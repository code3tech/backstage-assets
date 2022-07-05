//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Basic information about the account..
 * 
 * <p>Classe Java de AddressInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AddressInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sinceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="addressLine1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressLine2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressLine3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressLine4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="validityCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressElement1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressElement2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressElement3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressElement4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressElement5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressElement6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressElement7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressElement8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressElement9" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressElement10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressElement11" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressElement12" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressElement13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressElement14" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressElement15" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addressUpdateType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="linkType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="verificationInd" minOccurs="0"&gt;
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
@XmlType(name = "AddressInfo", propOrder = {
    "addressType",
    "sinceDate",
    "effectiveDate",
    "expirationDate",
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "validityCode",
    "addressElement1",
    "addressElement2",
    "addressElement3",
    "addressElement4",
    "addressElement5",
    "addressElement6",
    "addressElement7",
    "addressElement8",
    "addressElement9",
    "addressElement10",
    "addressElement11",
    "addressElement12",
    "addressElement13",
    "addressElement14",
    "addressElement15",
    "addressUpdateType",
    "linkType",
    "verificationInd"
})
public class AddressInfo {

    protected String addressType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sinceDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected String addressLine1;
    protected String addressLine2;
    protected String addressLine3;
    protected String addressLine4;
    protected String validityCode;
    protected String addressElement1;
    protected String addressElement2;
    protected String addressElement3;
    protected String addressElement4;
    protected String addressElement5;
    protected String addressElement6;
    protected String addressElement7;
    protected String addressElement8;
    protected String addressElement9;
    protected String addressElement10;
    protected String addressElement11;
    protected String addressElement12;
    protected String addressElement13;
    protected String addressElement14;
    protected String addressElement15;
    protected String addressUpdateType;
    protected String linkType;
    protected String verificationInd;

    /**
     * Obtém o valor da propriedade addressType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Define o valor da propriedade addressType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Obtém o valor da propriedade sinceDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSinceDate() {
        return sinceDate;
    }

    /**
     * Define o valor da propriedade sinceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSinceDate(XMLGregorianCalendar value) {
        this.sinceDate = value;
    }

    /**
     * Obtém o valor da propriedade effectiveDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Define o valor da propriedade effectiveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Obtém o valor da propriedade expirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Define o valor da propriedade expirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Obtém o valor da propriedade addressLine1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Define o valor da propriedade addressLine1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Obtém o valor da propriedade addressLine2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Define o valor da propriedade addressLine2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Obtém o valor da propriedade addressLine3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Define o valor da propriedade addressLine3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * Obtém o valor da propriedade addressLine4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * Define o valor da propriedade addressLine4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine4(String value) {
        this.addressLine4 = value;
    }

    /**
     * Obtém o valor da propriedade validityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidityCode() {
        return validityCode;
    }

    /**
     * Define o valor da propriedade validityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityCode(String value) {
        this.validityCode = value;
    }

    /**
     * Obtém o valor da propriedade addressElement1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressElement1() {
        return addressElement1;
    }

    /**
     * Define o valor da propriedade addressElement1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressElement1(String value) {
        this.addressElement1 = value;
    }

    /**
     * Obtém o valor da propriedade addressElement2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressElement2() {
        return addressElement2;
    }

    /**
     * Define o valor da propriedade addressElement2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressElement2(String value) {
        this.addressElement2 = value;
    }

    /**
     * Obtém o valor da propriedade addressElement3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressElement3() {
        return addressElement3;
    }

    /**
     * Define o valor da propriedade addressElement3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressElement3(String value) {
        this.addressElement3 = value;
    }

    /**
     * Obtém o valor da propriedade addressElement4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressElement4() {
        return addressElement4;
    }

    /**
     * Define o valor da propriedade addressElement4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressElement4(String value) {
        this.addressElement4 = value;
    }

    /**
     * Obtém o valor da propriedade addressElement5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressElement5() {
        return addressElement5;
    }

    /**
     * Define o valor da propriedade addressElement5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressElement5(String value) {
        this.addressElement5 = value;
    }

    /**
     * Obtém o valor da propriedade addressElement6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressElement6() {
        return addressElement6;
    }

    /**
     * Define o valor da propriedade addressElement6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressElement6(String value) {
        this.addressElement6 = value;
    }

    /**
     * Obtém o valor da propriedade addressElement7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressElement7() {
        return addressElement7;
    }

    /**
     * Define o valor da propriedade addressElement7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressElement7(String value) {
        this.addressElement7 = value;
    }

    /**
     * Obtém o valor da propriedade addressElement8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressElement8() {
        return addressElement8;
    }

    /**
     * Define o valor da propriedade addressElement8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressElement8(String value) {
        this.addressElement8 = value;
    }

    /**
     * Obtém o valor da propriedade addressElement9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressElement9() {
        return addressElement9;
    }

    /**
     * Define o valor da propriedade addressElement9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressElement9(String value) {
        this.addressElement9 = value;
    }

    /**
     * Obtém o valor da propriedade addressElement10.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressElement10() {
        return addressElement10;
    }

    /**
     * Define o valor da propriedade addressElement10.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressElement10(String value) {
        this.addressElement10 = value;
    }

    /**
     * Obtém o valor da propriedade addressElement11.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressElement11() {
        return addressElement11;
    }

    /**
     * Define o valor da propriedade addressElement11.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressElement11(String value) {
        this.addressElement11 = value;
    }

    /**
     * Obtém o valor da propriedade addressElement12.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressElement12() {
        return addressElement12;
    }

    /**
     * Define o valor da propriedade addressElement12.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressElement12(String value) {
        this.addressElement12 = value;
    }

    /**
     * Obtém o valor da propriedade addressElement13.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressElement13() {
        return addressElement13;
    }

    /**
     * Define o valor da propriedade addressElement13.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressElement13(String value) {
        this.addressElement13 = value;
    }

    /**
     * Obtém o valor da propriedade addressElement14.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressElement14() {
        return addressElement14;
    }

    /**
     * Define o valor da propriedade addressElement14.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressElement14(String value) {
        this.addressElement14 = value;
    }

    /**
     * Obtém o valor da propriedade addressElement15.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressElement15() {
        return addressElement15;
    }

    /**
     * Define o valor da propriedade addressElement15.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressElement15(String value) {
        this.addressElement15 = value;
    }

    /**
     * Obtém o valor da propriedade addressUpdateType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressUpdateType() {
        return addressUpdateType;
    }

    /**
     * Define o valor da propriedade addressUpdateType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressUpdateType(String value) {
        this.addressUpdateType = value;
    }

    /**
     * Obtém o valor da propriedade linkType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkType() {
        return linkType;
    }

    /**
     * Define o valor da propriedade linkType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkType(String value) {
        this.linkType = value;
    }

    /**
     * Obtém o valor da propriedade verificationInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificationInd() {
        return verificationInd;
    }

    /**
     * Define o valor da propriedade verificationInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificationInd(String value) {
        this.verificationInd = value;
    }

}
