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
 * <p>Classe Java de RetrieveNumberPortabilityStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RetrieveNumberPortabilityStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INIT"/&gt;
 *     &lt;enumeration value="APPROVED"/&gt;
 *     &lt;enumeration value="ENABLE"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="NOT_APPROVED"/&gt;
 *     &lt;enumeration value="CREATED"/&gt;
 *     &lt;enumeration value="SUSPENSION"/&gt;
 *     &lt;enumeration value="RESCHEDULE"/&gt;
 *     &lt;enumeration value="REQUESTED"/&gt;
 *     &lt;enumeration value="IN_PROGRESS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RetrieveNumberPortabilityStatus", namespace = "http://amdocs/tef-vivo/resource-common/types/v1")
@XmlEnum
public enum RetrieveNumberPortabilityStatus {


    /**
     * INIT
     * 
     */
    INIT,

    /**
     * APPROVED
     * 
     */
    APPROVED,

    /**
     * ENABLE
     * 
     */
    ENABLE,

    /**
     * ERROR
     * 
     */
    ERROR,

    /**
     * NOT APPROVED
     * 
     */
    NOT_APPROVED,

    /**
     * CREATED
     * 
     */
    CREATED,

    /**
     * SUSPENSION
     * 
     */
    SUSPENSION,

    /**
     * RESCHEDULE
     * 
     */
    RESCHEDULE,

    /**
     * REQUESTED
     * 
     */
    REQUESTED,

    /**
     * IN PROGRESS
     * 
     */
    IN_PROGRESS;

    public String value() {
        return name();
    }

    public static RetrieveNumberPortabilityStatus fromValue(String v) {
        return valueOf(v);
    }

}
