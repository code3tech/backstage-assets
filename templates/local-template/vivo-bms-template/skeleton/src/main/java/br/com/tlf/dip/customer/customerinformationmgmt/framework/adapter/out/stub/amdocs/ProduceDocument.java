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
 * <p>Classe Java de ProduceDocument.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ProduceDocument"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DONT_PRODUCE_OR_EXTRACT"/&gt;
 *     &lt;enumeration value="EXTRACT_DONT_PRODUCE"/&gt;
 *     &lt;enumeration value="PRODUCE_AND_EXTRACT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProduceDocument", namespace = "http://amdocs/tef-vivo/customerprofile-common/types/v1")
@XmlEnum
public enum ProduceDocument {

    DONT_PRODUCE_OR_EXTRACT,
    EXTRACT_DONT_PRODUCE,
    PRODUCE_AND_EXTRACT;

    public String value() {
        return name();
    }

    public static ProduceDocument fromValue(String v) {
        return valueOf(v);
    }

}