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
 * <p>Classe Java de CustomerInformation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anniversaryEndDay" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="businessEntity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="customerCurrency" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="customerKey" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="customerStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="customerStatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="cycleCode" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerCycleCodeInformation" minOccurs="0"/&gt;
 *         &lt;element name="cycleInitGroup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="docProduceInd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="externalId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="300"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="holdByOperId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="holdInd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lastCycle" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}BillingCycleControlInformation" minOccurs="0"/&gt;
 *         &lt;element name="lastCycleDbStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="newCycleCode" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerCycleCodeInformation" minOccurs="0"/&gt;
 *         &lt;element name="oldCycleCode" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerCycleCodeInformation" minOccurs="0"/&gt;
 *         &lt;element name="oldCycleExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="onlinePartitionId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="partitionKey" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerInformation", propOrder = {
    "anniversaryEndDay",
    "businessEntity",
    "customerCurrency",
    "customerId",
    "customerKey",
    "customerStatus",
    "customerStatusDate",
    "cycleCode",
    "cycleInitGroup",
    "docProduceInd",
    "externalId",
    "holdByOperId",
    "holdInd",
    "lastCycle",
    "lastCycleDbStatus",
    "newCycleCode",
    "oldCycleCode",
    "oldCycleExpirationDate",
    "onlinePartitionId",
    "partitionKey",
    "weight"
})
public class CustomerInformation {

    protected BigDecimal anniversaryEndDay;
    protected BigDecimal businessEntity;
    protected String customerCurrency;
    protected BigDecimal customerId;
    protected BigDecimal customerKey;
    protected String customerStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customerStatusDate;
    protected CustomerCycleCodeInformation cycleCode;
    protected BigDecimal cycleInitGroup;
    protected String docProduceInd;
    protected String externalId;
    protected BigDecimal holdByOperId;
    protected String holdInd;
    protected BillingCycleControlInformation lastCycle;
    protected String lastCycleDbStatus;
    protected CustomerCycleCodeInformation newCycleCode;
    protected CustomerCycleCodeInformation oldCycleCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar oldCycleExpirationDate;
    protected BigDecimal onlinePartitionId;
    protected BigDecimal partitionKey;
    protected BigDecimal weight;

    /**
     * Obtém o valor da propriedade anniversaryEndDay.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnniversaryEndDay() {
        return anniversaryEndDay;
    }

    /**
     * Define o valor da propriedade anniversaryEndDay.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnniversaryEndDay(BigDecimal value) {
        this.anniversaryEndDay = value;
    }

    /**
     * Obtém o valor da propriedade businessEntity.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBusinessEntity() {
        return businessEntity;
    }

    /**
     * Define o valor da propriedade businessEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBusinessEntity(BigDecimal value) {
        this.businessEntity = value;
    }

    /**
     * Obtém o valor da propriedade customerCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCurrency() {
        return customerCurrency;
    }

    /**
     * Define o valor da propriedade customerCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCurrency(String value) {
        this.customerCurrency = value;
    }

    /**
     * Obtém o valor da propriedade customerId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomerId() {
        return customerId;
    }

    /**
     * Define o valor da propriedade customerId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomerId(BigDecimal value) {
        this.customerId = value;
    }

    /**
     * Obtém o valor da propriedade customerKey.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCustomerKey() {
        return customerKey;
    }

    /**
     * Define o valor da propriedade customerKey.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCustomerKey(BigDecimal value) {
        this.customerKey = value;
    }

    /**
     * Obtém o valor da propriedade customerStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerStatus() {
        return customerStatus;
    }

    /**
     * Define o valor da propriedade customerStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerStatus(String value) {
        this.customerStatus = value;
    }

    /**
     * Obtém o valor da propriedade customerStatusDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomerStatusDate() {
        return customerStatusDate;
    }

    /**
     * Define o valor da propriedade customerStatusDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomerStatusDate(XMLGregorianCalendar value) {
        this.customerStatusDate = value;
    }

    /**
     * Obtém o valor da propriedade cycleCode.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCycleCodeInformation }
     *     
     */
    public CustomerCycleCodeInformation getCycleCode() {
        return cycleCode;
    }

