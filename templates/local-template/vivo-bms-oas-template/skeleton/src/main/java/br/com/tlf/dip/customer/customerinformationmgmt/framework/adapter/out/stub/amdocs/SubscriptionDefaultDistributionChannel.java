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
 * The default CustomerBillSpec that pays for all the charges of a Subscription. Any charge that was not distributed to
 * other CustomerBillSpec will be distributed to this one.
 * :
 * Derived from PIM entity SubscriptionDefaultDistribution in the domain customerpriceagreement.
 * 
 * <p>Classe Java de SubscriptionDefaultDistributionChannel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionDefaultDistributionChannel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="payChannel" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}PayChannelID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionDefaultDistributionChannel", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1", propOrder = {
    "payChannel"
})
public class SubscriptionDefaultDistributionChannel {

    protected PayChannelID payChannel;

    /**
     * Obtém o valor da propriedade payChannel.
     * 
     * @return
     *     possible object is
     *     {@link PayChannelID }
     *     
     */
    public PayChannelID getPayChannel() {
        return payChannel;
    }

    /**
     * Define o valor da propriedade payChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link PayChannelID }
     *     
     */
    public void setPayChannel(PayChannelID value) {
        this.payChannel = value;
    }

}
