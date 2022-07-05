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
 * <p>Classe Java de ProductState.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASSIGNED"/&gt;
 *     &lt;enumeration value="CANCELED"/&gt;
 *     &lt;enumeration value="ORDERED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProductState", namespace = "http://amdocs/tef-vivo/customerproduct-common/types/v1")
@XmlEnum
public enum ProductState {


    /**
     * The Product is currently installed/supplied for the customer, or was installed/supplied previously but replaced by a
     * more recent Product.
     * 
     */
    ASSIGNED,

    /**
     * The Product was created as part of a ProductOrderItem that has been cancelled.
     * 
     */
    CANCELED,

    /**
     * The Product is being ordered. There may be multiple Products with the same Product.ID value, but different Product.
     * version values with this state when future orders exist.
     * 
     */
    ORDERED;

    public String value() {
        return name();
    }

    public static ProductState fromValue(String v) {
        return valueOf(v);
    }

}
