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
 * <p>Classe Java de TelephoneType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TelephoneType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONTACT"/&gt;
 *     &lt;enumeration value="HOME"/&gt;
 *     &lt;enumeration value="MOBILE"/&gt;
 *     &lt;enumeration value="MOBILE_1"/&gt;
 *     &lt;enumeration value="MOBILE_2"/&gt;
 *     &lt;enumeration value="WORK"/&gt;
 *     &lt;enumeration value="WORK_1"/&gt;
 *     &lt;enumeration value="WORK_2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TelephoneType", namespace = "http://amdocs/tef-vivo/commonbusinessentities-common/types/v1")
@XmlEnum
public enum TelephoneType {

    CONTACT,
    HOME,
    MOBILE,
    MOBILE_1,
    MOBILE_2,
    WORK,
    WORK_1,
    WORK_2;

    public String value() {
        return name();
    }

    public static TelephoneType fromValue(String v) {
        return valueOf(v);
    }

}
