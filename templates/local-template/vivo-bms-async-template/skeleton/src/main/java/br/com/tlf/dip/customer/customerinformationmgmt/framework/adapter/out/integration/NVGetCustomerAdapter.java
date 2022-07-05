package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.integration;

import java.io.IOException;

import javax.xml.bind.JAXBElement;
import javax.xml.transform.TransformerException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.client.SoapFaultClientException;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpComponentsConnection;

import br.com.tlf.dip.customer.customerinformationmgmt.application.port.out.NVGetCustomerPortOut;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.siebel.NVGetCustomerWSInput;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.siebel.NVGetCustomerWSOutput;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.siebel.ObjectFactory;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.exception.AbstractBusinessException;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.helper.MessagesEnun;

@Service
public class NVGetCustomerAdapter implements NVGetCustomerPortOut {

	private static final String TOKEN_ERROR = "1";


	/**
	 * Mensagem Fault: UNEXPECTED_ERROR
	 */
	private static final String SIGLA_ERRO_INESPERADO = "SBL-EAI";


	@Autowired
	private WebServiceTemplate getCustomerWebServiceTemplate;
	
	private static Logger logger = LoggerFactory.getLogger(NVGetCustomerAdapter.class);
	
	@Override
	public NVGetCustomerWSOutput getCustomer(String documento, String sistemaOrigem) throws AbstractBusinessException {
		logger.info("Chamando Siebel");
		NVGetCustomerWSOutput  response = null;
		
		try {
			NVGetCustomerWSInput request = getNVGetCustomerWSInput(documento, sistemaOrigem);

			JAXBElement<NVGetCustomerWSOutput> responseJaxb = this.<NVGetCustomerWSOutput>callGetCustomerWebServiceAction(request);
			if (responseJaxb != null) {
				response = responseJaxb.getValue();

				if (response.getErrorSpcCode().contains(SIGLA_ERRO_INESPERADO)) {
					throw new AbstractBusinessException(MessagesEnun.UNEXPECTED_ERROR_SEARCH, null, "FaultCode: "+response.getErrorSpcCode() +" - "+ response.getErrorSpcMessage());
				}
				if (response.getErrorSpcCode().contains(TOKEN_ERROR)) {
					throw new AbstractBusinessException(MessagesEnun.UNEXPECTED_ERROR_SEARCH, null, "FaultCode: "+response.getErrorSpcCode() +" - "+ response.getErrorSpcMessage());
				}
	
			}
			logger.info("Concluindo a chamada no Siebel");
		
		} catch (SoapFaultClientException e) {
			logger.error("Erro na consulta {} - customerinformationsummary:{}", "NVGetCustomerAdapter.getCustomer" , e.getStackTrace() ,e);
			if (e.getFaultStringOrReason().contains(SIGLA_ERRO_INESPERADO)) {
				throw new AbstractBusinessException(MessagesEnun.UNEXPECTED_ERROR_SEARCH, null, "FaultCode: "+e.getFaultCode() +" - "+ e.getFaultStringOrReason());
			}
		} catch (AbstractBusinessException e) {
			logger.error("Erro na consulta {} - customerinformationsummary:{}", "NVGetCustomerAdapter.getCustomer" , e.getMensagemStackTrace(),e);
			throw new AbstractBusinessException(e.getMessagesEnun(), null, e.getMensagemStackTrace());
		
		} catch (Exception e) {
			logger.error("Erro na consulta {} - customerinformationsummary:{}", "NVGetCustomerAdapter.getCustomer" , e.getStackTrace() ,e);		
			throw new AbstractBusinessException(MessagesEnun.UNEXPECTED_ERROR_SEARCH, null, e.getMessage());
		}
		
		return response;
	}

	private NVGetCustomerWSInput getNVGetCustomerWSInput(String documento, String sistemaOrigem) {
		ObjectFactory objectFactory = new ObjectFactory();

		NVGetCustomerWSInput request = objectFactory.createNVGetCustomerWSInput();
		request.setDocumento(documento);
		request.setSistemaOrigem(sistemaOrigem);
		return request;
	}
	
	@SuppressWarnings("unchecked")
	private <T> JAXBElement<T> callGetCustomerWebServiceAction(Object request) {
		return (JAXBElement<T>) getCustomerWebServiceTemplate.marshalSendAndReceive(request, new WebServiceMessageCallback() {
			
			@Override
			public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
				
				TransportContext context = TransportContextHolder.getTransportContext();
				HttpComponentsConnection connection = (HttpComponentsConnection) context.getConnection();
				connection.getHttpPost().removeHeaders("Accept-Encoding");
                connection.addRequestHeader("Accept-Encoding", "text/html;text/xml;text/plain;text/css; application/javascript; application/json");
                
                SoapMessage soapMessage = (SoapMessage) message;
                soapMessage.setSoapAction("\"document/http://siebel.com/CustomUI:NVGetCustomerWS\"");
			}
		});
	}
	
}
