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
 * <p>Classe Java de DeliveryMethodAMDD.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryMethodAMDD"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NULL"/&gt;
 *     &lt;enumeration value="SMS"/&gt;
 *     &lt;enumeration value="PAPER"/&gt;
 *     &lt;enumeration value="EMAIL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliveryMethodAMDD", namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1")
@XmlEnum
public enum DeliveryMethodAMDD {


    /**
     * Delivery method as specified in the EOC
     * 
     */
    NULL,

    /**
     * SMS
     * 
     */
    SMS,

    /**
     * Delivery bill as paper format
     * 
     */
    PAPER,

    /**
     * Delivery method as EMAIL
     * 
     */
    EMAIL;

    public String value() {
        return name();
    }

    public static DeliveryMethodAMDD fromValue(String v) {
        return valueOf(v);
    }

}
