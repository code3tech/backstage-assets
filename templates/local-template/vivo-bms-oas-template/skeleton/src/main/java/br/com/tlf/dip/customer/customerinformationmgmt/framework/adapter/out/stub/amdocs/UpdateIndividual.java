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
 * <p>Classe Java de UpdateIndividual complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateIndividual"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appCtx" type="{http://amdocs/tef-vivo/core/types/v1}ApplicationContext" minOccurs="0"/&gt;
 *         &lt;element name="individualID" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualAllID"/&gt;
 *         &lt;element name="individualDetails" type="{http://amdocs/tef-vivo/customerprofile/types/v1}IndividualForUpdate" minOccurs="0"/&gt;
 *         &lt;element name="identificationsToUpdate" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="identifications" type="{http://amdocs/tef-vivo/customerprofile/types/v1}IndividualIdentification" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="identificationsToCreate" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="identifications" type="{http://amdocs/tef-vivo/customerprofile/types/v1}IndividualIdentificationForCreate" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="taxExemptionsToUpdate" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="taxExemptions" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerAccountTaxExemptionForUpdate" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="taxExemptionsToCreate" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="taxExemptions" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerAccountTaxExemptionForCreate" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "UpdateIndividual", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "appCtx",
    "individualID",
    "individualDetails",
    "identificationsToUpdate",
    "identificationsToCreate",
    "taxExemptionsToUpdate",
    "taxExemptionsToCreate"
})
public class UpdateIndividual {

    protected ApplicationContext appCtx;
    @XmlElement(required = true)
    protected IndividualAllID individualID;
    protected IndividualForUpdate individualDetails;
    protected UpdateIndividual.IdentificationsToUpdate identificationsToUpdate;
    protected UpdateIndividual.IdentificationsToCreate identificationsToCreate;
    protected UpdateIndividual.TaxExemptionsToUpdate taxExemptionsToUpdate;
    protected UpdateIndividual.TaxExemptionsToCreate taxExemptionsToCreate;

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
     * Obtém o valor da propriedade individualID.
     * 
     * @return
     *     possible object is
     *     {@link IndividualAllID }
     *     
     */
    public IndividualAllID getIndividualID() {
        return individualID;
    }

    /**
     * Define o valor da propriedade individualID.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualAllID }
     *     
     */
    public void setIndividualID(IndividualAllID value) {
        this.individualID = value;
    }

    /**
     * Obtém o valor da propriedade individualDetails.
     * 
     * @return
     *     possible object is
     *     {@link IndividualForUpdate }
     *     
     */
    public IndividualForUpdate getIndividualDetails() {
        return individualDetails;
    }

    /**
     * Define o valor da propriedade individualDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualForUpdate }
     *     
     */
    public void setIndividualDetails(IndividualForUpdate value) {
        this.individualDetails = value;
    }

    /**
     * Obtém o valor da propriedade identificationsToUpdate.
     * 
     * @return
     *     possible object is
     *     {@link UpdateIndividual.IdentificationsToUpdate }
     *     
     */
    public UpdateIndividual.IdentificationsToUpdate getIdentificationsToUpdate() {
        return identificationsToUpdate;
    }

    /**
     * Define o valor da propriedade identificationsToUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateIndividual.IdentificationsToUpdate }
     *     
     */
    public void setIdentificationsToUpdate(UpdateIndividual.IdentificationsToUpdate value) {
        this.identificationsToUpdate = value;
    }

    /**
     * Obtém o valor da propriedade identificationsToCreate.
     * 
     * @return
     *     possible object is
     *     {@link UpdateIndividual.IdentificationsToCreate }
     *     
     */
    public UpdateIndividual.IdentificationsToCreate getIdentificationsToCreate() {
        return identificationsToCreate;
    }

    /**
     * Define o valor da propriedade identificationsToCreate.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateIndividual.IdentificationsToCreate }
     *     
     */
    public void setIdentificationsToCreate(UpdateIndividual.IdentificationsToCreate value) {
        this.identificationsToCreate = value;
    }

