package br.com.tlf.dip.customer.customerinformationmgmt.framework.exception;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Classe responsável por representar o erro devolvido ao consumidor
 * @author A0089321 - arthur.gjunior
 * Data criação: 05/05/2021
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Error implements Serializable {

  private static final long serialVersionUID = -3098212556060809862L;

	public Error(Date date, String string, String string2, String string3, int i) {}

	public Error(Date timestamp, Integer status, String error, String trace, String message) {
		this.timestamp = new Date();
		this.status = status;
		this.error = error;
		this.trace = trace;
		this.message = message;
	}
  
  @JsonProperty(value = "timestamp", required = false)
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Date timestamp;
  
  @JsonProperty(value = "status", required = false)
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Integer status;
  
  @JsonProperty(value = "error", required = false)
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String error;
  
  @JsonProperty(value = "trace", required = false)
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String trace;
  
  
  @JsonProperty(value = "message", required = false)
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String message;

public Date getTimestamp() {
	return timestamp;
}

public void setTimestamp(Date timestamp) {
	this.timestamp = timestamp;
}

public Integer getStatus() {
	return status;
}

public void setStatus(Integer status) {
	this.status = status;
}

public String getError() {
	return error;
}

public void setError(String error) {
	this.error = error;
}

public String getTrace() {
	return trace;
}

public void setTrace(String trace) {
	this.trace = trace;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}
  
  

}
