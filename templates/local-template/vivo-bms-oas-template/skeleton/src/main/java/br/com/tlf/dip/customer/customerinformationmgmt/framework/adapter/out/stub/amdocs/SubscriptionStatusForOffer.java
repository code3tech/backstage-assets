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
 * <p>Classe Java de SubscriptionStatusForOffer.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriptionStatusForOffer"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIVE"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *     &lt;enumeration value="OD_ACTIVE_FROM_ACTIVE"/&gt;
 *     &lt;enumeration value="OD_CANCEL"/&gt;
 *     &lt;enumeration value="OD_SUSPEND"/&gt;
 *     &lt;enumeration value="OD_SUS_FROM_SUSPEND"/&gt;
 *     &lt;enumeration value="RESERVED"/&gt;
 *     &lt;enumeration value="SUSPENDED"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubscriptionStatusForOffer", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1")
@XmlEnum
public enum SubscriptionStatusForOffer {


    /**
     * Active
     * 
     */
    ACTIVE,

    /**
     * Cancelled
     * 
     */
    CANCELLED,

    /**
     * OD (Operator Decision) active from active - subscriber already has a barring offer in active status and collection adds the same offer as part of collection step. Then the status of the existing barring offer will change to this status.
     * 
     */
    OD_ACTIVE_FROM_ACTIVE,

    /**
     * OD (Operator Decision) cancelled - the final status after unsuccessful collection process.
     * 
     */
    OD_CANCEL,

    /**
     * OD (Operator Decision) suspend - collection processing suspends a Subscription  which was in Active status.
     * 
     */
    OD_SUSPEND,

    /**
     * OD (Operator Decision) suspend from suspend - collection processing decides to suspend Subscription that has already
     * been suspended by customer request. This suspension can be reversed by fixing the financial issues and not by plain
     * customer request.
     * 
     */
    OD_SUS_FROM_SUSPEND,

    /**
     * Reserved (subscriber was created but not activated yet)
     * 
     */
    RESERVED,

    /**
     * Suspended by customer request (as opposed to OD_SUSPEND).
     * 
     */
    SUSPENDED,

    /**
     * Not applicative
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static SubscriptionStatusForOffer fromValue(String v) {
        return valueOf(v);
    }

}
