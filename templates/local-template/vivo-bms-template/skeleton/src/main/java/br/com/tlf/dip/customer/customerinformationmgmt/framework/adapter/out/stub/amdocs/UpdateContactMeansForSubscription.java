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
 * <p>Classe Java de UpdateContactMeansForSubscription complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateContactMeansForSubscription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appCtx" type="{http://amdocs/tef-vivo/core/types/v1}ApplicationContext" minOccurs="0"/&gt;
 *         &lt;element name="contactAssociation" type="{http://amdocs/tef-vivo/customerprofile/types/v1}SubscriptionContactAssociation"/&gt;
 *         &lt;element name="contactMeans" type="{http://amdocs/tef-vivo/customerprofile/types/v1}PartyRoleContactMediumForUpdate"/&gt;
 *         &lt;element name="customer" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}CustomerExternalID"/&gt;
 *         &lt;element name="individual" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualExternalID"/&gt;
 *         &lt;element name="subscription" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}SubscriptionAllID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateContactMeansForSubscription", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "appCtx",
    "contactAssociation",
    "contactMeans",
    "customer",
    "individual",
    "subscription"
})
public class UpdateContactMeansForSubscription {

    protected ApplicationContext appCtx;
    @XmlElement(required = true)
    protected SubscriptionContactAssociation contactAssociation;
    @XmlElement(required = true)
    protected PartyRoleContactMediumForUpdate contactMeans;
    @XmlElement(required = true)
    protected CustomerExternalID customer;
    @XmlElement(required = true)
    protected IndividualExternalID individual;
    @XmlElement(required = true)
    protected SubscriptionAllID subscription;

    /**
     * Obtém o valor da propriedade appCtx.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationContext }
     *     
     */
    public ApplicationContext getAppCtx() {
        return appCtx;
    }

    /**
     * Define o valor da propriedade appCtx.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationContext }
     *     
     */
    public void setAppCtx(ApplicationContext value) {
        this.appCtx = value;
    }

    /**
     * Obtém o valor da propriedade contactAssociation.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionContactAssociation }
     *     
     */
    public SubscriptionContactAssociation getContactAssociation() {
        return contactAssociation;
    }

    /**
     * Define o valor da propriedade contactAssociation.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionContactAssociation }
     *     
     */
    public void setContactAssociation(SubscriptionContactAssociation value) {
        this.contactAssociation = value;
    }

    /**
     * Obtém o valor da propriedade contactMeans.
     * 
     * @return
     *     possible object is
     *     {@link PartyRoleContactMediumForUpdate }
     *     
     */
    public PartyRoleContactMediumForUpdate getContactMeans() {
        return contactMeans;
    }

    /**
     * Define o valor da propriedade contactMeans.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRoleContactMediumForUpdate }
     *     
     */
    public void setContactMeans(PartyRoleContactMediumForUpdate value) {
        this.contactMeans = value;
    }

    /**
     * Obtém o valor da propriedade customer.
     * 
     * @return
     *     possible object is
     *     {@link CustomerExternalID }
     *     
     */
    public CustomerExternalID getCustomer() {
        return customer;
    }

    /**
     * Define o valor da propriedade customer.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerExternalID }
     *     
     */
    public void setCustomer(CustomerExternalID value) {
        this.customer = value;
    }

    /**
     * Obtém o valor da propriedade individual.
     * 
     * @return
     *     possible object is
     *     {@link IndividualExternalID }
     *     
     */
    public IndividualExternalID getIndividual() {
        return individual;
    }

    /**
     * Define o valor da propriedade individual.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualExternalID }
     *     
     */
    public void setIndividual(IndividualExternalID value) {
        this.individual = value;
    }

    /**
     * Obtém o valor da propriedade subscription.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionAllID }
     *     
     */
    public SubscriptionAllID getSubscription() {
        return subscription;
    }

    /**
     * Define o valor da propriedade subscription.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionAllID }
     *     
     */
    public void setSubscription(SubscriptionAllID value) {
        this.subscription = value;
    }

}
