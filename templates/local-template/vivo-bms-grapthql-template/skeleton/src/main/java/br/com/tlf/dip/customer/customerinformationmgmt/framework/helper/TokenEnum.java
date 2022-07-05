package br.com.tlf.dip.customer.customerinformationmgmt.framework.helper;

/**
 * Enum relativo aos campos de validação do Token JWT enviado na solicitação.
 * @author A0089321 - arthur.gjuniuor
 *@data: 18/05/2021
 */
public enum TokenEnum {

	SUB("sub"),
	NRDOCUMENTO("nrdocumento");
	
	private TokenEnum(String key) {
		this.key = key;
	}
	private String key;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
}
