//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UpdateBillingAddressForBillSpec complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateBillingAddressForBillSpec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appCtx" type="{http://amdocs/tef-vivo/core/types/v1}ApplicationContext" minOccurs="0"/&gt;
 *         &lt;element name="billingAddress" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="billingAddres" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactMediumBillingAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="customerBillSpec" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}CustomerBillSpecID"/&gt;
 *         &lt;element name="formattedName" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualNameBilling" minOccurs="0"/&gt;
 *         &lt;element name="individual" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualExternalID" minOccurs="0"/&gt;
 *         &lt;element name="organization" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}OrganizationExternalID" minOccurs="0"/&gt;
 *         &lt;element name="customerBillSpecIndicators" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}UpdateCustomerBillSpecIndicators" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateBillingAddressForBillSpec", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "appCtx",
    "billingAddress",
    "customerBillSpec",
    "formattedName",
    "individual",
    "organization",
    "customerBillSpecIndicators"
})
public class UpdateBillingAddressForBillSpec {

    protected ApplicationContext appCtx;
    protected UpdateBillingAddressForBillSpec.BillingAddress billingAddress;
    @XmlElement(required = true)
    protected CustomerBillSpecID customerBillSpec;
    protected IndividualNameBilling formattedName;
    protected IndividualExternalID individual;
    protected OrganizationExternalID organization;
    protected UpdateCustomerBillSpecIndicators customerBillSpecIndicators;

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
     *     {@link UpdateBillingAddressForBillSpec.BillingAddress }
     *     
     */
    public UpdateBillingAddressForBillSpec.BillingAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Define o valor da propriedade billingAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateBillingAddressForBillSpec.BillingAddress }
     *     
     */
    public void setBillingAddress(UpdateBillingAddressForBillSpec.BillingAddress value) {
        this.billingAddress = value;
    }

    /**
     * Obtém o valor da propriedade customerBillSpec.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBillSpecID }
     *     
     */
    public CustomerBillSpecID getCustomerBillSpec() {
        return customerBillSpec;
    }

    /**
     * Define o valor da propriedade customerBillSpec.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBillSpecID }
     *     
     */
    public void setCustomerBillSpec(CustomerBillSpecID value) {
        this.customerBillSpec = value;
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

    /**
     * Obtém o valor da propriedade customerBillSpecIndicators.
     * 
     * @return
     *     possible object is
     *     {@link UpdateCustomerBillSpecIndicators }
     *     
     */
    public UpdateCustomerBillSpecIndicators getCustomerBillSpecIndicators() {
        return customerBillSpecIndicators;
    }

    /**
     * Define o valor da propriedade customerBillSpecIndicators.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateCustomerBillSpecIndicators }
     *     
     */
    public void setCustomerBillSpecIndicators(UpdateCustomerBillSpecIndicators value) {
        this.customerBillSpecIndicators = value;
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
     *         &lt;element name="billingAddres" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactMediumBillingAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "billingAddres"
    })
    public static class BillingAddress {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<ContactMediumBillingAddress> billingAddres;

        /**
         * Gets the value of the billingAddres property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the billingAddres property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBillingAddres().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactMediumBillingAddress }
         * 
         * 
         */
        public List<ContactMediumBillingAddress> getBillingAddres() {
            if (billingAddres == null) {
                billingAddres = new ArrayList<ContactMediumBillingAddress>();
            }
            return this.billingAddres;
        }

    }

}
