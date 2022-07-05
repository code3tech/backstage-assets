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
 * The specification of a tangible (equipment) or intangible (network, billing, agreement, etc.) object made available
 * externally through a ProductOffering to a Customer. A ProductSpecification is instantiated as a Product.
 * 
 * A ProductSpecification may contain other ProductSpecifications defined by ProductSpecContainment. In Amdocs Ordering, a
 * ProductSpecification that is not contained by another ProductSpecification is a Product or Main Component, while a
 * ProductSpecification that is contained is a Subproduct or Component.
 * 
 * ProductSpecifications can be classified by various groupings, such as BrowsingCategorys and ProductSpecificationTypes.
 * 
 * ProductSpecifications are versioned by a ProductCatalogVersion, and different versions can be referred to at the same
 * time. However, only the most recent version will typically used to instantiate a Product.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/productcatalog/types-unqualified/v1}ProductSpecification,
 * Derived from PIM entity ProductSpecification in the domain productspecification.
 * 
 * <p>Classe Java de ProductSpecificationID complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProductSpecificationID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
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
@XmlType(name = "ProductSpecificationID", namespace = "http://amdocs/tef-vivo/productcatalog-common/types/v1", propOrder = {
    "id"
})
public class ProductSpecificationID {

    protected String id;

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
