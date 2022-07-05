package br.com.tlf.dip.customer.customerinformationmgmt.framework.helper;

import java.util.HashMap;
import java.util.Map;

public enum MessagesAdapter {

	SERV_INATIVO(1,"O serviço consultado está inativo. Favor entrar em contato com o administrador do serviço."),
	LOGIN_NEXIST(2,"O login informado não existe na base de dados."),
	SERV_INATIVO_USER(3,"O serviço consultado está inativo para este usuário. Favor entrar em contato com o administrador do serviço."),
	SENHA_INVALIDA(4,"A senha informada está incorreta."),
	LOGIN_INVALIDO(5,"O login informado não possui permissão para acessar o serviço consultado. Favor entrar em contato com o administrador do serviço."),
	ERRO_NEGOCIO(6,"Exceção de negócio"),
	ERRO_AMBIENTE(7,"Erro de ambiente. Favor entrar em contato com o administrador do serviço e informar essa mensagem."),
	ERRO_DESCONHECIDO(8,"Erro desconhecido. Favor entrar em contato com o administrador do serviço e informar essa mensagem."),
	FORA_DE_HORARIO(9,"O serviço consultado está fora do horário permitido. Favor entrar em contato com o administrador do serviço."),
	LOGIN_SERVICO_NEXIST(10,"O login ou o serviço informado não existe na base de dados.");

	
	private Integer code;
	private String description;
	
	private  static final Map<Integer, MessagesAdapter> messageVal = new HashMap<>();
	static {
		for(MessagesAdapter m : MessagesAdapter.values()) {
			messageVal.put(m.getCode(), m);
		}
	}
	
	public static MessagesAdapter getDescriptionByCode(Integer c) {
		return messageVal.get(c);
	}
	
	private MessagesAdapter(Integer code, String description) {
		this.code = code;
		this.description = description;
	}



	public Integer getCode() {
		return code;
	}



	public void setCode(Integer code) {
		this.code = code;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}
	

	public String getDescription(Integer codigo) {
		
		
		return description;
	}
	
	
	
}
