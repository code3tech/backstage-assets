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
 * The periodic document produced for CustomerInvoiceReceiver is CustomerInvoice, which includes the new
 * AppliedCustomerBillingRates of the CustomerBillSpec. The document type is INVOICE_RECEIVER.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerprofile/types-unqualified/v1}CustomerInvoiceReceiver,
 * Derived from PIM entity CustomerInvoiceReceiver in the domain customer.
 * 
 * <p>Classe Java de CustomerInvoiceReceiver complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerInvoiceReceiver"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}CustomerBillSpecForRetrieve"&gt;
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
@XmlType(name = "CustomerInvoiceReceiver", namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1")
public class CustomerInvoiceReceiver
    extends CustomerBillSpecForRetrieve
{


}
