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
 * An entity instance cannot be identified from the information provided. It is not expected in general that the consumer
 * can correct this problem. However, the message might indicate to the consumer if the problem is completely unexpected,
 * or perhaps might have been expected (for example if the entity is of a type that can be archived and removed from the
 * backend persistent store e.g. by cleanup process). The key values used to find the entity are returned in the exception
 * attributes.
 * :
 * :
 * null.
 * 
 * <p>Classe Java de EntityCannotBeUpdatedFaultInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EntityCannotBeUpdatedFaultInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityCannotBeUpdatedFaultInfo", namespace = "http://amdocs/tef-vivo/core/types/v1", propOrder = {
    "entityTypeName",
    "keyValues"
})
public class EntityCannotBeUpdatedFaultInfo {

    protected String entityTypeName;
    protected EntityCannotBeUpdatedFaultInfo.KeyValues keyValues;

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
     *     {@link EntityCannotBeUpdatedFaultInfo.KeyValues }
     *     
     */
    public EntityCannotBeUpdatedFaultInfo.KeyValues getKeyValues() {
        return keyValues;
    }

    /**
     * Define o valor da propriedade keyValues.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityCannotBeUpdatedFaultInfo.KeyValues }
     *     
     */
    public void setKeyValues(EntityCannotBeUpdatedFaultInfo.KeyValues value) {
        this.keyValues = value;
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
