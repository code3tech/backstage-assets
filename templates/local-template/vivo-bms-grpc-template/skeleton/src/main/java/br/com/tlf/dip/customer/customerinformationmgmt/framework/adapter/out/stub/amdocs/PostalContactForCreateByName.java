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
 * The information used to create a PostalContact.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/commonbusinessentities/types-unqualified/v1}PostalContact,
 * Derived from PIM entity PostalContact in the domain party.
 * 
 * <p>Classe Java de PostalContactForCreateByName complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PostalContactForCreateByName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactMediumForCreateByName"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="physicalLocation" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}GeographicAddressID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalContactForCreateByName", propOrder = {
    "physicalLocation"
})
public class PostalContactForCreateByName
    extends ContactMediumForCreateByName
{

    @XmlElement(required = true)
    protected GeographicAddressID physicalLocation;

    /**
     * Obtém o valor da propriedade physicalLocation.
     * 
     * @return
     *     possible object is
     *     {@link GeographicAddressID }
     *     
     */
    public GeographicAddressID getPhysicalLocation() {
        return physicalLocation;
    }

    /**
     * Define o valor da propriedade physicalLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicAddressID }
     *     
     */
    public void setPhysicalLocation(GeographicAddressID value) {
        this.physicalLocation = value;
    }

}
