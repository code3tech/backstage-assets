package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.integration;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.SoapFaultClientException;
import org.springframework.ws.transport.http.HttpsUrlConnectionMessageSender;

import br.com.tlf.dip.customer.customerinformationmgmt.application.port.out.RetrieveCustomerDetailsPortOut;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.integration.config.IgnoreSSLConfig;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs.ApplicationContext;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs.CountryCode;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs.CustomerIdentification;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs.LanguageCode;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs.NationalIdentityCardIdentification3;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs.RetrieveCustomerDetails;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs.RetrieveCustomerDetailsResponse;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.exception.AbstractBusinessException;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.helper.MessagesEnun;

@Service
public class RetrieveCustomerDetailsAdapter implements RetrieveCustomerDetailsPortOut {

	/**
	 * Mensagem Fault: MandatoryParameterMissingFault
	 */
	private static final String MANDATORY_PARAMETERS_MISSING_FAULT = "One or more mandatory parameters are missing from the request.";

	/**
	 * Mensagem Fault: EntityNotFoundFault
	 */
	private static final String THE_CONTACT_CANNOT_BE_FOUND = "The Contact cannot be found.";

	@Autowired
	private WebServiceTemplate retrieveCustomerDetailsWebServiceTemplate;
	
	private static Logger logger = LoggerFactory.getLogger(RetrieveCustomerDetailsAdapter.class);
	
	@Override
	public RetrieveCustomerDetailsResponse retrieveCustomerDetails(String cardNumber, String cardType) throws AbstractBusinessException {
		
		RetrieveCustomerDetailsResponse response = null;
		
		//IGNORE SSL
		HttpsUrlConnectionMessageSender sender = new HttpsUrlConnectionMessageSender();
		sender.setHostnameVerifier(nullHostnameVerifier());
		sender.setTrustManagers(new TrustManager[] { new IgnoreSSLConfig() });
		retrieveCustomerDetailsWebServiceTemplate.setMessageSender(sender);

		try {
			logger.info("Chamando AMDOCS");
			RetrieveCustomerDetails request = new RetrieveCustomerDetails();
			
			ApplicationContext appCtx = new ApplicationContext();
			appCtx.setCountryCode(CountryCode.BRA);
			appCtx.setLanguageCode(LanguageCode.POR);
			request.setAppCtx(appCtx);
			
			CustomerIdentification customerIdentification = new CustomerIdentification();
			customerIdentification.setIndividualIdentification(new NationalIdentityCardIdentification3(cardNumber, cardType));
			request.setCustomerIdentification(customerIdentification);
			
			JAXBElement<RetrieveCustomerDetailsResponse> responseJaxb = callRetrieveCustomerDetailsWebServiceAction(request);
			if (responseJaxb != null) {
				response = responseJaxb.getValue();
			}
		} catch (SoapFaultClientException e) {
			if (e.getFaultStringOrReason().startsWith(THE_CONTACT_CANNOT_BE_FOUND)) {
				return null;
			}
			else if (e.getFaultStringOrReason().startsWith(MANDATORY_PARAMETERS_MISSING_FAULT)) {
				logger.error("Erro na consulta {} - customerinformationsummary:{}", "RetrieveCustomerDetailsAdapter.retrieveCustomerDetails" , e.getStackTrace() ,e);
				throw new AbstractBusinessException(MessagesEnun.MANDATORY_FIELDS_NOT_FILLED_IN, null, "FaultCode: "+e.getFaultCode() +" - "+ e.getFaultStringOrReason());
			}
		} catch (Exception e) {
			logger.error("Erro na consulta {} - customerinformationsummary:{}", "RetrieveCustomerDetailsAdapter.retrieveCustomerDetails" , e.getStackTrace() ,e);		
			throw new AbstractBusinessException(MessagesEnun.UNEXPECTED_ERROR_SEARCH, null, e.getMessage());
		}
		return response;
	}

	@SuppressWarnings("unchecked")
	private <T> JAXBElement<T> callRetrieveCustomerDetailsWebServiceAction(Object request) {
		return (JAXBElement<T>) retrieveCustomerDetailsWebServiceTemplate.marshalSendAndReceive(request);
	}

	private HostnameVerifier nullHostnameVerifier(){
		return new HostnameVerifier() {
			public boolean verify(String hostname, SSLSession session) {
				return true;
			}
		};
	}

}
