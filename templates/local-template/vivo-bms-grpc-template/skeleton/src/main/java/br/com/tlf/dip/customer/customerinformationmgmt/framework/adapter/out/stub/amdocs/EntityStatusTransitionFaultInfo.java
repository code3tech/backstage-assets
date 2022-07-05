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
 * The status of an entity instance from a modify operation is not a valid status transition from the current status. The
 * attributes of the exception specify the identification of the entity instance, the current status and status requested.
 * :
 * :
 * null.
 * 
 * <p>Classe Java de EntityStatusTransitionFaultInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EntityStatusTransitionFaultInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currentStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1023"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="entityTypeName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="keyValues" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="keyValue" type="{http://amdocs/tef-vivo/core/types/v1}FlexAttrText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="proposedStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1023"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
@XmlType(name = "EntityStatusTransitionFaultInfo", namespace = "http://amdocs/tef-vivo/core/types/v1", propOrder = {
    "currentStatus",
    "entityTypeName",
    "keyValues",
    "proposedStatus"
})
public class EntityStatusTransitionFaultInfo {

    protected String currentStatus;
    protected String entityTypeName;
    protected EntityStatusTransitionFaultInfo.KeyValues keyValues;
    protected String proposedStatus;

    /**
     * Obtém o valor da propriedade currentStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Define o valor da propriedade currentStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStatus(String value) {
        this.currentStatus = value;
    }

    /**
     * Obtém o valor da propriedade entityTypeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityTypeName() {
        return entityTypeName;
    }

    /**
     * Define o valor da propriedade entityTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityTypeName(String value) {
        this.entityTypeName = value;
    }

    /**
     * Obtém o valor da propriedade keyValues.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatusTransitionFaultInfo.KeyValues }
     *     
     */
    public EntityStatusTransitionFaultInfo.KeyValues getKeyValues() {
        return keyValues;
    }

    /**
     * Define o valor da propriedade keyValues.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatusTransitionFaultInfo.KeyValues }
     *     
     */
    public void setKeyValues(EntityStatusTransitionFaultInfo.KeyValues value) {
        this.keyValues = value;
    }

    /**
     * Obtém o valor da propriedade proposedStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposedStatus() {
        return proposedStatus;
    }

    /**
     * Define o valor da propriedade proposedStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposedStatus(String value) {
        this.proposedStatus = value;
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
     *         &lt;element name="keyValue" type="{http://amdocs/tef-vivo/core/types/v1}FlexAttrText" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "keyValue"
    })
    public static class KeyValues {

        @XmlElement(namespace = "http://amdocs/tef-vivo/core/types/v1")
        protected List<FlexAttrText> keyValue;

        /**
         * Gets the value of the keyValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the keyValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKeyValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlexAttrText }
         * 
         * 
         */
        public List<FlexAttrText> getKeyValue() {
            if (keyValue == null) {
                keyValue = new ArrayList<FlexAttrText>();
            }
            return this.keyValue;
        }

    }

}
