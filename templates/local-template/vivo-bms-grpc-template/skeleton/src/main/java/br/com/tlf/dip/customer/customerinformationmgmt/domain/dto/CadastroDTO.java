package br.com.tlf.dip.customer.customerinformationmgmt.domain.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CadastroDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ContatoClienteDTO contatoCliente;
	private ClienteDTO cliente;
	private Integer cdErro;
	private String dsErro;
	
}
