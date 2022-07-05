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
 * <p>Classe Java de UpdateAddressForCustomerAccount complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateAddressForCustomerAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appCtx" type="{http://amdocs/tef-vivo/core/types/v1}ApplicationContext" minOccurs="0"/&gt;
 *         &lt;element name="billingAddress" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactMediumBillingAddress"/&gt;
 *         &lt;element name="customerAccount" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}CustomerAccountID"/&gt;
 *         &lt;element name="formattedName" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualNameBilling" minOccurs="0"/&gt;
 *         &lt;element name="individual" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualExternalID"/&gt;
 *         &lt;element name="organization" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}OrganizationExternalID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateAddressForCustomerAccount", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "appCtx",
    "billingAddress",
    "customerAccount",
    "formattedName",
    "individual",
    "organization"
})
public class UpdateAddressForCustomerAccount {

    protected ApplicationContext appCtx;
    @XmlElement(required = true)
    protected ContactMediumBillingAddress billingAddress;
    @XmlElement(required = true)
    protected CustomerAccountID customerAccount;
    protected IndividualNameBilling formattedName;
    @XmlElement(required = true)
    protected IndividualExternalID individual;
    protected OrganizationExternalID organization;

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
     * Obtém o valor da propriedade billingAddress.
     * 
     * @return
     *     possible object is
     *     {@link ContactMediumBillingAddress }
     *     
     */
    public ContactMediumBillingAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Define o valor da propriedade billingAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMediumBillingAddress }
     *     
     */
    public void setBillingAddress(ContactMediumBillingAddress value) {
        this.billingAddress = value;
    }

    /**
     * Obtém o valor da propriedade customerAccount.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountID }
     *     
     */
    public CustomerAccountID getCustomerAccount() {
        return customerAccount;
    }

    /**
     * Define o valor da propriedade customerAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountID }
     *     
     */
    public void setCustomerAccount(CustomerAccountID value) {
        this.customerAccount = value;
    }

    /**
     * Obtém o valor da propriedade formattedName.
     * 
     * @return
     *     possible object is
     *     {@link IndividualNameBilling }
     *     
     */
    public IndividualNameBilling getFormattedName() {
        return formattedName;
    }

    /**
     * Define o valor da propriedade formattedName.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualNameBilling }
     *     
     */
    public void setFormattedName(IndividualNameBilling value) {
        this.formattedName = value;
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
     * Obtém o valor da propriedade organization.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationExternalID }
     *     
     */
    public OrganizationExternalID getOrganization() {
        return organization;
    }

    /**
     * Define o valor da propriedade organization.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationExternalID }
     *     
     */
    public void setOrganization(OrganizationExternalID value) {
        this.organization = value;
    }

}
