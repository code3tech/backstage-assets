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
 * <p>Classe Java de RegulatoryAuthorityType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RegulatoryAuthorityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STATE"/&gt;
 *     &lt;enumeration value="FEDERAL"/&gt;
 *     &lt;enumeration value="LOCAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RegulatoryAuthorityType", namespace = "http://amdocs/tef-vivo/commonbusinessentities-common/types/v1")
@XmlEnum
public enum RegulatoryAuthorityType {

    STATE,
    FEDERAL,
    LOCAL;

    public String value() {
        return name();
    }

    public static RegulatoryAuthorityType fromValue(String v) {
        return valueOf(v);
    }

}
