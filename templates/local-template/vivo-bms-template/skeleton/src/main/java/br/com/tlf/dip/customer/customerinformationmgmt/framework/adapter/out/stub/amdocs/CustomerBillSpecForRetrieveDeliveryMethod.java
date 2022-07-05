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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The specification for a periodical document that is rendered to a Customer. The document lists charges and usually
 * requires remittance.
 * :
 * Derived from PIM entity CustomerBillSpec in the domain customer.
 * 
 * <p>Classe Java de CustomerBillSpecForRetrieveDeliveryMethod complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerBillSpecForRetrieveDeliveryMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="emailAddress" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="printingCategoryRefId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="printingCategoryTitle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tempPrintingCategoryEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="tempPrintingCategoryEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="temporaryPrintingCategoryRefId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="temporaryPrintingCategoryTitle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
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
@XmlType(name = "CustomerBillSpecForRetrieveDeliveryMethod", namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1", propOrder = {
    "emailAddress",
    "printingCategoryRefId",
    "printingCategoryTitle",
    "tempPrintingCategoryEffectiveDate",
    "tempPrintingCategoryEndDate",
    "temporaryPrintingCategoryRefId",
    "temporaryPrintingCategoryTitle"
})
public class CustomerBillSpecForRetrieveDeliveryMethod {

    protected String emailAddress;
    protected String printingCategoryRefId;
    protected String printingCategoryTitle;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tempPrintingCategoryEffectiveDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tempPrintingCategoryEndDate;
    protected String temporaryPrintingCategoryRefId;
    protected String temporaryPrintingCategoryTitle;

    /**
     * Obtém o valor da propriedade emailAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Define o valor da propriedade emailAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Obtém o valor da propriedade printingCategoryRefId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintingCategoryRefId() {
        return printingCategoryRefId;
    }

    /**
     * Define o valor da propriedade printingCategoryRefId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintingCategoryRefId(String value) {
        this.printingCategoryRefId = value;
    }

    /**
     * Obtém o valor da propriedade printingCategoryTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintingCategoryTitle() {
        return printingCategoryTitle;
    }

    /**
     * Define o valor da propriedade printingCategoryTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintingCategoryTitle(String value) {
        this.printingCategoryTitle = value;
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
     * Obtém o valor da propriedade temporaryPrintingCategoryRefId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemporaryPrintingCategoryRefId() {
        return temporaryPrintingCategoryRefId;
    }

    /**
     * Define o valor da propriedade temporaryPrintingCategoryRefId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporaryPrintingCategoryRefId(String value) {
        this.temporaryPrintingCategoryRefId = value;
    }

    /**
     * Obtém o valor da propriedade temporaryPrintingCategoryTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemporaryPrintingCategoryTitle() {
        return temporaryPrintingCategoryTitle;
    }

    /**
     * Define o valor da propriedade temporaryPrintingCategoryTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporaryPrintingCategoryTitle(String value) {
        this.temporaryPrintingCategoryTitle = value;
    }

}
