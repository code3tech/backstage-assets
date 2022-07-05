//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A presentation of all AppliedCustomerBillingRates and financial activities made during the defined billing cycle period,
 * and record of the amount due of the CustomerBillSpec.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerbilling/types-unqualified/v1}CustomerBill,
 * Derived from PIM entity CustomerBill in the domain customerbill.
 * 
 * <p>Classe Java de CustomerBill complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerBill"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="cycleSequence" type="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}CustomerBillingCycle"/&gt;
 *         &lt;element name="id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="productionType" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}ProductionType" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}CustomerBillStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBill", namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1", propOrder = {
    "billDate",
    "cycleSequence",
    "id",
    "productionType",
    "status"
})
public class CustomerBill {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billDate;
    @XmlElement(required = true)
    protected CustomerBillingCycle cycleSequence;
    protected String id;
    @XmlSchemaType(name = "string")
    protected ProductionType productionType;
    @XmlSchemaType(name = "string")
    protected CustomerBillStatus status;

    /**
     * Obtém o valor da propriedade billDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillDate() {
        return billDate;
    }

    /**
     * Define o valor da propriedade billDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillDate(XMLGregorianCalendar value) {
        this.billDate = value;
    }

    /**
     * Obtém o valor da propriedade cycleSequence.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBillingCycle }
     *     
     */
    public CustomerBillingCycle getCycleSequence() {
        return cycleSequence;
    }

    /**
     * Define o valor da propriedade cycleSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBillingCycle }
     *     
     */
    public void setCycleSequence(CustomerBillingCycle value) {
        this.cycleSequence = value;
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
     * Obtém o valor da propriedade productionType.
     * 
     * @return
     *     possible object is
     *     {@link ProductionType }
     *     
     */
    public ProductionType getProductionType() {
        return productionType;
    }

    /**
     * Define o valor da propriedade productionType.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionType }
     *     
     */
    public void setProductionType(ProductionType value) {
        this.productionType = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBillStatus }
     *     
     */
    public CustomerBillStatus getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBillStatus }
     *     
     */
    public void setStatus(CustomerBillStatus value) {
        this.status = value;
    }

}
