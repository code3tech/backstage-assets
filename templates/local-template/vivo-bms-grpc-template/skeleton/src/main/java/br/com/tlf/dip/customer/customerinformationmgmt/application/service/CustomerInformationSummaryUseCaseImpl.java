package br.com.tlf.dip.customer.customerinformationmgmt.application.service;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import br.com.tlf.dip.customer.customerinformationmgmt.application.port.in.CustomerInformationSummaryUseCase;
import br.com.tlf.dip.customer.customerinformationmgmt.application.port.out.ConsultarCadastroPortOut;
import br.com.tlf.dip.customer.customerinformationmgmt.application.port.out.KnoxHBaseGatewayPortOut;
import br.com.tlf.dip.customer.customerinformationmgmt.application.port.out.NVGetCustomerPortOut;
import br.com.tlf.dip.customer.customerinformationmgmt.application.port.out.OudPortOut;
import br.com.tlf.dip.customer.customerinformationmgmt.application.port.out.RetrieveCustomerDetailsPortOut;
import br.com.tlf.dip.customer.customerinformationmgmt.application.service.adapters.AmdocsAdapter;
import br.com.tlf.dip.customer.customerinformationmgmt.application.service.adapters.SiebelAdapter;
import br.com.tlf.dip.customer.customerinformationmgmt.application.service.adapters.VivonetAdapter;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.Account;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.ContactCustomer;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.ContactMediumB2b;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.Contacts;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.CustomerB2b;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.CustomerInformationSummaryResponse;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.ProductCharacteristicType;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.dto.CadastroDTO;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.oud.OudRequestType;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.oud.OudResponseType;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.domain.Cell;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.domain.Row;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.domain.RowElement;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs.RetrieveCustomerDetailsResponse;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.siebel.NVGetCustomerWSOutput;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.exception.AbstractBusinessException;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.exception.CustomDataMapperException;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.helper.MessagesEnun;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.helper.Util;

@Service
public class CustomerInformationSummaryUseCaseImpl implements CustomerInformationSummaryUseCase {

	private static Logger logger = LoggerFactory.getLogger(CustomerInformationSummaryUseCaseImpl.class);

	//Sistema Origem
	private static final String SISTEMA_ORIGEM_4P = "4P";

	//Tipo do documento CPF
	private static final String CPF = "CPF";

	@Autowired
	private RetrieveCustomerDetailsPortOut retrieveCustomerDetailsPortOut;

	@Autowired
	private NVGetCustomerPortOut nvGetCustomerPortOut;

	@Autowired
	private ConsultarCadastroPortOut consultarCadastroPortOut;

	@Autowired
	private KnoxHBaseGatewayPortOut knoxHBaseGatewayPortOut;

	@Autowired
	private OudPortOut oudPortOut;

	@Override
	public CustomerInformationSummaryResponse getCustomerInformationSummary(String documentNumber, String jwtToken)
			throws AbstractBusinessException {

		try {

			// Validação: documentNumber e jwtToken
			if (Util.isValidString(documentNumber, 11) == false) {
				throw new AbstractBusinessException(MessagesEnun.ERROR_INVALID_DOCUMENTNUMBER, null, null);
			}

			// Requisição da informação junto ao provedores da informação (Amdocs, Siebel, VivoNet)
			RetrieveCustomerDetailsResponse amdocsResponse = retrieveCustomerDetailsPortOut
					.retrieveCustomerDetails(documentNumber, CPF);
			// Não mais passando token
			NVGetCustomerWSOutput siebelResponse = nvGetCustomerPortOut.getCustomer(documentNumber, SISTEMA_ORIGEM_4P);
			CadastroDTO vivoNetResponse = consultarCadastroPortOut.getCadastro(null, documentNumber);

			// Criar objeto vazio para retornos nulos
			CustomerInformationSummaryResponse emptyCustomer = new CustomerInformationSummaryResponse();

			// Buscando informações nos legados e construindo lista de respostas, em ordem de prioridade: [0 amdocs, 1 siebel, 2 vivonet]
			ArrayList<CustomerInformationSummaryResponse> responseList = new ArrayList<CustomerInformationSummaryResponse>();
			responseList.add(new AmdocsAdapter().getResponse(amdocsResponse).orElse(emptyCustomer));
			responseList.add(new SiebelAdapter().getResponse(siebelResponse).orElse(emptyCustomer));
			responseList.add(new VivonetAdapter().getResponse(vivoNetResponse).orElse(emptyCustomer));

			// Consolidar dados
			CustomerInformationSummaryResponse response = CustomerBuilder.getUnifiedCustomer(responseList)
					.orElse(emptyCustomer);

					if(response.getCustomer().getIndividual().getFirstName() == null)
						throw new AbstractBusinessException(MessagesEnun.CUSTOMER_NOT_FOUND, null, null);

			return response;

		} catch (AbstractBusinessException e) {
			logger.error("Erro na consulta {} - customerinformationsummary:{}",
					"CustomerInformationSummaryUseCaseImpl.getCustomerInformationSummary", e.getCause().getMessage(),e);
			throw new AbstractBusinessException(e.getMessagesEnun(), null, e.getMensagemStackTrace());
		} catch (Exception e) {
			logger.error("Erro na consulta {} - customerinformationsummary:{}",
					"CustomerInformationSummaryUseCaseImpl.getCustomerInformationSummary", e.getCause().getMessage(),e);
			throw new AbstractBusinessException(MessagesEnun.UNEXPECTED_ERROR_SEARCH, null, e.getMessage());
		}
	}

