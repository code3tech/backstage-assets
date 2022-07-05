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
 * How an instantiated  Characteristic might be displayed in a user interface. For example visibility of the
 * characteristic.
 * :
 * Derived from PIM entity CharacteristicDisplay in the domain characteristicvalue.
 * 
 * <p>Classe Java de CharacteristicDisplayForProductSpec complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CharacteristicDisplayForProductSpec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dynamicProperties" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="dynamicPropertie" type="{http://amdocs/tef-vivo/core/types/v1}FlexAttr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="visible" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
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
@XmlType(name = "CharacteristicDisplayForProductSpec", namespace = "http://amdocs/tef-vivo/productcatalog-common/types/v1", propOrder = {
    "dynamicProperties",
    "visible"
})
public class CharacteristicDisplayForProductSpec {

    protected CharacteristicDisplayForProductSpec.DynamicProperties dynamicProperties;
    protected Boolean visible;

    /**
     * Obtém o valor da propriedade dynamicProperties.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicDisplayForProductSpec.DynamicProperties }
     *     
     */
    public CharacteristicDisplayForProductSpec.DynamicProperties getDynamicProperties() {
        return dynamicProperties;
    }

    /**
     * Define o valor da propriedade dynamicProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicDisplayForProductSpec.DynamicProperties }
     *     
     */
    public void setDynamicProperties(CharacteristicDisplayForProductSpec.DynamicProperties value) {
        this.dynamicProperties = value;
    }

    /**
     * Obtém o valor da propriedade visible.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Define o valor da propriedade visible.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisible(Boolean value) {
        this.visible = value;
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
     *         &lt;element name="dynamicPropertie" type="{http://amdocs/tef-vivo/core/types/v1}FlexAttr" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "dynamicPropertie"
    })
    public static class DynamicProperties {

        @XmlElement(namespace = "http://amdocs/tef-vivo/productcatalog-common/types/v1")
        protected List<FlexAttr> dynamicPropertie;

        /**
         * Gets the value of the dynamicPropertie property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dynamicPropertie property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDynamicPropertie().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlexAttr }
         * 
         * 
         */
        public List<FlexAttr> getDynamicPropertie() {
            if (dynamicPropertie == null) {
                dynamicPropertie = new ArrayList<FlexAttr>();
            }
            return this.dynamicPropertie;
        }

    }

}
