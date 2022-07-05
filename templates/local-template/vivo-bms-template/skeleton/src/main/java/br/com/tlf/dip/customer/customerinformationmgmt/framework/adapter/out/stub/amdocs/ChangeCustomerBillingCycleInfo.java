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
 * The operation updates the customer billing cycle of given customer.
 * 
 * <p>Classe Java de ChangeCustomerBillingCycleInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ChangeCustomerBillingCycleInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appCtx" type="{http://amdocs/tef-vivo/core/types/v1}ApplicationContext" minOccurs="0"/&gt;
 *         &lt;element name="customerNo" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}CustomerID"/&gt;
 *         &lt;element name="customerBillingCycleInfo" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerBillingCycleInfoForUpdate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeCustomerBillingCycleInfo", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "appCtx",
    "customerNo",
    "customerBillingCycleInfo"
})
public class ChangeCustomerBillingCycleInfo {

    protected ApplicationContext appCtx;
    @XmlElement(required = true)
    protected CustomerID customerNo;
    @XmlElement(required = true)
    protected CustomerBillingCycleInfoForUpdate customerBillingCycleInfo;

    /**
     * Obtém o valor da propriedade appCtx.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationContext }
     *     
     */
    public ApplicationContext getAppCtx() {
        return appCtx;
    }

    /**
     * Define o valor da propriedade appCtx.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationContext }
     *     
     */
    public void setAppCtx(ApplicationContext value) {
        this.appCtx = value;
    }

    /**
     * Obtém o valor da propriedade customerNo.
     * 
     * @return
     *     possible object is
     *     {@link CustomerID }
     *     
     */
    public CustomerID getCustomerNo() {
        return customerNo;
    }

    /**
     * Define o valor da propriedade customerNo.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerID }
     *     
     */
    public void setCustomerNo(CustomerID value) {
        this.customerNo = value;
    }

    /**
     * Obtém o valor da propriedade customerBillingCycleInfo.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBillingCycleInfoForUpdate }
     *     
     */
    public CustomerBillingCycleInfoForUpdate getCustomerBillingCycleInfo() {
        return customerBillingCycleInfo;
    }

    /**
     * Define o valor da propriedade customerBillingCycleInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBillingCycleInfoForUpdate }
     *     
     */
    public void setCustomerBillingCycleInfo(CustomerBillingCycleInfoForUpdate value) {
        this.customerBillingCycleInfo = value;
    }

}
