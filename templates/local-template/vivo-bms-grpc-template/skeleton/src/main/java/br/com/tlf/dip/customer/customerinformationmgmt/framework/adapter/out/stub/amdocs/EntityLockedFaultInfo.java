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
 * An operation could not be performed on an entity instance because the entity is locked by another operation.
 * The consumer can be expected to correct this by:
 * waiting for the lock to be released
 * determining which (user) agent is holding the entity locked and requesting that it be freed
 * The key values identifying the entity instance are returned in the exception parameters.
 * :
 * :
 * null.
 * 
 * <p>Classe Java de EntityLockedFaultInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EntityLockedFaultInfo"&gt;
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
 *                   &lt;element name="keyValue" type="{http://amdocs/tef-vivo/core/types/v1}FlexAttr" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "EntityLockedFaultInfo", namespace = "http://amdocs/tef-vivo/core/types/v1", propOrder = {
    "entityTypeName",
    "keyValues"
})
public class EntityLockedFaultInfo {

    protected String entityTypeName;
    protected EntityLockedFaultInfo.KeyValues keyValues;

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
     *     {@link EntityLockedFaultInfo.KeyValues }
     *     
     */
    public EntityLockedFaultInfo.KeyValues getKeyValues() {
        return keyValues;
    }

    /**
     * Define o valor da propriedade keyValues.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityLockedFaultInfo.KeyValues }
     *     
     */
    public void setKeyValues(EntityLockedFaultInfo.KeyValues value) {
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
     *         &lt;element name="keyValue" type="{http://amdocs/tef-vivo/core/types/v1}FlexAttr" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        protected List<FlexAttr> keyValue;

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
         * {@link FlexAttr }
         * 
         * 
         */
        public List<FlexAttr> getKeyValue() {
            if (keyValue == null) {
                keyValue = new ArrayList<FlexAttr>();
            }
            return this.keyValue;
        }

    }

}
