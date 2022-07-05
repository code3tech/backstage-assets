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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java de RetrieveCustomerDetails complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveCustomerDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appCtx" type="{http://amdocs/tef-vivo/core/types/v1}ApplicationContext"/&gt;
 *         &lt;element name="customerIdentification" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}CustomerIdentification"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveCustomerDetails", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "appCtx",
    "customerIdentification"
})
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "retrieveCustomerDetails", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
public class RetrieveCustomerDetails {

    @XmlElement(required = true)
    protected ApplicationContext appCtx;
    @XmlElement(required = true)
    protected CustomerIdentification customerIdentification;

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
     * Obtém o valor da propriedade customerIdentification.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentification }
     *     
     */
    public CustomerIdentification getCustomerIdentification() {
        return customerIdentification;
    }

    /**
     * Define o valor da propriedade customerIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentification }
     *     
     */
    public void setCustomerIdentification(CustomerIdentification value) {
        this.customerIdentification = value;
    }

}
