//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The information used to create a Individual.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/commonbusinessentities/types-unqualified/v1}Individual,
 * Derived from PIM entity Individual in the domain party.
 * 
 * <p>Classe Java de IndividualForUpdate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IndividualForUpdate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/customerprofile/types/v1}IndividualPartyForUpdate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anonymous" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="deathDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="gender" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="languageTags" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="maritalStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="name" type="{http://amdocs/tef-vivo/customerprofile/types/v1}IndividualNameForUpdate" minOccurs="0"/&gt;
 *         &lt;element name="personRank" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualForUpdate", propOrder = {
    "anonymous",
    "birthDate",
    "deathDate",
    "gender",
    "languageTags",
    "maritalStatus",
    "name",
    "personRank"
})
public class IndividualForUpdate
    extends IndividualPartyForUpdate
{

    protected Boolean anonymous;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deathDate;
    protected String gender;
    protected String languageTags;
    protected String maritalStatus;
    protected IndividualNameForUpdate name;
    protected BigInteger personRank;

    /**
     * Obtém o valor da propriedade anonymous.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnonymous() {
        return anonymous;
    }

    /**
     * Define o valor da propriedade anonymous.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnonymous(Boolean value) {
        this.anonymous = value;
    }

    /**
     * Obtém o valor da propriedade birthDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Define o valor da propriedade birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Obtém o valor da propriedade deathDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeathDate() {
        return deathDate;
    }

    /**
     * Define o valor da propriedade deathDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeathDate(XMLGregorianCalendar value) {
        this.deathDate = value;
    }

    /**
     * Obtém o valor da propriedade gender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Define o valor da propriedade gender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Obtém o valor da propriedade languageTags.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageTags() {
        return languageTags;
    }

    /**
     * Define o valor da propriedade languageTags.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageTags(String value) {
        this.languageTags = value;
    }

    /**
     * Obtém o valor da propriedade maritalStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Define o valor da propriedade maritalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link IndividualNameForUpdate }
     *     
     */
    public IndividualNameForUpdate getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualNameForUpdate }
     *     
     */
    public void setName(IndividualNameForUpdate value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade personRank.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPersonRank() {
        return personRank;
    }

    /**
     * Define o valor da propriedade personRank.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPersonRank(BigInteger value) {
        this.personRank = value;
    }

}