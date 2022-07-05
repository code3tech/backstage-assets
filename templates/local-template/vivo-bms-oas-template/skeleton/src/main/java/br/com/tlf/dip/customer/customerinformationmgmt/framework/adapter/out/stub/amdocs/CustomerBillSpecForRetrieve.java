//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The specification for a periodical document that is rendered to a Customer. The document lists charges and usually
 * requires remittance.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerprofile/types-unqualified/v1}CustomerBillSpec,
 * Derived from PIM entity CustomerBillSpec in the domain customer.
 * 
 * <p>Classe Java de CustomerBillSpecForRetrieve complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerBillSpecForRetrieve"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billProductionFrequency" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="businessOrganizationUnit" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}BusinessOrganizationUnitID" minOccurs="0"/&gt;
 *         &lt;element name="dueDateShift" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}duration"&gt;
 *               &lt;pattern value="(\-)?P\p{Nd}{1,4}D(T\p{Nd}{1,4}H\p{Nd}{1,4}M\p{Nd}{1,4}(\.\p{Nd}{1,3})?S)?"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="externalID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
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
 *         &lt;element name="multiplier" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="openDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="payInstruction" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}PayInstructionPayMeans" minOccurs="0"/&gt;
 *         &lt;element name="printingCategory" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}PrintingCategory" minOccurs="0"/&gt;
 *         &lt;element name="produceDocument" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}ProduceDocument" minOccurs="0"/&gt;
 *         &lt;element name="status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="taxPresentment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tempPrintingCategoryEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="tempPrintingCategoryEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="temporaryPrintingCategory" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}PrintingCategory" minOccurs="0"/&gt;
 *         &lt;element name="zeroBalance" minOccurs="0"&gt;
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
@XmlType(name = "CustomerBillSpecForRetrieve", namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1", propOrder = {
    "billProductionFrequency",
    "businessOrganizationUnit",
    "dueDateShift",
    "externalID",
    "id",
    "multiplier",
    "name",
    "openDate",
    "payInstruction",
    "printingCategory",
    "produceDocument",
    "status",
    "taxPresentment",
    "tempPrintingCategoryEffectiveDate",
    "tempPrintingCategoryEndDate",
    "temporaryPrintingCategory",
    "zeroBalance"
})
@XmlSeeAlso({
    CustomerBillReceiver.class,
    CustomerInvoiceReceiver.class
})
public abstract class CustomerBillSpecForRetrieve {

    protected BigInteger billProductionFrequency;
    protected BusinessOrganizationUnitID businessOrganizationUnit;
    protected Duration dueDateShift;
    protected String externalID;
    protected String id;
    protected BigDecimal multiplier;
    protected String name;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar openDate;
    protected PayInstructionPayMeans payInstruction;
    @XmlSchemaType(name = "string")
    protected PrintingCategory printingCategory;
    @XmlSchemaType(name = "string")
    protected ProduceDocument produceDocument;
    protected String status;
    protected Boolean taxPresentment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tempPrintingCategoryEffectiveDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tempPrintingCategoryEndDate;
    @XmlSchemaType(name = "string")
    protected PrintingCategory temporaryPrintingCategory;
    protected Boolean zeroBalance;

    /**
     * Obtém o valor da propriedade billProductionFrequency.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBillProductionFrequency() {
        return billProductionFrequency;
    }

    /**
     * Define o valor da propriedade billProductionFrequency.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBillProductionFrequency(BigInteger value) {
        this.billProductionFrequency = value;
    }

    /**
     * Obtém o valor da propriedade businessOrganizationUnit.
     * 
     * @return
     *     possible object is
     *     {@link BusinessOrganizationUnitID }
     *     
     */
    public BusinessOrganizationUnitID getBusinessOrganizationUnit() {
        return businessOrganizationUnit;
    }

    /**
     * Define o valor da propriedade businessOrganizationUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessOrganizationUnitID }
     *     
     */
    public void setBusinessOrganizationUnit(BusinessOrganizationUnitID value) {
        this.businessOrganizationUnit = value;
    }

