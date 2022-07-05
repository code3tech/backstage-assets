package br.com.tlf.dip.customer.customerinformationmgmt.application.port.out;

import br.com.tlf.dip.customer.customerinformationmgmt.domain.oud.OudRequestType;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.oud.OudResponseType;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.exception.AbstractBusinessException;

public interface OudPortOut {
    
    public OudResponseType searchUser(OudRequestType oudRequest) throws AbstractBusinessException;;

}
