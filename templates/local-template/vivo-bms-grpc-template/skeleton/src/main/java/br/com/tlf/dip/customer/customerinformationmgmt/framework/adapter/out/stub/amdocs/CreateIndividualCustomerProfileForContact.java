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
 * <p>Classe Java de CreateIndividualCustomerProfileForContact complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CreateIndividualCustomerProfileForContact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appCtx" type="{http://amdocs/tef-vivo/core/types/v1}ApplicationContext" minOccurs="0"/&gt;
 *         &lt;element name="customerAccountAddress" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}BillingAddressContactMediumID"/&gt;
 *         &lt;element name="customerAccountDetails" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerAccountForCreate"/&gt;
 *         &lt;element name="customerBillSpecAddress" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}BillingAddressContactMediumID"/&gt;
 *         &lt;element name="customerBillSpecDetails" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerBillSpecForCreate"/&gt;
 *         &lt;element name="customerDetails" type="{http://amdocs/tef-vivo/customerprofile/types/v1}IndividualCustomerForCreate"/&gt;
 *         &lt;element name="existingContactID" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}ContactID"/&gt;
 *         &lt;element name="billingAddressesReferenced"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="billingAddresse" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactMediumBillingAddressForCreate" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "CreateIndividualCustomerProfileForContact", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "appCtx",
    "customerAccountAddress",
    "customerAccountDetails",
    "customerBillSpecAddress",
    "customerBillSpecDetails",
    "customerDetails",
    "existingContactID",
    "billingAddressesReferenced"
})
public class CreateIndividualCustomerProfileForContact {

    protected ApplicationContext appCtx;
    @XmlElement(required = true)
    protected BillingAddressContactMediumID customerAccountAddress;
    @XmlElement(required = true)
    protected CustomerAccountForCreate customerAccountDetails;
    @XmlElement(required = true)
    protected BillingAddressContactMediumID customerBillSpecAddress;
    @XmlElement(required = true)
    protected CustomerBillSpecForCreate customerBillSpecDetails;
    @XmlElement(required = true)
    protected IndividualCustomerForCreate customerDetails;
    @XmlElement(required = true)
    protected ContactID existingContactID;
    @XmlElement(required = true)
    protected CreateIndividualCustomerProfileForContact.BillingAddressesReferenced billingAddressesReferenced;

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
     * Obtém o valor da propriedade customerAccountAddress.
     * 
     * @return
     *     possible object is
     *     {@link BillingAddressContactMediumID }
     *     
     */
    public BillingAddressContactMediumID getCustomerAccountAddress() {
        return customerAccountAddress;
    }

    /**
     * Define o valor da propriedade customerAccountAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAddressContactMediumID }
     *     
     */
    public void setCustomerAccountAddress(BillingAddressContactMediumID value) {
        this.customerAccountAddress = value;
    }

    /**
     * Obtém o valor da propriedade customerAccountDetails.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountForCreate }
     *     
     */
    public CustomerAccountForCreate getCustomerAccountDetails() {
        return customerAccountDetails;
    }

    /**
     * Define o valor da propriedade customerAccountDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountForCreate }
     *     
     */
    public void setCustomerAccountDetails(CustomerAccountForCreate value) {
        this.customerAccountDetails = value;
    }

    /**
     * Obtém o valor da propriedade customerBillSpecAddress.
     * 
     * @return
     *     possible object is
     *     {@link BillingAddressContactMediumID }
     *     
     */
    public BillingAddressContactMediumID getCustomerBillSpecAddress() {
        return customerBillSpecAddress;
    }

    /**
     * Define o valor da propriedade customerBillSpecAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingAddressContactMediumID }
     *     
     */
    public void setCustomerBillSpecAddress(BillingAddressContactMediumID value) {
        this.customerBillSpecAddress = value;
    }

    /**
     * Obtém o valor da propriedade customerBillSpecDetails.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBillSpecForCreate }
     *     
     */
    public CustomerBillSpecForCreate getCustomerBillSpecDetails() {
        return customerBillSpecDetails;
    }

    /**
     * Define o valor da propriedade customerBillSpecDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBillSpecForCreate }
     *     
     */
    public void setCustomerBillSpecDetails(CustomerBillSpecForCreate value) {
        this.customerBillSpecDetails = value;
    }

    /**
     * Obtém o valor da propriedade customerDetails.
     * 
     * @return
     *     possible object is
     *     {@link IndividualCustomerForCreate }
     *     
     */
    public IndividualCustomerForCreate getCustomerDetails() {
        return customerDetails;
    }

    /**
     * Define o valor da propriedade customerDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualCustomerForCreate }
     *     
     */
    public void setCustomerDetails(IndividualCustomerForCreate value) {
        this.customerDetails = value;
    }

    /**
     * Obtém o valor da propriedade existingContactID.
     * 
     * @return
     *     possible object is
     *     {@link ContactID }
     *     
     */
    public ContactID getExistingContactID() {
        return existingContactID;
    }

    /**
     * Define o valor da propriedade existingContactID.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactID }
     *     
     */
    public void setExistingContactID(ContactID value) {
        this.existingContactID = value;
    }

    /**
     * Obtém o valor da propriedade billingAddressesReferenced.
     * 
     * @return
     *     possible object is
     *     {@link CreateIndividualCustomerProfileForContact.BillingAddressesReferenced }
     *     
     */
    public CreateIndividualCustomerProfileForContact.BillingAddressesReferenced getBillingAddressesReferenced() {
        return billingAddressesReferenced;
    }

    /**
     * Define o valor da propriedade billingAddressesReferenced.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateIndividualCustomerProfileForContact.BillingAddressesReferenced }
     *     
     */
    public void setBillingAddressesReferenced(CreateIndividualCustomerProfileForContact.BillingAddressesReferenced value) {
        this.billingAddressesReferenced = value;
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
     *         &lt;element name="billingAddresse" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactMediumBillingAddressForCreate" maxOccurs="unbounded"/&gt;
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
        "billingAddresse"
    })
    public static class BillingAddressesReferenced {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", required = true)
        protected List<ContactMediumBillingAddressForCreate> billingAddresse;

        /**
         * Gets the value of the billingAddresse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the billingAddresse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBillingAddresse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactMediumBillingAddressForCreate }
         * 
         * 
         */
        public List<ContactMediumBillingAddressForCreate> getBillingAddresse() {
            if (billingAddresse == null) {
                billingAddresse = new ArrayList<ContactMediumBillingAddressForCreate>();
            }
            return this.billingAddresse;
        }

    }

}
