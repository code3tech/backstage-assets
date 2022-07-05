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
 * A group of people with which the service provider collectively does business with, or which the service provider needs
 * to address collectively for a business-related  purpose. The Organization may be a statutory Organization, that is,
 * have a legal status which is independent of the people as individuals.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/commonbusinessentities/types-unqualified/v1}Organization,
 * Derived from PIM entity Organization in the domain party.
 * 
 * <p>Classe Java de OrganizationSummary complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrganizationSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/customerprofile/types/v1}OrganizationSummaryParty"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalId" type="{http://amdocs/tef-vivo/core/types/v1}AdditionalId" minOccurs="0"/&gt;
 *         &lt;element name="businessDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1023"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ceaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="establishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="externalID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fiscalYearEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="isLegalEntity" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="language" type="{http://amdocs/tef-vivo/core/types/v1}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://amdocs/tef-vivo/customerprofile/types/v1}OrganizationName"/&gt;
 *         &lt;element name="organizationType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="revenueRange" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sizeEmployees" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="standards" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}OrganizationStandard" minOccurs="0"/&gt;
 *         &lt;element name="stockSymbol" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="wwwDomain" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationSummary", propOrder = {
    "additionalId",
    "businessDescription",
    "ceaseDate",
    "establishDate",
    "externalID",
    "fiscalYearEnd",
    "isLegalEntity",
    "language",
    "name",
    "organizationType",
    "revenueRange",
    "sizeEmployees",
    "standards",
    "stockSymbol",
    "wwwDomain"
})
public class OrganizationSummary
    extends OrganizationSummaryParty
{

    protected AdditionalId additionalId;
    protected String businessDescription;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ceaseDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar establishDate;
    protected String externalID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fiscalYearEnd;
    protected Boolean isLegalEntity;
    @XmlSchemaType(name = "string")
    protected LanguageCode language;
    @XmlElement(required = true)
    protected OrganizationName2 name;
    protected String organizationType;
    protected String revenueRange;
    protected String sizeEmployees;
    protected String standards;
    protected String stockSymbol;
    protected String wwwDomain;

    /**
     * Obtém o valor da propriedade additionalId.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalId }
     *     
     */
    public AdditionalId getAdditionalId() {
        return additionalId;
    }

    /**
     * Define o valor da propriedade additionalId.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalId }
     *     
     */
    public void setAdditionalId(AdditionalId value) {
        this.additionalId = value;
    }

    /**
     * Obtém o valor da propriedade businessDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessDescription() {
        return businessDescription;
    }

    /**
     * Define o valor da propriedade businessDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessDescription(String value) {
        this.businessDescription = value;
    }

    /**
     * Obtém o valor da propriedade ceaseDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCeaseDate() {
        return ceaseDate;
    }

    /**
     * Define o valor da propriedade ceaseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCeaseDate(XMLGregorianCalendar value) {
        this.ceaseDate = value;
    }

    /**
     * Obtém o valor da propriedade establishDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstablishDate() {
        return establishDate;
    }

    /**
     * Define o valor da propriedade establishDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstablishDate(XMLGregorianCalendar value) {
        this.establishDate = value;
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
     * Obtém o valor da propriedade fiscalYearEnd.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFiscalYearEnd() {
        return fiscalYearEnd;
    }

    /**
     * Define o valor da propriedade fiscalYearEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFiscalYearEnd(XMLGregorianCalendar value) {
        this.fiscalYearEnd = value;
    }

    /**
     * Obtém o valor da propriedade isLegalEntity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLegalEntity() {
        return isLegalEntity;
    }

    /**
     * Define o valor da propriedade isLegalEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLegalEntity(Boolean value) {
        this.isLegalEntity = value;
    }

    /**
     * Obtém o valor da propriedade language.
     * 
     * @return
     *     possible object is
     *     {@link LanguageCode }
     *     
     */
    public LanguageCode getLanguage() {
        return language;
    }

    /**
     * Define o valor da propriedade language.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCode }
     *     
     */
    public void setLanguage(LanguageCode value) {
        this.language = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationName2 }
     *     
     */
    public OrganizationName2 getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationName2 }
     *     
     */
    public void setName(OrganizationName2 value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade organizationType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationType() {
        return organizationType;
    }

    /**
     * Define o valor da propriedade organizationType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationType(String value) {
        this.organizationType = value;
    }

    /**
     * Obtém o valor da propriedade revenueRange.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevenueRange() {
        return revenueRange;
    }

    /**
     * Define o valor da propriedade revenueRange.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevenueRange(String value) {
        this.revenueRange = value;
    }

    /**
     * Obtém o valor da propriedade sizeEmployees.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeEmployees() {
        return sizeEmployees;
    }

    /**
     * Define o valor da propriedade sizeEmployees.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeEmployees(String value) {
        this.sizeEmployees = value;
    }

    /**
     * Obtém o valor da propriedade standards.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandards() {
        return standards;
    }

    /**
     * Define o valor da propriedade standards.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandards(String value) {
        this.standards = value;
    }

    /**
     * Obtém o valor da propriedade stockSymbol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockSymbol() {
        return stockSymbol;
    }

    /**
     * Define o valor da propriedade stockSymbol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockSymbol(String value) {
        this.stockSymbol = value;
    }

    /**
     * Obtém o valor da propriedade wwwDomain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWwwDomain() {
        return wwwDomain;
    }

    /**
     * Define o valor da propriedade wwwDomain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWwwDomain(String value) {
        this.wwwDomain = value;
    }

}
