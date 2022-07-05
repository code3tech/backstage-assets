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
 * The aggregation of AppliedCreditRates to be credited on the same CustomerInvoice. CustomerCreditNote is created in
 * draft status, while draft AppliedCreditRates can be associated with or removed from it. Upon finalization a
 * CustomerInvoice is created for the CustomerCreditNote and AppliedCreditRates can no longer be added to it or removed
 * from it.
 * :
 * Derived from PIM entity CustomerCreditNote in the domain customerbill.
 * 
 * <p>Classe Java de CustomerCreditNoteNumber complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerCreditNoteNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/customerbilling-common/types/v1}AbstractCustomerInvoiceForCreditNoteNumber"&gt;
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
@XmlType(name = "CustomerCreditNoteNumber", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1")
public class CustomerCreditNoteNumber
    extends AbstractCustomerInvoiceForCreditNoteNumber
{


}
