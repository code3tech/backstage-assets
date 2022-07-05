package br.com.tlf.dip.customer.customerinformationmgmt.helper;

import java.util.ArrayList;
import java.util.List;

import br.com.tlf.dip.customer.customerinformationmgmt.domain.Account;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.ContactCustomer;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.ContactMediumB2b;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.Contacts;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.CustomerB2b;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.ProductCharacteristicType;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.domain.Cell;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.domain.Row;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.domain.RowElement;

public class Util {
	
	public static List<ContactCustomer> massFactoryOfListOfContactCustomer(String documentNumber,
			String valueOfPhoneNumberManager, String valueOfEmail, String valueOfPhoneNumberCustomer, String contactName,
			String id, String sourceSystem, String productChatacteresticName, String productCharacteristicValue) {
		
		List<ContactCustomer> contactUserList = new ArrayList<ContactCustomer>();
		ContactCustomer contactCustomer = new ContactCustomer();
		CustomerB2b customerB2b = new CustomerB2b();
		Contacts contacts = new Contacts();
		Account account = new Account();
		List<ProductCharacteristicType> productCharacteristicTypeList = new ArrayList<ProductCharacteristicType>();
		ProductCharacteristicType productCharacteristicType = new ProductCharacteristicType();
		List<ContactMediumB2b> contactMediumList = new ArrayList<ContactMediumB2b>();
		ContactMediumB2b phone_number_manager  = new ContactMediumB2b("phone_number_manager", valueOfPhoneNumberManager);
		ContactMediumB2b email  = new ContactMediumB2b("email", valueOfEmail);
		ContactMediumB2b phone_number_customer  = new ContactMediumB2b("phone_number_customer", valueOfPhoneNumberCustomer);
		contactMediumList.add(phone_number_customer);
		contactMediumList.add(email);
		contactMediumList.add(phone_number_manager);
		contacts.setContactMedium(contactMediumList);
		contacts.setContactName(contactName);
		account.setId(id);
		customerB2b.setOrganizationName(valueOfPhoneNumberManager);
		customerB2b.setDocumentNumber(documentNumber);
		customerB2b.setCustomerRank(valueOfPhoneNumberManager);
		customerB2b.setServiceSegment(valueOfPhoneNumberManager);
		customerB2b.setSourceSystem(sourceSystem);
		productCharacteristicType.setName(productChatacteresticName);
		productCharacteristicType.setValue(productCharacteristicValue);
		productCharacteristicTypeList.add(productCharacteristicType);
		customerB2b.setAccount(account);
		customerB2b.setContacts(contacts);
		customerB2b.setProductCharacteristicType(productCharacteristicTypeList);
		contactCustomer.setCustomer(customerB2b);
		contactUserList.add(contactCustomer);
		
		return contactUserList;
	}
	
	public static Row massFactoryListOfRow(String key, String value, String column, String timestamp) {
		Row row = new Row();
		RowElement rowElement = new RowElement();
		List<RowElement> rowList = new ArrayList<RowElement>();
		List<Cell> cellList = new ArrayList<Cell>();
		Cell cell = new Cell(value, column, timestamp);
		cellList.add(cell);
		rowElement.setKey(key);
		rowElement.setCellList(cellList);
		rowList.add(rowElement);
		row.setRowList(rowList);
		return row;
	}

}
