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
 * <p>Classe Java de UpdateIndividualResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateIndividualResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="individualID" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualOnlyID"/&gt;
 *         &lt;element name="individualIdentificationIDs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="individualIdentificationID" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualIdentificationID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="taxExemptionIDs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="taxExemptionID" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerAccountTaxExemptionID" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "UpdateIndividualResponse", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "individualID",
    "individualIdentificationIDs",
    "taxExemptionIDs"
})
public class UpdateIndividualResponse {

    @XmlElement(required = true)
    protected IndividualOnlyID individualID;
    protected UpdateIndividualResponse.IndividualIdentificationIDs individualIdentificationIDs;
    protected UpdateIndividualResponse.TaxExemptionIDs taxExemptionIDs;

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
     * Obtém o valor da propriedade individualIdentificationIDs.
     * 
     * @return
     *     possible object is
     *     {@link UpdateIndividualResponse.IndividualIdentificationIDs }
     *     
     */
    public UpdateIndividualResponse.IndividualIdentificationIDs getIndividualIdentificationIDs() {
        return individualIdentificationIDs;
    }

    /**
     * Define o valor da propriedade individualIdentificationIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateIndividualResponse.IndividualIdentificationIDs }
     *     
     */
    public void setIndividualIdentificationIDs(UpdateIndividualResponse.IndividualIdentificationIDs value) {
        this.individualIdentificationIDs = value;
    }

    /**
     * Obtém o valor da propriedade taxExemptionIDs.
     * 
     * @return
     *     possible object is
     *     {@link UpdateIndividualResponse.TaxExemptionIDs }
     *     
     */
    public UpdateIndividualResponse.TaxExemptionIDs getTaxExemptionIDs() {
        return taxExemptionIDs;
    }

    /**
     * Define o valor da propriedade taxExemptionIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateIndividualResponse.TaxExemptionIDs }
     *     
     */
    public void setTaxExemptionIDs(UpdateIndividualResponse.TaxExemptionIDs value) {
        this.taxExemptionIDs = value;
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
     *         &lt;element name="individualIdentificationID" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualIdentificationID" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "individualIdentificationID"
    })
    public static class IndividualIdentificationIDs {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<IndividualIdentificationID> individualIdentificationID;

        /**
         * Gets the value of the individualIdentificationID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the individualIdentificationID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIndividualIdentificationID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IndividualIdentificationID }
         * 
         * 
         */
        public List<IndividualIdentificationID> getIndividualIdentificationID() {
            if (individualIdentificationID == null) {
                individualIdentificationID = new ArrayList<IndividualIdentificationID>();
            }
            return this.individualIdentificationID;
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
     *         &lt;element name="taxExemptionID" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerAccountTaxExemptionID" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "taxExemptionID"
    })
    public static class TaxExemptionIDs {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<CustomerAccountTaxExemptionID> taxExemptionID;

        /**
         * Gets the value of the taxExemptionID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxExemptionID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxExemptionID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomerAccountTaxExemptionID }
         * 
         * 
         */
        public List<CustomerAccountTaxExemptionID> getTaxExemptionID() {
            if (taxExemptionID == null) {
                taxExemptionID = new ArrayList<CustomerAccountTaxExemptionID>();
            }
            return this.taxExemptionID;
        }

    }

}
