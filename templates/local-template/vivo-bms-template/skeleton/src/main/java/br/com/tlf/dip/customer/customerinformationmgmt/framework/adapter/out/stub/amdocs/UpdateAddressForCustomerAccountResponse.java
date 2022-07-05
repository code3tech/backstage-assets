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
 * <p>Classe Java de UpdateAddressForCustomerAccountResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateAddressForCustomerAccountResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="involvementID" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}PartyRoleCustomerAccountInvolvementID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateAddressForCustomerAccountResponse", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "involvementID"
})
public class UpdateAddressForCustomerAccountResponse {

    protected PartyRoleCustomerAccountInvolvementID involvementID;

    /**
     * Obtém o valor da propriedade involvementID.
     * 
     * @return
     *     possible object is
     *     {@link PartyRoleCustomerAccountInvolvementID }
     *     
     */
    public PartyRoleCustomerAccountInvolvementID getInvolvementID() {
        return involvementID;
    }

    /**
     * Define o valor da propriedade involvementID.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRoleCustomerAccountInvolvementID }
     *     
     */
    public void setInvolvementID(PartyRoleCustomerAccountInvolvementID value) {
        this.involvementID = value;
    }

}
