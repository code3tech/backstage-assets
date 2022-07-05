package br.com.tlf.dip.customer.customerinformationmgmt.framework.helper;

import br.com.tlf.dip.customer.customerinformationmgmt.framework.exception.GenericErrorsEnum;

public enum MessagesEnun {

	EXCEPTION_ARCHIVE_MESSAGES(GenericErrorsEnum.ERROR_GENERIC.getCode(), GenericErrorsEnum.ERROR_GENERIC.getReason() ,"exception resources."),
	DATA_MAPPER_ERROR(GenericErrorsEnum.ERROR_GENERIC.getCode(), GenericErrorsEnum.ERROR_GENERIC.getReason() ,"Erro ao realizar o data mapper."),
	UNEXPECTED_ERROR_SEARCH(GenericErrorsEnum.ERROR_GENERIC.getCode(), GenericErrorsEnum.ERROR_GENERIC.getReason(), "Ocorreu um erro inesperado durante chamada do serviço."),
	CUSTOMER_NOT_FOUND (GenericErrorsEnum.NOT_FOUND.getCode(), GenericErrorsEnum.NOT_FOUND.getReason(), "Cliente não encontrado na pesquisa."),
	ERROR_TOKEN_NOT_VALIDATE(GenericErrorsEnum.ERROR_GENERIC.getCode(), GenericErrorsEnum.ERROR_GENERIC.getReason(), "Ocorreu um erro inesperado ao validar o token de segurança."),
	ERROR_TOKEN_IS_EMPTY(GenericErrorsEnum.FORBIDDEN.getCode(), GenericErrorsEnum.FORBIDDEN.getReason(), "O token de segurança (obrigatório) não foi enviado."),
	ERROR_TOKEN_NOT_LINENUMBER(GenericErrorsEnum.FORBIDDEN.getCode(), GenericErrorsEnum.FORBIDDEN.getReason(), "O token não pertence a linha do assinante."),
	MANDATORY_FIELDS_NOT_FILLED_IN(GenericErrorsEnum.NOT_FOUND.getCode(), GenericErrorsEnum.NOT_FOUND.getReason(), "Campos obrigatórios não preenchidos."),
	ERROR_INVALID_DOCUMENTNUMBER(GenericErrorsEnum.BAD_REQUEST.getCode(), GenericErrorsEnum.BAD_REQUEST.getReason(), "O campo documentNumber deve conter 11 digitos.");
	
	private String code;
	private String name;
	private String value;
	
	private MessagesEnun(String code, String value, String name) {
		this.code = code;
		this.value = value;
		this.name = name;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
