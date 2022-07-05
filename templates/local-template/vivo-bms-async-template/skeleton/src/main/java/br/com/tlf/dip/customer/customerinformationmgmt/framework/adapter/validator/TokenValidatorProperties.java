package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.validator;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix = "oam")
public class TokenValidatorProperties {
    
    private final String pubcert;
    private final String clientId;
    private final String scope;

    @ConstructorBinding
    public TokenValidatorProperties(String pubcert, String clientId, String scope){
        this.pubcert = pubcert;
        this.clientId = clientId;
        this.scope = scope;
    }

    public String getPubcert() {
        return pubcert;
    }

    public String getClientId() {
        return clientId;
    }

    public String getScope() {
        return scope;
    }

    

}
