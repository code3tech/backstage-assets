package br.com.tlf.dip.customer.customerinformationmgmt.domain.oud;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OudUserType {

    private String entryUUID;
    private String mail;

    @JsonAlias("ds-pwp-last-login-time")
    private String dsPwpLastLoginTime;
    
    private String givenname;
    private String nrdocumento;
    private String[] vivoAuthorizationId;
    private String sn;
    private String cn;
    private String userID;
    private String pwdChangedTime;
    private String createTimestamp;
    private String modifyTimestamp;


}
