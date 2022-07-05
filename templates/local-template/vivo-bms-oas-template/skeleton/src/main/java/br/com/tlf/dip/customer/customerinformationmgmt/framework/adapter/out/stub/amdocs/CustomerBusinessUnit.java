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
 * The role played by an Individual or Organization in a business relationship with the service provider in which they
 * intend to buy, buy, or receive products or services from the service provider, and therefore incur and are liable for
 * the charges entailed by those products or services. It is also the role played by an Individual or Organization who
 * only pay for products or services that other Individuals or Organizations buy or receive.
 * :
 * Derived from PIM entity Customer in the domain customer.
 * 
 * <p>Classe Java de CustomerBusinessUnit complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerBusinessUnit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}PartyRole"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessOrganizationUnit" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}BusinessOrganizationUnitID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBusinessUnit", namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1", propOrder = {
    "businessOrganizationUnit"
})
public class CustomerBusinessUnit
    extends PartyRole3
{

    protected BusinessOrganizationUnitID businessOrganizationUnit;

    /**
     * Obtém o valor da propriedade businessOrganizationUnit.
     * 
     * @return
     *     possible object is
     *     {@link BusinessOrganizationUnitID }
     *     
     */
    public BusinessOrganizationUnitID getBusinessOrganizationUnit() {
        return businessOrganizationUnit;
    }

    /**
     * Define o valor da propriedade businessOrganizationUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessOrganizationUnitID }
     *     
     */
    public void setBusinessOrganizationUnit(BusinessOrganizationUnitID value) {
        this.businessOrganizationUnit = value;
    }

}
