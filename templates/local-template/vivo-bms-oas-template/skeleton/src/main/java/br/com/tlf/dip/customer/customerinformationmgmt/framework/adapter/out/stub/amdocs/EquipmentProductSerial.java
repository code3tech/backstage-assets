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
 * A ProductSpecification procured by a Customer. A Product models this instance of a ProductSpecification.
 * 
 * Note:  In Amdocs Ordering this serves as both an Assigned Product and an Ordered Product. An Ordered Product has no
 * activation date and has a status indicating that it is ordered.
 * 
 * A Product may be part of a complex structure of Products. The structure is typically based on relationships between
 * ProductSpecifications defined in ProductSpecContainment and ProductSpecRelationship. The structure is instantiated
 * through ProductContainment and ProductRelationship.
 * 
 * A Product is uniquely identified by its Product.ID and Product.version. When information regarding an existing Product
 * is changed a new instance is created with the same Product.ID and different Product.version. If a Product has
 * associated contained Products defined in ProductContainment then when it changes by definition all of the contained
 * Products must have new instances created for them. The history of a product is described by multiple Products with the
 * same Product.ID value.
 * 
 * The permitted status transitions of a Product are defined by the provider of any status update operations.
 * :
 * Derived from PIM entity Product in the domain product.
 * 
 * <p>Classe Java de EquipmentProductSerial complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentProductSerial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productSpec" type="{http://amdocs/tef-vivo/customerproduct-common/types/v1}EquipmentProductSpecification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentProductSerial", namespace = "http://amdocs/tef-vivo/customerproduct-common/types/v1", propOrder = {
    "productSpec"
})
@XmlSeeAlso({
    EquipmentSerial.class
})
public abstract class EquipmentProductSerial {

    protected EquipmentProductSpecification productSpec;

    /**
     * Obtém o valor da propriedade productSpec.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentProductSpecification }
     *     
     */
    public EquipmentProductSpecification getProductSpec() {
        return productSpec;
    }

    /**
     * Define o valor da propriedade productSpec.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentProductSpecification }
     *     
     */
    public void setProductSpec(EquipmentProductSpecification value) {
        this.productSpec = value;
    }

}
