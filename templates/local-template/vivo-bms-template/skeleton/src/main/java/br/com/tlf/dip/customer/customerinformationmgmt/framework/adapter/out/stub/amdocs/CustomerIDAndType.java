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
 * Restriction of {http://amdocs/pbg-portfolio/commonbusinessentities/types-unqualified/v1}Customer,
 * Derived from PIM entity Customer in the domain customer.
 * 
 * <p>Classe Java de CustomerIDAndType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerIDAndType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}PartyRoleForCustomer"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerBillingProfile" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}CustomerBillingProfileID" minOccurs="0"/&gt;
 *         &lt;element name="externalID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="type" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerIDAndType", namespace = "http://amdocs/tef-vivo/billingaccountmanagement/types/v1", propOrder = {
    "customerBillingProfile",
    "externalID",
    "type"
})
public class CustomerIDAndType
    extends PartyRoleForCustomer
{

    protected CustomerBillingProfileID customerBillingProfile;
    protected String externalID;
    protected String type;

    /**
     * Obtém o valor da propriedade customerBillingProfile.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBillingProfileID }
     *     
     */
    public CustomerBillingProfileID getCustomerBillingProfile() {
        return customerBillingProfile;
    }

    /**
     * Define o valor da propriedade customerBillingProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBillingProfileID }
     *     
     */
    public void setCustomerBillingProfile(CustomerBillingProfileID value) {
        this.customerBillingProfile = value;
    }

    /**
     * Obtém o valor da propriedade externalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalID() {
        return externalID;
    }

    /**
     * Define o valor da propriedade externalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalID(String value) {
        this.externalID = value;
    }

    /**
     * Obtém o valor da propriedade type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define o valor da propriedade type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
