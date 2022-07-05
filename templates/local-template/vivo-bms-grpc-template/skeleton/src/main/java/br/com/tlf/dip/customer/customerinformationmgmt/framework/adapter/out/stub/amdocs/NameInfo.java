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
 * Holds the name information for customer, account, billing arrangement, subscriber etc.
 * 
 * <p>Classe Java de NameInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NameInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nameType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nameLine1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nameLine2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="nameElement1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nameElement2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nameElement3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nameElement4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nameElement5" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nameElement6" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nameElement7" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nameElement8" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nameElement9" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nameElement10" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nameUpdateType" minOccurs="0"&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameInfo", propOrder = {
    "nameType",
    "nameLine1",
    "nameLine2",
    "effectiveDate",
    "expirationDate",
    "nameElement1",
    "nameElement2",
    "nameElement3",
    "nameElement4",
    "nameElement5",
    "nameElement6",
    "nameElement7",
    "nameElement8",
    "nameElement9",
    "nameElement10",
    "nameUpdateType",
    "linkType"
})
public class NameInfo {

    protected String nameType;
    protected String nameLine1;
    protected String nameLine2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected String nameElement1;
    protected String nameElement2;
    protected String nameElement3;
    protected String nameElement4;
    protected String nameElement5;
    protected String nameElement6;
    protected String nameElement7;
    protected String nameElement8;
    protected String nameElement9;
    protected String nameElement10;
    protected String nameUpdateType;
    protected String linkType;

    /**
     * Obtém o valor da propriedade nameType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameType() {
        return nameType;
    }

    /**
     * Define o valor da propriedade nameType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameType(String value) {
        this.nameType = value;
    }

    /**
     * Obtém o valor da propriedade nameLine1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameLine1() {
        return nameLine1;
    }

    /**
     * Define o valor da propriedade nameLine1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameLine1(String value) {
        this.nameLine1 = value;
    }

    /**
     * Obtém o valor da propriedade nameLine2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameLine2() {
        return nameLine2;
    }

    /**
     * Define o valor da propriedade nameLine2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameLine2(String value) {
        this.nameLine2 = value;
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
     * Obtém o valor da propriedade nameElement1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameElement1() {
        return nameElement1;
    }

    /**
     * Define o valor da propriedade nameElement1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameElement1(String value) {
        this.nameElement1 = value;
    }

    /**
     * Obtém o valor da propriedade nameElement2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameElement2() {
        return nameElement2;
    }

    /**
     * Define o valor da propriedade nameElement2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameElement2(String value) {
        this.nameElement2 = value;
    }

    /**
     * Obtém o valor da propriedade nameElement3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameElement3() {
        return nameElement3;
    }

    /**
     * Define o valor da propriedade nameElement3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameElement3(String value) {
        this.nameElement3 = value;
    }

    /**
     * Obtém o valor da propriedade nameElement4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameElement4() {
        return nameElement4;
    }

    /**
     * Define o valor da propriedade nameElement4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameElement4(String value) {
        this.nameElement4 = value;
    }

    /**
     * Obtém o valor da propriedade nameElement5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameElement5() {
        return nameElement5;
    }

    /**
     * Define o valor da propriedade nameElement5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameElement5(String value) {
        this.nameElement5 = value;
    }

    /**
     * Obtém o valor da propriedade nameElement6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameElement6() {
        return nameElement6;
    }

    /**
     * Define o valor da propriedade nameElement6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameElement6(String value) {
        this.nameElement6 = value;
    }

    /**
     * Obtém o valor da propriedade nameElement7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameElement7() {
        return nameElement7;
    }

    /**
     * Define o valor da propriedade nameElement7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameElement7(String value) {
        this.nameElement7 = value;
    }

    /**
     * Obtém o valor da propriedade nameElement8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameElement8() {
        return nameElement8;
    }

    /**
     * Define o valor da propriedade nameElement8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameElement8(String value) {
        this.nameElement8 = value;
    }

    /**
     * Obtém o valor da propriedade nameElement9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameElement9() {
        return nameElement9;
    }

    /**
     * Define o valor da propriedade nameElement9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameElement9(String value) {
        this.nameElement9 = value;
    }

    /**
     * Obtém o valor da propriedade nameElement10.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameElement10() {
        return nameElement10;
    }

    /**
     * Define o valor da propriedade nameElement10.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameElement10(String value) {
        this.nameElement10 = value;
    }

    /**
     * Obtém o valor da propriedade nameUpdateType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameUpdateType() {
        return nameUpdateType;
    }

    /**
     * Define o valor da propriedade nameUpdateType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameUpdateType(String value) {
        this.nameUpdateType = value;
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

}
