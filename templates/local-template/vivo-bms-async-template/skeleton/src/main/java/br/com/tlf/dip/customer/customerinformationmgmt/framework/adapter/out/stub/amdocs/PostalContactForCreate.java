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


/**
 * The information used to create a PostalContact.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/commonbusinessentities/types-unqualified/v1}PostalContact,
 * Derived from PIM entity PostalContact in the domain party.
 * 
 * <p>Classe Java de PostalContactForCreate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PostalContactForCreate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactMediumForCreate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="city"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="country" type="{http://amdocs/tef-vivo/core/types/v1}CountryCode"/&gt;
 *         &lt;element name="county" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}CountyID" minOccurs="0"/&gt;
 *         &lt;element name="formattedAddress1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1023"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="formattedAddress2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1023"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="formattedAddress3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1023"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="formattedAddress4" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1023"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="physicalLocation" type="{http://amdocs/tef-vivo/customerprofile/types/v1}GeographicAddressForCreate" minOccurs="0"/&gt;
 *         &lt;element name="postOfficeBox" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="postalCode" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}GeographicPostalAreaCode"/&gt;
 *         &lt;element name="state" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}StateID" minOccurs="0"/&gt;
 *         &lt;element name="town" minOccurs="0"&gt;
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
@XmlType(name = "PostalContactForCreate", propOrder = {
    "additionalName",
    "city",
    "country",
    "county",
    "formattedAddress1",
    "formattedAddress2",
    "formattedAddress3",
    "formattedAddress4",
    "physicalLocation",
    "postOfficeBox",
    "postalCode",
    "state",
    "town"
})
public class PostalContactForCreate
    extends ContactMediumForCreate
{

    protected String additionalName;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CountryCode country;
    protected CountyID county;
    protected String formattedAddress1;
    protected String formattedAddress2;
    protected String formattedAddress3;
    protected String formattedAddress4;
    protected GeographicAddressForCreate physicalLocation;
    protected String postOfficeBox;
    @XmlElement(required = true)
    protected String postalCode;
    protected StateID state;
    protected String town;

    /**
     * Obtém o valor da propriedade additionalName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalName() {
        return additionalName;
    }

    /**
     * Define o valor da propriedade additionalName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalName(String value) {
        this.additionalName = value;
    }

    /**
     * Obtém o valor da propriedade city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Define o valor da propriedade city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtém o valor da propriedade country.
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    public CountryCode getCountry() {
        return country;
    }

    /**
     * Define o valor da propriedade country.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    public void setCountry(CountryCode value) {
        this.country = value;
    }

    /**
     * Obtém o valor da propriedade county.
     * 
     * @return
     *     possible object is
     *     {@link CountyID }
     *     
     */
    public CountyID getCounty() {
        return county;
    }

    /**
     * Define o valor da propriedade county.
     * 
     * @param value
     *     allowed object is
     *     {@link CountyID }
     *     
     */
    public void setCounty(CountyID value) {
        this.county = value;
    }

    /**
     * Obtém o valor da propriedade formattedAddress1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedAddress1() {
        return formattedAddress1;
    }

    /**
     * Define o valor da propriedade formattedAddress1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedAddress1(String value) {
        this.formattedAddress1 = value;
    }

    /**
     * Obtém o valor da propriedade formattedAddress2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedAddress2() {
        return formattedAddress2;
    }

    /**
     * Define o valor da propriedade formattedAddress2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedAddress2(String value) {
        this.formattedAddress2 = value;
    }

    /**
     * Obtém o valor da propriedade formattedAddress3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedAddress3() {
        return formattedAddress3;
    }

    /**
     * Define o valor da propriedade formattedAddress3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedAddress3(String value) {
        this.formattedAddress3 = value;
    }

    /**
     * Obtém o valor da propriedade formattedAddress4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedAddress4() {
        return formattedAddress4;
    }

    /**
     * Define o valor da propriedade formattedAddress4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedAddress4(String value) {
        this.formattedAddress4 = value;
    }

    /**
     * Obtém o valor da propriedade physicalLocation.
     * 
     * @return
     *     possible object is
     *     {@link GeographicAddressForCreate }
     *     
     */
    public GeographicAddressForCreate getPhysicalLocation() {
        return physicalLocation;
    }

    /**
     * Define o valor da propriedade physicalLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicAddressForCreate }
     *     
     */
    public void setPhysicalLocation(GeographicAddressForCreate value) {
        this.physicalLocation = value;
    }

    /**
     * Obtém o valor da propriedade postOfficeBox.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostOfficeBox() {
        return postOfficeBox;
    }

    /**
     * Define o valor da propriedade postOfficeBox.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostOfficeBox(String value) {
        this.postOfficeBox = value;
    }

    /**
     * Obtém o valor da propriedade postalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Define o valor da propriedade postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Obtém o valor da propriedade state.
     * 
     * @return
     *     possible object is
     *     {@link StateID }
     *     
     */
    public StateID getState() {
        return state;
    }

    /**
     * Define o valor da propriedade state.
     * 
     * @param value
     *     allowed object is
     *     {@link StateID }
     *     
     */
    public void setState(StateID value) {
        this.state = value;
    }

    /**
     * Obtém o valor da propriedade town.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown() {
        return town;
    }

    /**
     * Define o valor da propriedade town.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown(String value) {
        this.town = value;
    }

}
