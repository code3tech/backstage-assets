//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The information used to create a PartyRole.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/commonbusinessentities/types-unqualified/v1}PartyRole,
 * Derived from PIM entity PartyRole in the domain party.
 * 
 * <p>Classe Java de CustomerForInvolvementPartyRole complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerForInvolvementPartyRole"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactRelationships" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="contactRelationship" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactPartyRoleRelationshipForUpdate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "CustomerForInvolvementPartyRole", propOrder = {
    "contactRelationships"
})
@XmlSeeAlso({
    CustomerForInvolvement.class
})
public abstract class CustomerForInvolvementPartyRole {

    protected CustomerForInvolvementPartyRole.ContactRelationships contactRelationships;

    /**
     * Obtém o valor da propriedade contactRelationships.
     * 
     * @return
     *     possible object is
     *     {@link CustomerForInvolvementPartyRole.ContactRelationships }
     *     
     */
    public CustomerForInvolvementPartyRole.ContactRelationships getContactRelationships() {
        return contactRelationships;
    }

    /**
     * Define o valor da propriedade contactRelationships.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerForInvolvementPartyRole.ContactRelationships }
     *     
     */
    public void setContactRelationships(CustomerForInvolvementPartyRole.ContactRelationships value) {
        this.contactRelationships = value;
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
     *         &lt;element name="contactRelationship" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactPartyRoleRelationshipForUpdate" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "contactRelationship"
    })
    public static class ContactRelationships {

        protected List<ContactPartyRoleRelationshipForUpdate> contactRelationship;

        /**
         * Gets the value of the contactRelationship property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contactRelationship property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContactRelationship().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactPartyRoleRelationshipForUpdate }
         * 
         * 
         */
        public List<ContactPartyRoleRelationshipForUpdate> getContactRelationship() {
            if (contactRelationship == null) {
                contactRelationship = new ArrayList<ContactPartyRoleRelationshipForUpdate>();
            }
            return this.contactRelationship;
        }

    }

}
