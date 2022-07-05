//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The billing specific attributes and associations for the Customer. These attributes and associations have no meaning
 * for a Customer which is not instantiated in the billing system.
 * :
 * Derived from PIM entity CustomerBillingProfile in the domain customer.:
 * Restriction of {http://amdocs/pbg-portfolio/customerprofile/types-unqualified/v1}CustomerBillingProfile,
 * Derived from PIM entity CustomerBillingProfile in the domain customer.
 * 
 * <p>Classe Java de CustomerBillingProfileSummary complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerBillingProfileSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dealerCode" type="{http://amdocs/tef-vivo/supplierpartner-common/types/v1}Dealer" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerBillingProfileSummary", propOrder = {
    "dealerCode",
    "offerCurrency"
})
public class CustomerBillingProfileSummary {

    protected Dealer dealerCode;
    @XmlSchemaType(name = "string")
    protected CurrencyCode offerCurrency;

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
