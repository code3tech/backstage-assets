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
 * <p>Classe Java de RechargeChannel.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RechargeChannel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="E_PAYMENT"/&gt;
 *     &lt;enumeration value="BILLING"/&gt;
 *     &lt;enumeration value="CUSTOMER_MANAGER"/&gt;
 *     &lt;enumeration value="ATM"/&gt;
 *     &lt;enumeration value="IVR"/&gt;
 *     &lt;enumeration value="AR"/&gt;
 *     &lt;enumeration value="CRM"/&gt;
 *     &lt;enumeration value="VR"/&gt;
 *     &lt;enumeration value="RATER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RechargeChannel", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1")
@XmlEnum
public enum RechargeChannel {


    /**
     * E Payment
     * 
     */
    E_PAYMENT,

    /**
     * Billing
     * 
     */
    BILLING,

    /**
     * Customer Manager
     * 
     */
    CUSTOMER_MANAGER,

    /**
     * ATM
     * 
     */
    ATM,

    /**
     * IVR
     * 
     */
    IVR,

    /**
     * Accounts Receivable
     * 
     */
    AR,

    /**
     * Customer Relationship Manager
     * 
     */
    CRM,

    /**
     * Voucher
     * 
     */
    VR,

    /**
     * Rater
     * 
     */
    RATER;

    public String value() {
        return name();
    }

    public static RechargeChannel fromValue(String v) {
        return valueOf(v);
    }

}
