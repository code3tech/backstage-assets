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
 * <p>Classe Java de RetrieveCustomerProfileByExternalIDResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveCustomerProfileByExternalIDResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerDetails" type="{http://amdocs/tef-vivo/customerprofile/types/v1}Customer"/&gt;
 *         &lt;element name="geographicAddressesReferenced" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="geographicAddresse" type="{http://amdocs/tef-vivo/customerprofile/types/v1}GeographicAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *                   &lt;element name="individual" type="{http://amdocs/tef-vivo/customerprofile/types/v1}Individual" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *                   &lt;element name="organization" type="{http://amdocs/tef-vivo/customerprofile/types/v1}Organization" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "RetrieveCustomerProfileByExternalIDResponse", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "customerDetails",
    "geographicAddressesReferenced",
    "individualsReferenced",
    "organizationsReferenced"
})
public class RetrieveCustomerProfileByExternalIDResponse {

    @XmlElement(required = true)
    protected Customer2 customerDetails;
    protected RetrieveCustomerProfileByExternalIDResponse.GeographicAddressesReferenced geographicAddressesReferenced;
    protected RetrieveCustomerProfileByExternalIDResponse.IndividualsReferenced individualsReferenced;
    protected RetrieveCustomerProfileByExternalIDResponse.OrganizationsReferenced organizationsReferenced;

    /**
     * Obtém o valor da propriedade customerDetails.
     * 
     * @return
     *     possible object is
     *     {@link Customer2 }
     *     
     */
    public Customer2 getCustomerDetails() {
        return customerDetails;
    }

    /**
     * Define o valor da propriedade customerDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer2 }
     *     
     */
    public void setCustomerDetails(Customer2 value) {
        this.customerDetails = value;
    }

    /**
     * Obtém o valor da propriedade geographicAddressesReferenced.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveCustomerProfileByExternalIDResponse.GeographicAddressesReferenced }
     *     
     */
    public RetrieveCustomerProfileByExternalIDResponse.GeographicAddressesReferenced getGeographicAddressesReferenced() {
        return geographicAddressesReferenced;
    }

    /**
     * Define o valor da propriedade geographicAddressesReferenced.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveCustomerProfileByExternalIDResponse.GeographicAddressesReferenced }
     *     
     */
    public void setGeographicAddressesReferenced(RetrieveCustomerProfileByExternalIDResponse.GeographicAddressesReferenced value) {
        this.geographicAddressesReferenced = value;
    }

    /**
     * Obtém o valor da propriedade individualsReferenced.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveCustomerProfileByExternalIDResponse.IndividualsReferenced }
     *     
     */
    public RetrieveCustomerProfileByExternalIDResponse.IndividualsReferenced getIndividualsReferenced() {
        return individualsReferenced;
    }

    /**
     * Define o valor da propriedade individualsReferenced.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveCustomerProfileByExternalIDResponse.IndividualsReferenced }
     *     
     */
    public void setIndividualsReferenced(RetrieveCustomerProfileByExternalIDResponse.IndividualsReferenced value) {
        this.individualsReferenced = value;
    }

    /**
     * Obtém o valor da propriedade organizationsReferenced.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveCustomerProfileByExternalIDResponse.OrganizationsReferenced }
     *     
     */
    public RetrieveCustomerProfileByExternalIDResponse.OrganizationsReferenced getOrganizationsReferenced() {
        return organizationsReferenced;
    }

    /**
     * Define o valor da propriedade organizationsReferenced.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveCustomerProfileByExternalIDResponse.OrganizationsReferenced }
     *     
     */
    public void setOrganizationsReferenced(RetrieveCustomerProfileByExternalIDResponse.OrganizationsReferenced value) {
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
     *         &lt;element name="geographicAddresse" type="{http://amdocs/tef-vivo/customerprofile/types/v1}GeographicAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "geographicAddresse"
    })
    public static class GeographicAddressesReferenced {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<GeographicAddress2> geographicAddresse;

        /**
         * Gets the value of the geographicAddresse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the geographicAddresse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGeographicAddresse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GeographicAddress2 }
         * 
         * 
         */
        public List<GeographicAddress2> getGeographicAddresse() {
            if (geographicAddresse == null) {
                geographicAddresse = new ArrayList<GeographicAddress2>();
            }
            return this.geographicAddresse;
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
     *         &lt;element name="individual" type="{http://amdocs/tef-vivo/customerprofile/types/v1}Individual" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        protected List<Individual2> individual;

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
         * {@link Individual2 }
         * 
         * 
         */
        public List<Individual2> getIndividual() {
            if (individual == null) {
                individual = new ArrayList<Individual2>();
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
     *         &lt;element name="organization" type="{http://amdocs/tef-vivo/customerprofile/types/v1}Organization" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        protected List<Organization2> organization;

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
         * {@link Organization2 }
         * 
         * 
         */
        public List<Organization2> getOrganization() {
            if (organization == null) {
                organization = new ArrayList<Organization2>();
            }
            return this.organization;
        }

    }

}