    /**
     * Define o valor da propriedade cycleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCycleCodeInformation }
     *     
     */
    public void setCycleCode(CustomerCycleCodeInformation value) {
        this.cycleCode = value;
    }

    /**
     * Obtém o valor da propriedade cycleInitGroup.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCycleInitGroup() {
        return cycleInitGroup;
    }

    /**
     * Define o valor da propriedade cycleInitGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCycleInitGroup(BigDecimal value) {
        this.cycleInitGroup = value;
    }

    /**
     * Obtém o valor da propriedade docProduceInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocProduceInd() {
        return docProduceInd;
    }

    /**
     * Define o valor da propriedade docProduceInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocProduceInd(String value) {
        this.docProduceInd = value;
    }

    /**
     * Obtém o valor da propriedade externalId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Define o valor da propriedade externalId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
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
     * Obtém o valor da propriedade holdInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldInd() {
        return holdInd;
    }

    /**
     * Define o valor da propriedade holdInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldInd(String value) {
        this.holdInd = value;
    }

    /**
     * Obtém o valor da propriedade lastCycle.
     * 
     * @return
     *     possible object is
     *     {@link BillingCycleControlInformation }
     *     
     */
    public BillingCycleControlInformation getLastCycle() {
        return lastCycle;
    }

    /**
     * Define o valor da propriedade lastCycle.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingCycleControlInformation }
     *     
     */
    public void setLastCycle(BillingCycleControlInformation value) {
        this.lastCycle = value;
    }

    /**
     * Obtém o valor da propriedade lastCycleDbStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastCycleDbStatus() {
        return lastCycleDbStatus;
    }

    /**
     * Define o valor da propriedade lastCycleDbStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastCycleDbStatus(String value) {
        this.lastCycleDbStatus = value;
    }

    /**
     * Obtém o valor da propriedade newCycleCode.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCycleCodeInformation }
     *     
     */
    public CustomerCycleCodeInformation getNewCycleCode() {
        return newCycleCode;
    }

    /**
     * Define o valor da propriedade newCycleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCycleCodeInformation }
     *     
     */
    public void setNewCycleCode(CustomerCycleCodeInformation value) {
        this.newCycleCode = value;
    }

    /**
     * Obtém o valor da propriedade oldCycleCode.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCycleCodeInformation }
     *     
     */
    public CustomerCycleCodeInformation getOldCycleCode() {
        return oldCycleCode;
    }

    /**
     * Define o valor da propriedade oldCycleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCycleCodeInformation }
     *     
     */
    public void setOldCycleCode(CustomerCycleCodeInformation value) {
        this.oldCycleCode = value;
    }

    /**
     * Obtém o valor da propriedade oldCycleExpirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOldCycleExpirationDate() {
        return oldCycleExpirationDate;
    }

    /**
     * Define o valor da propriedade oldCycleExpirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOldCycleExpirationDate(XMLGregorianCalendar value) {
        this.oldCycleExpirationDate = value;
    }

    /**
     * Obtém o valor da propriedade onlinePartitionId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOnlinePartitionId() {
        return onlinePartitionId;
    }

    /**
     * Define o valor da propriedade onlinePartitionId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOnlinePartitionId(BigDecimal value) {
        this.onlinePartitionId = value;
    }

    /**
     * Obtém o valor da propriedade partitionKey.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartitionKey() {
        return partitionKey;
    }

    /**
     * Define o valor da propriedade partitionKey.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartitionKey(BigDecimal value) {
        this.partitionKey = value;
    }

    /**
     * Obtém o valor da propriedade weight.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Define o valor da propriedade weight.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

}
