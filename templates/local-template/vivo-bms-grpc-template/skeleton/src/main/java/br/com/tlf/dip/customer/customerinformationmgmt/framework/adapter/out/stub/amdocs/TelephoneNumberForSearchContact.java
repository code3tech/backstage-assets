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
 * A telephone number used to contact the Contact.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/commonbusinessentities/types-unqualified/v1}TelephoneNumber,
 * Derived from PIM entity TelephoneNumber in the domain party.
 * 
 * <p>Classe Java de TelephoneNumberForSearchContact complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TelephoneNumberForSearchContact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactMediumForSearchContact"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="number" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="63"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="type" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}TelephoneType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneNumberForSearchContact", propOrder = {
    "number",
    "type"
})
public class TelephoneNumberForSearchContact
    extends ContactMediumForSearchContact
{

    protected String number;
    @XmlSchemaType(name = "string")
    protected TelephoneType type;

    /**
     * Obtém o valor da propriedade number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Define o valor da propriedade number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneType }
     *     
     */
    public TelephoneType getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneType }
     *     
     */
    public void setType(TelephoneType value) {
        this.type = value;
    }

}
