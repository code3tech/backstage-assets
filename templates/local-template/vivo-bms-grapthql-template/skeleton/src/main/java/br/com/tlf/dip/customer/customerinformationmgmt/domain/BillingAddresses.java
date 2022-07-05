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
public class BillingAddresses {
	
	private String city;
	private String streetName;
	private String country;
	private String stateOfProvince;
	private String streetNrFirst;
	private String postCode;
	private String complement;
}