    /**
     * Obtém o valor da propriedade taxExemptionsToUpdate.
     * 
     * @return
     *     possible object is
     *     {@link UpdateIndividual.TaxExemptionsToUpdate }
     *     
     */
    public UpdateIndividual.TaxExemptionsToUpdate getTaxExemptionsToUpdate() {
        return taxExemptionsToUpdate;
    }

    /**
     * Define o valor da propriedade taxExemptionsToUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateIndividual.TaxExemptionsToUpdate }
     *     
     */
    public void setTaxExemptionsToUpdate(UpdateIndividual.TaxExemptionsToUpdate value) {
        this.taxExemptionsToUpdate = value;
    }

    /**
     * Obtém o valor da propriedade taxExemptionsToCreate.
     * 
     * @return
     *     possible object is
     *     {@link UpdateIndividual.TaxExemptionsToCreate }
     *     
     */
    public UpdateIndividual.TaxExemptionsToCreate getTaxExemptionsToCreate() {
        return taxExemptionsToCreate;
    }

    /**
     * Define o valor da propriedade taxExemptionsToCreate.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateIndividual.TaxExemptionsToCreate }
     *     
     */
    public void setTaxExemptionsToCreate(UpdateIndividual.TaxExemptionsToCreate value) {
        this.taxExemptionsToCreate = value;
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
     *         &lt;element name="identifications" type="{http://amdocs/tef-vivo/customerprofile/types/v1}IndividualIdentificationForCreate" maxOccurs="unbounded"/&gt;
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
        "identifications"
    })
    public static class IdentificationsToCreate {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", required = true)
        protected List<IndividualIdentificationForCreate> identifications;

        /**
         * Gets the value of the identifications property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the identifications property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIdentifications().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IndividualIdentificationForCreate }
         * 
         * 
         */
        public List<IndividualIdentificationForCreate> getIdentifications() {
            if (identifications == null) {
                identifications = new ArrayList<IndividualIdentificationForCreate>();
            }
            return this.identifications;
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
     *         &lt;element name="identifications" type="{http://amdocs/tef-vivo/customerprofile/types/v1}IndividualIdentification" maxOccurs="unbounded"/&gt;
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
        "identifications"
    })
    public static class IdentificationsToUpdate {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", required = true)
        protected List<IndividualIdentification2> identifications;

        /**
         * Gets the value of the identifications property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the identifications property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIdentifications().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IndividualIdentification2 }
         * 
         * 
         */
        public List<IndividualIdentification2> getIdentifications() {
            if (identifications == null) {
                identifications = new ArrayList<IndividualIdentification2>();
            }
            return this.identifications;
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
     *         &lt;element name="taxExemptions" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerAccountTaxExemptionForCreate" maxOccurs="unbounded"/&gt;
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
        "taxExemptions"
    })
    public static class TaxExemptionsToCreate {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", required = true)
        protected List<CustomerAccountTaxExemptionForCreate> taxExemptions;

        /**
         * Gets the value of the taxExemptions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxExemptions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxExemptions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomerAccountTaxExemptionForCreate }
         * 
         * 
         */
        public List<CustomerAccountTaxExemptionForCreate> getTaxExemptions() {
            if (taxExemptions == null) {
                taxExemptions = new ArrayList<CustomerAccountTaxExemptionForCreate>();
            }
            return this.taxExemptions;
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
     *         &lt;element name="taxExemptions" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerAccountTaxExemptionForUpdate" maxOccurs="unbounded"/&gt;
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
        "taxExemptions"
    })
    public static class TaxExemptionsToUpdate {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", required = true)
        protected List<CustomerAccountTaxExemptionForUpdate> taxExemptions;

        /**
         * Gets the value of the taxExemptions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxExemptions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxExemptions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomerAccountTaxExemptionForUpdate }
         * 
         * 
         */
        public List<CustomerAccountTaxExemptionForUpdate> getTaxExemptions() {
            if (taxExemptions == null) {
                taxExemptions = new ArrayList<CustomerAccountTaxExemptionForUpdate>();
            }
            return this.taxExemptions;
        }

    }

}
