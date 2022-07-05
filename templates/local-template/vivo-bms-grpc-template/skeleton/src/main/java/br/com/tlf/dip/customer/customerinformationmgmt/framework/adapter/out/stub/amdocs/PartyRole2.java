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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The information used to create a PartyRole.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/commonbusinessentities/types-unqualified/v1}PartyRole,
 * Derived from PIM entity PartyRole in the domain party.
 * 
 * <p>Classe Java de PartyRole complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PartyRole"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactRelationships" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="contactRelationship" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactPartyRoleRelationship" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="party" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}PartyID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRole", propOrder = {
    "contactRelationships",
    "id",
    "party"
})
@XmlSeeAlso({
    Customer2 .class
})
public abstract class PartyRole2 {

    protected PartyRole2 .ContactRelationships contactRelationships;
    protected String id;
    @XmlElement(required = true)
    protected PartyID party;

    /**
     * Obtém o valor da propriedade contactRelationships.
     * 
     * @return
     *     possible object is
     *     {@link PartyRole2 .ContactRelationships }
     *     
     */
    public PartyRole2 .ContactRelationships getContactRelationships() {
        return contactRelationships;
    }

    /**
     * Define o valor da propriedade contactRelationships.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRole2 .ContactRelationships }
     *     
     */
    public void setContactRelationships(PartyRole2 .ContactRelationships value) {
        this.contactRelationships = value;
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
     * Obtém o valor da propriedade party.
     * 
     * @return
     *     possible object is
     *     {@link PartyID }
     *     
     */
    public PartyID getParty() {
        return party;
    }

    /**
     * Define o valor da propriedade party.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyID }
     *     
     */
    public void setParty(PartyID value) {
        this.party = value;
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
     *         &lt;element name="contactRelationship" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactPartyRoleRelationship" maxOccurs="unbounded" minOccurs="0"/&gt;
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

        protected List<ContactPartyRoleRelationship> contactRelationship;

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
         * {@link ContactPartyRoleRelationship }
         * 
         * 
         */
        public List<ContactPartyRoleRelationship> getContactRelationship() {
            if (contactRelationship == null) {
                contactRelationship = new ArrayList<ContactPartyRoleRelationship>();
            }
            return this.contactRelationship;
        }

    }

}