    /**
     * Obtém o valor da propriedade dueDateShift.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDueDateShift() {
        return dueDateShift;
    }

    /**
     * Define o valor da propriedade dueDateShift.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDueDateShift(Duration value) {
        this.dueDateShift = value;
    }

    /**
     * Obtém o valor da propriedade externalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalID() {
        return externalID;
    }

    /**
     * Define o valor da propriedade externalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalID(String value) {
        this.externalID = value;
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
     * Obtém o valor da propriedade multiplier.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultiplier() {
        return multiplier;
    }

    /**
     * Define o valor da propriedade multiplier.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiplier(BigDecimal value) {
        this.multiplier = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade openDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenDate() {
        return openDate;
    }

    /**
     * Define o valor da propriedade openDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOpenDate(XMLGregorianCalendar value) {
        this.openDate = value;
    }

    /**
     * Obtém o valor da propriedade payInstruction.
     * 
     * @return
     *     possible object is
     *     {@link PayInstructionPayMeans }
     *     
     */
    public PayInstructionPayMeans getPayInstruction() {
        return payInstruction;
    }

    /**
     * Define o valor da propriedade payInstruction.
     * 
     * @param value
     *     allowed object is
     *     {@link PayInstructionPayMeans }
     *     
     */
    public void setPayInstruction(PayInstructionPayMeans value) {
        this.payInstruction = value;
    }

    /**
     * Obtém o valor da propriedade printingCategory.
     * 
     * @return
     *     possible object is
     *     {@link PrintingCategory }
     *     
     */
    public PrintingCategory getPrintingCategory() {
        return printingCategory;
    }

    /**
     * Define o valor da propriedade printingCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintingCategory }
     *     
     */
    public void setPrintingCategory(PrintingCategory value) {
        this.printingCategory = value;
    }

    /**
     * Obtém o valor da propriedade produceDocument.
     * 
     * @return
     *     possible object is
     *     {@link ProduceDocument }
     *     
     */
    public ProduceDocument getProduceDocument() {
        return produceDocument;
    }

    /**
     * Define o valor da propriedade produceDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link ProduceDocument }
     *     
     */
    public void setProduceDocument(ProduceDocument value) {
        this.produceDocument = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade taxPresentment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxPresentment() {
        return taxPresentment;
    }

    /**
     * Define o valor da propriedade taxPresentment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxPresentment(Boolean value) {
        this.taxPresentment = value;
    }

    /**
     * Obtém o valor da propriedade tempPrintingCategoryEffectiveDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTempPrintingCategoryEffectiveDate() {
        return tempPrintingCategoryEffectiveDate;
    }

    /**
     * Define o valor da propriedade tempPrintingCategoryEffectiveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTempPrintingCategoryEffectiveDate(XMLGregorianCalendar value) {
        this.tempPrintingCategoryEffectiveDate = value;
    }

    /**
     * Obtém o valor da propriedade tempPrintingCategoryEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTempPrintingCategoryEndDate() {
        return tempPrintingCategoryEndDate;
    }

    /**
     * Define o valor da propriedade tempPrintingCategoryEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTempPrintingCategoryEndDate(XMLGregorianCalendar value) {
        this.tempPrintingCategoryEndDate = value;
    }

    /**
     * Obtém o valor da propriedade temporaryPrintingCategory.
     * 
     * @return
     *     possible object is
     *     {@link PrintingCategory }
     *     
     */
    public PrintingCategory getTemporaryPrintingCategory() {
        return temporaryPrintingCategory;
    }

    /**
     * Define o valor da propriedade temporaryPrintingCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintingCategory }
     *     
     */
    public void setTemporaryPrintingCategory(PrintingCategory value) {
        this.temporaryPrintingCategory = value;
    }

    /**
     * Obtém o valor da propriedade zeroBalance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroBalance() {
        return zeroBalance;
    }

    /**
     * Define o valor da propriedade zeroBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZeroBalance(Boolean value) {
        this.zeroBalance = value;
    }

}
