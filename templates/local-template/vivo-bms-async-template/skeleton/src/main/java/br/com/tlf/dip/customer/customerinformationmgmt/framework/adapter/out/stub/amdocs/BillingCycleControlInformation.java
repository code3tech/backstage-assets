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
 * Customer Information representing a customer retrieved from Billing
 * 
 * <p>Classe Java de BillingCycleControlInformation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BillingCycleControlInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cycleCode" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cycleEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="cycleInstance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cycleMonth" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cycleRunDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="cycleSeqNo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cycleSeqRun" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cycleStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="cycleStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cycleYear" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="periodKey" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingCycleControlInformation", namespace = "http://amdocs/tef-vivo/commonbusinessentities-common/types/v1", propOrder = {
    "cycleCode",
    "cycleEndDate",
    "cycleInstance",
    "cycleMonth",
    "cycleRunDate",
    "cycleSeqNo",
    "cycleSeqRun",
    "cycleStartDate",
    "cycleStatus",
    "cycleYear",
    "periodKey"
})
public class BillingCycleControlInformation {

    protected BigDecimal cycleCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cycleEndDate;
    protected BigDecimal cycleInstance;
    protected BigDecimal cycleMonth;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cycleRunDate;
    protected BigDecimal cycleSeqNo;
    protected BigDecimal cycleSeqRun;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cycleStartDate;
    protected String cycleStatus;
    protected BigDecimal cycleYear;
    protected BigDecimal periodKey;

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
     * Obtém o valor da propriedade cycleEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCycleEndDate() {
        return cycleEndDate;
    }

    /**
     * Define o valor da propriedade cycleEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCycleEndDate(XMLGregorianCalendar value) {
        this.cycleEndDate = value;
    }

    /**
     * Obtém o valor da propriedade cycleInstance.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCycleInstance() {
        return cycleInstance;
    }

    /**
     * Define o valor da propriedade cycleInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCycleInstance(BigDecimal value) {
        this.cycleInstance = value;
    }

    /**
     * Obtém o valor da propriedade cycleMonth.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCycleMonth() {
        return cycleMonth;
    }

    /**
     * Define o valor da propriedade cycleMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCycleMonth(BigDecimal value) {
        this.cycleMonth = value;
    }

    /**
     * Obtém o valor da propriedade cycleRunDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCycleRunDate() {
        return cycleRunDate;
    }

    /**
     * Define o valor da propriedade cycleRunDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCycleRunDate(XMLGregorianCalendar value) {
        this.cycleRunDate = value;
    }

    /**
     * Obtém o valor da propriedade cycleSeqNo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCycleSeqNo() {
        return cycleSeqNo;
    }

    /**
     * Define o valor da propriedade cycleSeqNo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCycleSeqNo(BigDecimal value) {
        this.cycleSeqNo = value;
    }

    /**
     * Obtém o valor da propriedade cycleSeqRun.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCycleSeqRun() {
        return cycleSeqRun;
    }

    /**
     * Define o valor da propriedade cycleSeqRun.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCycleSeqRun(BigDecimal value) {
        this.cycleSeqRun = value;
    }

    /**
     * Obtém o valor da propriedade cycleStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCycleStartDate() {
        return cycleStartDate;
    }

    /**
     * Define o valor da propriedade cycleStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCycleStartDate(XMLGregorianCalendar value) {
        this.cycleStartDate = value;
    }

    /**
     * Obtém o valor da propriedade cycleStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleStatus() {
        return cycleStatus;
    }

    /**
     * Define o valor da propriedade cycleStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleStatus(String value) {
        this.cycleStatus = value;
    }

    /**
     * Obtém o valor da propriedade cycleYear.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCycleYear() {
        return cycleYear;
    }

    /**
     * Define o valor da propriedade cycleYear.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCycleYear(BigDecimal value) {
        this.cycleYear = value;
    }

    /**
     * Obtém o valor da propriedade periodKey.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeriodKey() {
        return periodKey;
    }

    /**
     * Define o valor da propriedade periodKey.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeriodKey(BigDecimal value) {
        this.periodKey = value;
    }

}
