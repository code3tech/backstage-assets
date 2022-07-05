package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.integration.config;

import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class NVGetCustomerWebServiceTemplateConfig {

	@Value("${webservice.api.siebel.getcustomer.login}")
	private String WS_SECURITY_LOGIN = "USER_SIEBEL";
	
	@Value("${webservice.api.siebel.getcustomer.password}")
	private String WS_SECURITY_PASSOWRD = "PASSWORD_SIEBEL";
	
	@Value("${webservice.api.siebel.getcustomer.class.package}")
	private String SOURCE_CLASS_PACKAGE;
	
	@Value("${webservice.api.siebel.getcustomer.uri}")
	private String WEB_SERVICE_API_URI;
	
	
	@Autowired
	private HttpComponentsMessageSender httpComponentsMessageSender;
	
	@Bean("getCustomerWebServiceTemplate")
	public WebServiceTemplate getCustomerWebServiceTemplate(@Qualifier(value =  "getCustomerWebServiceMarshaller") Jaxb2Marshaller marshaller) {
		var webservice = new WebServiceTemplate(marshaller);
		webservice.setDefaultUri(WEB_SERVICE_API_URI);
		webservice.setInterceptors( new ClientInterceptor[] {this.securityInterceptor()} );
		webservice.setMessageSender(httpComponentsMessageSender);
		return webservice;
	}
	
	@Bean("getCustomerWebServiceMarshaller")
	public Jaxb2Marshaller getCustomerWebServiceMarshaller() {
		var marshaller = new Jaxb2Marshaller();
		marshaller.setPackagesToScan(SOURCE_CLASS_PACKAGE);
		return marshaller;
	}
	
	@Bean
	public Wss4jSecurityInterceptor securityInterceptor() {
	  Wss4jSecurityInterceptor security = new Wss4jSecurityInterceptor();	  
	  // Adiciona a tag "UsernameToken" no header
	  security.setSecurementActions(WSHandlerConstants.USERNAME_TOKEN);	  
	  // Seta os valores de "UsernameToken" e definie o Type PasswordText no header
	  security.setSecurementPasswordType(WSConstants.PW_TEXT);
	  security.setSecurementUsername(WS_SECURITY_LOGIN);
	  security.setSecurementPassword(WS_SECURITY_PASSOWRD);
	  return security;
	}
}
