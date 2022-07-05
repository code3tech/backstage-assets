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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The billing specific attributes and associations for the Customer. These attributes and associations have no meaning
 * for a Customer which is not instantiated in the billing system.
 * :
 * Derived from PIM entity CustomerBillingProfile in the domain customer.
 * 
 * <p>Classe Java de CustomerBillingProfileForRetrieve complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerBillingProfileForRetrieve"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billCycleSpecification" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}CustomerBillingCycleSpecificationForRetrieve" minOccurs="0"/&gt;
 *         &lt;element name="customer" type="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}CustomerBusinessUnit" minOccurs="0"/&gt;
 *         &lt;element name="holdByOperId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="holdIndicator" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="offerCurrency" type="{http://amdocs/tef-vivo/core/types/v1}CurrencyCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBillingProfileForRetrieve", namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1", propOrder = {
    "billCycleSpecification",
    "customer",
    "holdByOperId",
    "holdIndicator",
    "id",
    "offerCurrency"
})
public class CustomerBillingProfileForRetrieve {

    protected CustomerBillingCycleSpecificationForRetrieve billCycleSpecification;
    protected CustomerBusinessUnit customer;
    protected BigDecimal holdByOperId;
    protected Boolean holdIndicator;
    protected String id;
    @XmlSchemaType(name = "string")
    protected CurrencyCode offerCurrency;

    /**
     * Obtém o valor da propriedade billCycleSpecification.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBillingCycleSpecificationForRetrieve }
     *     
     */
    public CustomerBillingCycleSpecificationForRetrieve getBillCycleSpecification() {
        return billCycleSpecification;
    }

    /**
     * Define o valor da propriedade billCycleSpecification.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBillingCycleSpecificationForRetrieve }
     *     
     */
    public void setBillCycleSpecification(CustomerBillingCycleSpecificationForRetrieve value) {
        this.billCycleSpecification = value;
    }

    /**
     * Obtém o valor da propriedade customer.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBusinessUnit }
     *     
     */
    public CustomerBusinessUnit getCustomer() {
        return customer;
    }

    /**
     * Define o valor da propriedade customer.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBusinessUnit }
     *     
     */
    public void setCustomer(CustomerBusinessUnit value) {
        this.customer = value;
    }

    /**
     * Obtém o valor da propriedade holdByOperId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHoldByOperId() {
        return holdByOperId;
    }

    /**
     * Define o valor da propriedade holdByOperId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHoldByOperId(BigDecimal value) {
        this.holdByOperId = value;
    }

    /**
     * Obtém o valor da propriedade holdIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHoldIndicator() {
        return holdIndicator;
    }

    /**
     * Define o valor da propriedade holdIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHoldIndicator(Boolean value) {
        this.holdIndicator = value;
    }

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

    /**
     * Obtém o valor da propriedade offerCurrency.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getOfferCurrency() {
        return offerCurrency;
    }

    /**
     * Define o valor da propriedade offerCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setOfferCurrency(CurrencyCode value) {
        this.offerCurrency = value;
    }

}
