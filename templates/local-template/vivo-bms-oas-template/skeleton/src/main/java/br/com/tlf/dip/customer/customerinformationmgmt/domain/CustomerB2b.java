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
public class CustomerB2b {
	
	private Contacts contacts;
	private Account account;
	private String organizationName;
	private String documentNumber;
	private String customerRank;
	private String serviceSegment;
	private String sourceSystem;
	private List<ProductCharacteristicType> productCharacteristicType;

}
