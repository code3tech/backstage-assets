//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The method of a Recharge.:
 * Derived from PIM entity Recharge in the domain prepaidbalanceactivities.:
 * Restriction of {http://amdocs/pbg-portfolio/customerbilling/types-unqualified/v1}RechargeMethod,
 * Derived from PIM entity RechargeMethod in the domain prepaidbalanceactivities.
 * 
 * <p>Classe Java de RechargeMethod complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RechargeMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="method" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}RechargeMethodCode" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}RechargeMethodType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RechargeMethod", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1", propOrder = {
    "method",
    "type"
})
public class RechargeMethod {

    @XmlSchemaType(name = "string")
    protected RechargeMethodCode method;
    @XmlSchemaType(name = "string")
    protected RechargeMethodType type;

    /**
     * Obtém o valor da propriedade method.
     * 
     * @return
     *     possible object is
     *     {@link RechargeMethodCode }
     *     
     */
    public RechargeMethodCode getMethod() {
        return method;
    }

    /**
     * Define o valor da propriedade method.
     * 
     * @param value
     *     allowed object is
     *     {@link RechargeMethodCode }
     *     
     */
    public void setMethod(RechargeMethodCode value) {
        this.method = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link RechargeMethodType }
     *     
     */
    public RechargeMethodType getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link RechargeMethodType }
     *     
     */
    public void setType(RechargeMethodType value) {
        this.type = value;
    }

}
