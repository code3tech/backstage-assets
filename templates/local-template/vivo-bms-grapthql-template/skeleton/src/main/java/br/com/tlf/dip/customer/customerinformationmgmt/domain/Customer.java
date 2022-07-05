package br.com.tlf.dip.customer.customerinformationmgmt.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(Include.NON_NULL)
public class Customer {

	private Individual individual;
	private ContactMedium contactMedium;
	private String documentNumber;
	private Date customerBirthDate;
	private Date customerBirthDateSerasa;
	private BillingAddresses billingAddresses;
	private String customerSegment;
	private Date agingMobile;
	private Date aging;
	private String customerType;
	private String documentNumberType;

}
