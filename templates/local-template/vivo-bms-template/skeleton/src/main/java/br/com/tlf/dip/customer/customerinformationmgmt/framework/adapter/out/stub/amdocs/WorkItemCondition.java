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
 * <p>Classe Java de WorkItemCondition.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkItemCondition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLOSED"/&gt;
 *     &lt;enumeration value="DISPATCH"/&gt;
 *     &lt;enumeration value="FORWARD"/&gt;
 *     &lt;enumeration value="OPEN"/&gt;
 *     &lt;enumeration value="REJECT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkItemCondition", namespace = "http://amdocs/tef-vivo/commonbusinessentities-common/types/v1")
@XmlEnum
public enum WorkItemCondition {


    /**
     * The WorkItem is now closed to routing.
     * 
     */
    CLOSED,

    /**
     * The WorkItem has been dispatched to a Queue for acceptance.
     * 
     */
    DISPATCH,

    /**
     * The WorkItem has been forwarded to a ApplicationUser.
     * 
     */
    FORWARD,

    /**
     * The WorkItem is owned by an ApplicationUser and is not currently being routed.
     * 
     */
    OPEN,

    /**
     * The WorkItem has been rejected from a Queue or ApplicationUser.
     * 
     */
    REJECT;

    public String value() {
        return name();
    }

    public static WorkItemCondition fromValue(String v) {
        return valueOf(v);
    }

}
