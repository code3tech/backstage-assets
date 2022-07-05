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
 * <p>Classe Java de IndividualInvolvement complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IndividualInvolvement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactMeansForIndividuals" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="contactMeansForIndividual" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}ContactMediumID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="contactMeansForRole" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}ContactMediumID" minOccurs="0"/&gt;
 *         &lt;element name="customer" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerForInvolvementPartyRole" minOccurs="0"/&gt;
 *         &lt;element name="customerBillSpecs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="customerBillSpec" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerBillSpecForInvolvement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="individual" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualExternalID"/&gt;
 *         &lt;element name="involvedAccounts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="involvedAccount" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerAccountForInvolvement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="involvedPrepaidBalances" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="involvedPrepaidBalance" type="{http://amdocs/tef-vivo/customerprofile/types/v1}PrepaidBalanceForInvolvement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="subscriptionProducts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="subscriptionProduct" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ProductForInvolvement" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "IndividualInvolvement", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "contactMeansForIndividuals",
    "contactMeansForRole",
    "customer",
    "customerBillSpecs",
    "individual",
    "involvedAccounts",
    "involvedPrepaidBalances",
    "subscriptionProducts"
})
public class IndividualInvolvement {

    protected IndividualInvolvement.ContactMeansForIndividuals contactMeansForIndividuals;
    protected ContactMediumID contactMeansForRole;
    protected CustomerForInvolvementPartyRole customer;
    protected IndividualInvolvement.CustomerBillSpecs customerBillSpecs;
    @XmlElement(required = true)
    protected IndividualExternalID individual;
    protected IndividualInvolvement.InvolvedAccounts involvedAccounts;
    protected IndividualInvolvement.InvolvedPrepaidBalances involvedPrepaidBalances;
    protected IndividualInvolvement.SubscriptionProducts subscriptionProducts;

    /**
     * Obtém o valor da propriedade contactMeansForIndividuals.
     * 
     * @return
     *     possible object is
     *     {@link IndividualInvolvement.ContactMeansForIndividuals }
     *     
     */
    public IndividualInvolvement.ContactMeansForIndividuals getContactMeansForIndividuals() {
        return contactMeansForIndividuals;
    }

    /**
     * Define o valor da propriedade contactMeansForIndividuals.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualInvolvement.ContactMeansForIndividuals }
     *     
     */
    public void setContactMeansForIndividuals(IndividualInvolvement.ContactMeansForIndividuals value) {
        this.contactMeansForIndividuals = value;
    }

    /**
     * Obtém o valor da propriedade contactMeansForRole.
     * 
     * @return
     *     possible object is
     *     {@link ContactMediumID }
     *     
     */
    public ContactMediumID getContactMeansForRole() {
        return contactMeansForRole;
    }

    /**
     * Define o valor da propriedade contactMeansForRole.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMediumID }
     *     
     */
    public void setContactMeansForRole(ContactMediumID value) {
        this.contactMeansForRole = value;
    }

    /**
     * Obtém o valor da propriedade customer.
     * 
     * @return
     *     possible object is
     *     {@link CustomerForInvolvementPartyRole }
     *     
     */
    public CustomerForInvolvementPartyRole getCustomer() {
        return customer;
    }

    /**
     * Define o valor da propriedade customer.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerForInvolvementPartyRole }
     *     
     */
    public void setCustomer(CustomerForInvolvementPartyRole value) {
        this.customer = value;
    }

    /**
     * Obtém o valor da propriedade customerBillSpecs.
     * 
     * @return
     *     possible object is
     *     {@link IndividualInvolvement.CustomerBillSpecs }
     *     
     */
    public IndividualInvolvement.CustomerBillSpecs getCustomerBillSpecs() {
        return customerBillSpecs;
    }

