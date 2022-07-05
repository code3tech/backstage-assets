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
 * An instance of a logical resource, such as telephone number 09-7761333, e-mail address info@amdocs.com, URL http://www.
 * amdocs.com . It may also represent multiple instances of consecutive values where this is relevant for the value type,
 * such as a range of consecutive telephone numbers.
 * :
 * Derived from PIM entity LogicalResource in the domain logicalresource.
 * 
 * <p>Classe Java de LogicalResource complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LogicalResource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/resource-common/types/v1}Resource"&gt;
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
@XmlType(name = "LogicalResource", namespace = "http://amdocs/tef-vivo/resource-common/types/v1")
@XmlSeeAlso({
    TelephoneNumberResource.class
})
public abstract class LogicalResource
    extends Resource
{


}
