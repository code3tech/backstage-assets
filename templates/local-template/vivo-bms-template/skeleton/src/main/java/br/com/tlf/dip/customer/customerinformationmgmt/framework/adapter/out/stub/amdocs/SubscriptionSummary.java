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
 * Restriction of {http://amdocs/pbg-portfolio/customerbilling/types-unqualified/v1}Subscription,
 * Derived from PIM entity Subscription in the domain customerpriceagreement.
 * 
 * <p>Classe Java de SubscriptionSummary complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actualPaymentCategory" type="{http://amdocs/tef-vivo/productcatalog-common/types/v1}PaymentCategory" minOccurs="0"/&gt;
 *         &lt;element name="businessOrganizationUnit" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}BusinessOrganizationUnitID" minOccurs="0"/&gt;
 *         &lt;element name="dealer" type="{http://amdocs/tef-vivo/supplierpartner-common/types/v1}Dealer" minOccurs="0"/&gt;
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="linkSubscription" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}SubscriptionID" minOccurs="0"/&gt;
 *         &lt;element name="primaryResourceForGuiding" type="{http://amdocs/tef-vivo/resource-common/types/v1}LogicalResourceSummary" minOccurs="0"/&gt;
 *         &lt;element name="reference" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="resourcesForGuidings" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="resourcesForGuiding" type="{http://amdocs/tef-vivo/resource-common/types/v1}LogicalResourceSummary" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="status" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}SubscriptionStatus" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}SubscriptionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionSummary", namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1", propOrder = {
    "actualPaymentCategory",
    "businessOrganizationUnit",
    "dealer",
    "effectiveDate",
    "id",
    "linkSubscription",
    "primaryResourceForGuiding",
    "reference",
    "resourcesForGuidings",
    "status",
    "type"
})
public class SubscriptionSummary {

    @XmlSchemaType(name = "string")
    protected PaymentCategory actualPaymentCategory;
    protected BusinessOrganizationUnitID businessOrganizationUnit;
    protected Dealer dealer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    protected String id;
    protected SubscriptionID linkSubscription;
    protected LogicalResourceSummary primaryResourceForGuiding;
    protected String reference;
    protected SubscriptionSummary.ResourcesForGuidings resourcesForGuidings;
    @XmlSchemaType(name = "string")
    protected SubscriptionStatus status;
    @XmlSchemaType(name = "string")
    protected SubscriptionType type;

    /**
     * Obtém o valor da propriedade actualPaymentCategory.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCategory }
     *     
     */
    public PaymentCategory getActualPaymentCategory() {
        return actualPaymentCategory;
    }

    /**
     * Define o valor da propriedade actualPaymentCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCategory }
     *     
     */
    public void setActualPaymentCategory(PaymentCategory value) {
        this.actualPaymentCategory = value;
    }

    /**
     * Obtém o valor da propriedade businessOrganizationUnit.
     * 
     * @return
     *     possible object is
     *     {@link BusinessOrganizationUnitID }
     *     
     */
    public BusinessOrganizationUnitID getBusinessOrganizationUnit() {
        return businessOrganizationUnit;
    }

    /**
     * Define o valor da propriedade businessOrganizationUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessOrganizationUnitID }
     *     
     */
    public void setBusinessOrganizationUnit(BusinessOrganizationUnitID value) {
        this.businessOrganizationUnit = value;
    }

    /**
     * Obtém o valor da propriedade dealer.
     * 
     * @return
     *     possible object is
     *     {@link Dealer }
     *     
     */
    public Dealer getDealer() {
        return dealer;
    }

    /**
     * Define o valor da propriedade dealer.
     * 
     * @param value
     *     allowed object is
     *     {@link Dealer }
     *     
     */
    public void setDealer(Dealer value) {
        this.dealer = value;
    }

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
     * Obtém o valor da propriedade linkSubscription.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionID }
     *     
     */
    public SubscriptionID getLinkSubscription() {
        return linkSubscription;
    }

    /**
     * Define o valor da propriedade linkSubscription.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionID }
     *     
     */
    public void setLinkSubscription(SubscriptionID value) {
        this.linkSubscription = value;
    }

    /**
     * Obtém o valor da propriedade primaryResourceForGuiding.
     * 
     * @return
     *     possible object is
     *     {@link LogicalResourceSummary }
     *     
     */
    public LogicalResourceSummary getPrimaryResourceForGuiding() {
        return primaryResourceForGuiding;
    }

    /**
     * Define o valor da propriedade primaryResourceForGuiding.
     * 
     * @param value
     *     allowed object is
     *     {@link LogicalResourceSummary }
     *     
     */
    public void setPrimaryResourceForGuiding(LogicalResourceSummary value) {
        this.primaryResourceForGuiding = value;
    }

    /**
     * Obtém o valor da propriedade reference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Define o valor da propriedade reference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Obtém o valor da propriedade resourcesForGuidings.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionSummary.ResourcesForGuidings }
     *     
     */
    public SubscriptionSummary.ResourcesForGuidings getResourcesForGuidings() {
        return resourcesForGuidings;
    }

    /**
     * Define o valor da propriedade resourcesForGuidings.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionSummary.ResourcesForGuidings }
     *     
     */
    public void setResourcesForGuidings(SubscriptionSummary.ResourcesForGuidings value) {
        this.resourcesForGuidings = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionStatus }
     *     
     */
    public SubscriptionStatus getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionStatus }
     *     
     */
    public void setStatus(SubscriptionStatus value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionType }
     *     
     */
    public SubscriptionType getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionType }
     *     
     */
    public void setType(SubscriptionType value) {
        this.type = value;
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
     *         &lt;element name="resourcesForGuiding" type="{http://amdocs/tef-vivo/resource-common/types/v1}LogicalResourceSummary" minOccurs="0"/&gt;
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
        "resourcesForGuiding"
    })
    public static class ResourcesForGuidings {

        @XmlElement(namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1")
        protected LogicalResourceSummary resourcesForGuiding;

        /**
         * Obtém o valor da propriedade resourcesForGuiding.
         * 
         * @return
         *     possible object is
         *     {@link LogicalResourceSummary }
         *     
         */
        public LogicalResourceSummary getResourcesForGuiding() {
            return resourcesForGuiding;
        }

        /**
         * Define o valor da propriedade resourcesForGuiding.
         * 
         * @param value
         *     allowed object is
         *     {@link LogicalResourceSummary }
         *     
         */
        public void setResourcesForGuiding(LogicalResourceSummary value) {
            this.resourcesForGuiding = value;
        }

    }

}
