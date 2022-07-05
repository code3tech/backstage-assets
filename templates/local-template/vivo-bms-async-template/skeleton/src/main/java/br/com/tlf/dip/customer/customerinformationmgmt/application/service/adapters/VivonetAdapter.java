package br.com.tlf.dip.customer.customerinformationmgmt.application.service.adapters;

import br.com.tlf.dip.customer.customerinformationmgmt.domain.*;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.dto.CadastroDTO;

import java.util.Objects;
import java.util.Optional;

public class VivonetAdapter implements CustomerAdapter<CadastroDTO> {

    @Override
    public Optional<CustomerInformationSummaryResponse> getResponse(CadastroDTO input) {

        if (input == null) return Optional.empty();
        CadastroDTO legacyData = new CadastroDTO();

        try {
            legacyData = ((CadastroDTO) input);
            if(legacyData.getCliente() == null || legacyData.getContatoCliente() == null) return Optional.empty();
        } catch (NullPointerException npe) {
            return Optional.empty();
        }

        CustomerInformationSummaryResponse response = new CustomerInformationSummaryResponse();
        Customer customer = new Customer();
        BillingAddresses billingAddress = new BillingAddresses();
        ContactMedium contactMedium = new ContactMedium();
        Individual individual = new Individual();

        individual.setFirstName(Objects.requireNonNullElse(legacyData.getCliente().getNomeCliente(), ""));
        individual.setLastName(Objects.requireNonNullElse(legacyData.getCliente().getSobrenomeCliente(), ""));
        individual.setMotherName(Objects.requireNonNullElse(legacyData.getCliente().getNmMaeCliente(), ""));
        individual.setMotherNameSerasa(null);

        if (legacyData.getContatoCliente() != null && legacyData.getContatoCliente().getTipoContato() != null) {
            if (legacyData.getContatoCliente().getTipoContato().equalsIgnoreCase("EMAIL"))
                contactMedium.setEmail(Objects.requireNonNullElse(legacyData.getContatoCliente().getContato(), ""));
            else
                contactMedium
                        .setMobilePhone(Objects.requireNonNullElse(legacyData.getContatoCliente().getContato(), ""));
        }
        contactMedium.setWorkPhone(null);

        customer.setDocumentNumber(Objects.requireNonNullElse(legacyData.getCliente().getDocumentoCliente(), ""));
        customer.setCustomerType(Objects.requireNonNullElse(legacyData.getCliente().getTpCliente(), ""));

        customer.setCustomerSegment(legacyData.getCliente().getDsSegmento());

        try {
            customer.setCustomerBirthDate(legacyData.getCliente().getDtNascimentoCliente());
        } catch (NullPointerException npe) {
            //SKIP
        }

        try {
            customer.setAgingMobile(legacyData.getCliente().getAging());
        } catch (NullPointerException npe) {
            //SKIP
        }

        customer.setAging(null);
        customer.setCustomerBirthDateSerasa(null);

        billingAddress.setCity(null);
        billingAddress.setComplement(null);
        billingAddress.setCountry(null);
        billingAddress.setPostCode(null);
        billingAddress.setStateOfProvince(null);
        billingAddress.setStreetName(Objects.requireNonNullElse(legacyData.getCliente().getEndereco(), ""));
        billingAddress.setStreetNrFirst(null);

        customer.setBillingAddresses(billingAddress);
        customer.setContactMedium(contactMedium);
        customer.setIndividual(individual);
        response.setCustomer(customer);

        return Optional.ofNullable(response);
    }

}
