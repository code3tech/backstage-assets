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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The financial reflection of the Customer relationship. A financial bottom line, in terms of outstanding balance and
 * debt amounts, of the log of financial transactions such as invoices and payments that stem from the Customer
 * relationship.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerprofile/types-unqualified/v1}CustomerAccount,
 * Derived from PIM entity CustomerAccount in the domain customer.
 * 
 * <p>Classe Java de CustomerAccountForRetrieve complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccountForRetrieve"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ageBuckets" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ageBucket" type="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}AgeBuckets" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="balancePolicy" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}BalancePolicy" minOccurs="0"/&gt;
 *         &lt;element name="collectionStatus" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}CollectionStatusBilling" minOccurs="0"/&gt;
 *         &lt;element name="collectionTreatments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="collectionTreatment" type="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}CollectionTreatment" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="collectionWaiver" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="currency" type="{http://amdocs/tef-vivo/core/types/v1}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="documentType" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}CustomerAccountDocumentType" minOccurs="0"/&gt;
 *         &lt;element name="externalID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fixCollectionPolicy" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}CollectionPolicy" minOccurs="0"/&gt;
 *         &lt;element name="id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="latePaymentFeeWaiver" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
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
 *         &lt;element name="openDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="writeOffStatus" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}WriteOffStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccountForRetrieve", namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1", propOrder = {
    "ageBuckets",
    "balancePolicy",
    "collectionStatus",
    "collectionTreatments",
    "collectionWaiver",
    "currency",
    "documentType",
    "externalID",
    "fixCollectionPolicy",
    "id",
    "latePaymentFeeWaiver",
    "name",
    "openDate",
    "writeOffStatus"
})
public class CustomerAccountForRetrieve {

    protected CustomerAccountForRetrieve.AgeBuckets ageBuckets;
    @XmlSchemaType(name = "string")
    protected BalancePolicy balancePolicy;
    @XmlSchemaType(name = "string")
    protected CollectionStatusBilling collectionStatus;
    protected CustomerAccountForRetrieve.CollectionTreatments collectionTreatments;
    protected Boolean collectionWaiver;
    @XmlSchemaType(name = "string")
    protected CurrencyCode currency;
    @XmlSchemaType(name = "string")
    protected CustomerAccountDocumentType documentType;
    protected String externalID;
    protected String fixCollectionPolicy;
    protected String id;
    protected Boolean latePaymentFeeWaiver;
    protected String name;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openDate;
    @XmlSchemaType(name = "string")
    protected WriteOffStatus writeOffStatus;

    /**
     * Obtém o valor da propriedade ageBuckets.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountForRetrieve.AgeBuckets }
     *     
     */
    public CustomerAccountForRetrieve.AgeBuckets getAgeBuckets() {
        return ageBuckets;
    }

    /**
     * Define o valor da propriedade ageBuckets.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountForRetrieve.AgeBuckets }
     *     
     */
    public void setAgeBuckets(CustomerAccountForRetrieve.AgeBuckets value) {
        this.ageBuckets = value;
    }

    /**
     * Obtém o valor da propriedade balancePolicy.
     * 
     * @return
     *     possible object is
     *     {@link BalancePolicy }
     *     
     */
    public BalancePolicy getBalancePolicy() {
        return balancePolicy;
    }

    /**
     * Define o valor da propriedade balancePolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link BalancePolicy }
     *     
     */
    public void setBalancePolicy(BalancePolicy value) {
        this.balancePolicy = value;
    }

    /**
     * Obtém o valor da propriedade collectionStatus.
     * 
     * @return
     *     possible object is
     *     {@link CollectionStatusBilling }
     *     
     */
    public CollectionStatusBilling getCollectionStatus() {
        return collectionStatus;
    }

    /**
     * Define o valor da propriedade collectionStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionStatusBilling }
     *     
     */
    public void setCollectionStatus(CollectionStatusBilling value) {
        this.collectionStatus = value;
    }

