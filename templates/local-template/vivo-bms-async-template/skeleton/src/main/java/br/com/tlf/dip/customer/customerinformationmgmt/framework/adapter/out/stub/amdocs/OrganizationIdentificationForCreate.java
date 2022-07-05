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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information used by a statutory organization as a proof of identity, usually registration with a regulator.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/commonbusinessentities/types-unqualified/v1}OrganizationIdentification,
 * Derived from PIM entity OrganizationIdentification in the domain party.
 * 
 * <p>Classe Java de OrganizationIdentificationForCreate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrganizationIdentificationForCreate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isDefault" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="issuingCountry" type="{http://amdocs/tef-vivo/core/types/v1}CountryCode"/&gt;
 *         &lt;element name="issuingState" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}State" minOccurs="0"/&gt;
 *         &lt;element name="validityEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="validityStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationIdentificationForCreate", propOrder = {
    "isDefault",
    "issuingCountry",
    "issuingState",
    "validityEnd",
    "validityStart"
})
@XmlSeeAlso({
    CompanyRegistrationForCreate.class,
    OtherOrganizationIdentificationForCreate.class,
    TaxRegistrationForCreate.class
})
public abstract class OrganizationIdentificationForCreate {

    protected Boolean isDefault;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CountryCode issuingCountry;
    protected State2 issuingState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validityEnd;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validityStart;

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
     * Obtém o valor da propriedade issuingState.
     * 
     * @return
     *     possible object is
     *     {@link State2 }
     *     
     */
    public State2 getIssuingState() {
        return issuingState;
    }

    /**
     * Define o valor da propriedade issuingState.
     * 
     * @param value
     *     allowed object is
     *     {@link State2 }
     *     
     */
    public void setIssuingState(State2 value) {
        this.issuingState = value;
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
