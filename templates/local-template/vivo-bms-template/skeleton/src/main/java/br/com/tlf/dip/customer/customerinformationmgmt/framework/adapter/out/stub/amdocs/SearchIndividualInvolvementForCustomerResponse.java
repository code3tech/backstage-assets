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
 * <p>Classe Java de SearchIndividualInvolvementForCustomerResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SearchIndividualInvolvementForCustomerResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="involvements" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="involvement" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}IndividualInvolvement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="contactsReferenced" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="contact" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactMediumForInvolvement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="individualsReferenced" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="individual" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualShortSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "SearchIndividualInvolvementForCustomerResponse", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "involvements",
    "contactsReferenced",
    "individualsReferenced"
})
public class SearchIndividualInvolvementForCustomerResponse {

    protected SearchIndividualInvolvementForCustomerResponse.Involvements involvements;
    protected SearchIndividualInvolvementForCustomerResponse.ContactsReferenced contactsReferenced;
    protected SearchIndividualInvolvementForCustomerResponse.IndividualsReferenced individualsReferenced;

    /**
     * Obtém o valor da propriedade involvements.
     * 
     * @return
     *     possible object is
     *     {@link SearchIndividualInvolvementForCustomerResponse.Involvements }
     *     
     */
    public SearchIndividualInvolvementForCustomerResponse.Involvements getInvolvements() {
        return involvements;
    }

    /**
     * Define o valor da propriedade involvements.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchIndividualInvolvementForCustomerResponse.Involvements }
     *     
     */
    public void setInvolvements(SearchIndividualInvolvementForCustomerResponse.Involvements value) {
        this.involvements = value;
    }

    /**
     * Obtém o valor da propriedade contactsReferenced.
     * 
     * @return
     *     possible object is
     *     {@link SearchIndividualInvolvementForCustomerResponse.ContactsReferenced }
     *     
     */
    public SearchIndividualInvolvementForCustomerResponse.ContactsReferenced getContactsReferenced() {
        return contactsReferenced;
    }

    /**
     * Define o valor da propriedade contactsReferenced.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchIndividualInvolvementForCustomerResponse.ContactsReferenced }
     *     
     */
    public void setContactsReferenced(SearchIndividualInvolvementForCustomerResponse.ContactsReferenced value) {
        this.contactsReferenced = value;
    }

    /**
     * Obtém o valor da propriedade individualsReferenced.
     * 
     * @return
     *     possible object is
     *     {@link SearchIndividualInvolvementForCustomerResponse.IndividualsReferenced }
     *     
     */
    public SearchIndividualInvolvementForCustomerResponse.IndividualsReferenced getIndividualsReferenced() {
        return individualsReferenced;
    }

    /**
     * Define o valor da propriedade individualsReferenced.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchIndividualInvolvementForCustomerResponse.IndividualsReferenced }
     *     
     */
    public void setIndividualsReferenced(SearchIndividualInvolvementForCustomerResponse.IndividualsReferenced value) {
        this.individualsReferenced = value;
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
     *         &lt;element name="contact" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactMediumForInvolvement" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "contact"
    })
    public static class ContactsReferenced {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<ContactMediumForInvolvement> contact;

        /**
         * Gets the value of the contact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContact().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactMediumForInvolvement }
         * 
         * 
         */
        public List<ContactMediumForInvolvement> getContact() {
            if (contact == null) {
                contact = new ArrayList<ContactMediumForInvolvement>();
            }
            return this.contact;
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
     *         &lt;element name="individual" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualShortSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "individual"
    })
    public static class IndividualsReferenced {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<IndividualShortSummary> individual;

        /**
         * Gets the value of the individual property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the individual property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIndividual().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IndividualShortSummary }
         * 
         * 
         */
        public List<IndividualShortSummary> getIndividual() {
            if (individual == null) {
                individual = new ArrayList<IndividualShortSummary>();
            }
            return this.individual;
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
     *         &lt;element name="involvement" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}IndividualInvolvement" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "involvement"
    })
    public static class Involvements {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<IndividualInvolvement> involvement;

        /**
         * Gets the value of the involvement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the involvement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInvolvement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IndividualInvolvement }
         * 
         * 
         */
        public List<IndividualInvolvement> getInvolvement() {
            if (involvement == null) {
                involvement = new ArrayList<IndividualInvolvement>();
            }
            return this.involvement;
        }

    }

}
