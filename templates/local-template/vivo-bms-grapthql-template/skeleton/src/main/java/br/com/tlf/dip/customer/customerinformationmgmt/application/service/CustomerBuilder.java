package br.com.tlf.dip.customer.customerinformationmgmt.application.service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Optional;

import br.com.tlf.dip.customer.customerinformationmgmt.domain.BillingAddresses;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.ContactMedium;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.Customer;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.CustomerInformationSummaryResponse;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.Email;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.Individual;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.MobilePhone;

public class CustomerBuilder {

    public static Optional<CustomerInformationSummaryResponse> getUnifiedCustomer(
            ArrayList<CustomerInformationSummaryResponse> responseList) {
        CustomerInformationSummaryResponse response = new CustomerInformationSummaryResponse();

        Customer customer = new Customer();
        customer.setDocumentNumberType("CPF");
        BillingAddresses billingAddress = new BillingAddresses();
        ContactMedium contactMedium = new ContactMedium();
        contactMedium.setEmailList(new LinkedHashSet<Email>());
        contactMedium.setMobilePhoneList(new LinkedHashSet<MobilePhone>());
        Individual individual = new Individual();

        responseList.stream().filter(cust -> cust.getCustomer()!=null).forEachOrdered(cust -> {


                // INDIVIDUAL
                if (individual.getFirstName() == null || individual.getFirstName().trim().equals("")) {
                    individual.setFirstName(cust.getCustomer().getIndividual().getFirstName());
                }

                if (individual.getLastName() == null || individual.getLastName().trim().equals("")) {
                    individual.setLastName(cust.getCustomer().getIndividual().getLastName());
                }

                if (individual.getMotherName() == null || individual.getMotherName().trim().equals("")) {
                    individual.setMotherName(cust.getCustomer().getIndividual().getMotherName());
                }

                if (individual.getMotherNameSerasa() == null || individual.getMotherNameSerasa().trim().equals("")) {
                    individual.setMotherNameSerasa(cust.getCustomer().getIndividual().getMotherNameSerasa());
                }

                // CONTACT
                if (contactMedium.getEmail() == null || contactMedium.getEmail().trim().equals("")) {
                    contactMedium.setEmail(cust.getCustomer().getContactMedium().getEmail());
                }

                if (contactMedium.getMobilePhone() == null || contactMedium.getMobilePhone().trim().equals("")) {
                    contactMedium.setMobilePhone(cust.getCustomer().getContactMedium().getMobilePhone());
                }

                if (contactMedium.getWorkPhone() == null || contactMedium.getWorkPhone().trim().equals("")) {
                    contactMedium.setWorkPhone(cust.getCustomer().getContactMedium().getWorkPhone());
                }

                // CONTACT LISTS
                if (cust.getCustomer().getContactMedium().getEmailList() != null)
                    contactMedium.setEmailList(cust.getCustomer().getContactMedium().getEmailList());

                if (cust.getCustomer().getContactMedium().getMobilePhoneList() != null)
                    contactMedium.setMobilePhoneList(cust.getCustomer().getContactMedium().getMobilePhoneList());

                // CUSTOMER
                if (customer.getAging() == null && cust.getCustomer().getAging() != null) {
                    customer.setAging(cust.getCustomer().getAging());
                }

                if (customer.getAgingMobile() == null && cust.getCustomer().getAgingMobile() != null) {
                    customer.setAgingMobile(cust.getCustomer().getAgingMobile());
                }

                if (customer.getCustomerBirthDate() == null && cust.getCustomer().getCustomerBirthDate() != null) {
                    customer.setCustomerBirthDate(cust.getCustomer().getCustomerBirthDate());
                }

                if (customer.getCustomerBirthDateSerasa() == null
                        && cust.getCustomer().getCustomerBirthDateSerasa() != null) {
                    customer.setCustomerBirthDateSerasa(cust.getCustomer().getCustomerBirthDateSerasa());
                }

                if (customer.getDocumentNumber() == null || customer.getDocumentNumber().trim().equals("")) {
                    customer.setDocumentNumber(cust.getCustomer().getDocumentNumber());
                }

                if (customer.getCustomerSegment() == null || customer.getCustomerSegment().trim().equals("")) {
                    customer.setCustomerSegment(cust.getCustomer().getCustomerSegment());
                }

                if (customer.getCustomerType() == null || customer.getCustomerType().trim().equals("")) {
                    customer.setCustomerType(cust.getCustomer().getCustomerType());
                }

                // ADDRESS
                if (billingAddress.getCity() == null || billingAddress.getCity().trim().equals("")) {
                    billingAddress.setCity(cust.getCustomer().getBillingAddresses().getCity());
                }

                if (billingAddress.getComplement() == null || billingAddress.getComplement().trim().equals("")) {
                    billingAddress.setComplement(cust.getCustomer().getBillingAddresses().getComplement());
                }

                if (billingAddress.getCountry() == null || billingAddress.getCountry().trim().equals("")) {
                    billingAddress.setCountry(cust.getCustomer().getBillingAddresses().getCountry());
                }

                if (billingAddress.getPostCode() == null || billingAddress.getPostCode().trim().equals("")) {
                    billingAddress.setPostCode(cust.getCustomer().getBillingAddresses().getPostCode());
                }

                if (billingAddress.getStateOfProvince() == null
                        || billingAddress.getStateOfProvince().trim().equals("")) {
                    billingAddress.setStateOfProvince(cust.getCustomer().getBillingAddresses().getStateOfProvince());
                }

                if (billingAddress.getStreetName() == null || billingAddress.getStreetName().trim().equals("")) {
                    billingAddress.setStreetName(cust.getCustomer().getBillingAddresses().getStreetName());
                }

                if (billingAddress.getStreetNrFirst() == null || billingAddress.getStreetNrFirst().trim().equals("")) {
                    billingAddress.setStreetNrFirst(cust.getCustomer().getBillingAddresses().getStreetNrFirst());
                }
            

        });

        customer.setBillingAddresses(billingAddress);
        customer.setContactMedium(contactMedium);
        customer.setIndividual(individual);
        response.setCustomer(customer);

        return Optional.ofNullable(response);
    }

}
