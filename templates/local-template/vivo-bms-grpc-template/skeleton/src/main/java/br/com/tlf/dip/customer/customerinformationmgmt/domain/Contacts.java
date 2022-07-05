package br.com.tlf.dip.customer.customerinformationmgmt.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(value = Include.NON_NULL)
public class Contacts {

	private String contactName;
	private List<ContactMediumB2b> contactMedium;
}
