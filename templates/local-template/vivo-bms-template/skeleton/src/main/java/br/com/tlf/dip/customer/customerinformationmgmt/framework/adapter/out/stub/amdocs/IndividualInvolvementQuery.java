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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de IndividualInvolvementQuery complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IndividualInvolvementQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customer" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}CustomerAllID"/&gt;
 *         &lt;element name="frameworkAgreement" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}FrameworkAgreementID" minOccurs="0"/&gt;
 *         &lt;element name="individual" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualExternalID" minOccurs="0"/&gt;
 *         &lt;element name="individualName" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualNameShort" minOccurs="0"/&gt;
 *         &lt;element name="involvementTypes"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="involvementType" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}IndividualInvolvementEntityType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="subscriptionProduct" type="{http://amdocs/tef-vivo/customerproduct-common/types/v1}ProductServiceExternalID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualInvolvementQuery", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "customer",
    "frameworkAgreement",
    "individual",
    "individualName",
    "involvementTypes",
    "subscriptionProduct"
})
public class IndividualInvolvementQuery {

    @XmlElement(required = true)
    protected CustomerAllID customer;
    protected FrameworkAgreementID frameworkAgreement;
    protected IndividualExternalID individual;
    protected IndividualNameShort individualName;
    @XmlElement(required = true)
    protected IndividualInvolvementQuery.InvolvementTypes involvementTypes;
    protected ProductServiceExternalID subscriptionProduct;

    /**
     * Obtém o valor da propriedade customer.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAllID }
     *     
     */
    public CustomerAllID getCustomer() {
        return customer;
    }

    /**
     * Define o valor da propriedade customer.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAllID }
     *     
     */
    public void setCustomer(CustomerAllID value) {
        this.customer = value;
    }

    /**
     * Obtém o valor da propriedade frameworkAgreement.
     * 
     * @return
     *     possible object is
     *     {@link FrameworkAgreementID }
     *     
     */
    public FrameworkAgreementID getFrameworkAgreement() {
        return frameworkAgreement;
    }

    /**
     * Define o valor da propriedade frameworkAgreement.
     * 
     * @param value
     *     allowed object is
     *     {@link FrameworkAgreementID }
     *     
     */
    public void setFrameworkAgreement(FrameworkAgreementID value) {
        this.frameworkAgreement = value;
    }

    /**
     * Obtém o valor da propriedade individual.
     * 
     * @return
     *     possible object is
     *     {@link IndividualExternalID }
     *     
     */
    public IndividualExternalID getIndividual() {
        return individual;
    }

    /**
     * Define o valor da propriedade individual.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualExternalID }
     *     
     */
    public void setIndividual(IndividualExternalID value) {
        this.individual = value;
    }

    /**
     * Obtém o valor da propriedade individualName.
     * 
     * @return
     *     possible object is
     *     {@link IndividualNameShort }
     *     
     */
    public IndividualNameShort getIndividualName() {
        return individualName;
    }

    /**
     * Define o valor da propriedade individualName.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualNameShort }
     *     
     */
    public void setIndividualName(IndividualNameShort value) {
        this.individualName = value;
    }

    /**
     * Obtém o valor da propriedade involvementTypes.
     * 
     * @return
     *     possible object is
     *     {@link IndividualInvolvementQuery.InvolvementTypes }
     *     
     */
    public IndividualInvolvementQuery.InvolvementTypes getInvolvementTypes() {
        return involvementTypes;
    }

    /**
     * Define o valor da propriedade involvementTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualInvolvementQuery.InvolvementTypes }
     *     
     */
    public void setInvolvementTypes(IndividualInvolvementQuery.InvolvementTypes value) {
        this.involvementTypes = value;
    }

    /**
     * Obtém o valor da propriedade subscriptionProduct.
     * 
     * @return
     *     possible object is
     *     {@link ProductServiceExternalID }
     *     
     */
    public ProductServiceExternalID getSubscriptionProduct() {
        return subscriptionProduct;
    }

    /**
     * Define o valor da propriedade subscriptionProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductServiceExternalID }
     *     
     */
    public void setSubscriptionProduct(ProductServiceExternalID value) {
        this.subscriptionProduct = value;
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
     *         &lt;element name="involvementType" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}IndividualInvolvementEntityType" maxOccurs="unbounded"/&gt;
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
        "involvementType"
    })
    public static class InvolvementTypes {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", required = true)
        @XmlSchemaType(name = "string")
        protected List<IndividualInvolvementEntityType> involvementType;

        /**
         * Gets the value of the involvementType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the involvementType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInvolvementType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IndividualInvolvementEntityType }
         * 
         * 
         */
        public List<IndividualInvolvementEntityType> getInvolvementType() {
            if (involvementType == null) {
                involvementType = new ArrayList<IndividualInvolvementEntityType>();
            }
            return this.involvementType;
        }

    }

}
