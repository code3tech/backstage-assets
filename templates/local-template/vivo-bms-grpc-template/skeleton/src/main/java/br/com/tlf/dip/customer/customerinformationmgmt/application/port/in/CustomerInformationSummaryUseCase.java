package br.com.tlf.dip.customer.customerinformationmgmt.application.port.in;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import br.com.tlf.dip.customer.customerinformationmgmt.domain.ContactCustomer;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.CustomerInformationSummaryResponse;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.exception.AbstractBusinessException;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.exception.CustomDataMapperException;

public interface CustomerInformationSummaryUseCase {

	CustomerInformationSummaryResponse getCustomerInformationSummary(String documentNumber, String jwtToken) throws AbstractBusinessException;
	
	List<ContactCustomer> retrieveContactUsers
	(String documentNumber, String email, String networkNumber, String customerId) 
			throws AbstractBusinessException, JsonMappingException, JsonProcessingException, CustomDataMapperException;

	CustomerInformationSummaryResponse retrieveDocumentByUserId(String userId, String jwtToken) throws AbstractBusinessException;

}
