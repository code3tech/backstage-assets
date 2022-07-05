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
 * <p>Classe Java de ProductActivationStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductActivationStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIVE"/&gt;
 *     &lt;enumeration value="CEASED"/&gt;
 *     &lt;enumeration value="SUSPENDED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProductActivationStatus", namespace = "http://amdocs/tef-vivo/customerproduct-common/types/v1")
@XmlEnum
public enum ProductActivationStatus {


    /**
     * The Product is active and can receive service (and will incur recurring charges if relevant).
     * 
     */
    ACTIVE,

    /**
     * The Product is disconnected or cancelled and  cannot receive service (and will no longer incur recurring charges).
     * Although it is possible for the Product to be re-established to an active state it is generally possible only within a
     * window of time after it has moved to a cease state as the associated resources may no longer be available.
     * 
     */
    CEASED,

    /**
     * The Product is suspended and cannot receive service. It may still incur charges at the same or reduced level, depending
     * on business rules. Typically all associated resources remain allocated and it is possible for the Product to move to an
     * active state again.
     * 
     */
    SUSPENDED;

    public String value() {
        return name();
    }

    public static ProductActivationStatus fromValue(String v) {
        return valueOf(v);
    }

}
