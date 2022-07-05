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
 * Details of the Individual.
 * 
 * <p>Classe Java de IndividualDetails complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IndividualDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://amdocs/tef-vivo/customerprofile/types/v1}GeographicAddress" minOccurs="0"/&gt;
 *         &lt;element name="individual" type="{http://amdocs/tef-vivo/customerprofile/types/v1}Individual" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualDetails", propOrder = {
    "address",
    "individual"
})
public class IndividualDetails2 {

    protected GeographicAddress2 address;
    protected Individual2 individual;

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link GeographicAddress2 }
     *     
     */
    public GeographicAddress2 getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicAddress2 }
     *     
     */
    public void setAddress(GeographicAddress2 value) {
        this.address = value;
    }

    /**
     * Obtém o valor da propriedade individual.
     * 
     * @return
     *     possible object is
     *     {@link Individual2 }
     *     
     */
    public Individual2 getIndividual() {
        return individual;
    }

    /**
     * Define o valor da propriedade individual.
     * 
     * @param value
     *     allowed object is
     *     {@link Individual2 }
     *     
     */
    public void setIndividual(Individual2 value) {
        this.individual = value;
    }

}
