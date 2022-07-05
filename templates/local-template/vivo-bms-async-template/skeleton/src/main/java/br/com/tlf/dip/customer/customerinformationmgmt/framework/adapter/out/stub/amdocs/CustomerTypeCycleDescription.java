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
 * Defines the Cycle Description for a particular customer type and subtype.
 * :
 * 
 * <p>Classe Java de CustomerTypeCycleDescription complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerTypeCycleDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billProductionUpperLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="billProductionUpperLimitSensitive" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="billingReference" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="billingReferenceSensitive" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="businessEntityId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="businessEntityIdSensitive" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cycleCloseDay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cycleCloseDaySensitive" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cycleCode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cycleCodeSensitive" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cycleDesc" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1023"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cycleDescSensitive" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cyclePopulationCd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cyclePopulationCdSensitive" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="frequency" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1023"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="frequencyMultiplier" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="frequencyMultiplierSensitive" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="frequencySensitive" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="l3Enabled" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="l3EnabledSensitive" minOccurs="0"&gt;
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
@XmlType(name = "CustomerTypeCycleDescription", propOrder = {
    "billProductionUpperLimit",
    "billProductionUpperLimitSensitive",
    "billingReference",
    "billingReferenceSensitive",
    "businessEntityId",
    "businessEntityIdSensitive",
    "cycleCloseDay",
    "cycleCloseDaySensitive",
    "cycleCode",
    "cycleCodeSensitive",
    "cycleDesc",
    "cycleDescSensitive",
    "cyclePopulationCd",
    "cyclePopulationCdSensitive",
    "frequency",
    "frequencyMultiplier",
    "frequencyMultiplierSensitive",
    "frequencySensitive",
    "l3Enabled",
    "l3EnabledSensitive"
})
public class CustomerTypeCycleDescription {

    protected BigDecimal billProductionUpperLimit;
    protected Boolean billProductionUpperLimitSensitive;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billingReference;
    protected Boolean billingReferenceSensitive;
    protected String businessEntityId;
    protected Boolean businessEntityIdSensitive;
    protected BigDecimal cycleCloseDay;
    protected Boolean cycleCloseDaySensitive;
    protected BigDecimal cycleCode;
    protected Boolean cycleCodeSensitive;
    protected String cycleDesc;
    protected Boolean cycleDescSensitive;
    protected String cyclePopulationCd;
    protected Boolean cyclePopulationCdSensitive;
    protected String frequency;
    protected BigDecimal frequencyMultiplier;
    protected Boolean frequencyMultiplierSensitive;
    protected Boolean frequencySensitive;
    protected String l3Enabled;
    protected Boolean l3EnabledSensitive;

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
     * Obtém o valor da propriedade billProductionUpperLimitSensitive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillProductionUpperLimitSensitive() {
        return billProductionUpperLimitSensitive;
    }

    /**
     * Define o valor da propriedade billProductionUpperLimitSensitive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillProductionUpperLimitSensitive(Boolean value) {
        this.billProductionUpperLimitSensitive = value;
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
     * Obtém o valor da propriedade billingReferenceSensitive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillingReferenceSensitive() {
        return billingReferenceSensitive;
    }

    /**
     * Define o valor da propriedade billingReferenceSensitive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillingReferenceSensitive(Boolean value) {
        this.billingReferenceSensitive = value;
    }

    /**
     * Obtém o valor da propriedade businessEntityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessEntityId() {
        return businessEntityId;
    }

    /**
     * Define o valor da propriedade businessEntityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessEntityId(String value) {
        this.businessEntityId = value;
    }

    /**
     * Obtém o valor da propriedade businessEntityIdSensitive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusinessEntityIdSensitive() {
        return businessEntityIdSensitive;
    }

    /**
     * Define o valor da propriedade businessEntityIdSensitive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusinessEntityIdSensitive(Boolean value) {
        this.businessEntityIdSensitive = value;
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
     * Obtém o valor da propriedade cycleCloseDaySensitive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCycleCloseDaySensitive() {
        return cycleCloseDaySensitive;
    }

    /**
     * Define o valor da propriedade cycleCloseDaySensitive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCycleCloseDaySensitive(Boolean value) {
        this.cycleCloseDaySensitive = value;
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
     * Obtém o valor da propriedade cycleCodeSensitive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCycleCodeSensitive() {
        return cycleCodeSensitive;
    }

    /**
     * Define o valor da propriedade cycleCodeSensitive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCycleCodeSensitive(Boolean value) {
        this.cycleCodeSensitive = value;
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
     * Obtém o valor da propriedade cycleDescSensitive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCycleDescSensitive() {
        return cycleDescSensitive;
    }

    /**
     * Define o valor da propriedade cycleDescSensitive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCycleDescSensitive(Boolean value) {
        this.cycleDescSensitive = value;
    }

    /**
     * Obtém o valor da propriedade cyclePopulationCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCyclePopulationCd() {
        return cyclePopulationCd;
    }

    /**
     * Define o valor da propriedade cyclePopulationCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCyclePopulationCd(String value) {
        this.cyclePopulationCd = value;
    }

    /**
     * Obtém o valor da propriedade cyclePopulationCdSensitive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCyclePopulationCdSensitive() {
        return cyclePopulationCdSensitive;
    }

    /**
     * Define o valor da propriedade cyclePopulationCdSensitive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCyclePopulationCdSensitive(Boolean value) {
        this.cyclePopulationCdSensitive = value;
    }

    /**
     * Obtém o valor da propriedade frequency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Define o valor da propriedade frequency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
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

    /**
     * Obtém o valor da propriedade frequencyMultiplierSensitive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrequencyMultiplierSensitive() {
        return frequencyMultiplierSensitive;
    }

    /**
     * Define o valor da propriedade frequencyMultiplierSensitive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFrequencyMultiplierSensitive(Boolean value) {
        this.frequencyMultiplierSensitive = value;
    }

    /**
     * Obtém o valor da propriedade frequencySensitive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrequencySensitive() {
        return frequencySensitive;
    }

    /**
     * Define o valor da propriedade frequencySensitive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFrequencySensitive(Boolean value) {
        this.frequencySensitive = value;
    }

    /**
     * Obtém o valor da propriedade l3Enabled.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getL3Enabled() {
        return l3Enabled;
    }

    /**
     * Define o valor da propriedade l3Enabled.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setL3Enabled(String value) {
        this.l3Enabled = value;
    }

    /**
     * Obtém o valor da propriedade l3EnabledSensitive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isL3EnabledSensitive() {
        return l3EnabledSensitive;
    }

    /**
     * Define o valor da propriedade l3EnabledSensitive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setL3EnabledSensitive(Boolean value) {
        this.l3EnabledSensitive = value;
    }

}
