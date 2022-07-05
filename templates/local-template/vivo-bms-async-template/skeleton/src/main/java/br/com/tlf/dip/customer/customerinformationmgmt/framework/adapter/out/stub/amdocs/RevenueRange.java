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
 * <p>Classe Java de RevenueRange.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RevenueRange"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FIFTY_MILLION_TO_ONE_HUNDRED_MILLION"/&gt;
 *     &lt;enumeration value="FIVE_MILLION_TO_TWENTY_MILLION"/&gt;
 *     &lt;enumeration value="ONE_MILLION_TO_FIVE_MILLION"/&gt;
 *     &lt;enumeration value="OVER_ONE_HUNDRED_MILLION"/&gt;
 *     &lt;enumeration value="TWENTY_MILLION_TO_FIFTY_MILLION"/&gt;
 *     &lt;enumeration value="UNDER_ONE_MILLION"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RevenueRange", namespace = "http://amdocs/tef-vivo/commonbusinessentities-common/types/v1")
@XmlEnum
public enum RevenueRange {

    FIFTY_MILLION_TO_ONE_HUNDRED_MILLION,
    FIVE_MILLION_TO_TWENTY_MILLION,
    ONE_MILLION_TO_FIVE_MILLION,
    OVER_ONE_HUNDRED_MILLION,
    TWENTY_MILLION_TO_FIFTY_MILLION,
    UNDER_ONE_MILLION,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static RevenueRange fromValue(String v) {
        return valueOf(v);
    }

}
