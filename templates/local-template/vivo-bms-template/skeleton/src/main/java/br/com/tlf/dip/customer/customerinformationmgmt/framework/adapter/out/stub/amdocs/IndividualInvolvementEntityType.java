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
 * <p>Classe Java de IndividualInvolvementEntityType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="IndividualInvolvementEntityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUSTOMER"/&gt;
 *     &lt;enumeration value="CUSTOMERACCOUNT"/&gt;
 *     &lt;enumeration value="CUSTOMERBILLSPEC"/&gt;
 *     &lt;enumeration value="PREPAIDBALANCE"/&gt;
 *     &lt;enumeration value="SUBSCRIPTION_PRODUCT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IndividualInvolvementEntityType", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
@XmlEnum
public enum IndividualInvolvementEntityType {


    /**
     * Filter for direct involvements with the Customer.
     * 
     */
    CUSTOMER,

    /**
     * Filter for involvements with CustomerAccounts of the Customer.
     * 
     */
    CUSTOMERACCOUNT,

    /**
     * Filter for involvements with CustomerBillSpecs of the Customer.
     * 
     */
    CUSTOMERBILLSPEC,

    /**
     * Filter for involvements with PrepaidBalances of the Customer.
     * 
     */
    PREPAIDBALANCE,

    /**
     * Filter for involvements with the Products representing Subscriptions of the Customer.
     * 
     */
    SUBSCRIPTION_PRODUCT;

    public String value() {
        return name();
    }

    public static IndividualInvolvementEntityType fromValue(String v) {
        return valueOf(v);
    }

}
