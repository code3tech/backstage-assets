package br.com.tlf.dip.customer.customerinformationmgmt.framework.exception;

import br.com.tlf.dip.customer.customerinformationmgmt.framework.helper.MessagesEnun;


/**
 * Encapsula exceções lançadas pela camada de negócio - UseCase
 * @author A0089321 - Arthur Gomes
 *
 */
public class AbstractBusinessException extends AbstractGenericException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MessagesEnun messagesEnun;

	private String reason;

	public AbstractBusinessException(MessagesEnun message, Object[] messageParameters,String stackTrace) {
		
		super(message.getCode(), message.getName(), message.getValue(),messageParameters,stackTrace);
		this.messagesEnun=message;

		this.reason=message.getName();
		
	}

	public MessagesEnun getMessagesEnun() {
		return messagesEnun;
	}

	public void setMessagesEnun(MessagesEnun messagesEnun) {
		this.messagesEnun = messagesEnun;
	}

	

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}


	
}
