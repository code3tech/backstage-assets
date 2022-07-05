//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The internal and external identifier of an Subscription. Only one is required.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerbilling/types-unqualified/v1}Subscription,
 * Derived from PIM entity Subscription in the domain customerpriceagreement.
 * 
 * <p>Classe Java de SubscriptionAllID complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionAllID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalIDs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="externalID" type="{http://amdocs/tef-vivo/core/types/v1}AdditionalIdKey" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionAllID", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1", propOrder = {
    "externalIDs",
    "id"
})
public class SubscriptionAllID {

    protected SubscriptionAllID.ExternalIDs externalIDs;
    protected String id;

    /**
     * Obtém o valor da propriedade externalIDs.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionAllID.ExternalIDs }
     *     
     */
    public SubscriptionAllID.ExternalIDs getExternalIDs() {
        return externalIDs;
    }

    /**
     * Define o valor da propriedade externalIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionAllID.ExternalIDs }
     *     
     */
    public void setExternalIDs(SubscriptionAllID.ExternalIDs value) {
        this.externalIDs = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="externalID" type="{http://amdocs/tef-vivo/core/types/v1}AdditionalIdKey" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "externalID"
    })
    public static class ExternalIDs {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1")
        protected AdditionalIdKey externalID;

        /**
         * Obtém o valor da propriedade externalID.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalIdKey }
         *     
         */
        public AdditionalIdKey getExternalID() {
            return externalID;
        }

        /**
         * Define o valor da propriedade externalID.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalIdKey }
         *     
         */
        public void setExternalID(AdditionalIdKey value) {
            this.externalID = value;
        }

    }

}
