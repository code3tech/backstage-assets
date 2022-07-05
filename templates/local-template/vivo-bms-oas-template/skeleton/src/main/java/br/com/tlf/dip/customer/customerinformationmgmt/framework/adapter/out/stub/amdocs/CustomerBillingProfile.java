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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The billing specific attributes and associations for the Customer. These attributes and associations have no meaning
 * for a Customer which is not instantiated in the billing system.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerprofile/types-unqualified/v1}CustomerBillingProfile,
 * Derived from PIM entity CustomerBillingProfile in the domain customer.
 * 
 * <p>Classe Java de CustomerBillingProfile complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerBillingProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billCycleSpecification" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerBillingCycleSpecification"/&gt;
 *         &lt;element name="cycleChangeRequest" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CycleChangeRequest" minOccurs="0"/&gt;
 *         &lt;element name="dealerCode" type="{http://amdocs/tef-vivo/supplierpartner-common/types/v1}Dealer" minOccurs="0"/&gt;
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
 *         &lt;element name="largeCustomerIndicator" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="offerCurrency" type="{http://amdocs/tef-vivo/core/types/v1}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="unitID" minOccurs="0"&gt;
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
@XmlType(name = "CustomerBillingProfile", propOrder = {
    "billCycleSpecification",
    "cycleChangeRequest",
    "dealerCode",
    "holdByOperId",
    "holdIndicator",
    "id",
    "largeCustomerIndicator",
    "offerCurrency",
    "unitID"
})
public class CustomerBillingProfile {

    @XmlElement(required = true)
    protected CustomerBillingCycleSpecification billCycleSpecification;
    protected CycleChangeRequest cycleChangeRequest;
    protected Dealer dealerCode;
    protected BigDecimal holdByOperId;
    protected Boolean holdIndicator;
    protected String id;
    protected Boolean largeCustomerIndicator;
    @XmlSchemaType(name = "string")
    protected CurrencyCode offerCurrency;
    protected String unitID;

    /**
     * Obtém o valor da propriedade billCycleSpecification.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBillingCycleSpecification }
     *     
     */
    public CustomerBillingCycleSpecification getBillCycleSpecification() {
        return billCycleSpecification;
    }

    /**
     * Define o valor da propriedade billCycleSpecification.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBillingCycleSpecification }
     *     
     */
    public void setBillCycleSpecification(CustomerBillingCycleSpecification value) {
        this.billCycleSpecification = value;
    }

    /**
     * Obtém o valor da propriedade cycleChangeRequest.
     * 
     * @return
     *     possible object is
     *     {@link CycleChangeRequest }
     *     
     */
    public CycleChangeRequest getCycleChangeRequest() {
        return cycleChangeRequest;
    }

    /**
     * Define o valor da propriedade cycleChangeRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleChangeRequest }
     *     
     */
    public void setCycleChangeRequest(CycleChangeRequest value) {
        this.cycleChangeRequest = value;
    }

    /**
     * Obtém o valor da propriedade dealerCode.
     * 
     * @return
     *     possible object is
     *     {@link Dealer }
     *     
     */
    public Dealer getDealerCode() {
        return dealerCode;
    }

    /**
     * Define o valor da propriedade dealerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Dealer }
     *     
     */
    public void setDealerCode(Dealer value) {
        this.dealerCode = value;
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
     * Obtém o valor da propriedade largeCustomerIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLargeCustomerIndicator() {
        return largeCustomerIndicator;
    }

    /**
     * Define o valor da propriedade largeCustomerIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLargeCustomerIndicator(Boolean value) {
        this.largeCustomerIndicator = value;
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

    /**
     * Obtém o valor da propriedade unitID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitID() {
        return unitID;
    }

    /**
     * Define o valor da propriedade unitID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitID(String value) {
        this.unitID = value;
    }

}
