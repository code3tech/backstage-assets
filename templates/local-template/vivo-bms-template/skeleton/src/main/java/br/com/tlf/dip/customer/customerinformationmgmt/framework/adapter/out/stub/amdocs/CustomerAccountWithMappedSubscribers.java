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
 * Derived from PIM entity CustomerAccount in the domain customer.
 * 
 * <p>Classe Java de CustomerAccountWithMappedSubscribers complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccountWithMappedSubscribers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collectionIndicator" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="collectionStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="collectionStatus" type="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}CollectionStatus" minOccurs="0"/&gt;
 *         &lt;element name="id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mappedSubscribers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mappedSubscriber" type="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}MappedSubscriptionDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="openDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}AccountStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccountWithMappedSubscribers", namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1", propOrder = {
    "collectionIndicator",
    "collectionStartDate",
    "collectionStatus",
    "id",
    "mappedSubscribers",
    "openDate",
    "status"
})
public class CustomerAccountWithMappedSubscribers {

    protected Boolean collectionIndicator;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar collectionStartDate;
    protected String collectionStatus;
    protected String id;
    protected CustomerAccountWithMappedSubscribers.MappedSubscribers mappedSubscribers;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openDate;
    protected String status;

    /**
     * Obtém o valor da propriedade collectionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollectionIndicator() {
        return collectionIndicator;
    }

    /**
     * Define o valor da propriedade collectionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollectionIndicator(Boolean value) {
        this.collectionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade collectionStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCollectionStartDate() {
        return collectionStartDate;
    }

    /**
     * Define o valor da propriedade collectionStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCollectionStartDate(XMLGregorianCalendar value) {
        this.collectionStartDate = value;
    }

    /**
     * Obtém o valor da propriedade collectionStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionStatus() {
        return collectionStatus;
    }

    /**
     * Define o valor da propriedade collectionStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionStatus(String value) {
        this.collectionStatus = value;
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
     * Obtém o valor da propriedade mappedSubscribers.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountWithMappedSubscribers.MappedSubscribers }
     *     
     */
    public CustomerAccountWithMappedSubscribers.MappedSubscribers getMappedSubscribers() {
        return mappedSubscribers;
    }

    /**
     * Define o valor da propriedade mappedSubscribers.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountWithMappedSubscribers.MappedSubscribers }
     *     
     */
    public void setMappedSubscribers(CustomerAccountWithMappedSubscribers.MappedSubscribers value) {
        this.mappedSubscribers = value;
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
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     *         &lt;element name="mappedSubscriber" type="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}MappedSubscriptionDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "mappedSubscriber"
    })
    public static class MappedSubscribers {

        @XmlElement(namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1")
        protected List<MappedSubscriptionDetails> mappedSubscriber;

        /**
         * Gets the value of the mappedSubscriber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mappedSubscriber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMappedSubscriber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MappedSubscriptionDetails }
         * 
         * 
         */
        public List<MappedSubscriptionDetails> getMappedSubscriber() {
            if (mappedSubscriber == null) {
                mappedSubscriber = new ArrayList<MappedSubscriptionDetails>();
            }
            return this.mappedSubscriber;
        }

    }

}
