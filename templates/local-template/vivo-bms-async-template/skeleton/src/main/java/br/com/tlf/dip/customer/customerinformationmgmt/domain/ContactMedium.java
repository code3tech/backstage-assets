package br.com.tlf.dip.customer.customerinformationmgmt.domain;

import java.util.LinkedHashSet;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(Include.NON_NULL)
public class ContactMedium {

	private String email;
	private String mobilePhone;
	private String workPhone;
	private LinkedHashSet<Email> emailList;
	private LinkedHashSet<MobilePhone> mobilePhoneList;
}
