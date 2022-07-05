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
 * <p>Classe Java de ChargeOrigin.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ChargeOrigin"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AR"/&gt;
 *     &lt;enumeration value="BACKDATING"/&gt;
 *     &lt;enumeration value="BOD_COMPENSATION"/&gt;
 *     &lt;enumeration value="CHARGE_CALCULATOR"/&gt;
 *     &lt;enumeration value="CM"/&gt;
 *     &lt;enumeration value="DIFF_CALCULATOR"/&gt;
 *     &lt;enumeration value="DISCOUNT"/&gt;
 *     &lt;enumeration value="DOCUMENTATION"/&gt;
 *     &lt;enumeration value="INVOICING"/&gt;
 *     &lt;enumeration value="MANUAL"/&gt;
 *     &lt;enumeration value="M_COMMERCE"/&gt;
 *     &lt;enumeration value="QUOTATION_SERVER"/&gt;
 *     &lt;enumeration value="RATER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChargeOrigin", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1")
@XmlEnum
public enum ChargeOrigin {


    /**
     * Charge received from AR
     * 
     */
    AR,

    /**
     * Charge inserted by BTLEOD as part of backdated transactions processing
     * 
     */
    BACKDATING,

    /**
     * Bill on Demand compensation charge
     * 
     */
    BOD_COMPENSATION,

    /**
     * Charge calculator
     * 
     */
    CHARGE_CALCULATOR,

    /**
     * Charge received from CM
     * 
     */
    CM,

    /**
     * Diff calculator
     * 
     */
    DIFF_CALCULATOR,

    /**
     * Discount
     * 
     */
    DISCOUNT,

    /**
     * Documentation
     * 
     */
    DOCUMENTATION,

    /**
     * Invoicing
     * 
     */
    INVOICING,

    /**
     * Manually created charge
     * 
     */
    MANUAL,

    /**
     * M-commerce
     * 
     */
    M_COMMERCE,

    /**
     * Charge Inserted by Quotation Server
     * 
     */
    QUOTATION_SERVER,

    /**
     * Charge received from Rater
     * 
     */
    RATER;

    public String value() {
        return name();
    }

    public static ChargeOrigin fromValue(String v) {
        return valueOf(v);
    }

}
