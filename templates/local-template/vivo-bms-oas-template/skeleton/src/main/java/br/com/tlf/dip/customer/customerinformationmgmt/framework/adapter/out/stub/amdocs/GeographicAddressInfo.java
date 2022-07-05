//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import lombok.Data;


/**
 * A structured textual way of describing where a GeographicSite is. It is usually composed of an ordered list of names of
 * geographic locations according to rules governed by context.
 * :
 * Derived from PIM entity GeographicAddress in the domain location.
 * 
 * <p>Classe Java de GeographicAddressInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GeographicAddressInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="city" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="complement1Value" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="complement2Value" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="complement3Value" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="complementType1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="complementType2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="complementType3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="country" type="{http://amdocs/tef-vivo/core/types/v1}CountryCode" minOccurs="0"/&gt;
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
 *         &lt;element name="id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="postOfficeBox" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="postalCode" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}GeographicPostalAreaCode" minOccurs="0"/&gt;
 *         &lt;element name="referencePoint" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="state" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}State" minOccurs="0"/&gt;
 *         &lt;element name="street" minOccurs="0"&gt;
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
 *               &lt;maxLength value="1023"/&gt;
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
@XmlType(name = "GeographicAddressInfo", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "city",
    "complement1Value",
    "complement2Value",
    "complement3Value",
    "complementType1",
    "complementType2",
    "complementType3",
    "country",
    "formattedAddress1",
    "formattedAddress2",
    "formattedAddress3",
    "formattedAddress4",
    "id",
    "latitude",
    "longitude",
    "postOfficeBox",
    "postalCode",
    "referencePoint",
    "state",
    "street",
    "streetNumber"
})
@Data
public class GeographicAddressInfo {

    protected String city;
    protected String complement1Value;
    protected String complement2Value;
    protected String complement3Value;
    protected String complementType1;
    protected String complementType2;
    protected String complementType3;
    @XmlSchemaType(name = "string")
    protected CountryCode country;
    protected String formattedAddress1;
    protected String formattedAddress2;
    protected String formattedAddress3;
    protected String formattedAddress4;
    protected String id;
    protected BigDecimal latitude;
    protected BigDecimal longitude;
    protected String postOfficeBox;
    protected String postalCode;
    protected String referencePoint;
    protected State state;
    protected String street;
    protected String streetNumber;

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
     * Obtém o valor da propriedade complement1Value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplement1Value() {
        return complement1Value;
    }

    /**
     * Define o valor da propriedade complement1Value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplement1Value(String value) {
        this.complement1Value = value;
    }

    /**
     * Obtém o valor da propriedade complement2Value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplement2Value() {
        return complement2Value;
    }

    /**
     * Define o valor da propriedade complement2Value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplement2Value(String value) {
        this.complement2Value = value;
    }

    /**
     * Obtém o valor da propriedade complement3Value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplement3Value() {
        return complement3Value;
    }

    /**
     * Define o valor da propriedade complement3Value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplement3Value(String value) {
        this.complement3Value = value;
    }

    /**
     * Obtém o valor da propriedade complementType1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementType1() {
        return complementType1;
    }

    /**
     * Define o valor da propriedade complementType1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementType1(String value) {
        this.complementType1 = value;
    }

    /**
     * Obtém o valor da propriedade complementType2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementType2() {
        return complementType2;
    }

    /**
     * Define o valor da propriedade complementType2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementType2(String value) {
        this.complementType2 = value;
    }

    /**
     * Obtém o valor da propriedade complementType3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementType3() {
        return complementType3;
    }

    /**
     * Define o valor da propriedade complementType3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementType3(String value) {
        this.complementType3 = value;
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
     * Obtém o valor da propriedade latitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Define o valor da propriedade latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * Obtém o valor da propriedade longitude.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Define o valor da propriedade longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
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
     * Obtém o valor da propriedade state.
     * 
     * @return
     *     possible object is
     *     {@link State }
     *     
     */
    public State getState() {
        return state;
    }

    /**
     * Define o valor da propriedade state.
     * 
     * @param value
     *     allowed object is
     *     {@link State }
     *     
     */
    public void setState(State value) {
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

}
