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
 * <p>Classe Java de SizeEmployees.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SizeEmployees"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ONE_HUNDRED_TO_TWO_HUNDRED_FORTY_NINE"/&gt;
 *     &lt;enumeration value="OVER_ONE"/&gt;
 *     &lt;enumeration value="TEN_TO_NINETY_NINE"/&gt;
 *     &lt;enumeration value="TWO_HUNDRED_FIFTY_TO_NINE_HUNDRED_NINETY_NINE"/&gt;
 *     &lt;enumeration value="UNDER_TEN"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SizeEmployees", namespace = "http://amdocs/tef-vivo/commonbusinessentities-common/types/v1")
@XmlEnum
public enum SizeEmployees {

    ONE_HUNDRED_TO_TWO_HUNDRED_FORTY_NINE,
    OVER_ONE,
    TEN_TO_NINETY_NINE,
    TWO_HUNDRED_FIFTY_TO_NINE_HUNDRED_NINETY_NINE,
    UNDER_TEN,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static SizeEmployees fromValue(String v) {
        return valueOf(v);
    }

}
