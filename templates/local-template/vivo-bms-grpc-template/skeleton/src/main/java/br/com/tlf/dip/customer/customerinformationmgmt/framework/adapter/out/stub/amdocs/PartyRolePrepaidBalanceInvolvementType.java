//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PartyRolePrepaidBalanceInvolvementType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyRolePrepaidBalanceInvolvementType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRIMARY"/&gt;
 *     &lt;enumeration value="SECONDARY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyRolePrepaidBalanceInvolvementType", namespace = "http://amdocs/tef-vivo/customerprofile-common/types/v1")
@XmlEnum
public enum PartyRolePrepaidBalanceInvolvementType {

    PRIMARY,
    SECONDARY;

    public String value() {
        return name();
    }

    public static PartyRolePrepaidBalanceInvolvementType fromValue(String v) {
        return valueOf(v);
    }

}