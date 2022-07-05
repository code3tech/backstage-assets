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
 * The operation updates contact details.
 * If a Contact does not exist for the details provided in the request then nothing happens.
 * 
 * <p>Classe Java de UpdateContactDetails complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateContactDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appCtx" type="{http://amdocs/tef-vivo/core/types/v1}ApplicationContext"/&gt;
 *         &lt;element name="externalID" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualAllID" minOccurs="0"/&gt;
 *         &lt;element name="identification" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}IndividualQueryByIdentification" minOccurs="0"/&gt;
 *         &lt;element name="individual" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}Individual" minOccurs="0"/&gt;
 *         &lt;element name="contactMeans" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="contactMean" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactMedium" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="address" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}GeographicAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateContactDetails", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "appCtx",
    "externalID",
    "identification",
    "individual",
    "contactMeans",
    "address"
})
public class UpdateContactDetails {

    @XmlElement(required = true)
    protected ApplicationContext appCtx;
    protected IndividualAllID externalID;
    protected IndividualQueryByIdentification identification;
    protected Individual individual;
    protected UpdateContactDetails.ContactMeans contactMeans;
    protected GeographicAddress address;

    /**
     * Obtém o valor da propriedade appCtx.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationContext }
     *     
     */
    public ApplicationContext getAppCtx() {
        return appCtx;
    }

    /**
     * Define o valor da propriedade appCtx.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationContext }
     *     
     */
    public void setAppCtx(ApplicationContext value) {
        this.appCtx = value;
    }

    /**
     * Obtém o valor da propriedade externalID.
     * 
     * @return
     *     possible object is
     *     {@link IndividualAllID }
     *     
     */
    public IndividualAllID getExternalID() {
        return externalID;
    }

    /**
     * Define o valor da propriedade externalID.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualAllID }
     *     
     */
    public void setExternalID(IndividualAllID value) {
        this.externalID = value;
    }

    /**
     * Obtém o valor da propriedade identification.
     * 
     * @return
     *     possible object is
     *     {@link IndividualQueryByIdentification }
     *     
     */
    public IndividualQueryByIdentification getIdentification() {
        return identification;
    }

    /**
     * Define o valor da propriedade identification.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualQueryByIdentification }
     *     
     */
    public void setIdentification(IndividualQueryByIdentification value) {
        this.identification = value;
    }

    /**
     * Obtém o valor da propriedade individual.
     * 
     * @return
     *     possible object is
     *     {@link Individual }
     *     
     */
    public Individual getIndividual() {
        return individual;
    }

    /**
     * Define o valor da propriedade individual.
     * 
     * @param value
     *     allowed object is
     *     {@link Individual }
     *     
     */
    public void setIndividual(Individual value) {
        this.individual = value;
    }

    /**
     * Obtém o valor da propriedade contactMeans.
     * 
     * @return
     *     possible object is
     *     {@link UpdateContactDetails.ContactMeans }
     *     
     */
    public UpdateContactDetails.ContactMeans getContactMeans() {
        return contactMeans;
    }

    /**
     * Define o valor da propriedade contactMeans.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateContactDetails.ContactMeans }
     *     
     */
    public void setContactMeans(UpdateContactDetails.ContactMeans value) {
        this.contactMeans = value;
    }

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link GeographicAddress }
     *     
     */
    public GeographicAddress getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicAddress }
     *     
     */
    public void setAddress(GeographicAddress value) {
        this.address = value;
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
     *         &lt;element name="contactMean" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactMedium" maxOccurs="unbounded" minOccurs="0"/&gt;
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

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<ContactMedium> contactMean;

        /**
         * Gets the value of the contactMean property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contactMean property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContactMean().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactMedium }
         * 
         * 
         */
        public List<ContactMedium> getContactMean() {
            if (contactMean == null) {
                contactMean = new ArrayList<ContactMedium>();
            }
            return this.contactMean;
        }

    }

}
