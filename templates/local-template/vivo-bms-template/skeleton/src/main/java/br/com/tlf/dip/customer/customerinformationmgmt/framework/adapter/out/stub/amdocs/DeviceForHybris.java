//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Device Details
 * 
 * <p>Classe Java de DeviceForHybris complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DeviceForHybris"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="renova" type="{http://amdocs/tef-vivo/resource-common/types/v1}Renova" minOccurs="0"/&gt;
 *         &lt;element name="sku" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="subsidized" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="valoriza" type="{http://amdocs/tef-vivo/resource-common/types/v1}Valoriza" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceForHybris", namespace = "http://amdocs/tef-vivo/resource-common/types/v1", propOrder = {
    "price",
    "renova",
    "sku",
    "subsidized",
    "valoriza"
})
public class DeviceForHybris {

    protected BigDecimal price;
    protected Renova renova;
    protected String sku;
    protected Boolean subsidized;
    protected Valoriza valoriza;

    /**
     * Obtém o valor da propriedade price.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Define o valor da propriedade price.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Obtém o valor da propriedade renova.
     * 
     * @return
     *     possible object is
     *     {@link Renova }
     *     
     */
    public Renova getRenova() {
        return renova;
    }

    /**
     * Define o valor da propriedade renova.
     * 
     * @param value
     *     allowed object is
     *     {@link Renova }
     *     
     */
    public void setRenova(Renova value) {
        this.renova = value;
    }

    /**
     * Obtém o valor da propriedade sku.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Define o valor da propriedade sku.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

    /**
     * Obtém o valor da propriedade subsidized.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubsidized() {
        return subsidized;
    }

    /**
     * Define o valor da propriedade subsidized.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubsidized(Boolean value) {
        this.subsidized = value;
    }

    /**
     * Obtém o valor da propriedade valoriza.
     * 
     * @return
     *     possible object is
     *     {@link Valoriza }
     *     
     */
    public Valoriza getValoriza() {
        return valoriza;
    }

    /**
     * Define o valor da propriedade valoriza.
     * 
     * @param value
     *     allowed object is
     *     {@link Valoriza }
     *     
     */
    public void setValoriza(Valoriza value) {
        this.valoriza = value;
    }

}
