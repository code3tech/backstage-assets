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
 * <p>Classe Java de RefundType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OVERPAYMENT"/&gt;
 *     &lt;enumeration value="DEPOSIT"/&gt;
 *     &lt;enumeration value="PAYMENT"/&gt;
 *     &lt;enumeration value="DEPOSIT_REVERSAL"/&gt;
 *     &lt;enumeration value="OVERPAYMENT_REVERSAL"/&gt;
 *     &lt;enumeration value="PAYMENT_REVERSAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RefundType", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1")
@XmlEnum
public enum RefundType {


    /**
     * Overpayment
     * 
     */
    OVERPAYMENT,

    /**
     * Deposit
     * 
     */
    DEPOSIT,

    /**
     * Payment
     * 
     */
    PAYMENT,

    /**
     * Deposit Reversal
     * 
     */
    DEPOSIT_REVERSAL,

    /**
     * Overpayment Reversal
     * 
     */
    OVERPAYMENT_REVERSAL,

    /**
     * Payment reversal
     * 
     */
    PAYMENT_REVERSAL;

    public String value() {
        return name();
    }

    public static RefundType fromValue(String v) {
        return valueOf(v);
    }

}
