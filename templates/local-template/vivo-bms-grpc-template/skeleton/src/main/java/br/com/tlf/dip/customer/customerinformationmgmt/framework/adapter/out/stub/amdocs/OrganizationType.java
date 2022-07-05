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
 * <p>Classe Java de OrganizationType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OrganizationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Competitor"/&gt;
 *     &lt;enumeration value="Corporate"/&gt;
 *     &lt;enumeration value="Customer"/&gt;
 *     &lt;enumeration value="Federal"/&gt;
 *     &lt;enumeration value="Government"/&gt;
 *     &lt;enumeration value="Partner"/&gt;
 *     &lt;enumeration value="Reseller"/&gt;
 *     &lt;enumeration value="Residential"/&gt;
 *     &lt;enumeration value="Supplier"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrganizationType", namespace = "http://amdocs/tef-vivo/commonbusinessentities-common/types/v1")
@XmlEnum
public enum OrganizationType {

    @XmlEnumValue("Competitor")
    COMPETITOR("Competitor"),
    @XmlEnumValue("Corporate")
    CORPORATE("Corporate"),
    @XmlEnumValue("Customer")
    CUSTOMER("Customer"),
    @XmlEnumValue("Federal")
    FEDERAL("Federal"),
    @XmlEnumValue("Government")
    GOVERNMENT("Government"),
    @XmlEnumValue("Partner")
    PARTNER("Partner"),
    @XmlEnumValue("Reseller")
    RESELLER("Reseller"),
    @XmlEnumValue("Residential")
    RESIDENTIAL("Residential"),
    @XmlEnumValue("Supplier")
    SUPPLIER("Supplier");
    private final String value;

    OrganizationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrganizationType fromValue(String v) {
        for (OrganizationType c: OrganizationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
