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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The specification for a periodical document that is rendered to a Customer. The document lists charges and usually
 * requires remittance.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerprofile/types-unqualified/v1}CustomerBillSpec,
 * Derived from PIM entity CustomerBillSpec in the domain customer.
 * 
 * <p>Classe Java de CustomerBillSpecForCreate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerBillSpecForCreate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="payInstruction" type="{http://amdocs/tef-vivo/customerprofile/types/v1}PayInstructionForCreate"/&gt;
 *         &lt;element name="produceDocument" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}ProduceDocument" minOccurs="0"/&gt;
 *         &lt;element name="taxPresentment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean"&gt;
 *               &lt;pattern value="false|true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBillSpecForCreate", propOrder = {
    "name",
    "payInstruction",
    "produceDocument",
    "taxPresentment"
})
public class CustomerBillSpecForCreate {

    protected String name;
    @XmlElement(required = true)
    protected PayInstructionForCreate payInstruction;
    @XmlSchemaType(name = "string")
    protected ProduceDocument produceDocument;
    protected Boolean taxPresentment;

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade payInstruction.
     * 
     * @return
     *     possible object is
     *     {@link PayInstructionForCreate }
     *     
     */
    public PayInstructionForCreate getPayInstruction() {
        return payInstruction;
    }

    /**
     * Define o valor da propriedade payInstruction.
     * 
     * @param value
     *     allowed object is
     *     {@link PayInstructionForCreate }
     *     
     */
    public void setPayInstruction(PayInstructionForCreate value) {
        this.payInstruction = value;
    }

    /**
     * Obtém o valor da propriedade produceDocument.
     * 
     * @return
     *     possible object is
     *     {@link ProduceDocument }
     *     
     */
    public ProduceDocument getProduceDocument() {
        return produceDocument;
    }

    /**
     * Define o valor da propriedade produceDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link ProduceDocument }
     *     
     */
    public void setProduceDocument(ProduceDocument value) {
        this.produceDocument = value;
    }

    /**
     * Obtém o valor da propriedade taxPresentment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxPresentment() {
        return taxPresentment;
    }

    /**
     * Define o valor da propriedade taxPresentment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxPresentment(Boolean value) {
        this.taxPresentment = value;
    }

}
