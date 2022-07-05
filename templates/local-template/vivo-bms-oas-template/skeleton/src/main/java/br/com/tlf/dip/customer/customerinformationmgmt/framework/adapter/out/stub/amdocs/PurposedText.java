//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Text (names, descriptions, etc.) that has a particular purpose, for example Marketing, Technical, etc.
 * :
 * Derived from PIM entity PurposedText in the domain purposedtext.
 * 
 * <p>Classe Java de PurposedText complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PurposedText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="text" type="{http://amdocs/tef-vivo/core/types/v1}BinaryObject" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}TextPurpose" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurposedText", namespace = "http://amdocs/tef-vivo/commonbusinessentities-common/types/v1", propOrder = {
    "text",
    "type"
})
public class PurposedText {

    protected BinaryObject text;
    @XmlSchemaType(name = "string")
    protected TextPurpose type;

    /**
     * Obtém o valor da propriedade text.
     * 
     * @return
     *     possible object is
     *     {@link BinaryObject }
     *     
     */
    public BinaryObject getText() {
        return text;
    }

    /**
     * Define o valor da propriedade text.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryObject }
     *     
     */
    public void setText(BinaryObject value) {
        this.text = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link TextPurpose }
     *     
     */
    public TextPurpose getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link TextPurpose }
     *     
     */
    public void setType(TextPurpose value) {
        this.type = value;
    }

}
