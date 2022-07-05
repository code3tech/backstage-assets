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
 * <p>Classe Java de LogicalResourceTypeNameAll.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LogicalResourceTypeNameAll"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MSISDN"/&gt;
 *     &lt;enumeration value="SIM"/&gt;
 *     &lt;enumeration value="IMSI"/&gt;
 *     &lt;enumeration value="USER_NAME"/&gt;
 *     &lt;enumeration value="USIM"/&gt;
 *     &lt;enumeration value="VPN"/&gt;
 *     &lt;enumeration value="IPV4"/&gt;
 *     &lt;enumeration value="PRIVATE_NUMBER"/&gt;
 *     &lt;enumeration value="UNIVERSAL_INTEGRATED_CIRCUIT_CARD"/&gt;
 *     &lt;enumeration value="LOGIN_ID"/&gt;
 *     &lt;enumeration value="CONNECTION_NUMBER"/&gt;
 *     &lt;enumeration value="ACCESSORY_NUMBER"/&gt;
 *     &lt;enumeration value="VOIP"/&gt;
 *     &lt;enumeration value="TELEPHONE_NUMBER"/&gt;
 *     &lt;enumeration value="EMAIL"/&gt;
 *     &lt;enumeration value="EMTA_SERIAL_NUMBER"/&gt;
 *     &lt;enumeration value="CALLING_CARD_NUMBER"/&gt;
 *     &lt;enumeration value="EXT"/&gt;
 *     &lt;enumeration value="INTEGRATED_SERVICES_DIGITAL_NETWORK"/&gt;
 *     &lt;enumeration value="IP_WIRELINE"/&gt;
 *     &lt;enumeration value="CIRCUIT_ID"/&gt;
 *     &lt;enumeration value="PVC"/&gt;
 *     &lt;enumeration value="WL_DUMMY_RESOURCE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LogicalResourceTypeNameAll", namespace = "http://amdocs/tef-vivo/resource-common/types/v1")
@XmlEnum
public enum LogicalResourceTypeNameAll {


    /**
     * MSISDN
     * 
     */
    MSISDN("MSISDN"),

    /**
     * SIM
     * 
     */
    SIM("SIM"),

    /**
     * IMSI
     * 
     */
    IMSI("IMSI"),

    /**
     * User name
     * 
     */
    USER_NAME("USER_NAME"),

    /**
     * USIM
     * 
     */
    USIM("USIM"),

    /**
     * VPN
     * 
     */
    VPN("VPN"),

    /**
     * IPv4
     * 
     */
    @XmlEnumValue("IPV4")
    IPV_4("IPV4"),

    /**
     * Private number
     * 
     */
    PRIVATE_NUMBER("PRIVATE_NUMBER"),

    /**
     * Universal integrated circuit card
     * 
     */
    UNIVERSAL_INTEGRATED_CIRCUIT_CARD("UNIVERSAL_INTEGRATED_CIRCUIT_CARD"),

    /**
     * Login id
     * 
     */
    LOGIN_ID("LOGIN_ID"),

    /**
     * Connection number
     * 
     */
    CONNECTION_NUMBER("CONNECTION_NUMBER"),

    /**
     * Accessory number
     * 
     */
    ACCESSORY_NUMBER("ACCESSORY_NUMBER"),

    /**
     * VOIP
     * 
     */
    VOIP("VOIP"),

    /**
     * Telephone number
     * 
     */
    TELEPHONE_NUMBER("TELEPHONE_NUMBER"),

    /**
     * Email
     * 
     */
    EMAIL("EMAIL"),

    /**
     * EMTA serial number
     * 
     */
    EMTA_SERIAL_NUMBER("EMTA_SERIAL_NUMBER"),

    /**
     * Calling card number
     * 
     */
    CALLING_CARD_NUMBER("CALLING_CARD_NUMBER"),

    /**
     * Extension
     * 
     */
    EXT("EXT"),

    /**
     * Integrated services digital network
     * 
     */
    INTEGRATED_SERVICES_DIGITAL_NETWORK("INTEGRATED_SERVICES_DIGITAL_NETWORK"),

    /**
     * IP for wireline
     * 
     */
    IP_WIRELINE("IP_WIRELINE"),

    /**
     * Circuit id
     * 
     */
    CIRCUIT_ID("CIRCUIT_ID"),

    /**
     * PVC
     * 
     */
    PVC("PVC"),

    /**
     * WL dummy resource
     * 
     */
    WL_DUMMY_RESOURCE("WL_DUMMY_RESOURCE");
    private final String value;

    LogicalResourceTypeNameAll(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogicalResourceTypeNameAll fromValue(String v) {
        for (LogicalResourceTypeNameAll c: LogicalResourceTypeNameAll.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