    /**
     * Define o valor da propriedade customerBillSpecs.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualInvolvement.CustomerBillSpecs }
     *     
     */
    public void setCustomerBillSpecs(IndividualInvolvement.CustomerBillSpecs value) {
        this.customerBillSpecs = value;
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
     * Obtém o valor da propriedade involvedAccounts.
     * 
     * @return
     *     possible object is
     *     {@link IndividualInvolvement.InvolvedAccounts }
     *     
     */
    public IndividualInvolvement.InvolvedAccounts getInvolvedAccounts() {
        return involvedAccounts;
    }

    /**
     * Define o valor da propriedade involvedAccounts.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualInvolvement.InvolvedAccounts }
     *     
     */
    public void setInvolvedAccounts(IndividualInvolvement.InvolvedAccounts value) {
        this.involvedAccounts = value;
    }

    /**
     * Obtém o valor da propriedade involvedPrepaidBalances.
     * 
     * @return
     *     possible object is
     *     {@link IndividualInvolvement.InvolvedPrepaidBalances }
     *     
     */
    public IndividualInvolvement.InvolvedPrepaidBalances getInvolvedPrepaidBalances() {
        return involvedPrepaidBalances;
    }

    /**
     * Define o valor da propriedade involvedPrepaidBalances.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualInvolvement.InvolvedPrepaidBalances }
     *     
     */
    public void setInvolvedPrepaidBalances(IndividualInvolvement.InvolvedPrepaidBalances value) {
        this.involvedPrepaidBalances = value;
    }

    /**
     * Obtém o valor da propriedade subscriptionProducts.
     * 
     * @return
     *     possible object is
     *     {@link IndividualInvolvement.SubscriptionProducts }
     *     
     */
    public IndividualInvolvement.SubscriptionProducts getSubscriptionProducts() {
        return subscriptionProducts;
    }

    /**
     * Define o valor da propriedade subscriptionProducts.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualInvolvement.SubscriptionProducts }
     *     
     */
    public void setSubscriptionProducts(IndividualInvolvement.SubscriptionProducts value) {
        this.subscriptionProducts = value;
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
     *         &lt;element name="contactMeansForIndividual" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}ContactMediumID" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "contactMeansForIndividual"
    })
    public static class ContactMeansForIndividuals {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<ContactMediumID> contactMeansForIndividual;

        /**
         * Gets the value of the contactMeansForIndividual property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contactMeansForIndividual property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContactMeansForIndividual().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactMediumID }
         * 
         * 
         */
        public List<ContactMediumID> getContactMeansForIndividual() {
            if (contactMeansForIndividual == null) {
                contactMeansForIndividual = new ArrayList<ContactMediumID>();
            }
            return this.contactMeansForIndividual;
        }

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
     *         &lt;element name="customerBillSpec" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerBillSpecForInvolvement" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "customerBillSpec"
    })
    public static class CustomerBillSpecs {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<CustomerBillSpecForInvolvement> customerBillSpec;

        /**
         * Gets the value of the customerBillSpec property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customerBillSpec property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomerBillSpec().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomerBillSpecForInvolvement }
         * 
         * 
         */
        public List<CustomerBillSpecForInvolvement> getCustomerBillSpec() {
            if (customerBillSpec == null) {
                customerBillSpec = new ArrayList<CustomerBillSpecForInvolvement>();
            }
            return this.customerBillSpec;
        }

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
     *         &lt;element name="involvedAccount" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerAccountForInvolvement" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "involvedAccount"
    })
    public static class InvolvedAccounts {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<CustomerAccountForInvolvement> involvedAccount;

        /**
         * Gets the value of the involvedAccount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the involvedAccount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInvolvedAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomerAccountForInvolvement }
         * 
         * 
         */
        public List<CustomerAccountForInvolvement> getInvolvedAccount() {
            if (involvedAccount == null) {
                involvedAccount = new ArrayList<CustomerAccountForInvolvement>();
            }
            return this.involvedAccount;
        }

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
     *         &lt;element name="involvedPrepaidBalance" type="{http://amdocs/tef-vivo/customerprofile/types/v1}PrepaidBalanceForInvolvement" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "involvedPrepaidBalance"
    })
    public static class InvolvedPrepaidBalances {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<PrepaidBalanceForInvolvement> involvedPrepaidBalance;

        /**
         * Gets the value of the involvedPrepaidBalance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the involvedPrepaidBalance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInvolvedPrepaidBalance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PrepaidBalanceForInvolvement }
         * 
         * 
         */
        public List<PrepaidBalanceForInvolvement> getInvolvedPrepaidBalance() {
            if (involvedPrepaidBalance == null) {
                involvedPrepaidBalance = new ArrayList<PrepaidBalanceForInvolvement>();
            }
            return this.involvedPrepaidBalance;
        }

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
     *         &lt;element name="subscriptionProduct" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ProductForInvolvement" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "subscriptionProduct"
    })
    public static class SubscriptionProducts {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<ProductForInvolvement> subscriptionProduct;

        /**
         * Gets the value of the subscriptionProduct property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subscriptionProduct property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubscriptionProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProductForInvolvement }
         * 
         * 
         */
        public List<ProductForInvolvement> getSubscriptionProduct() {
            if (subscriptionProduct == null) {
                subscriptionProduct = new ArrayList<ProductForInvolvement>();
            }
            return this.subscriptionProduct;
        }

    }

}
