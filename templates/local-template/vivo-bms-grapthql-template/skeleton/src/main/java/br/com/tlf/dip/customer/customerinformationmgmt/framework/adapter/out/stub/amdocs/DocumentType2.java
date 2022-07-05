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
 * <p>Classe Java de DocumentType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BILL"/&gt;
 *     &lt;enumeration value="BILL_LIST"/&gt;
 *     &lt;enumeration value="EXP_BILL"/&gt;
 *     &lt;enumeration value="EXPRESS_PAYMENT_SLIP"/&gt;
 *     &lt;enumeration value="CALL_DETAILS"/&gt;
 *     &lt;enumeration value="CALL_DETAILS_ASCII"/&gt;
 *     &lt;enumeration value="TAX_INVOICE"/&gt;
 *     &lt;enumeration value="PAYMENT_ORDER"/&gt;
 *     &lt;enumeration value="LIST_PAYMENT_ORDER"/&gt;
 *     &lt;enumeration value="STATEMENT_OF_SERVICES"/&gt;
 *     &lt;enumeration value="RECONCILIATION_REPORT"/&gt;
 *     &lt;enumeration value="PREPAYMENT_SLIP"/&gt;
 *     &lt;enumeration value="PAYMENT_SLIP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentType", namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1")
@XmlEnum
public enum DocumentType2 {


    /**
     * Bill
     * 
     */
    BILL,

    /**
     * Bill List
     * 
     */
    BILL_LIST,

    /**
     * Express Bill
     * 
     */
    EXP_BILL,

    /**
     * Express Payment Slip
     * 
     */
    EXPRESS_PAYMENT_SLIP,

    /**
     * Call Details
     * 
     */
    CALL_DETAILS,

    /**
     * Call Details Ascii
     * 
     */
    CALL_DETAILS_ASCII,

    /**
     * Tax Invoice
     * 
     */
    TAX_INVOICE,

    /**
     * Payment Order
     * 
     */
    PAYMENT_ORDER,

    /**
     * List of Payment Orders
     * 
     */
    LIST_PAYMENT_ORDER,

    /**
     * Statement of Services
     * 
     */
    STATEMENT_OF_SERVICES,

    /**
     * Reconciliation Report
     * 
     */
    RECONCILIATION_REPORT,

    /**
     * Prepayment Slip
     * 
     */
    PREPAYMENT_SLIP,

    /**
     * Payment Slip
     * 
     */
    PAYMENT_SLIP;

    public String value() {
        return name();
    }

    public static DocumentType2 fromValue(String v) {
        return valueOf(v);
    }

}
