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
 * <p>Classe Java de NumberPortabilityStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NumberPortabilityStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPROVED"/&gt;
 *     &lt;enumeration value="CANCEL"/&gt;
 *     &lt;enumeration value="ENABLE"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="NOT_APPROVED"/&gt;
 *     &lt;enumeration value="CREATED"/&gt;
 *     &lt;enumeration value="SUSPENSION"/&gt;
 *     &lt;enumeration value="RESCHEDULE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NumberPortabilityStatus", namespace = "http://amdocs/tef-vivo/resource-common/types/v1")
@XmlEnum
public enum NumberPortabilityStatus {


    /**
     * Approved
     * 
     */
    APPROVED,

    /**
     * Cancel
     * 
     */
    CANCEL,

    /**
     * Enable
     * 
     */
    ENABLE,

    /**
     * Error
     * 
     */
    ERROR,

    /**
     * Not approved
     * 
     */
    NOT_APPROVED,

    /**
     * Created
     * 
     */
    CREATED,

    /**
     * Suspension
     * 
     */
    SUSPENSION,

    /**
     * Reschedule
     * 
     */
    RESCHEDULE;

    public String value() {
        return name();
    }

    public static NumberPortabilityStatus fromValue(String v) {
        return valueOf(v);
    }

}
