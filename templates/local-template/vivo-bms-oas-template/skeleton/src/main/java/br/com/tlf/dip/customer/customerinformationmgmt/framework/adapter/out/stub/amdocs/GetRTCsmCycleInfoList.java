//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The operation retrieves the RT CSM Cycle of given customer type.
 * 
 * <p>Classe Java de GetRTCsmCycleInfoList complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GetRTCsmCycleInfoList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appCtx" type="{http://amdocs/tef-vivo/core/types/v1}ApplicationContext" minOccurs="0"/&gt;
 *         &lt;element name="customerTypeAndSubType" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}CustomerTypeAndSubType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRTCsmCycleInfoList", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "appCtx",
    "customerTypeAndSubType"
})
public class GetRTCsmCycleInfoList {

    protected ApplicationContext appCtx;
    protected CustomerTypeAndSubType customerTypeAndSubType;

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
     * Obtém o valor da propriedade customerTypeAndSubType.
     * 
     * @return
     *     possible object is
     *     {@link CustomerTypeAndSubType }
     *     
     */
    public CustomerTypeAndSubType getCustomerTypeAndSubType() {
        return customerTypeAndSubType;
    }

    /**
     * Define o valor da propriedade customerTypeAndSubType.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerTypeAndSubType }
     *     
     */
    public void setCustomerTypeAndSubType(CustomerTypeAndSubType value) {
        this.customerTypeAndSubType = value;
    }

}
