package br.com.tlf.dip.customer.customerinformationmgmt.domain.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class ClienteDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nomeCliente;
	private String sobrenomeCliente;
	private String documentoCliente;
	private Date dtNascimentoCliente;
	private String nmMaeCliente;
	private String nomeUsuario;
	private String sobrenomeUsuario; 
	private String documentoUsuario; 
	private Date dtNascimentoUsuario;
	private String nmMaeUsuario;
	private Date aging;
	private Long terminal;
	private String endereco;
	private String tpCliente;
	private Integer cdSegmento;
	private String dsSegmento;
	private Date dataHora;
	private String entidade;

}
