package br.com.tlf.dip.customer.customerinformationmgmt.application.service.adapters;

import java.util.Optional;

import br.com.tlf.dip.customer.customerinformationmgmt.domain.CustomerInformationSummaryResponse;

public interface CustomerAdapter<T> {
    
    public Optional<CustomerInformationSummaryResponse> getResponse(T input);
 
}
