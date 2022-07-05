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
 * A type of ContactMedium that is a postal address. A postal address is made up of 4 formatted address lines that are
 * used to address envelopes, packages that are posted. Operations that create PostalContact can create the formatted
 * lines from specific attributes such as town, city etc. if the consumer does not provide them.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/commonbusinessentities/types-unqualified/v1}PostalContact,
 * Derived from PIM entity PostalContact in the domain party.
 * 
 * <p>Classe Java de PostalContactBillingAddress complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PostalContactBillingAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactMediumBillingAddress"&gt;
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
 *         &lt;element name="complementAddress1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="complementAddress2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="complementAddress3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="complementAddressValue1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="complementAddressValue2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="complementAddressValue3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="country" type="{http://amdocs/tef-vivo/core/types/v1}CountryCode"/&gt;
 *         &lt;element name="dangerousArea" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dialingCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="externalId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="formattedAddress1"&gt;
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
 *         &lt;element name="fraudIndicator" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ibgeCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="localNationalCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="neighborHood" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="postalCode" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}GeographicPostalAreaCode" minOccurs="0"/&gt;
 *         &lt;element name="referencePoint"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ruralArea" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="state" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}StateID"/&gt;
 *         &lt;element name="street"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="streetNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="streetTitle"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="streetType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="telefonicArea" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
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
@XmlType(name = "PostalContactBillingAddress", propOrder = {
    "additionalName",
    "city",
    "complementAddress1",
    "complementAddress2",
    "complementAddress3",
    "complementAddressValue1",
    "complementAddressValue2",
    "complementAddressValue3",
    "country",
    "dangerousArea",
    "dialingCode",
    "externalId",
    "formattedAddress1",
    "formattedAddress2",
    "fraudIndicator",
    "ibgeCode",
    "localNationalCode",
    "neighborHood",
    "postalCode",
    "referencePoint",
    "ruralArea",
    "state",
    "street",
    "streetNumber",
    "streetTitle",
    "streetType",
    "telefonicArea"
})
public class PostalContactBillingAddress
    extends ContactMediumBillingAddress
{

    protected String additionalName;
    @XmlElement(required = true)
    protected String city;
    protected String complementAddress1;
    protected String complementAddress2;
    protected String complementAddress3;
    protected String complementAddressValue1;
    protected String complementAddressValue2;
    protected String complementAddressValue3;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CountryCode country;
    protected Boolean dangerousArea;
    protected String dialingCode;
    @XmlElement(required = true)
    protected String externalId;
    @XmlElement(required = true)
    protected String formattedAddress1;
    protected String formattedAddress2;
    protected Boolean fraudIndicator;
    @XmlElement(required = true)
    protected String ibgeCode;
    @XmlElement(required = true)
    protected String localNationalCode;
    protected String neighborHood;
    protected String postalCode;
    @XmlElement(required = true)
    protected String referencePoint;
    protected Boolean ruralArea;
    @XmlElement(required = true)
    protected StateID state;
    @XmlElement(required = true)
    protected String street;
    protected String streetNumber;
    @XmlElement(required = true)
    protected String streetTitle;
    @XmlElement(required = true)
    protected String streetType;
    protected String telefonicArea;

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
     * Obtém o valor da propriedade complementAddress1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementAddress1() {
        return complementAddress1;
    }

    /**
     * Define o valor da propriedade complementAddress1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementAddress1(String value) {
        this.complementAddress1 = value;
    }

    /**
     * Obtém o valor da propriedade complementAddress2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementAddress2() {
        return complementAddress2;
    }

    /**
     * Define o valor da propriedade complementAddress2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementAddress2(String value) {
        this.complementAddress2 = value;
    }

    /**
     * Obtém o valor da propriedade complementAddress3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementAddress3() {
        return complementAddress3;
    }

    /**
     * Define o valor da propriedade complementAddress3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementAddress3(String value) {
        this.complementAddress3 = value;
    }

    /**
     * Obtém o valor da propriedade complementAddressValue1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementAddressValue1() {
        return complementAddressValue1;
    }

    /**
     * Define o valor da propriedade complementAddressValue1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementAddressValue1(String value) {
        this.complementAddressValue1 = value;
    }

    /**
     * Obtém o valor da propriedade complementAddressValue2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementAddressValue2() {
        return complementAddressValue2;
    }

    /**
     * Define o valor da propriedade complementAddressValue2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementAddressValue2(String value) {
        this.complementAddressValue2 = value;
    }

    /**
     * Obtém o valor da propriedade complementAddressValue3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementAddressValue3() {
        return complementAddressValue3;
    }

    /**
     * Define o valor da propriedade complementAddressValue3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementAddressValue3(String value) {
        this.complementAddressValue3 = value;
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
     * Obtém o valor da propriedade dangerousArea.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDangerousArea() {
        return dangerousArea;
    }

    /**
     * Define o valor da propriedade dangerousArea.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDangerousArea(Boolean value) {
        this.dangerousArea = value;
    }

    /**
     * Obtém o valor da propriedade dialingCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialingCode() {
        return dialingCode;
    }

    /**
     * Define o valor da propriedade dialingCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialingCode(String value) {
        this.dialingCode = value;
    }

    /**
     * Obtém o valor da propriedade externalId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Define o valor da propriedade externalId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
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
     * Obtém o valor da propriedade fraudIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFraudIndicator() {
        return fraudIndicator;
    }

    /**
     * Define o valor da propriedade fraudIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFraudIndicator(Boolean value) {
        this.fraudIndicator = value;
    }

    /**
     * Obtém o valor da propriedade ibgeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbgeCode() {
        return ibgeCode;
    }

    /**
     * Define o valor da propriedade ibgeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbgeCode(String value) {
        this.ibgeCode = value;
    }

    /**
     * Obtém o valor da propriedade localNationalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalNationalCode() {
        return localNationalCode;
    }

    /**
     * Define o valor da propriedade localNationalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalNationalCode(String value) {
        this.localNationalCode = value;
    }

    /**
     * Obtém o valor da propriedade neighborHood.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeighborHood() {
        return neighborHood;
    }

    /**
     * Define o valor da propriedade neighborHood.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeighborHood(String value) {
        this.neighborHood = value;
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
     * Obtém o valor da propriedade referencePoint.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePoint() {
        return referencePoint;
    }

    /**
     * Define o valor da propriedade referencePoint.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePoint(String value) {
        this.referencePoint = value;
    }

    /**
     * Obtém o valor da propriedade ruralArea.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRuralArea() {
        return ruralArea;
    }

    /**
     * Define o valor da propriedade ruralArea.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRuralArea(Boolean value) {
        this.ruralArea = value;
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
     * Obtém o valor da propriedade street.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Define o valor da propriedade street.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Obtém o valor da propriedade streetNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Define o valor da propriedade streetNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumber(String value) {
        this.streetNumber = value;
    }

    /**
     * Obtém o valor da propriedade streetTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetTitle() {
        return streetTitle;
    }

    /**
     * Define o valor da propriedade streetTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetTitle(String value) {
        this.streetTitle = value;
    }

    /**
     * Obtém o valor da propriedade streetType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetType() {
        return streetType;
    }

    /**
     * Define o valor da propriedade streetType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetType(String value) {
        this.streetType = value;
    }

    /**
     * Obtém o valor da propriedade telefonicArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonicArea() {
        return telefonicArea;
    }

    /**
     * Define o valor da propriedade telefonicArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonicArea(String value) {
        this.telefonicArea = value;
    }

}
