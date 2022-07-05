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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information, usually in a form of a document, used by an Individual as a proof of identity.
 * :
 * Restriction of {http://amdocs/tef-vivo/commonbusinessentities/types-unqualified/v1}IndividualIdentification,
 * Derived from PIM entity IndividualIdentification in the domain party.
 * 
 * <p>Classe Java de IndividualIdentification complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IndividualIdentification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isDefault" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="issuingCountry" type="{http://amdocs/tef-vivo/core/types/v1}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="validityEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="validityStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualIdentification", propOrder = {
    "id",
    "isDefault",
    "issuingCountry",
    "validityEnd",
    "validityStart"
})
@XmlSeeAlso({
    DriversLicenseIdentification.class,
    NationalIdentityCardIdentification2 .class,
    OtherIndividualIdentification.class,
    PassportIdentification.class,
    SocialSecurityNumberIdentification.class
})
public abstract class IndividualIdentification2 {

    protected String id;
    protected Boolean isDefault;
    @XmlSchemaType(name = "string")
    protected CountryCode issuingCountry;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validityEnd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validityStart;

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
     * Obtém o valor da propriedade isDefault.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Define o valor da propriedade isDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

    /**
     * Obtém o valor da propriedade issuingCountry.
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    public CountryCode getIssuingCountry() {
        return issuingCountry;
    }

    /**
     * Define o valor da propriedade issuingCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    public void setIssuingCountry(CountryCode value) {
        this.issuingCountry = value;
    }

    /**
     * Obtém o valor da propriedade validityEnd.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidityEnd() {
        return validityEnd;
    }

    /**
     * Define o valor da propriedade validityEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidityEnd(XMLGregorianCalendar value) {
        this.validityEnd = value;
    }

    /**
     * Obtém o valor da propriedade validityStart.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidityStart() {
        return validityStart;
    }

    /**
     * Define o valor da propriedade validityStart.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidityStart(XMLGregorianCalendar value) {
        this.validityStart = value;
    }

}
