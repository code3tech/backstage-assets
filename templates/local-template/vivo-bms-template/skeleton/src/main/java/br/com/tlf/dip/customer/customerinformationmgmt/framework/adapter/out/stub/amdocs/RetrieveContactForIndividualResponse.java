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
 * <p>Classe Java de RetrieveContactForIndividualResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveContactForIndividualResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="individual" type="{http://amdocs/tef-vivo/customerprofile/types/v1}Individual" minOccurs="0"/&gt;
 *         &lt;element name="contacts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="contact" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactForMeans" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressesReferenced" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="address" type="{http://amdocs/tef-vivo/customerprofile/types/v1}GeographicAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="organizationsReferenced" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="organization" type="{http://amdocs/tef-vivo/customerprofile/types/v1}OrganizationSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "RetrieveContactForIndividualResponse", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "individual",
    "contacts",
    "addressesReferenced",
    "organizationsReferenced"
})
public class RetrieveContactForIndividualResponse {

    protected Individual2 individual;
    protected RetrieveContactForIndividualResponse.Contacts contacts;
    protected RetrieveContactForIndividualResponse.AddressesReferenced addressesReferenced;
    protected RetrieveContactForIndividualResponse.OrganizationsReferenced organizationsReferenced;

    /**
     * Obtém o valor da propriedade individual.
     * 
     * @return
     *     possible object is
     *     {@link Individual2 }
     *     
     */
    public Individual2 getIndividual() {
        return individual;
    }

    /**
     * Define o valor da propriedade individual.
     * 
     * @param value
     *     allowed object is
     *     {@link Individual2 }
     *     
     */
    public void setIndividual(Individual2 value) {
        this.individual = value;
    }

    /**
     * Obtém o valor da propriedade contacts.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveContactForIndividualResponse.Contacts }
     *     
     */
    public RetrieveContactForIndividualResponse.Contacts getContacts() {
        return contacts;
    }

    /**
     * Define o valor da propriedade contacts.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveContactForIndividualResponse.Contacts }
     *     
     */
    public void setContacts(RetrieveContactForIndividualResponse.Contacts value) {
        this.contacts = value;
    }

    /**
     * Obtém o valor da propriedade addressesReferenced.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveContactForIndividualResponse.AddressesReferenced }
     *     
     */
    public RetrieveContactForIndividualResponse.AddressesReferenced getAddressesReferenced() {
        return addressesReferenced;
    }

    /**
     * Define o valor da propriedade addressesReferenced.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveContactForIndividualResponse.AddressesReferenced }
     *     
     */
    public void setAddressesReferenced(RetrieveContactForIndividualResponse.AddressesReferenced value) {
        this.addressesReferenced = value;
    }

    /**
     * Obtém o valor da propriedade organizationsReferenced.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveContactForIndividualResponse.OrganizationsReferenced }
     *     
     */
    public RetrieveContactForIndividualResponse.OrganizationsReferenced getOrganizationsReferenced() {
        return organizationsReferenced;
    }

    /**
     * Define o valor da propriedade organizationsReferenced.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveContactForIndividualResponse.OrganizationsReferenced }
     *     
     */
    public void setOrganizationsReferenced(RetrieveContactForIndividualResponse.OrganizationsReferenced value) {
        this.organizationsReferenced = value;
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
     *         &lt;element name="address" type="{http://amdocs/tef-vivo/customerprofile/types/v1}GeographicAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "address"
    })
    public static class AddressesReferenced {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<GeographicAddress2> address;

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GeographicAddress2 }
         * 
         * 
         */
        public List<GeographicAddress2> getAddress() {
            if (address == null) {
                address = new ArrayList<GeographicAddress2>();
            }
            return this.address;
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
     *         &lt;element name="contact" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactForMeans" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    public static class Contacts {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<ContactForMeans> contact;

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
         * {@link ContactForMeans }
         * 
         * 
         */
        public List<ContactForMeans> getContact() {
            if (contact == null) {
                contact = new ArrayList<ContactForMeans>();
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
     *         &lt;element name="organization" type="{http://amdocs/tef-vivo/customerprofile/types/v1}OrganizationSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "organization"
    })
    public static class OrganizationsReferenced {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<OrganizationSummary> organization;

        /**
         * Gets the value of the organization property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the organization property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrganization().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrganizationSummary }
         * 
         * 
         */
        public List<OrganizationSummary> getOrganization() {
            if (organization == null) {
                organization = new ArrayList<OrganizationSummary>();
            }
            return this.organization;
        }

    }

}
