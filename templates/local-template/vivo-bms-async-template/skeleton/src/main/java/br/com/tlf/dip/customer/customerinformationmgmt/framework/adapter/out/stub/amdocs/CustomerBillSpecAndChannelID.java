//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Derived from PIM entity CustomerBillSpec in the domain customer.:
 * Restriction of {http://amdocs/pbg-portfolio/customerprofile/types-unqualified/v1}CustomerBillSpec,
 * Derived from PIM entity CustomerBillSpec in the domain customer.
 * 
 * <p>Classe Java de CustomerBillSpecAndChannelID complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerBillSpecAndChannelID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="payInstruction" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}PayInstructionID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBillSpecAndChannelID", namespace = "http://amdocs/tef-vivo/customerprofile-common/types/v1", propOrder = {
    "id",
    "payInstruction"
})
public class CustomerBillSpecAndChannelID {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected PayInstructionID payInstruction;

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade payInstruction.
     * 
     * @return
     *     possible object is
     *     {@link PayInstructionID }
     *     
     */
    public PayInstructionID getPayInstruction() {
        return payInstruction;
    }

    /**
     * Define o valor da propriedade payInstruction.
     * 
     * @param value
     *     allowed object is
     *     {@link PayInstructionID }
     *     
     */
    public void setPayInstruction(PayInstructionID value) {
        this.payInstruction = value;
    }

}
