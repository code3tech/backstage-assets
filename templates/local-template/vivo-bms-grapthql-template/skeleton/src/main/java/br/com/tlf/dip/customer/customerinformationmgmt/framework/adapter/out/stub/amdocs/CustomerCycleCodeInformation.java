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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Cycle code information used to define each cycle code in Billing system
 * 
 * <p>Classe Java de CustomerCycleCodeInformation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerCycleCodeInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billProductionUpperLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="billingReference" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="businessEntityId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cycleBillDay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cycleCloseDay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cycleCode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cycleDesc" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="180"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cycleFrequency" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cyclePopulationCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cyclePopulationDesc" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="180"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="frequencyMultiplier" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerCycleCodeInformation", propOrder = {
    "billProductionUpperLimit",
    "billingReference",
    "businessEntityId",
    "cycleBillDay",
    "cycleCloseDay",
    "cycleCode",
    "cycleDesc",
    "cycleFrequency",
    "cyclePopulationCode",
    "cyclePopulationDesc",
    "frequencyMultiplier"
})
public class CustomerCycleCodeInformation {

    protected BigDecimal billProductionUpperLimit;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billingReference;
    protected BigDecimal businessEntityId;
    protected BigDecimal cycleBillDay;
    protected BigDecimal cycleCloseDay;
    protected BigDecimal cycleCode;
    protected String cycleDesc;
    protected String cycleFrequency;
    protected String cyclePopulationCode;
    protected String cyclePopulationDesc;
    protected BigDecimal frequencyMultiplier;

    /**
     * Obtém o valor da propriedade billProductionUpperLimit.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillProductionUpperLimit() {
        return billProductionUpperLimit;
    }

    /**
     * Define o valor da propriedade billProductionUpperLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillProductionUpperLimit(BigDecimal value) {
        this.billProductionUpperLimit = value;
    }

    /**
     * Obtém o valor da propriedade billingReference.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillingReference() {
        return billingReference;
    }

    /**
     * Define o valor da propriedade billingReference.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillingReference(XMLGregorianCalendar value) {
        this.billingReference = value;
    }

    /**
     * Obtém o valor da propriedade businessEntityId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBusinessEntityId() {
        return businessEntityId;
    }

    /**
     * Define o valor da propriedade businessEntityId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBusinessEntityId(BigDecimal value) {
        this.businessEntityId = value;
    }

    /**
     * Obtém o valor da propriedade cycleBillDay.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCycleBillDay() {
        return cycleBillDay;
    }

    /**
     * Define o valor da propriedade cycleBillDay.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCycleBillDay(BigDecimal value) {
        this.cycleBillDay = value;
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
     * Obtém o valor da propriedade cycleDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleDesc() {
        return cycleDesc;
    }

    /**
     * Define o valor da propriedade cycleDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleDesc(String value) {
        this.cycleDesc = value;
    }

    /**
     * Obtém o valor da propriedade cycleFrequency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleFrequency() {
        return cycleFrequency;
    }

    /**
     * Define o valor da propriedade cycleFrequency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleFrequency(String value) {
        this.cycleFrequency = value;
    }

    /**
     * Obtém o valor da propriedade cyclePopulationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCyclePopulationCode() {
        return cyclePopulationCode;
    }

    /**
     * Define o valor da propriedade cyclePopulationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCyclePopulationCode(String value) {
        this.cyclePopulationCode = value;
    }

    /**
     * Obtém o valor da propriedade cyclePopulationDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCyclePopulationDesc() {
        return cyclePopulationDesc;
    }

    /**
     * Define o valor da propriedade cyclePopulationDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCyclePopulationDesc(String value) {
        this.cyclePopulationDesc = value;
    }

    /**
     * Obtém o valor da propriedade frequencyMultiplier.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrequencyMultiplier() {
        return frequencyMultiplier;
    }

    /**
     * Define o valor da propriedade frequencyMultiplier.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFrequencyMultiplier(BigDecimal value) {
        this.frequencyMultiplier = value;
    }

}
