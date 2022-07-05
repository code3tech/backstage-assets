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
 * <p>Classe Java de InvoiceType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoiceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BILL_RECEIVER"/&gt;
 *     &lt;enumeration value="CREDIT_NOTE"/&gt;
 *     &lt;enumeration value="DEBIT_NOTE"/&gt;
 *     &lt;enumeration value="DEPOSIT"/&gt;
 *     &lt;enumeration value="DISHONORED_CHECK"/&gt;
 *     &lt;enumeration value="INVOICE_RECEIVER"/&gt;
 *     &lt;enumeration value="REFUND"/&gt;
 *     &lt;enumeration value="TOLERANCE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvoiceType", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1")
@XmlEnum
public enum InvoiceType {


    /**
     * Invoice created as part of Invoicing run for CustomerAccount of type CustomerBillReceiver
     * 
     */
    BILL_RECEIVER,
    CREDIT_NOTE,
    DEBIT_NOTE,
    DEPOSIT,
    DISHONORED_CHECK,

    /**
     * Invoice created as part of Invoicing run for CustomerAccount of type CustomerInvoiceReceiver
     * 
     */
    INVOICE_RECEIVER,
    REFUND,
    TOLERANCE;

    public String value() {
        return name();
    }

    public static InvoiceType fromValue(String v) {
        return valueOf(v);
    }

}
