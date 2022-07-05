package br.com.tlf.dip.customer.customerinformationmgmt.application.port.out;

import br.com.tlf.dip.customer.customerinformationmgmt.domain.dto.CadastroDTO;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.exception.AbstractBusinessException;

public interface ConsultarCadastroPortOut {
	
	public CadastroDTO getCadastro(String numeroLinha, String documento) throws AbstractBusinessException;

}
