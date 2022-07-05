package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.domain;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class RowElement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("key")
	private String key;

	@JsonProperty("Cell")
	private List<Cell> cellList;
}
