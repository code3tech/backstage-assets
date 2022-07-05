//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MaritalStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MaritalStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Divorced"/&gt;
 *     &lt;enumeration value="Married"/&gt;
 *     &lt;enumeration value="Separated"/&gt;
 *     &lt;enumeration value="Single"/&gt;
 *     &lt;enumeration value="Widowed"/&gt;
 *     &lt;enumeration value="Desquitado"/&gt;
 *     &lt;enumeration value="Outros"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MaritalStatus", namespace = "http://amdocs/tef-vivo/commonbusinessentities-common/types/v1")
@XmlEnum
public enum MaritalStatus {

    @XmlEnumValue("Divorced")
    DIVORCED("Divorced"),
    @XmlEnumValue("Married")
    MARRIED("Married"),
    @XmlEnumValue("Separated")
    SEPARATED("Separated"),
    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("Widowed")
    WIDOWED("Widowed"),
    @XmlEnumValue("Desquitado")
    DESQUITADO("Desquitado"),
    @XmlEnumValue("Outros")
    OUTROS("Outros");
    private final String value;

    MaritalStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaritalStatus fromValue(String v) {
        for (MaritalStatus c: MaritalStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
