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
 * The financial reflection of the Customer relationship. A financial bottom line, in terms of outstanding balance and
 * debt amounts, of the log of financial transactions such as invoices and payments that stem from the Customer
 * relationship.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerprofile/types-unqualified/v1}CustomerAccount,
 * Derived from PIM entity CustomerAccount in the domain customer.
 * 
 * <p>Classe Java de CustomerAccountForSearch complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccountForSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessOrganizationUnit" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}BusinessOrganizationUnitID" minOccurs="0"/&gt;
 *         &lt;element name="collectionTreatments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="collectionTreatment" type="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}CollectionTreatmentForSearch" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="document" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}CustomerIdentificationDocument" minOccurs="0"/&gt;
 *         &lt;element name="id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
@XmlType(name = "CustomerAccountForSearch", namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1", propOrder = {
    "businessOrganizationUnit",
    "collectionTreatments",
    "document",
    "id",
    "name"
})
public class CustomerAccountForSearch {

    protected BusinessOrganizationUnitID businessOrganizationUnit;
    protected CustomerAccountForSearch.CollectionTreatments collectionTreatments;
    protected CustomerIdentificationDocument document;
    protected String id;
    protected String name;

    /**
     * Obtém o valor da propriedade businessOrganizationUnit.
     * 
     * @return
     *     possible object is
     *     {@link BusinessOrganizationUnitID }
     *     
     */
    public BusinessOrganizationUnitID getBusinessOrganizationUnit() {
        return businessOrganizationUnit;
    }

    /**
     * Define o valor da propriedade businessOrganizationUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessOrganizationUnitID }
     *     
     */
    public void setBusinessOrganizationUnit(BusinessOrganizationUnitID value) {
        this.businessOrganizationUnit = value;
    }

    /**
     * Obtém o valor da propriedade collectionTreatments.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountForSearch.CollectionTreatments }
     *     
     */
    public CustomerAccountForSearch.CollectionTreatments getCollectionTreatments() {
        return collectionTreatments;
    }

    /**
     * Define o valor da propriedade collectionTreatments.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountForSearch.CollectionTreatments }
     *     
     */
    public void setCollectionTreatments(CustomerAccountForSearch.CollectionTreatments value) {
        this.collectionTreatments = value;
    }

    /**
     * Obtém o valor da propriedade document.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentificationDocument }
     *     
     */
    public CustomerIdentificationDocument getDocument() {
        return document;
    }

    /**
     * Define o valor da propriedade document.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentificationDocument }
     *     
     */
    public void setDocument(CustomerIdentificationDocument value) {
        this.document = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     *         &lt;element name="collectionTreatment" type="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}CollectionTreatmentForSearch" minOccurs="0"/&gt;
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
        "collectionTreatment"
    })
    public static class CollectionTreatments {

        @XmlElement(namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1")
        protected CollectionTreatmentForSearch collectionTreatment;

        /**
         * Obtém o valor da propriedade collectionTreatment.
         * 
         * @return
         *     possible object is
         *     {@link CollectionTreatmentForSearch }
         *     
         */
        public CollectionTreatmentForSearch getCollectionTreatment() {
            return collectionTreatment;
        }

        /**
         * Define o valor da propriedade collectionTreatment.
         * 
         * @param value
         *     allowed object is
         *     {@link CollectionTreatmentForSearch }
         *     
         */
        public void setCollectionTreatment(CollectionTreatmentForSearch value) {
            this.collectionTreatment = value;
        }

    }

}
