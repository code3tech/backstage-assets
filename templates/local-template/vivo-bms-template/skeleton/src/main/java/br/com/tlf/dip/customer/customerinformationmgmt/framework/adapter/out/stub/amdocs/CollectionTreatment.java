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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A treatment that is assigned to a CustomerAccount when it enters Collections. Each CollectionTreatment contains a list
 * of CollectionTreatmentActivitys and an optional PaymentArrangement according to the progress of the CollectionTreatment.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerbilling/types-unqualified/v1}CollectionTreatment,
 * Derived from PIM entity CollectionTreatment in the domain customercollections.
 * 
 * <p>Classe Java de CollectionTreatment complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CollectionTreatment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assignedUser" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}ApplicationUserID" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}CollectionCategory" minOccurs="0"/&gt;
 *         &lt;element name="characteristics" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="characteristic" type="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}CollectionTreatmentCharacteristicValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "CollectionTreatment", namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1", propOrder = {
    "assignedUser",
    "category",
    "characteristics",
    "startDate"
})
public class CollectionTreatment {

    protected ApplicationUserID assignedUser;
    @XmlSchemaType(name = "string")
    protected CollectionCategory category;
    protected CollectionTreatment.Characteristics characteristics;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;

    /**
     * Obtém o valor da propriedade assignedUser.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationUserID }
     *     
     */
    public ApplicationUserID getAssignedUser() {
        return assignedUser;
    }

    /**
     * Define o valor da propriedade assignedUser.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationUserID }
     *     
     */
    public void setAssignedUser(ApplicationUserID value) {
        this.assignedUser = value;
    }

    /**
     * Obtém o valor da propriedade category.
     * 
     * @return
     *     possible object is
     *     {@link CollectionCategory }
     *     
     */
    public CollectionCategory getCategory() {
        return category;
    }

    /**
     * Define o valor da propriedade category.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionCategory }
     *     
     */
    public void setCategory(CollectionCategory value) {
        this.category = value;
    }

    /**
     * Obtém o valor da propriedade characteristics.
     * 
     * @return
     *     possible object is
     *     {@link CollectionTreatment.Characteristics }
     *     
     */
    public CollectionTreatment.Characteristics getCharacteristics() {
        return characteristics;
    }

    /**
     * Define o valor da propriedade characteristics.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionTreatment.Characteristics }
     *     
     */
    public void setCharacteristics(CollectionTreatment.Characteristics value) {
        this.characteristics = value;
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
     *         &lt;element name="characteristic" type="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}CollectionTreatmentCharacteristicValue" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "characteristic"
    })
    public static class Characteristics {

        @XmlElement(namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1")
        protected List<CollectionTreatmentCharacteristicValue> characteristic;

        /**
         * Gets the value of the characteristic property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the characteristic property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCharacteristic().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CollectionTreatmentCharacteristicValue }
         * 
         * 
         */
        public List<CollectionTreatmentCharacteristicValue> getCharacteristic() {
            if (characteristic == null) {
                characteristic = new ArrayList<CollectionTreatmentCharacteristicValue>();
            }
            return this.characteristic;
        }

    }

}
