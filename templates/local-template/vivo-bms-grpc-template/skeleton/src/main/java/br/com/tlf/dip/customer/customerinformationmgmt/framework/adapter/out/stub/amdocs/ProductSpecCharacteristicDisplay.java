//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a
 * discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be
 * derived from a formula (for example, usage time (hrs) = 30 - talk time *3).  Certain characteristics, such as color,
 * may be configured during the ordering or some other process.
 * :
 * Derived from PIM entity ProductSpecCharacteristic in the domain productspecification.
 * 
 * <p>Classe Java de ProductSpecCharacteristicDisplay complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProductSpecCharacteristicDisplay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/productcatalog-common/types/v1}ConfigurableCharacteristicDisplay"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1023"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="displayInformation" type="{http://amdocs/tef-vivo/productcatalog-common/types/v1}CharacteristicDisplayForProductSpec" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSpecCharacteristicDisplay", namespace = "http://amdocs/tef-vivo/productcatalog-common/types/v1", propOrder = {
    "description",
    "displayInformation"
})
public class ProductSpecCharacteristicDisplay
    extends ConfigurableCharacteristicDisplay
{

    protected String description;
    protected CharacteristicDisplayForProductSpec displayInformation;

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade displayInformation.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicDisplayForProductSpec }
     *     
     */
    public CharacteristicDisplayForProductSpec getDisplayInformation() {
        return displayInformation;
    }

    /**
     * Define o valor da propriedade displayInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicDisplayForProductSpec }
     *     
     */
    public void setDisplayInformation(CharacteristicDisplayForProductSpec value) {
        this.displayInformation = value;
    }

}
