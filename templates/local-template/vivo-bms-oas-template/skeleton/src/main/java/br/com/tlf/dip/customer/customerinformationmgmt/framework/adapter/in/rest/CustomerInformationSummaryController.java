package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.in.rest;

import java.io.UnsupportedEncodingException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.util.List;

import com.auth0.jwt.exceptions.TokenExpiredException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.tlf.dip.customer.customerinformationmgmt.application.port.in.CustomerInformationSummaryUseCase;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.ContactCustomer;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.CustomerInformationSummaryResponse;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.validator.TokenValidatorComponent;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.exception.AbstractBusinessException;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.exception.CustomDataMapperException;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.helper.MessagesEnun;

@RestController
@RequestMapping("/users")
public class CustomerInformationSummaryController {
	
	@Autowired
	private CustomerInformationSummaryUseCase customerInformationSummaryUseCase;

	@Autowired
	private TokenValidatorComponent tokenValidator;
		
	private static Logger logger = LoggerFactory.getLogger(CustomerInformationSummaryController.class);
	
	@GetMapping("/b2b")
	public ResponseEntity<List<ContactCustomer>> retrieveContactUsers(
			@RequestHeader(value = "Authorization", required = false) String authToken,
			@RequestParam(required = false) String documentNumber, 
			@RequestParam(required = false) String email, 
			@RequestParam(required = false) String networkNumber, 
			@RequestParam(required = false) String customerId) throws JsonMappingException, JsonProcessingException, AbstractBusinessException, CustomDataMapperException {
		
		return ResponseEntity.ok(customerInformationSummaryUseCase.retrieveContactUsers(documentNumber, email, networkNumber, customerId));
		
	}

	@RequestMapping(value = "/userId/{userId}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<CustomerInformationSummaryResponse> getCustomerInformationSummaryByUserId(@PathVariable String userId, @RequestHeader(value = "Authorization") String authToken) throws AbstractBusinessException {
		
		try {
			if (authToken != null) {
				// Authorization: Bearer akshjdakjshdsakj
				String[] aToken = authToken.split(" ");
		        if (aToken.length > 1 ) {
		        	authToken = aToken[1];
		        }
			}
			//VALIDATE TOKEN
			tokenValidator.validateToken(authToken);
			return ResponseEntity.ok(customerInformationSummaryUseCase.retrieveDocumentByUserId(userId, authToken));
		}catch (AbstractBusinessException e) {
			logger.error("Erro na consulta {} - customerinformationsummary:{}", "CustomerInformationSummaryController.getCustomerInformationSummaryByUserId" , e.getMensagemStackTrace(),e);
			throw new AbstractBusinessException(e.getMessagesEnun(), null, e.getMensagemStackTrace());
		}catch (TokenExpiredException | SignatureException | IllegalArgumentException | UnsupportedEncodingException | CertificateException tkException){
			throw new AbstractBusinessException(MessagesEnun.ERROR_TOKEN_NOT_VALIDATE, null, tkException.getMessage());
		}
	}
	
	@RequestMapping(value = "/documentNumber/{documentNumber}", method = RequestMethod.GET, produces="application/json")
	public CustomerInformationSummaryResponse getCustomerInformationSummary(@PathVariable(value = "documentNumber") String documentNumber, @RequestHeader(value = "Authorization") String authToken) throws AbstractBusinessException {
		
		try {
			if (authToken != null) {
				// Authorization: Bearer akshjdakjshdsakj
				String[] aToken = authToken.split(" ");
		        if (aToken.length > 1 ) {
		        	authToken = aToken[1];
		        }
			}
			//VALIDATE TOKEN
			tokenValidator.validateToken(authToken);
	        return customerInformationSummaryUseCase.getCustomerInformationSummary(documentNumber, authToken);
		}catch (AbstractBusinessException e) {
			logger.error("Erro na consulta {} - customerinformationsummary:{}", "CustomerInformationSummaryController.retrieveCustomerDetails" , e.getMensagemStackTrace(),e);
			throw new AbstractBusinessException(e.getMessagesEnun(), null, e.getMensagemStackTrace());
		}catch (TokenExpiredException | SignatureException | IllegalArgumentException | UnsupportedEncodingException | CertificateException tkException){
			throw new AbstractBusinessException(MessagesEnun.ERROR_TOKEN_NOT_VALIDATE, null, tkException.getMessage());
		}
		
	}

}
