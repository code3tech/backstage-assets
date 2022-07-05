package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.tlf.dip.customer.customerinformationmgmt.application.port.out.OudPortOut;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.oud.OudRequestType;
import br.com.tlf.dip.customer.customerinformationmgmt.domain.oud.OudResponseType;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.exception.AbstractBusinessException;
import io.netty.handler.logging.LogLevel;
import reactor.netty.http.client.HttpClient;
import reactor.netty.transport.logging.AdvancedByteBufFormat;

@Component
public class SearchUserOudImpl implements OudPortOut {

    @Value("${oud.endpoint}")
    private String endpoint;

    @Value("${oud.encoded-basic-credentials}")
    private String encodedBasicAuth;

    private String path = "/CustomerProvisioning/searchUser";

    private WebClient getWebClient(){
        HttpClient httpClient = HttpClient.create().wiretap("reactor.netty.http.client.HttpClient", LogLevel.DEBUG, AdvancedByteBufFormat.TEXTUAL);
        return WebClient.builder()
        .baseUrl(this.endpoint)
        .clientConnector(new ReactorClientHttpConnector(httpClient))
        .build();
    }

    @Override
    public OudResponseType searchUser(OudRequestType oudRequest) throws AbstractBusinessException {
        OudResponseType response = this.getWebClient().post()
                        .uri(uriBuilder -> uriBuilder
                            .path(this.path)
                            .build())
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .header("Authorization", String.format("Basic %s", this.encodedBasicAuth))
                        .bodyValue(oudRequest)
                        .retrieve()
		                .bodyToMono(OudResponseType[].class)
                        .block()[0];
        return response;
    }
    
}
