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
 * The value of a ProductSpecCharacteristic  associated to a Product. The value might come from a catalog,  from end-user
 * input, or by running business rules.
 * :
 * Derived from PIM entity ProductCharacteristicValue in the domain product.
 * 
 * <p>Classe Java de ProductCharacteristicValueForRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProductCharacteristicValueForRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/customerproduct-common/types/v1}CharacteristicValueForRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="characteristicDefinition" type="{http://amdocs/tef-vivo/customerproduct-common/types/v1}ProductSpecCharacteristicID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductCharacteristicValueForRequest", namespace = "http://amdocs/tef-vivo/customerproduct-common/types/v1", propOrder = {
    "characteristicDefinition"
})
public class ProductCharacteristicValueForRequest
    extends CharacteristicValueForRequest
{

    protected ProductSpecCharacteristicID characteristicDefinition;

    /**
     * Obtém o valor da propriedade characteristicDefinition.
     * 
     * @return
     *     possible object is
     *     {@link ProductSpecCharacteristicID }
     *     
     */
    public ProductSpecCharacteristicID getCharacteristicDefinition() {
        return characteristicDefinition;
    }

    /**
     * Define o valor da propriedade characteristicDefinition.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSpecCharacteristicID }
     *     
     */
    public void setCharacteristicDefinition(ProductSpecCharacteristicID value) {
        this.characteristicDefinition = value;
    }

}
