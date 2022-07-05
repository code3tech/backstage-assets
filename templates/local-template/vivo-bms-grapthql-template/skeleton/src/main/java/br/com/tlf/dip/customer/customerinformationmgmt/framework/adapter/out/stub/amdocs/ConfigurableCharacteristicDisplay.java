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
 * A characteristic that may have its value set during the ordering or some other process. For example: e-mail address,
 * mailbox size, voice line number, spending limit.
 * :
 * Derived from PIM entity ConfigurableCharacteristic in the domain characteristicvalue.
 * 
 * <p>Classe Java de ConfigurableCharacteristicDisplay complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ConfigurableCharacteristicDisplay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/productcatalog-common/types/v1}CharacteristicForDisplay"&gt;
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
@XmlType(name = "ConfigurableCharacteristicDisplay", namespace = "http://amdocs/tef-vivo/productcatalog-common/types/v1")
@XmlSeeAlso({
    ProductSpecCharacteristicDisplay.class
})
public abstract class ConfigurableCharacteristicDisplay
    extends CharacteristicForDisplay
{


}
