package br.com.tlf.dip.customer.customerinformationmgmt.domain.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ContatoClienteDTO {

	private String contato;
	private String tipoContato;
	private Date dtExpiracao;

}
