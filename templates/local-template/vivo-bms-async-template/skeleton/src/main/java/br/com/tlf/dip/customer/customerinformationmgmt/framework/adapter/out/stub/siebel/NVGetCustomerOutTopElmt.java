//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:52:08 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.siebel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NVGetCustomerOutTopElmt complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NVGetCustomerOutTopElmt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NVGetCustomerOut" type="{http://www.siebel.com/xml/NVGetCustomerOut}NVGetCustomerOut"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NVGetCustomerOutTopElmt", propOrder = {
    "nvGetCustomerOut"
})
public class NVGetCustomerOutTopElmt {

    @XmlElement(name = "NVGetCustomerOut", required = true)
    protected NVGetCustomerOut nvGetCustomerOut;

    /**
     * Obtém o valor da propriedade nvGetCustomerOut.
     * 
     * @return
     *     possible object is
     *     {@link NVGetCustomerOut }
     *     
     */
    public NVGetCustomerOut getNVGetCustomerOut() {
        return nvGetCustomerOut;
    }

    /**
     * Define o valor da propriedade nvGetCustomerOut.
     * 
     * @param value
     *     allowed object is
     *     {@link NVGetCustomerOut }
     *     
     */
    public void setNVGetCustomerOut(NVGetCustomerOut value) {
        this.nvGetCustomerOut = value;
    }

}
