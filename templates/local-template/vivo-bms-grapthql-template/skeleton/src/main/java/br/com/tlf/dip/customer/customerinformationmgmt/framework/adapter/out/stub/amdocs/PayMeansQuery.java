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
 * The available filters for searching pay means. Either an Individual or Organization identifier must be specified.
 * :
 * 
 * <p>Classe Java de PayMeansQuery complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PayMeansQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="individual" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualAllID" minOccurs="0"/&gt;
 *         &lt;element name="organization" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}OrganizationAllID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayMeansQuery", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "individual",
    "organization"
})
public class PayMeansQuery {

    protected IndividualAllID individual;
    protected OrganizationAllID organization;

    /**
     * Obtém o valor da propriedade individual.
     * 
     * @return
     *     possible object is
     *     {@link IndividualAllID }
     *     
     */
    public IndividualAllID getIndividual() {
        return individual;
    }

    /**
     * Define o valor da propriedade individual.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualAllID }
     *     
     */
    public void setIndividual(IndividualAllID value) {
        this.individual = value;
    }

    /**
     * Obtém o valor da propriedade organization.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationAllID }
     *     
     */
    public OrganizationAllID getOrganization() {
        return organization;
    }

    /**
     * Define o valor da propriedade organization.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationAllID }
     *     
     */
    public void setOrganization(OrganizationAllID value) {
        this.organization = value;
    }

}
