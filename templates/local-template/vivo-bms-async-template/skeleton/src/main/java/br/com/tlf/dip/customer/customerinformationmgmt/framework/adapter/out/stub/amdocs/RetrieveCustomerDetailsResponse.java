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

import lombok.Data;


/**
 * <p>Classe Java de RetrieveCustomerDetailsResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveCustomerDetailsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerDetail" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}CustomerDetails" minOccurs="0"/&gt;
 *         &lt;element name="individualDetail" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}IndividualDetails" minOccurs="0"/&gt;
 *         &lt;element name="organizationInfo" type="{http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1}OrganizationDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveCustomerDetailsResponse", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "customerDetail",
    "individualDetail",
    "organizationInfo"
})
@Data
public class RetrieveCustomerDetailsResponse {

    protected CustomerDetails customerDetail;
    protected IndividualDetails individualDetail;
    protected OrganizationDetails organizationInfo;

    /**
     * Obtém o valor da propriedade customerDetail.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDetails }
     *     
     */
    public CustomerDetails getCustomerDetail() {
        return customerDetail;
    }

    /**
     * Define o valor da propriedade customerDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDetails }
     *     
     */
    public void setCustomerDetail(CustomerDetails value) {
        this.customerDetail = value;
    }

    /**
     * Obtém o valor da propriedade individualDetail.
     * 
     * @return
     *     possible object is
     *     {@link IndividualDetails }
     *     
     */
    public IndividualDetails getIndividualDetail() {
        return individualDetail;
    }

    /**
     * Define o valor da propriedade individualDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualDetails }
     *     
     */
    public void setIndividualDetail(IndividualDetails value) {
        this.individualDetail = value;
    }

    /**
     * Obtém o valor da propriedade organizationInfo.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDetails }
     *     
     */
    public OrganizationDetails getOrganizationInfo() {
        return organizationInfo;
    }

    /**
     * Define o valor da propriedade organizationInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDetails }
     *     
     */
    public void setOrganizationInfo(OrganizationDetails value) {
        this.organizationInfo = value;
    }

}
