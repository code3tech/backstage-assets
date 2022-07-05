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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The role played by an Individual or Organization in a business relationship with the service provider in which they
 * intend to buy, buy, or receive products or services from the service provider, and therefore incur and are liable for
 * the charges entailed by those products or services. It is also the role played by an Individual or Organization who
 * only pay for products or services that other Individuals or Organizations buy or receive.
 * :
 * Derived from PIM entity Customer in the domain customer.:
 * Restriction of {http://amdocs/pbg-portfolio/commonbusinessentities/types-unqualified/v1}Customer,
 * Derived from PIM entity Customer in the domain customer.
 * 
 * <p>Classe Java de OrganizationCustomerProfileForCreate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrganizationCustomerProfileForCreate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/customerprofile/types/v1}PartyRoleForOrganizationCustomerProfile"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acquisitionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="alias"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="businessOrganizationUnit" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}BusinessOrganizationUnitID" minOccurs="0"/&gt;
 *         &lt;element name="customerBillingProfile" type="{http://amdocs/tef-vivo/customerprofile/types/v1}IndividualCustomerBillingProfileForCreate"/&gt;
 *         &lt;element name="externalID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="owningOrganization" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}OrganizationAllID" minOccurs="0"/&gt;
 *         &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="resourcePool" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}ResourcePool" minOccurs="0"/&gt;
 *         &lt;element name="subType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="type" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
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
@XmlType(name = "OrganizationCustomerProfileForCreate", propOrder = {
    "acquisitionDate",
    "alias",
    "businessOrganizationUnit",
    "customerBillingProfile",
    "externalID",
    "owningOrganization",
    "rank",
    "resourcePool",
    "subType",
    "type"
})
public class OrganizationCustomerProfileForCreate
    extends PartyRoleForOrganizationCustomerProfile
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar acquisitionDate;
    @XmlElement(required = true)
    protected String alias;
    protected BusinessOrganizationUnitID businessOrganizationUnit;
    @XmlElement(required = true)
    protected IndividualCustomerBillingProfileForCreate customerBillingProfile;
    protected String externalID;
    protected OrganizationAllID owningOrganization;
    protected BigInteger rank;
    protected ResourcePool resourcePool;
    protected String subType;
    protected String type;

    /**
     * Obtém o valor da propriedade acquisitionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcquisitionDate() {
        return acquisitionDate;
    }

    /**
     * Define o valor da propriedade acquisitionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcquisitionDate(XMLGregorianCalendar value) {
        this.acquisitionDate = value;
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
     * Obtém o valor da propriedade businessOrganizationUnit.
     * 
     * @return
     *     possible object is
     *     {@link BusinessOrganizationUnitID }
     *     
     */
    public BusinessOrganizationUnitID getBusinessOrganizationUnit() {
        return businessOrganizationUnit;
    }

    /**
     * Define o valor da propriedade businessOrganizationUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessOrganizationUnitID }
     *     
     */
    public void setBusinessOrganizationUnit(BusinessOrganizationUnitID value) {
        this.businessOrganizationUnit = value;
    }

    /**
     * Obtém o valor da propriedade customerBillingProfile.
     * 
     * @return
     *     possible object is
     *     {@link IndividualCustomerBillingProfileForCreate }
     *     
     */
    public IndividualCustomerBillingProfileForCreate getCustomerBillingProfile() {
        return customerBillingProfile;
    }

    /**
     * Define o valor da propriedade customerBillingProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualCustomerBillingProfileForCreate }
     *     
     */
    public void setCustomerBillingProfile(IndividualCustomerBillingProfileForCreate value) {
        this.customerBillingProfile = value;
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
     * Obtém o valor da propriedade owningOrganization.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAllID }
     *     
     */
    public OrganizationAllID getOwningOrganization() {
        return owningOrganization;
    }

    /**
     * Define o valor da propriedade owningOrganization.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAllID }
     *     
     */
    public void setOwningOrganization(OrganizationAllID value) {
        this.owningOrganization = value;
    }

    /**
     * Obtém o valor da propriedade rank.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRank() {
        return rank;
    }

    /**
     * Define o valor da propriedade rank.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRank(BigInteger value) {
        this.rank = value;
    }

    /**
     * Obtém o valor da propriedade resourcePool.
     * 
     * @return
     *     possible object is
     *     {@link ResourcePool }
     *     
     */
    public ResourcePool getResourcePool() {
        return resourcePool;
    }

    /**
     * Define o valor da propriedade resourcePool.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcePool }
     *     
     */
    public void setResourcePool(ResourcePool value) {
        this.resourcePool = value;
    }

    /**
     * Obtém o valor da propriedade subType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Define o valor da propriedade subType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
