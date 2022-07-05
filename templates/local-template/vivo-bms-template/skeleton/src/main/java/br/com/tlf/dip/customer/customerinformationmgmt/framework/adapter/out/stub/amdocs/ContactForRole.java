//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A role played by an Individual in which they can be contacted. The two most common situations are:
 * 
 * 	An Individual contacted and acts for oneself.
 * 	An Individual contacted and acts as a delegate on behalf of an Organization.
 * 
 * :
 * Restriction of {http://amdocs/pbg-portfolio/commonbusinessentities/types-unqualified/v1}Contact,
 * Derived from PIM entity Contact in the domain party.
 * 
 * <p>Classe Java de ContactForRole complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ContactForRole"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/customerprofile/types/v1}IndividualRoleOnlyPartyID"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactMeans" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="contactMean" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactMedium" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="organization" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}OrganizationOnlyID" minOccurs="0"/&gt;
 *         &lt;element name="primary" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="role" minOccurs="0"&gt;
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
@XmlType(name = "ContactForRole", propOrder = {
    "contactMeans",
    "organization",
    "primary",
    "role"
})
public class ContactForRole
    extends IndividualRoleOnlyPartyID
{

    protected ContactForRole.ContactMeans contactMeans;
    protected OrganizationOnlyID organization;
    protected Boolean primary;
    protected String role;

    /**
     * Obtém o valor da propriedade contactMeans.
     * 
     * @return
     *     possible object is
     *     {@link ContactForRole.ContactMeans }
     *     
     */
    public ContactForRole.ContactMeans getContactMeans() {
        return contactMeans;
    }

    /**
     * Define o valor da propriedade contactMeans.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactForRole.ContactMeans }
     *     
     */
    public void setContactMeans(ContactForRole.ContactMeans value) {
        this.contactMeans = value;
    }

    /**
     * Obtém o valor da propriedade organization.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationOnlyID }
     *     
     */
    public OrganizationOnlyID getOrganization() {
        return organization;
    }

    /**
     * Define o valor da propriedade organization.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationOnlyID }
     *     
     */
    public void setOrganization(OrganizationOnlyID value) {
        this.organization = value;
    }

    /**
     * Obtém o valor da propriedade primary.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimary() {
        return primary;
    }

    /**
     * Define o valor da propriedade primary.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimary(Boolean value) {
        this.primary = value;
    }

    /**
     * Obtém o valor da propriedade role.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Define o valor da propriedade role.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
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
     *         &lt;element name="contactMean" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactMedium" minOccurs="0"/&gt;
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
        "contactMean"
    })
    public static class ContactMeans {

        protected ContactMedium contactMean;

        /**
         * Obtém o valor da propriedade contactMean.
         * 
         * @return
         *     possible object is
         *     {@link ContactMedium }
         *     
         */
        public ContactMedium getContactMean() {
            return contactMean;
        }

        /**
         * Define o valor da propriedade contactMean.
         * 
         * @param value
         *     allowed object is
         *     {@link ContactMedium }
         *     
         */
        public void setContactMean(ContactMedium value) {
            this.contactMean = value;
        }

    }

}
