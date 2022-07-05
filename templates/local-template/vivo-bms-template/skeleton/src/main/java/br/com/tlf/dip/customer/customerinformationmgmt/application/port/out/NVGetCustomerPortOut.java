package br.com.tlf.dip.customer.customerinformationmgmt.application.port.out;

import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.siebel.NVGetCustomerWSOutput;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.exception.AbstractBusinessException;

public interface NVGetCustomerPortOut {
	
	public NVGetCustomerWSOutput getCustomer(String documento, String sistemaOrigem) throws AbstractBusinessException;
	
}
