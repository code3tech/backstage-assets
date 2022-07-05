package br.com.tlf.dip.customer.customerinformationmgmt.framework.exception;

import br.com.tlf.dip.customer.customerinformationmgmt.framework.helper.MessagesEnun;

/**
 * Encapsula exceções lançadas pela camada de persistencia - Adapter-out
 * @author A0089321 - Arthur Gomes
 *
 */
public class AbstractPersistenceException extends AbstractGenericException{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1100732234292037401L;
	private MessagesEnun messagesEnun;
	private String code;
	private String reason;
	
	
	public AbstractPersistenceException(String code,String reason, MessagesEnun message, Object[] messageParameters,String stackTrace) {
		super( code, reason, message.getValue(), messageParameters,stackTrace);
		this.messagesEnun=message;
		this.code=code;
		this.reason=reason;
	}
	public MessagesEnun getMessagesEnun() {
		return messagesEnun;
	}

	public void setMessagesEnun(MessagesEnun messagesEnun) {
		this.messagesEnun = messagesEnun;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
