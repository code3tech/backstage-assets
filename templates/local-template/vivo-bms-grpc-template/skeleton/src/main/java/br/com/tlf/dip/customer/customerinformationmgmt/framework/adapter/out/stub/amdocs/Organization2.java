//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
 * <p>Classe Java de Organization complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Organization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/customerprofile/types/v1}OrganizationParty"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalId" type="{http://amdocs/tef-vivo/core/types/v1}AdditionalId" minOccurs="0"/&gt;
 *         &lt;element name="alias" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="businessDescription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1023"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="businessPartnerAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ceaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="cnpj" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="customerValue" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="establishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="externalID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fax" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fiscalYearEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="identifications" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="identification" type="{http://amdocs/tef-vivo/customerprofile/types/v1}OrganizationIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isLegalEntity" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="judicialBlock" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="language" type="{http://amdocs/tef-vivo/core/types/v1}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="locations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="location" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}GeographicSiteID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="municipalRegExemptionInd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="municipalRegNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="180"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="name" type="{http://amdocs/tef-vivo/customerprofile/types/v1}OrganizationName"/&gt;
 *         &lt;element name="organizationType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="phone" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
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
 *         &lt;element name="stateRegExemptionInd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="stateRegNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="180"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="stockSymbol" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="subsidiariesAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "Organization", propOrder = {
    "additionalId",
    "alias",
    "businessDescription",
    "businessPartnerAmount",
    "ceaseDate",
    "cnpj",
    "customerValue",
    "establishDate",
    "externalID",
    "fax",
    "fiscalYearEnd",
    "identifications",
    "isLegalEntity",
    "judicialBlock",
    "language",
    "locations",
    "municipalRegExemptionInd",
    "municipalRegNumber",
    "name",
    "organizationType",
    "phone",
    "revenueRange",
    "sizeEmployees",
    "standards",
    "stateRegExemptionInd",
    "stateRegNumber",
    "stockSymbol",
    "subsidiariesAmount",
    "wwwDomain"
})
public class Organization2
    extends OrganizationParty2
{

    protected AdditionalId additionalId;
    protected String alias;
    protected String businessDescription;
    protected BigDecimal businessPartnerAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ceaseDate;
    protected String cnpj;
    protected String customerValue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar establishDate;
    protected String externalID;
    protected String fax;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fiscalYearEnd;
    protected Organization2 .Identifications identifications;
    protected Boolean isLegalEntity;
    protected Boolean judicialBlock;
    @XmlSchemaType(name = "string")
    protected LanguageCode language;
    protected Organization2 .Locations locations;
    protected Boolean municipalRegExemptionInd;
    protected String municipalRegNumber;
    @XmlElement(required = true)
    protected OrganizationName2 name;
    protected String organizationType;
    protected String phone;
    protected String revenueRange;
    protected String sizeEmployees;
    protected String standards;
    protected Boolean stateRegExemptionInd;
    protected String stateRegNumber;
    protected String stockSymbol;
    protected BigDecimal subsidiariesAmount;
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
     * Obtém o valor da propriedade alias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Define o valor da propriedade alias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
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
     * Obtém o valor da propriedade businessPartnerAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBusinessPartnerAmount() {
        return businessPartnerAmount;
    }

    /**
     * Define o valor da propriedade businessPartnerAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBusinessPartnerAmount(BigDecimal value) {
        this.businessPartnerAmount = value;
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
     * Obtém o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpj(String value) {
        this.cnpj = value;
    }

    /**
     * Obtém o valor da propriedade customerValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerValue() {
        return customerValue;
    }

    /**
     * Define o valor da propriedade customerValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerValue(String value) {
        this.customerValue = value;
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
     * Obtém o valor da propriedade fax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Define o valor da propriedade fax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
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
     * Obtém o valor da propriedade identifications.
     * 
     * @return
     *     possible object is
     *     {@link Organization2 .Identifications }
     *     
     */
    public Organization2 .Identifications getIdentifications() {
        return identifications;
    }

    /**
     * Define o valor da propriedade identifications.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization2 .Identifications }
     *     
     */
    public void setIdentifications(Organization2 .Identifications value) {
        this.identifications = value;
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
     * Obtém o valor da propriedade judicialBlock.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJudicialBlock() {
        return judicialBlock;
    }

    /**
     * Define o valor da propriedade judicialBlock.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJudicialBlock(Boolean value) {
        this.judicialBlock = value;
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
     * Obtém o valor da propriedade locations.
     * 
     * @return
     *     possible object is
     *     {@link Organization2 .Locations }
     *     
     */
    public Organization2 .Locations getLocations() {
        return locations;
    }

    /**
     * Define o valor da propriedade locations.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization2 .Locations }
     *     
     */
    public void setLocations(Organization2 .Locations value) {
        this.locations = value;
    }

    /**
     * Obtém o valor da propriedade municipalRegExemptionInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMunicipalRegExemptionInd() {
        return municipalRegExemptionInd;
    }

    /**
     * Define o valor da propriedade municipalRegExemptionInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMunicipalRegExemptionInd(Boolean value) {
        this.municipalRegExemptionInd = value;
    }

    /**
     * Obtém o valor da propriedade municipalRegNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipalRegNumber() {
        return municipalRegNumber;
    }

    /**
     * Define o valor da propriedade municipalRegNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipalRegNumber(String value) {
        this.municipalRegNumber = value;
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
     * Obtém o valor da propriedade phone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Define o valor da propriedade phone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
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
     * Obtém o valor da propriedade stateRegExemptionInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStateRegExemptionInd() {
        return stateRegExemptionInd;
    }

    /**
     * Define o valor da propriedade stateRegExemptionInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStateRegExemptionInd(Boolean value) {
        this.stateRegExemptionInd = value;
    }

    /**
     * Obtém o valor da propriedade stateRegNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateRegNumber() {
        return stateRegNumber;
    }

    /**
     * Define o valor da propriedade stateRegNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateRegNumber(String value) {
        this.stateRegNumber = value;
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
     * Obtém o valor da propriedade subsidiariesAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubsidiariesAmount() {
        return subsidiariesAmount;
    }

    /**
     * Define o valor da propriedade subsidiariesAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubsidiariesAmount(BigDecimal value) {
        this.subsidiariesAmount = value;
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
     *         &lt;element name="identification" type="{http://amdocs/tef-vivo/customerprofile/types/v1}OrganizationIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "identification"
    })
    public static class Identifications {

        protected List<OrganizationIdentification> identification;

        /**
         * Gets the value of the identification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the identification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIdentification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrganizationIdentification }
         * 
         * 
         */
        public List<OrganizationIdentification> getIdentification() {
            if (identification == null) {
                identification = new ArrayList<OrganizationIdentification>();
            }
            return this.identification;
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
     *         &lt;element name="location" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}GeographicSiteID" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "location"
    })
    public static class Locations {

        protected List<GeographicSiteID> location;

        /**
         * Gets the value of the location property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the location property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GeographicSiteID }
         * 
         * 
         */
        public List<GeographicSiteID> getLocation() {
            if (location == null) {
                location = new ArrayList<GeographicSiteID>();
            }
            return this.location;
        }

    }

}
