package br.com.tlf.dip.customer.customerinformationmgmt.application.service.adapters;

import java.util.Objects;
import java.util.Optional;

import br.com.tlf.dip.customer.customerinformationmgmt.domain.BillingAddresses;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.ContactMedium;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.Customer;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.CustomerInformationSummaryResponse;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.Individual;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs.GeographicAddressInfo;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs.IndividualInfo;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs.RetrieveCustomerDetailsResponse;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.helper.Util;

public class AmdocsAdapter implements CustomerAdapter<RetrieveCustomerDetailsResponse> {

    @Override
    public Optional<CustomerInformationSummaryResponse> getResponse(RetrieveCustomerDetailsResponse input) {

        if(input == null) return Optional.empty();
        IndividualInfo legacyData = new IndividualInfo();
        GeographicAddressInfo address;

        try {
            legacyData = ((RetrieveCustomerDetailsResponse) input).getIndividualDetail().getIndividual();
        }
        catch(NullPointerException npe) {
            return Optional.empty();
        }

        try{
            address = ((RetrieveCustomerDetailsResponse) input).getCustomerDetail().getAddress();
        }catch(NullPointerException npe){
            address = new GeographicAddressInfo();
        }

        CustomerInformationSummaryResponse response = new CustomerInformationSummaryResponse();
        Customer customer = new Customer();
        BillingAddresses billingAddress = new BillingAddresses();
        ContactMedium contactMedium = new ContactMedium();
        Individual individual = new Individual();

        individual.setFirstName(legacyData.getName().getGivenName() != null ? legacyData.getName().getGivenName() : null);
        individual.setLastName(legacyData.getName().getFamilyName() != null ? legacyData.getName().getFamilyName() : null);
        individual.setMotherName(legacyData.getName().getMotherName() != null ? legacyData.getName().getMotherName() : null);
        individual.setMotherNameSerasa(null);

        contactMedium.setEmail(legacyData.getEmail() != null ? legacyData.getEmail() : null);
        contactMedium.setMobilePhone(legacyData.getTelephone() != null ? legacyData.getTelephone() : null);
        contactMedium.setWorkPhone(null);

        customer.setDocumentNumber(Objects.requireNonNullElse(legacyData.getIdentifications().getIdentification().stream().findFirst().get().getCardNumber(),""));
        customer.setCustomerBirthDate(legacyData.getBirthDate() != null ? Util.toDate(legacyData.getBirthDate()) : null);
        customer.setCustomerBirthDateSerasa(null);
        customer.setAging(null);
        customer.setAgingMobile(null);
        customer.setCustomerSegment(legacyData.getSegmentation() != null ? legacyData.getSegmentation() : null);
        customer.setCustomerType(null);

        billingAddress.setCity(address.getCity() != null ? address.getCity() : null);
        billingAddress.setComplement(address.getComplement1Value() != null ? address.getComplement1Value() : null);
        billingAddress.setCountry(address.getCountry() != null && address.getCountry().name() != null ? address.getCountry().name() : null);
        billingAddress.setPostCode(address.getPostalCode() != null ? address.getPostalCode() : null);
        billingAddress.setStateOfProvince(address.getState() != null && address.getState().getName() != null ? address.getState().getName() : null);
        billingAddress.setStreetName(address.getStreet() != null ? address.getStreet() : null);
        billingAddress.setStreetNrFirst(address.getStreetNumber() != null ? address.getStreetNumber() : null);

        customer.setBillingAddresses(billingAddress);
        customer.setContactMedium(contactMedium);
        customer.setIndividual(individual);
        response.setCustomer(customer);

        return Optional.ofNullable(response);
    }

   
    
}
