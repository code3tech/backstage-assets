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
 * <p>Classe Java de RetrieveContactResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveContactResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aggregateContact" type="{http://amdocs/tef-vivo/customerprofile/types/v1}AggregateContactForRetrieve"/&gt;
 *         &lt;element name="addressesReferenced" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="addresse" type="{http://amdocs/tef-vivo/customerprofile/types/v1}GeographicAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "RetrieveContactResponse", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "aggregateContact",
    "addressesReferenced",
    "organizationsReferenced"
})
public class RetrieveContactResponse {

    @XmlElement(required = true)
    protected AggregateContactForRetrieve aggregateContact;
    protected RetrieveContactResponse.AddressesReferenced addressesReferenced;
    protected RetrieveContactResponse.OrganizationsReferenced organizationsReferenced;

    /**
     * Obtém o valor da propriedade aggregateContact.
     * 
     * @return
     *     possible object is
     *     {@link AggregateContactForRetrieve }
     *     
     */
    public AggregateContactForRetrieve getAggregateContact() {
        return aggregateContact;
    }

    /**
     * Define o valor da propriedade aggregateContact.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregateContactForRetrieve }
     *     
     */
    public void setAggregateContact(AggregateContactForRetrieve value) {
        this.aggregateContact = value;
    }

    /**
     * Obtém o valor da propriedade addressesReferenced.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveContactResponse.AddressesReferenced }
     *     
     */
    public RetrieveContactResponse.AddressesReferenced getAddressesReferenced() {
        return addressesReferenced;
    }

    /**
     * Define o valor da propriedade addressesReferenced.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveContactResponse.AddressesReferenced }
     *     
     */
    public void setAddressesReferenced(RetrieveContactResponse.AddressesReferenced value) {
        this.addressesReferenced = value;
    }

    /**
     * Obtém o valor da propriedade organizationsReferenced.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveContactResponse.OrganizationsReferenced }
     *     
     */
    public RetrieveContactResponse.OrganizationsReferenced getOrganizationsReferenced() {
        return organizationsReferenced;
    }

    /**
     * Define o valor da propriedade organizationsReferenced.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveContactResponse.OrganizationsReferenced }
     *     
     */
    public void setOrganizationsReferenced(RetrieveContactResponse.OrganizationsReferenced value) {
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
     *         &lt;element name="addresse" type="{http://amdocs/tef-vivo/customerprofile/types/v1}GeographicAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "addresse"
    })
    public static class AddressesReferenced {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<GeographicAddress2> addresse;

        /**
         * Gets the value of the addresse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addresse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddresse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GeographicAddress2 }
         * 
         * 
         */
        public List<GeographicAddress2> getAddresse() {
            if (addresse == null) {
                addresse = new ArrayList<GeographicAddress2>();
            }
            return this.addresse;
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
