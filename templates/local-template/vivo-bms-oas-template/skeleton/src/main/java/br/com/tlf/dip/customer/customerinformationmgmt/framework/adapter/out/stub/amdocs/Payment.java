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
 * A transaction that adds money to the CustomerAccount balance.
 * :
 * Derived from PIM entity Payment in the domain customeraccountactivities.
 * 
 * <p>Classe Java de Payment complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Payment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/resource-common/types/v1}FinancialTransaction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentReservationID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment", namespace = "http://amdocs/tef-vivo/resource-common/types/v1", propOrder = {
    "paymentReservationID"
})
public class Payment
    extends FinancialTransaction
{

    protected String paymentReservationID;

    /**
     * Obtém o valor da propriedade paymentReservationID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentReservationID() {
        return paymentReservationID;
    }

    /**
     * Define o valor da propriedade paymentReservationID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentReservationID(String value) {
        this.paymentReservationID = value;
    }

}
