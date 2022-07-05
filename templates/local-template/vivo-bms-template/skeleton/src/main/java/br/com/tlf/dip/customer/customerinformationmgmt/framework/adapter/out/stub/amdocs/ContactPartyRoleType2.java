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
 * <p>Classe Java de ContactPartyRoleType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactPartyRoleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUSTOMER_NAME_ADDRESS"/&gt;
 *     &lt;enumeration value="MAILING_NAME_ADDRESS"/&gt;
 *     &lt;enumeration value="PRIMARY"/&gt;
 *     &lt;enumeration value="SECONDARY"/&gt;
 *     &lt;enumeration value="TAX_NAME_ADDRESS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContactPartyRoleType")
@XmlEnum
public enum ContactPartyRoleType2 {

    CUSTOMER_NAME_ADDRESS,
    MAILING_NAME_ADDRESS,
    PRIMARY,
    SECONDARY,
    TAX_NAME_ADDRESS;

    public String value() {
        return name();
    }

    public static ContactPartyRoleType2 fromValue(String v) {
        return valueOf(v);
    }

}
