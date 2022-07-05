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
 * Registration with regulatory authority which is used as identification.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/commonbusinessentities/types-unqualified/v1}OtherOrganizationIdentification,
 * Derived from PIM entity OtherOrganizationIdentification in the domain party.
 * 
 * <p>Classe Java de OtherOrganizationIdentificationForCreate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OtherOrganizationIdentificationForCreate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/customerprofile/types/v1}OrganizationIdentificationForCreate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificationValue"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="issuingJurisdictionName" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}RegulatoryAuthority"/&gt;
 *         &lt;element name="type" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}OtherOrganizationIdentificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherOrganizationIdentificationForCreate", propOrder = {
    "identificationValue",
    "issuingJurisdictionName",
    "type"
})
public class OtherOrganizationIdentificationForCreate
    extends OrganizationIdentificationForCreate
{

    @XmlElement(required = true)
    protected String identificationValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RegulatoryAuthority issuingJurisdictionName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OtherOrganizationIdentificationType type;

    /**
     * Obtém o valor da propriedade identificationValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationValue() {
        return identificationValue;
    }

    /**
     * Define o valor da propriedade identificationValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationValue(String value) {
        this.identificationValue = value;
    }

    /**
     * Obtém o valor da propriedade issuingJurisdictionName.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryAuthority }
     *     
     */
    public RegulatoryAuthority getIssuingJurisdictionName() {
        return issuingJurisdictionName;
    }

    /**
     * Define o valor da propriedade issuingJurisdictionName.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryAuthority }
     *     
     */
    public void setIssuingJurisdictionName(RegulatoryAuthority value) {
        this.issuingJurisdictionName = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link OtherOrganizationIdentificationType }
     *     
     */
    public OtherOrganizationIdentificationType getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherOrganizationIdentificationType }
     *     
     */
    public void setType(OtherOrganizationIdentificationType value) {
        this.type = value;
    }

}
