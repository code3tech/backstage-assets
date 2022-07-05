package br.com.tlf.dip.customer.customerinformationmgmt.application.port.out;

import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.domain.Row;

public interface KnoxHBaseGatewayPortOut {
	

	public Row getCNPJ(String cnpj);
	public Row getConta(String conta);
	public Row getEmail(String email);
	public Row getLinha(String linha);
	
}
