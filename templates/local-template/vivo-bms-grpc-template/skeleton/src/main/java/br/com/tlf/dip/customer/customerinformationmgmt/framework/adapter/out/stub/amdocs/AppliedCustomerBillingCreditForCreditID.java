//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An amount of money which the CustomerAccount is credited for. It may result from an applied discount, one time credit,
 * or received from a third party.
 * :
 * Derived from PIM entity AppliedCustomerBillingCredit in the domain appliedcustomerbillingrate.
 * 
 * <p>Classe Java de AppliedCustomerBillingCreditForCreditID complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AppliedCustomerBillingCreditForCreditID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/customerbilling-common/types/v1}AppliedCustomerBillingRateForCreditID"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppliedCustomerBillingCreditForCreditID", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1")
@XmlSeeAlso({
    AppliedCreditRateID.class
})
public abstract class AppliedCustomerBillingCreditForCreditID
    extends AppliedCustomerBillingRateForCreditID
{


}
