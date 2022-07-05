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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The part played by a Party in a given context with any characteristics, such as expected pattern of behavior,
 * attributes, and/or associations that it entails. PartyRole is an abstract concept that should be used in places where
 * the business refers to a Party playing a Role.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/commonbusinessentities/types-unqualified/v1}PartyRole,
 * Derived from PIM entity PartyRole in the domain party.
 * 
 * <p>Classe Java de IndividualCustomerPartyRoleForCreate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IndividualCustomerPartyRoleForCreate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="party" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}PartyIndividualID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualCustomerPartyRoleForCreate", propOrder = {
    "party"
})
@XmlSeeAlso({
    IndividualCustomerForCreate.class
})
public abstract class IndividualCustomerPartyRoleForCreate {

    @XmlElement(required = true)
    protected PartyIndividualID party;

    /**
     * Obtém o valor da propriedade party.
     * 
     * @return
     *     possible object is
     *     {@link PartyIndividualID }
     *     
     */
    public PartyIndividualID getParty() {
        return party;
    }

    /**
     * Define o valor da propriedade party.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIndividualID }
     *     
     */
    public void setParty(PartyIndividualID value) {
        this.party = value;
    }

}