	public CustomerInformationSummaryResponse retrieveDocumentByUserId(String userId, String jwtToken) throws AbstractBusinessException{
		try{
			OudResponseType response = oudPortOut.searchUser(new OudRequestType(userId));
			if(response==null) throw new AbstractBusinessException(MessagesEnun.UNEXPECTED_ERROR_SEARCH,null,null);
			String documentNumber = response.getNrdocumento();
			return this.getCustomerInformationSummary(documentNumber, jwtToken);
		}catch(AbstractBusinessException abe){
			logger.error("Erro na consulta {} - customerinformationsummary:{}",
					"CustomerInformationSummaryUseCaseImpl.retrieveDocumentByUserId", abe.getCause().getMessage(),abe);
			throw new AbstractBusinessException(abe.getMessagesEnun(), null, abe.getMensagemStackTrace());
		}catch (WebClientResponseException wcre){
			logger.error("Erro na consulta {} - customerinformationsummary:{}", "CustomerInformationSummaryUseCaseImpl.retrieveDocumentByUserId", wcre.getMessage(), wcre);
			throw new AbstractBusinessException(MessagesEnun.UNEXPECTED_ERROR_SEARCH, null, wcre.getMessage());
		}catch (Exception e) {
			logger.error("Erro na consulta {} - customerinformationsummary:{}",
					"CustomerInformationSummaryUseCaseImpl.retrieveDocumentByUserId", e.getCause().getMessage(),e);
			throw new AbstractBusinessException(MessagesEnun.UNEXPECTED_ERROR_SEARCH, null, e.getMessage());
		}
	}

	//B2B-OPERATION

	@Override
	public List<ContactCustomer> retrieveContactUsers(String documentNumber, String email, String networkNumber,
			String customerId) throws CustomDataMapperException {

		Row row = null;
		List<String> base64List = new ArrayList<String>();

		if (documentNumber != null) {
			row = knoxHBaseGatewayPortOut.getCNPJ(documentNumber);
		}

		if (email != null) {
			row = knoxHBaseGatewayPortOut.getEmail(email);
		}

		if (networkNumber != null) {
			row = knoxHBaseGatewayPortOut.getLinha(networkNumber);
		}

		if (customerId != null) {
			row = knoxHBaseGatewayPortOut.getConta(customerId);
		}

		for (RowElement r : row.getRowList()) {
			for (Cell cell : r.getCellList()) {
				base64List.add(cell.getValue());
			}
		}

		// decodando e mapeando para JsonNode resposta do knox HBase para ser
		// transformada para CustomerB2b, pegando o primeiro item sempre pois nunca
		// teremos mais de 1 item nesse array
		byte[] decodedBytes = Base64.getDecoder().decode(base64List.get(0));
		String decodedString = new String(decodedBytes);
		ObjectMapper mapper = new ObjectMapper();

		JsonNode jsonObj;

		try {
			jsonObj = mapper.readTree(decodedString);
		} catch (JsonProcessingException e) {
			logger.error("Erro ao realizar o mapeamento dos dados", e);
			throw new CustomDataMapperException(MessagesEnun.DATA_MAPPER_ERROR, null, e.getStackTrace().toString());
		}

		List<ContactCustomer> cutomerB2bList = mapperKnoxHBaseToContactUserList(jsonObj);

		return cutomerB2bList;
	}

	public List<ContactCustomer> mapperKnoxHBaseToContactUserList(JsonNode obj) {

		List<ContactCustomer> contactUserList = new ArrayList<ContactCustomer>();

		for (JsonNode node : obj.get("value")) {

			ContactCustomer contactUser = new ContactCustomer();
			CustomerB2b customer = new CustomerB2b();
			Contacts contacts = new Contacts();
			ContactMediumB2b phoneManager = new ContactMediumB2b();
			ContactMediumB2b email = new ContactMediumB2b();
			ContactMediumB2b phoneCustomer = new ContactMediumB2b();
			List<ContactMediumB2b> contactMediumB2bList = new ArrayList<ContactMediumB2b>();
			Account account = new Account();
			ProductCharacteristicType productCharacteristicType = new ProductCharacteristicType();
			List<ProductCharacteristicType> productCharacteristicTypeList = new ArrayList<ProductCharacteristicType>();

			phoneManager.setType("phone_number_manager");
			phoneManager.setValue(node.get("ds_tlfn_gestor").textValue());
			email.setType("email");
			email.setValue(node.get("ds_email").textValue());
			phoneCustomer.setType("phone_number_customer");
			phoneCustomer.setValue(node.get("ds_tlfn_linha").textValue());
			contactMediumB2bList.add(phoneManager);
			contactMediumB2bList.add(email);
			contactMediumB2bList.add(phoneCustomer);
			contacts.setContactMedium(contactMediumB2bList);
			contacts.setContactName(node.get("nome_gestor").textValue());
			customer.setContacts(contacts);

			account.setId(node.get("cd_cnta").textValue());
			customer.setAccount(account);

			customer.setOrganizationName(node.get("nm_cnta").textValue());
			customer.setDocumentNumber(node.get("cd_doct").textValue());
			customer.setCustomerRank(node.get("ds_sgmt_vl").textValue());
			customer.setServiceSegment(node.get("sub_sgmt_cnta").textValue());
			customer.setSourceSystem(node.get("origem_info").textValue());

			productCharacteristicType.setName(node.get("familia").textValue());
			productCharacteristicType.setValue(node.get("subfamilia").textValue());
			productCharacteristicTypeList.add(productCharacteristicType);
			customer.setProductCharacteristicType(productCharacteristicTypeList);

			contactUser.setCustomer(customer);
			contactUserList.add(contactUser);
		}

		return contactUserList;
	}

}
