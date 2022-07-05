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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CreateIndividualCustomerProfileForContactResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CreateIndividualCustomerProfileForContactResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerAccountID" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}CustomerAccountID" minOccurs="0"/&gt;
 *         &lt;element name="customerBillSpecID" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}CustomerBillSpecCoreID" minOccurs="0"/&gt;
 *         &lt;element name="customerBillingProfileID" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}CustomerBillingProfileID" minOccurs="0"/&gt;
 *         &lt;element name="customerID" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}CustomerID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateIndividualCustomerProfileForContactResponse", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "customerAccountID",
    "customerBillSpecID",
    "customerBillingProfileID",
    "customerID"
})
public class CreateIndividualCustomerProfileForContactResponse {

    protected CustomerAccountID customerAccountID;
    protected CustomerBillSpecCoreID customerBillSpecID;
    protected CustomerBillingProfileID customerBillingProfileID;
    @XmlElement(required = true)
    protected CustomerID customerID;

    /**
     * Obtém o valor da propriedade customerAccountID.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccountID }
     *     
     */
    public CustomerAccountID getCustomerAccountID() {
        return customerAccountID;
    }

    /**
     * Define o valor da propriedade customerAccountID.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccountID }
     *     
     */
    public void setCustomerAccountID(CustomerAccountID value) {
        this.customerAccountID = value;
    }

    /**
     * Obtém o valor da propriedade customerBillSpecID.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBillSpecCoreID }
     *     
     */
    public CustomerBillSpecCoreID getCustomerBillSpecID() {
        return customerBillSpecID;
    }

    /**
     * Define o valor da propriedade customerBillSpecID.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBillSpecCoreID }
     *     
     */
    public void setCustomerBillSpecID(CustomerBillSpecCoreID value) {
        this.customerBillSpecID = value;
    }

    /**
     * Obtém o valor da propriedade customerBillingProfileID.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBillingProfileID }
     *     
     */
    public CustomerBillingProfileID getCustomerBillingProfileID() {
        return customerBillingProfileID;
    }

    /**
     * Define o valor da propriedade customerBillingProfileID.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBillingProfileID }
     *     
     */
    public void setCustomerBillingProfileID(CustomerBillingProfileID value) {
        this.customerBillingProfileID = value;
    }

    /**
     * Obtém o valor da propriedade customerID.
     * 
     * @return
     *     possible object is
     *     {@link CustomerID }
     *     
     */
    public CustomerID getCustomerID() {
        return customerID;
    }

    /**
     * Define o valor da propriedade customerID.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerID }
     *     
     */
    public void setCustomerID(CustomerID value) {
        this.customerID = value;
    }

}
