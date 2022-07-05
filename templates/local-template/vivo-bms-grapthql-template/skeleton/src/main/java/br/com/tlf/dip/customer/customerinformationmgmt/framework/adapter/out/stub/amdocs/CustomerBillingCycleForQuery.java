//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An instance of CustomerBillingCycleSpecification for a specific period for which a group of Customers is billed. Each
 * Customer is associated with CustomerBillingCycleSpecification and each month (or a different period based on
 * definitions) a new instance (CustomerBillingCycle is created for the generation of the CustomerBill that covers this
 * period.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerbilling/types-unqualified/v1}CustomerBillingCycle,
 * Derived from PIM entity CustomerBillingCycle in the domain customerbill.
 * 
 * <p>Classe Java de CustomerBillingCycleForQuery complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerBillingCycleForQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cycleCloseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="cycleCode" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}CustomerBillingCycleSpecificationForQuery"/&gt;
 *         &lt;element name="cycleInstance" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBillingCycleForQuery", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1", propOrder = {
    "cycleCloseDate",
    "cycleCode",
    "cycleInstance"
})
public class CustomerBillingCycleForQuery {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cycleCloseDate;
    @XmlElement(required = true)
    protected CustomerBillingCycleSpecificationForQuery cycleCode;
    @XmlElement(required = true)
    protected BigInteger cycleInstance;

    /**
     * Obtém o valor da propriedade cycleCloseDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCycleCloseDate() {
        return cycleCloseDate;
    }

    /**
     * Define o valor da propriedade cycleCloseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCycleCloseDate(XMLGregorianCalendar value) {
        this.cycleCloseDate = value;
    }

    /**
     * Obtém o valor da propriedade cycleCode.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBillingCycleSpecificationForQuery }
     *     
     */
    public CustomerBillingCycleSpecificationForQuery getCycleCode() {
        return cycleCode;
    }

    /**
     * Define o valor da propriedade cycleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBillingCycleSpecificationForQuery }
     *     
     */
    public void setCycleCode(CustomerBillingCycleSpecificationForQuery value) {
        this.cycleCode = value;
    }

    /**
     * Obtém o valor da propriedade cycleInstance.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCycleInstance() {
        return cycleInstance;
    }

    /**
     * Define o valor da propriedade cycleInstance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCycleInstance(BigInteger value) {
        this.cycleInstance = value;
    }

}
