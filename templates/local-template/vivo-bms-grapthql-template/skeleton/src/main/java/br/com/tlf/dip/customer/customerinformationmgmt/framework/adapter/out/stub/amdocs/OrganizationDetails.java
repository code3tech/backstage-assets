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
 *         &lt;element name="address" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}GeographicAddressInfo" minOccurs="0"/&gt;
 *         &lt;element name="csr" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}Employee" minOccurs="0"/&gt;
 *         &lt;element name="organization" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}Organization" minOccurs="0"/&gt;
 *         &lt;element name="relatedIndividuals" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="individual" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}IndividualDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "OrganizationDetails", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "address",
    "csr",
    "organization",
    "relatedIndividuals"
})
public class OrganizationDetails {

    protected GeographicAddressInfo address;
    protected Employee csr;
    protected Organization organization;
    protected OrganizationDetails.RelatedIndividuals relatedIndividuals;

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link GeographicAddressInfo }
     *     
     */
    public GeographicAddressInfo getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicAddressInfo }
     *     
     */
    public void setAddress(GeographicAddressInfo value) {
        this.address = value;
    }

    /**
     * Obtém o valor da propriedade csr.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getCsr() {
        return csr;
    }

    /**
     * Define o valor da propriedade csr.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setCsr(Employee value) {
        this.csr = value;
    }

    /**
     * Obtém o valor da propriedade organization.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Define o valor da propriedade organization.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setOrganization(Organization value) {
        this.organization = value;
    }

    /**
     * Obtém o valor da propriedade relatedIndividuals.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDetails.RelatedIndividuals }
     *     
     */
    public OrganizationDetails.RelatedIndividuals getRelatedIndividuals() {
        return relatedIndividuals;
    }

    /**
     * Define o valor da propriedade relatedIndividuals.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDetails.RelatedIndividuals }
     *     
     */
    public void setRelatedIndividuals(OrganizationDetails.RelatedIndividuals value) {
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
     *         &lt;element name="individual" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}IndividualDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
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

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<IndividualDetails> individual;

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
         * {@link IndividualDetails }
         * 
         * 
         */
        public List<IndividualDetails> getIndividual() {
            if (individual == null) {
                individual = new ArrayList<IndividualDetails>();
            }
            return this.individual;
        }

    }

}
