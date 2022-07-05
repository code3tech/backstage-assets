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
import javax.xml.bind.annotation.XmlType;


/**
 * Details of the Organization.
 * 
 * <p>Classe Java de OrganizationDetails complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrganizationDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://amdocs/tef-vivo/customerprofile/types/v1}GeographicAddress" minOccurs="0"/&gt;
 *         &lt;element name="csrFirstName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="csrLastName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="organization" type="{http://amdocs/tef-vivo/customerprofile/types/v1}Organization" minOccurs="0"/&gt;
 *         &lt;element name="relatedIndividuals" minOccurs="0"&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationDetails", propOrder = {
    "address",
    "csrFirstName",
    "csrLastName",
    "organization",
    "relatedIndividuals"
})
public class OrganizationDetails2 {

    protected GeographicAddress2 address;
    protected String csrFirstName;
    protected String csrLastName;
    protected Organization2 organization;
    protected OrganizationDetails2 .RelatedIndividuals relatedIndividuals;

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link GeographicAddress2 }
     *     
     */
    public GeographicAddress2 getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicAddress2 }
     *     
     */
    public void setAddress(GeographicAddress2 value) {
        this.address = value;
    }

    /**
     * Obtém o valor da propriedade csrFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsrFirstName() {
        return csrFirstName;
    }

    /**
     * Define o valor da propriedade csrFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsrFirstName(String value) {
        this.csrFirstName = value;
    }

    /**
     * Obtém o valor da propriedade csrLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsrLastName() {
        return csrLastName;
    }

    /**
     * Define o valor da propriedade csrLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsrLastName(String value) {
        this.csrLastName = value;
    }

    /**
     * Obtém o valor da propriedade organization.
     * 
     * @return
     *     possible object is
     *     {@link Organization2 }
     *     
     */
    public Organization2 getOrganization() {
        return organization;
    }

    /**
     * Define o valor da propriedade organization.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization2 }
     *     
     */
    public void setOrganization(Organization2 value) {
        this.organization = value;
    }

    /**
     * Obtém o valor da propriedade relatedIndividuals.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDetails2 .RelatedIndividuals }
     *     
     */
    public OrganizationDetails2 .RelatedIndividuals getRelatedIndividuals() {
        return relatedIndividuals;
    }

    /**
     * Define o valor da propriedade relatedIndividuals.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDetails2 .RelatedIndividuals }
     *     
     */
    public void setRelatedIndividuals(OrganizationDetails2 .RelatedIndividuals value) {
        this.relatedIndividuals = value;
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
    public static class RelatedIndividuals {

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

}
