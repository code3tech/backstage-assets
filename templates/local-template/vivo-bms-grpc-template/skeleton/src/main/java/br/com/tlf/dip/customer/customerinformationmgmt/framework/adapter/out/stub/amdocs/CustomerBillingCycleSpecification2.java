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
import javax.xml.datatype.Duration;


/**
 * The cycles in the system. CustomerBillingCycleSpecification are instantiated as CustomerBillingCycle for each
 * billing period. For example, if the service provider runs a single cycle every day and all the cycles in the system are
 * monthly cycles then there will be 30 instances of CustomerBillingCycleSpecification in the billing system.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerbilling/types-unqualified/v1}CustomerBillingCycleSpecification,
 * Derived from PIM entity CustomerBillingCycleSpecification in the domain customerbill.
 * 
 * <p>Classe Java de CustomerBillingCycleSpecification complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerBillingCycleSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billingDateShift" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}duration"&gt;
 *               &lt;pattern value="(\-)?P\p{Nd}{1,4}D(T\p{Nd}{1,4}H\p{Nd}{1,4}M\p{Nd}{1,4}(\.\p{Nd}{1,3})?S)?"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cycleCloseDay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cycleCode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="description" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1023"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="frequency" type="{http://amdocs/tef-vivo/core/types/v1}SimpleFrequency" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBillingCycleSpecification", namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1", propOrder = {
    "billingDateShift",
    "cycleCloseDay",
    "cycleCode",
    "description",
    "frequency"
})
public class CustomerBillingCycleSpecification2 {

    protected Duration billingDateShift;
    protected BigDecimal cycleCloseDay;
    protected BigDecimal cycleCode;
    protected String description;
    protected Duration frequency;

    /**
     * Obtém o valor da propriedade billingDateShift.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getBillingDateShift() {
        return billingDateShift;
    }

    /**
     * Define o valor da propriedade billingDateShift.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setBillingDateShift(Duration value) {
        this.billingDateShift = value;
    }

    /**
     * Obtém o valor da propriedade cycleCloseDay.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCycleCloseDay() {
        return cycleCloseDay;
    }

    /**
     * Define o valor da propriedade cycleCloseDay.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCycleCloseDay(BigDecimal value) {
        this.cycleCloseDay = value;
    }

    /**
     * Obtém o valor da propriedade cycleCode.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCycleCode() {
        return cycleCode;
    }

    /**
     * Define o valor da propriedade cycleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCycleCode(BigDecimal value) {
        this.cycleCode = value;
    }

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
     * Obtém o valor da propriedade frequency.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getFrequency() {
        return frequency;
    }

    /**
     * Define o valor da propriedade frequency.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFrequency(Duration value) {
        this.frequency = value;
    }

}
