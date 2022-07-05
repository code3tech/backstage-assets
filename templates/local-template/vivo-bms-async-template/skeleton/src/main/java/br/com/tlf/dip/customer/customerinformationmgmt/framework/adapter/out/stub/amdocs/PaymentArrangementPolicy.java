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
 * <p>Classe Java de PaymentArrangementPolicy.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentArrangementPolicy"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CORP_OR_GOV_DEF"/&gt;
 *     &lt;enumeration value="CORP_OR_GOV_HIGH"/&gt;
 *     &lt;enumeration value="CORP_OR_GOV_LOW"/&gt;
 *     &lt;enumeration value="RESIDENTIAL_DEFAULT"/&gt;
 *     &lt;enumeration value="RESIDENTIAL_HIGH_DEBT"/&gt;
 *     &lt;enumeration value="RESIDENTIAL_LOW_DEBT"/&gt;
 *     &lt;enumeration value="RESIDENTIAL_MIN_DEBT"/&gt;
 *     &lt;enumeration value="SMALL_BUSINESS_DEF"/&gt;
 *     &lt;enumeration value="SMALL_BUSINESS_HIGH"/&gt;
 *     &lt;enumeration value="SMALL_BUSINESS_LOW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentArrangementPolicy", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1")
@XmlEnum
public enum PaymentArrangementPolicy {


    /**
     * Corporation or Government default
     * 
     */
    CORP_OR_GOV_DEF,

    /**
     * Corporation or Government high
     * 
     */
    CORP_OR_GOV_HIGH,

    /**
     * Corporation or Government low
     * 
     */
    CORP_OR_GOV_LOW,

    /**
     * Residential default
     * 
     */
    RESIDENTIAL_DEFAULT,

    /**
     * Residential high
     * 
     */
    RESIDENTIAL_HIGH_DEBT,

    /**
     * Residential low
     * 
     */
    RESIDENTIAL_LOW_DEBT,

    /**
     * Residential minimum
     * 
     */
    RESIDENTIAL_MIN_DEBT,

    /**
     * Small business default
     * 
     */
    SMALL_BUSINESS_DEF,

    /**
     * Small business high
     * 
     */
    SMALL_BUSINESS_HIGH,

    /**
     * Small business low
     * 
     */
    SMALL_BUSINESS_LOW;

    public String value() {
        return name();
    }

    public static PaymentArrangementPolicy fromValue(String v) {
        return valueOf(v);
    }

}
