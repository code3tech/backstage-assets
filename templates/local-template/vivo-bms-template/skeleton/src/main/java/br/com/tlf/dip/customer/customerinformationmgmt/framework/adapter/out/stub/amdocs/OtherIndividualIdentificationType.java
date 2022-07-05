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
 * <p>Classe Java de OtherIndividualIdentificationType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="OtherIndividualIdentificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Social Security Number"/&gt;
 *     &lt;enumeration value="CPF"/&gt;
 *     &lt;enumeration value="National Insurance Number"/&gt;
 *     &lt;enumeration value="Passport Number"/&gt;
 *     &lt;enumeration value="Driver's License Number"/&gt;
 *     &lt;enumeration value="ID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OtherIndividualIdentificationType", namespace = "http://amdocs/tef-vivo/commonbusinessentities-common/types/v1")
@XmlEnum
public enum OtherIndividualIdentificationType {

    @XmlEnumValue("Social Security Number")
    SOCIAL_SECURITY_NUMBER("Social Security Number"),
    CPF("CPF"),
    @XmlEnumValue("National Insurance Number")
    NATIONAL_INSURANCE_NUMBER("National Insurance Number"),
    @XmlEnumValue("Passport Number")
    PASSPORT_NUMBER("Passport Number"),
    @XmlEnumValue("Driver's License Number")
    DRIVER_S_LICENSE_NUMBER("Driver's License Number"),
    ID("ID");
    private final String value;

    OtherIndividualIdentificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OtherIndividualIdentificationType fromValue(String v) {
        for (OtherIndividualIdentificationType c: OtherIndividualIdentificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
