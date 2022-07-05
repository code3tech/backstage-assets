package br.com.tlf.dip.customer.customerinformationmgmt.application.port.out;

import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs.RetrieveCustomerDetailsResponse;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.exception.AbstractBusinessException;

public interface RetrieveCustomerDetailsPortOut {
	
	public RetrieveCustomerDetailsResponse retrieveCustomerDetails(String cardNumber, String cardType) throws AbstractBusinessException;

}
