package br.com.tlf.dip.customer.customerinformationmgmt.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(Include.NON_NULL)
public class Individual {

	private String firstName;
	private String lastName;
	private String motherName;
	private String motherNameSerasa;
	
}
