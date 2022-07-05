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
 * The freedom from taxes imposed by a taxing authority.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerprofile/types-unqualified/v1}CustomerAccountTaxExemption,
 * Derived from PIM entity CustomerAccountTaxExemption in the domain customer.
 * 
 * <p>Classe Java de CustomerAccountTaxExemptionForCreate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccountTaxExemptionForCreate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certificateNumberr" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="taxAuthority" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}TaxAuthority" minOccurs="0"/&gt;
 *         &lt;element name="taxAuthorityType" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}TaxAuthorityType" minOccurs="0"/&gt;
 *         &lt;element name="taxType" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}TaxType" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerAccountTaxExemptionForCreate", propOrder = {
    "certificateNumberr",
    "taxAuthority",
    "taxAuthorityType",
    "taxType",
    "validityEnd",
    "validityStart"
})
public class CustomerAccountTaxExemptionForCreate {

    protected String certificateNumberr;
    @XmlSchemaType(name = "string")
    protected TaxAuthority taxAuthority;
    @XmlSchemaType(name = "string")
    protected TaxAuthorityType taxAuthorityType;
    @XmlSchemaType(name = "string")
    protected TaxType taxType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validityEnd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validityStart;

    /**
     * Obtém o valor da propriedade certificateNumberr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumberr() {
        return certificateNumberr;
    }

    /**
     * Define o valor da propriedade certificateNumberr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumberr(String value) {
        this.certificateNumberr = value;
    }

    /**
     * Obtém o valor da propriedade taxAuthority.
     * 
     * @return
     *     possible object is
     *     {@link TaxAuthority }
     *     
     */
    public TaxAuthority getTaxAuthority() {
        return taxAuthority;
    }

    /**
     * Define o valor da propriedade taxAuthority.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAuthority }
     *     
     */
    public void setTaxAuthority(TaxAuthority value) {
        this.taxAuthority = value;
    }

    /**
     * Obtém o valor da propriedade taxAuthorityType.
     * 
     * @return
     *     possible object is
     *     {@link TaxAuthorityType }
     *     
     */
    public TaxAuthorityType getTaxAuthorityType() {
        return taxAuthorityType;
    }

    /**
     * Define o valor da propriedade taxAuthorityType.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAuthorityType }
     *     
     */
    public void setTaxAuthorityType(TaxAuthorityType value) {
        this.taxAuthorityType = value;
    }

    /**
     * Obtém o valor da propriedade taxType.
     * 
     * @return
     *     possible object is
     *     {@link TaxType }
     *     
     */
    public TaxType getTaxType() {
        return taxType;
    }

    /**
     * Define o valor da propriedade taxType.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType }
     *     
     */
    public void setTaxType(TaxType value) {
        this.taxType = value;
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
