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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The cycles in the system. CustomerBillingCycleSpecification are instantiated as CustomerBillingCycle for each
 * billing period. For example, if the service provider runs a single cycle every day and all the cycles in the system are
 * monthly cycles then there will be 30 instances of CustomerBillingCycleSpecification in the billing system.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerbilling/types-unqualified/v1}CustomerBillingCycleSpecification,
 * Derived from PIM entity CustomerBillingCycleSpecification in the domain customerbill.
 * 
 * <p>Classe Java de CustomerBillingCycleSpecificationCode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerBillingCycleSpecificationCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cycleCode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBillingCycleSpecificationCode", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1", propOrder = {
    "cycleCode"
})
public class CustomerBillingCycleSpecificationCode {

    @XmlElement(required = true)
    protected BigDecimal cycleCode;

    /**
     * Obtém o valor da propriedade cycleCode.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCycleCode() {
        return cycleCode;
    }

    /**
     * Define o valor da propriedade cycleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCycleCode(BigDecimal value) {
        this.cycleCode = value;
    }

}
