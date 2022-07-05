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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CreateContactAndIndividualResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CreateContactAndIndividualResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactID" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}ContactID"/&gt;
 *         &lt;element name="contactMediumIDs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="contactMediumID" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}ContactMediumID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="geographicAddressIDs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="geographicAddressID" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}GeographicAddressID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="individualID" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualOnlyID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateContactAndIndividualResponse", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "contactID",
    "contactMediumIDs",
    "geographicAddressIDs",
    "individualID"
})
public class CreateContactAndIndividualResponse {

    @XmlElement(required = true)
    protected ContactID contactID;
    protected CreateContactAndIndividualResponse.ContactMediumIDs contactMediumIDs;
    protected CreateContactAndIndividualResponse.GeographicAddressIDs geographicAddressIDs;
    protected IndividualOnlyID individualID;

    /**
     * Obtém o valor da propriedade contactID.
     * 
     * @return
     *     possible object is
     *     {@link ContactID }
     *     
     */
    public ContactID getContactID() {
        return contactID;
    }

    /**
     * Define o valor da propriedade contactID.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactID }
     *     
     */
    public void setContactID(ContactID value) {
        this.contactID = value;
    }

    /**
     * Obtém o valor da propriedade contactMediumIDs.
     * 
     * @return
     *     possible object is
     *     {@link CreateContactAndIndividualResponse.ContactMediumIDs }
     *     
     */
    public CreateContactAndIndividualResponse.ContactMediumIDs getContactMediumIDs() {
        return contactMediumIDs;
    }

    /**
     * Define o valor da propriedade contactMediumIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateContactAndIndividualResponse.ContactMediumIDs }
     *     
     */
    public void setContactMediumIDs(CreateContactAndIndividualResponse.ContactMediumIDs value) {
        this.contactMediumIDs = value;
    }

    /**
     * Obtém o valor da propriedade geographicAddressIDs.
     * 
     * @return
     *     possible object is
     *     {@link CreateContactAndIndividualResponse.GeographicAddressIDs }
     *     
     */
    public CreateContactAndIndividualResponse.GeographicAddressIDs getGeographicAddressIDs() {
        return geographicAddressIDs;
    }

    /**
     * Define o valor da propriedade geographicAddressIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateContactAndIndividualResponse.GeographicAddressIDs }
     *     
     */
    public void setGeographicAddressIDs(CreateContactAndIndividualResponse.GeographicAddressIDs value) {
        this.geographicAddressIDs = value;
    }

    /**
     * Obtém o valor da propriedade individualID.
     * 
     * @return
     *     possible object is
     *     {@link IndividualOnlyID }
     *     
     */
    public IndividualOnlyID getIndividualID() {
        return individualID;
    }

    /**
     * Define o valor da propriedade individualID.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualOnlyID }
     *     
     */
    public void setIndividualID(IndividualOnlyID value) {
        this.individualID = value;
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
     *         &lt;element name="contactMediumID" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}ContactMediumID" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "contactMediumID"
    })
    public static class ContactMediumIDs {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<ContactMediumID> contactMediumID;

        /**
         * Gets the value of the contactMediumID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contactMediumID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContactMediumID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactMediumID }
         * 
         * 
         */
        public List<ContactMediumID> getContactMediumID() {
            if (contactMediumID == null) {
                contactMediumID = new ArrayList<ContactMediumID>();
            }
            return this.contactMediumID;
        }

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
     *         &lt;element name="geographicAddressID" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}GeographicAddressID" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "geographicAddressID"
    })
    public static class GeographicAddressIDs {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<GeographicAddressID> geographicAddressID;

        /**
         * Gets the value of the geographicAddressID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the geographicAddressID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGeographicAddressID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GeographicAddressID }
         * 
         * 
         */
        public List<GeographicAddressID> getGeographicAddressID() {
            if (geographicAddressID == null) {
                geographicAddressID = new ArrayList<GeographicAddressID>();
            }
            return this.geographicAddressID;
        }

    }

}
