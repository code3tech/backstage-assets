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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A grouping of gathering pricing schemas, product characteristics, guiding resources for billing purposes. A
 * Subscription is generated from a Product, but not every Product generates a Subscription, for example a Product might
 * be added to existing Subscription.
 * 
 * Typically, Subscription would be associated with one or more LogicalResources from which event data would create usage
 * charges associated to the Subscription. Examples of associated resources include telephone number and email address.
 * 
 * In Amdocs Billing and in Ensemble, this known as Subscriber
 * :
 * Derived from PIM entity Subscription in the domain customerpriceagreement.
 * 
 * <p>Classe Java de MappedSubscriptionDetails complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MappedSubscriptionDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="memberIndicator" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="offerTechnology" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="primaryResourceForGuiding" type="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}MappedLogicalResource" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}SubscriptionStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappedSubscriptionDetails", namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1", propOrder = {
    "effectiveDate",
    "id",
    "memberIndicator",
    "offerTechnology",
    "primaryResourceForGuiding",
    "status"
})
public class MappedSubscriptionDetails {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    protected String id;
    protected String memberIndicator;
    protected String offerTechnology;
    protected MappedLogicalResource primaryResourceForGuiding;
    protected String status;

    /**
     * Obtém o valor da propriedade effectiveDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Define o valor da propriedade effectiveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
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
     * Obtém o valor da propriedade memberIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberIndicator() {
        return memberIndicator;
    }

    /**
     * Define o valor da propriedade memberIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberIndicator(String value) {
        this.memberIndicator = value;
    }

    /**
     * Obtém o valor da propriedade offerTechnology.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferTechnology() {
        return offerTechnology;
    }

    /**
     * Define o valor da propriedade offerTechnology.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferTechnology(String value) {
        this.offerTechnology = value;
    }

    /**
     * Obtém o valor da propriedade primaryResourceForGuiding.
     * 
     * @return
     *     possible object is
     *     {@link MappedLogicalResource }
     *     
     */
    public MappedLogicalResource getPrimaryResourceForGuiding() {
        return primaryResourceForGuiding;
    }

    /**
     * Define o valor da propriedade primaryResourceForGuiding.
     * 
     * @param value
     *     allowed object is
     *     {@link MappedLogicalResource }
     *     
     */
    public void setPrimaryResourceForGuiding(MappedLogicalResource value) {
        this.primaryResourceForGuiding = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
