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
import javax.xml.bind.annotation.XmlType;


/**
 * An instance of CustomerBillingCycleInfoForUpdate.
 * 
 * <p>Classe Java de CustomerBillingCycleInfoForUpdate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerBillingCycleInfoForUpdate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="billCycleNo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cycleProductionFrequency" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBillingCycleInfoForUpdate", propOrder = {
    "billCycleNo",
    "cycleProductionFrequency"
})
public class CustomerBillingCycleInfoForUpdate {

    protected BigDecimal billCycleNo;
    protected BigDecimal cycleProductionFrequency;

    /**
     * Obtém o valor da propriedade billCycleNo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillCycleNo() {
        return billCycleNo;
    }

    /**
     * Define o valor da propriedade billCycleNo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillCycleNo(BigDecimal value) {
        this.billCycleNo = value;
    }

    /**
     * Obtém o valor da propriedade cycleProductionFrequency.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCycleProductionFrequency() {
        return cycleProductionFrequency;
    }

    /**
     * Define o valor da propriedade cycleProductionFrequency.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCycleProductionFrequency(BigDecimal value) {
        this.cycleProductionFrequency = value;
    }

}
