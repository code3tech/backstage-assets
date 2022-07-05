package br.com.tlf.dip.customer.customerinformationmgmt.domain.oud;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter 
public class OudResponseType {
    
    private String entryUUID;
    private String mail;

    @JsonAlias("ds-pwp-last-login-time")
    private String dsPwpLastLoginTime;
    
    private String givenname;
    private String nrdocumento;

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private String[] vivoAuthorizationId;
    private String sn;
    private String cn;
    private String userID;
    private String pwdChangedTime;
    private String createTimestamp;
    private String modifyTimestamp;

}
