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
 * <p>Classe Java de Salutation.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Salutation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Dr."/&gt;
 *     &lt;enumeration value="Mr."/&gt;
 *     &lt;enumeration value="Mrs."/&gt;
 *     &lt;enumeration value="Ms."/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Salutation", namespace = "http://amdocs/tef-vivo/commonbusinessentities-common/types/v1")
@XmlEnum
public enum Salutation {

    @XmlEnumValue("Dr.")
    DR("Dr."),
    @XmlEnumValue("Mr.")
    MR("Mr."),
    @XmlEnumValue("Mrs.")
    MRS("Mrs."),
    @XmlEnumValue("Ms.")
    MS("Ms.");
    private final String value;

    Salutation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Salutation fromValue(String v) {
        for (Salutation c: Salutation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
