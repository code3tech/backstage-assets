package br.com.tlf.dip.customer.customerinformationmgmt.application.service.adapters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;

import br.com.tlf.dip.customer.customerinformationmgmt.domain.BillingAddresses;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.ContactMedium;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.Customer;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.CustomerInformationSummaryResponse;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.Email;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.Individual;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.MobilePhone;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.siebel.Conta;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.siebel.NVGetCustomerWSOutput;

public class SiebelAdapter implements CustomerAdapter<NVGetCustomerWSOutput> {

    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

    @Override
    public Optional<CustomerInformationSummaryResponse> getResponse(NVGetCustomerWSOutput input) {

        if (input == null)
            return Optional.empty();
        Conta legacyData = new Conta();

        try {
            legacyData = ((NVGetCustomerWSOutput) input).getNVGetCustomerOut().getConta();
            if (legacyData == null)
                return Optional.empty();
        } catch (NullPointerException npe) {
            return Optional.empty();
        }

        CustomerInformationSummaryResponse response = new CustomerInformationSummaryResponse();
        Customer customer = new Customer();
        BillingAddresses billingAddress = new BillingAddresses();
        ContactMedium contactMedium = new ContactMedium();
        Individual individual = new Individual();

        individual.setFirstName(Objects.requireNonNullElse(legacyData.getNomeCompleto(), ""));
        individual.setLastName(null);
        individual.setMotherName(Objects.requireNonNullElse(legacyData.getNomeMae(), ""));
        individual.setMotherNameSerasa(Objects.requireNonNullElse(legacyData.getNomeMaeSerasa(), ""));

        if (legacyData.getContato() != null || legacyData.getContato().size() > 0) {
            legacyData.getContato().stream().filter(x -> x.getPrincipal().equalsIgnoreCase("SIM")).forEach(x -> {
                contactMedium.setEmail(Objects.requireNonNullElse(x.getEmail(), ""));
                contactMedium.setMobilePhone(Objects.requireNonNullElse(x.getTelefoneCelular(), ""));
                contactMedium.setWorkPhone(Objects.requireNonNullElse(x.getTelefoneComercial(), ""));
            });

            LinkedHashSet<Email> emailList = new LinkedHashSet<>();
            LinkedHashSet<MobilePhone> mobilePhoneList = new LinkedHashSet<>();
            legacyData.getContato().removeIf(x -> x.getPrincipal().equalsIgnoreCase("SIM"));
            legacyData.getContato().stream().forEach(x -> {
                if(x.getEmail() != null && x.getEmail().trim().length()>0) emailList.add(new Email(x.getEmail()));
                if(x.getTelefoneCelular() != null && x.getTelefoneCelular().trim().length()>0) mobilePhoneList.add(new MobilePhone(x.getTelefoneCelular()));
            });

            contactMedium.setEmailList(emailList);
            contactMedium.setMobilePhoneList(mobilePhoneList);
        }
        customer.setDocumentNumber(Objects.requireNonNullElse(legacyData.getDocumento(), ""));
        try {
            customer.setCustomerBirthDate(this.sdf.parse(legacyData.getDataNascimento()));
        } catch (ParseException pe) {
            customer.setCustomerBirthDate(null);
        }

        try {
            customer.setCustomerBirthDateSerasa(this.sdf.parse(legacyData.getDataNascimentoSerasa()));
        } catch (ParseException pe) {
            customer.setCustomerBirthDateSerasa(null);
        }

        customer.setCustomerSegment(legacyData.getSegmento());
        customer.setCustomerType(null);
        customer.setAging(null);
        customer.setAgingMobile(null);

        billingAddress.setCity(null);
        billingAddress.setComplement(null);
        billingAddress.setCountry(null);
        billingAddress.setPostCode(null);
        billingAddress.setStateOfProvince(null);
        billingAddress.setStreetName(null);
        billingAddress.setStreetNrFirst(null);

        customer.setBillingAddresses(billingAddress);
        customer.setContactMedium(contactMedium);
        customer.setIndividual(individual);
        response.setCustomer(customer);

        return Optional.ofNullable(response);
    }

}