    /**
     * Obtém o valor da propriedade collectionTreatments.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountForRetrieve.CollectionTreatments }
     *     
     */
    public CustomerAccountForRetrieve.CollectionTreatments getCollectionTreatments() {
        return collectionTreatments;
    }

    /**
     * Define o valor da propriedade collectionTreatments.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountForRetrieve.CollectionTreatments }
     *     
     */
    public void setCollectionTreatments(CustomerAccountForRetrieve.CollectionTreatments value) {
        this.collectionTreatments = value;
    }

    /**
     * Obtém o valor da propriedade collectionWaiver.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollectionWaiver() {
        return collectionWaiver;
    }

    /**
     * Define o valor da propriedade collectionWaiver.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollectionWaiver(Boolean value) {
        this.collectionWaiver = value;
    }

    /**
     * Obtém o valor da propriedade currency.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getCurrency() {
        return currency;
    }

    /**
     * Define o valor da propriedade currency.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setCurrency(CurrencyCode value) {
        this.currency = value;
    }

    /**
     * Obtém o valor da propriedade documentType.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountDocumentType }
     *     
     */
    public CustomerAccountDocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Define o valor da propriedade documentType.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountDocumentType }
     *     
     */
    public void setDocumentType(CustomerAccountDocumentType value) {
        this.documentType = value;
    }

    /**
     * Obtém o valor da propriedade externalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalID() {
        return externalID;
    }

    /**
     * Define o valor da propriedade externalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalID(String value) {
        this.externalID = value;
    }

    /**
     * Obtém o valor da propriedade fixCollectionPolicy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixCollectionPolicy() {
        return fixCollectionPolicy;
    }

    /**
     * Define o valor da propriedade fixCollectionPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixCollectionPolicy(String value) {
        this.fixCollectionPolicy = value;
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
     * Obtém o valor da propriedade latePaymentFeeWaiver.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLatePaymentFeeWaiver() {
        return latePaymentFeeWaiver;
    }

    /**
     * Define o valor da propriedade latePaymentFeeWaiver.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLatePaymentFeeWaiver(Boolean value) {
        this.latePaymentFeeWaiver = value;
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
     * Obtém o valor da propriedade openDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenDate() {
        return openDate;
    }

    /**
     * Define o valor da propriedade openDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenDate(XMLGregorianCalendar value) {
        this.openDate = value;
    }

    /**
     * Obtém o valor da propriedade writeOffStatus.
     * 
     * @return
     *     possible object is
     *     {@link WriteOffStatus }
     *     
     */
    public WriteOffStatus getWriteOffStatus() {
        return writeOffStatus;
    }

    /**
     * Define o valor da propriedade writeOffStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link WriteOffStatus }
     *     
     */
    public void setWriteOffStatus(WriteOffStatus value) {
        this.writeOffStatus = value;
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
     *         &lt;element name="ageBucket" type="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}AgeBuckets" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "ageBucket"
    })
    public static class AgeBuckets {

        @XmlElement(namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1")
        protected List<br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs.AgeBuckets> ageBucket;

        /**
         * Gets the value of the ageBucket property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ageBucket property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAgeBucket().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs.AgeBuckets }
         * 
         * 
         */
        public List<br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs.AgeBuckets> getAgeBucket() {
            if (ageBucket == null) {
                ageBucket = new ArrayList<br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs.AgeBuckets>();
            }
            return this.ageBucket;
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
     *         &lt;element name="collectionTreatment" type="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}CollectionTreatment" minOccurs="0"/&gt;
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
        protected CollectionTreatment collectionTreatment;

        /**
         * Obtém o valor da propriedade collectionTreatment.
         * 
         * @return
         *     possible object is
         *     {@link CollectionTreatment }
         *     
         */
        public CollectionTreatment getCollectionTreatment() {
            return collectionTreatment;
        }

        /**
         * Define o valor da propriedade collectionTreatment.
         * 
         * @param value
         *     allowed object is
         *     {@link CollectionTreatment }
         *     
         */
        public void setCollectionTreatment(CollectionTreatment value) {
            this.collectionTreatment = value;
        }

    }

}
