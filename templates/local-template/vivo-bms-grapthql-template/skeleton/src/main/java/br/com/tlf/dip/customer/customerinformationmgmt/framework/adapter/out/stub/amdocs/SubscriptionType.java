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
 * <p>Classe Java de SubscriptionType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALL_CRM"/&gt;
 *     &lt;enumeration value="ATM"/&gt;
 *     &lt;enumeration value="CALLING_CARD"/&gt;
 *     &lt;enumeration value="CENTREX"/&gt;
 *     &lt;enumeration value="FRAME_RELAY"/&gt;
 *     &lt;enumeration value="GSM"/&gt;
 *     &lt;enumeration value="IPVPN_MPLS"/&gt;
 *     &lt;enumeration value="ISDN"/&gt;
 *     &lt;enumeration value="LEASED_LINE"/&gt;
 *     &lt;enumeration value="ONE_EIGHT_XX"/&gt;
 *     &lt;enumeration value="ONE_SEVEN_XX"/&gt;
 *     &lt;enumeration value="PBX"/&gt;
 *     &lt;enumeration value="PSTN"/&gt;
 *     &lt;enumeration value="UMTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SubscriptionType", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1")
@XmlEnum
public enum SubscriptionType {

    ALL_CRM,
    ATM,
    CALLING_CARD,
    CENTREX,
    FRAME_RELAY,
    GSM,
    IPVPN_MPLS,
    ISDN,
    LEASED_LINE,
    ONE_EIGHT_XX,
    ONE_SEVEN_XX,
    PBX,
    PSTN,
    UMTS;

    public String value() {
        return name();
    }

    public static SubscriptionType fromValue(String v) {
        return valueOf(v);
    }

}
