//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A number, text, or date that can be assigned to an instance of a Characteristic.
 * 
 * The defining Characteristic has a  CharacteristicValueType that defines the valid form and range of the value.
 * 
 * The value attribute (and valueTo attribute if it is populated) is a string that contains a canonical representation
 * (locale and time-zone independent) of the value of the characteristic in a format according to the elementary type of
 * the value (CharacteristicValueBasicType) as follows:
 * 
 * 	BOOLEAN ? true (for Boolean True) or false (for Boolean False)
 * 	STRING ? as is (no translation)
 * 	DATE ? string representing the date and time in UTC, in the format (italics are replaced, non-italics are literal)
 * YYYY-MM-DD HH:MM:SS e.g. 2007-07-31 14:30:54
 * 	INTEGER ? string of numeric digits; if negative preceded by a minus sign, e.g. 1, -5561
 * 	DOUBLE ? string of numeric digits, decimal separator period, string of numeric digits; if negative preceded by a minus
 * sign, e.g. 0.55123, 14436536.44, -5523.2
 * 	COMPLEX - Used to define a group of CharacteristicValues
 * 
 * 
 * It is the data provider?s responsibility to ensure that values are correctly formatted and the data consumer?s
 * responsibility to ensure that values are correctly parsed.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/commonbusinessentities/types-unqualified/v1}CharacteristicValue,
 * Derived from PIM entity CharacteristicValue in the domain characteristicvalue.
 * 
 * <p>Classe Java de CharacteristicValue complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CharacteristicValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value" minOccurs="0"&gt;
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
@XmlType(name = "CharacteristicValue", namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1", propOrder = {
    "value"
})
@XmlSeeAlso({
    CollectionTreatmentCharacteristicValue.class
})
public abstract class CharacteristicValue {

    protected String value;

    /**
     * Obtém o valor da propriedade value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
