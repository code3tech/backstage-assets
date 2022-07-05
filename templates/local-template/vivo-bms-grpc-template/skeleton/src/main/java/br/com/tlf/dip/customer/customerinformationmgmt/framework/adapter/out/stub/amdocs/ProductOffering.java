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
 * The presentation of one or more ProductSpecifications to the marketplace for sale, rental, or lease for a
 * ProdOfferPriceCharge.  A ProductOffering may target one or more market segments, be included in one or more Product
 * Catalogs, presented in support of one or more Product Strategies, and made available in one or more SalesChannels.
 * ProductOffering may represent a simple offering of a single ProductSpecification or a bundle of ProductSpecifications.
 * :
 * Derived from PIM entity ProductOffering in the domain productoffering.
 * 
 * <p>Classe Java de ProductOffering complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProductOffering"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isToCeaseBundle" minOccurs="0"&gt;
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
@XmlType(name = "ProductOffering", namespace = "http://amdocs/tef-vivo/productcatalog-common/types/v1", propOrder = {
    "isToCeaseBundle"
})
public class ProductOffering {

    protected Boolean isToCeaseBundle;

    /**
     * Obtém o valor da propriedade isToCeaseBundle.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsToCeaseBundle() {
        return isToCeaseBundle;
    }

    /**
     * Define o valor da propriedade isToCeaseBundle.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsToCeaseBundle(Boolean value) {
        this.isToCeaseBundle = value;
    }

}
