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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A means (an instrument) for taking payments, that is, by which money can be withdrawn from an account with a credit
 * company or a bank. The card can be a credit card, debit card or charge card.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerprofile/types-unqualified/v1}Card,
 * Derived from PIM entity Card in the domain customer.
 * 
 * <p>Classe Java de CardSummary complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CardSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="brand" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cardBillingAddress" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="encryptedNumber" type="{http://amdocs/tef-vivo/core/types/v1}BinaryObject" minOccurs="0"/&gt;
 *         &lt;element name="id"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="imprintedName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="validityMonth" type="{http://www.w3.org/2001/XMLSchema}gMonth"/&gt;
 *         &lt;element name="validityYear"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}gYear"&gt;
 *               &lt;maxInclusive value="3000"/&gt;
 *               &lt;minInclusive value="1900"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="visibleNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
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
@XmlType(name = "CardSummary", propOrder = {
    "brand",
    "cardBillingAddress",
    "encryptedNumber",
    "id",
    "imprintedName",
    "validityMonth",
    "validityYear",
    "visibleNumber"
})
public class CardSummary {

    protected String brand;
    protected String cardBillingAddress;
    protected BinaryObject encryptedNumber;
    @XmlElement(required = true)
    protected String id;
    protected String imprintedName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "gMonth")
    protected XMLGregorianCalendar validityMonth;
    @XmlElement(required = true)
    protected XMLGregorianCalendar validityYear;
    protected String visibleNumber;

    /**
     * Obtém o valor da propriedade brand.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Define o valor da propriedade brand.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Obtém o valor da propriedade cardBillingAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBillingAddress() {
        return cardBillingAddress;
    }

    /**
     * Define o valor da propriedade cardBillingAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBillingAddress(String value) {
        this.cardBillingAddress = value;
    }

    /**
     * Obtém o valor da propriedade encryptedNumber.
     * 
     * @return
     *     possible object is
     *     {@link BinaryObject }
     *     
     */
    public BinaryObject getEncryptedNumber() {
        return encryptedNumber;
    }

    /**
     * Define o valor da propriedade encryptedNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryObject }
     *     
     */
    public void setEncryptedNumber(BinaryObject value) {
        this.encryptedNumber = value;
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
     * Obtém o valor da propriedade imprintedName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImprintedName() {
        return imprintedName;
    }

    /**
     * Define o valor da propriedade imprintedName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImprintedName(String value) {
        this.imprintedName = value;
    }

    /**
     * Obtém o valor da propriedade validityMonth.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidityMonth() {
        return validityMonth;
    }

    /**
     * Define o valor da propriedade validityMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidityMonth(XMLGregorianCalendar value) {
        this.validityMonth = value;
    }

    /**
     * Obtém o valor da propriedade validityYear.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidityYear() {
        return validityYear;
    }

    /**
     * Define o valor da propriedade validityYear.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidityYear(XMLGregorianCalendar value) {
        this.validityYear = value;
    }

    /**
     * Obtém o valor da propriedade visibleNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibleNumber() {
        return visibleNumber;
    }

    /**
     * Define o valor da propriedade visibleNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibleNumber(String value) {
        this.visibleNumber = value;
    }

}
