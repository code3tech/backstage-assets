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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The role that  a PartyRole plays for a CustomerBillSpec.  This data type is an Association Role entity. It defines the
 * attributes for an Association.
 * :
 * Derived from PIM entity PartyRoleCustomerAccountInvolvement in the domain customer.:
 * Restriction of {http://amdocs/pbg-portfolio/customerprofile/types-unqualified/v1}PartyRoleCustomerAccountInvolvement,
 * Derived from PIM entity PartyRoleCustomerAccountInvolvement in the domain customer.
 * 
 * <p>Classe Java de PartyRoleCustomerAccountInvolvementForCreate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PartyRoleCustomerAccountInvolvementForCreate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="role" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}SecondaryPartyRoleCustomerAccountInvolvementType"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRoleCustomerAccountInvolvementForCreate", propOrder = {
    "endDate",
    "role",
    "startDate"
})
public class PartyRoleCustomerAccountInvolvementForCreate {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SecondaryPartyRoleCustomerAccountInvolvementType role;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;

    /**
     * Obtém o valor da propriedade endDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Define o valor da propriedade endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Obtém o valor da propriedade role.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryPartyRoleCustomerAccountInvolvementType }
     *     
     */
    public SecondaryPartyRoleCustomerAccountInvolvementType getRole() {
        return role;
    }

    /**
     * Define o valor da propriedade role.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryPartyRoleCustomerAccountInvolvementType }
     *     
     */
    public void setRole(SecondaryPartyRoleCustomerAccountInvolvementType value) {
        this.role = value;
    }

    /**
     * Obtém o valor da propriedade startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Define o valor da propriedade startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

}
