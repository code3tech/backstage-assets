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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


/**
 * <p>Classe Java de CustomerIdentification complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerIdentification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="individualIdentification" type="{http://amdocs/tef-vivo/billingaccountmanagement/types/v1}NationalIdentityCardIdentification" minOccurs="0"/&gt;
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organizationIdentification" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}OrganizationOnlyID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerIdentification", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "individualIdentification",
    "msisdn",
    "organizationIdentification"
})
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerIdentification {

    protected NationalIdentityCardIdentification3 individualIdentification;
    protected String msisdn;
    protected OrganizationOnlyID organizationIdentification;

    /**
     * Obtém o valor da propriedade individualIdentification.
     * 
     * @return
     *     possible object is
     *     {@link NationalIdentityCardIdentification3 }
     *     
     */
    public NationalIdentityCardIdentification3 getIndividualIdentification() {
        return individualIdentification;
    }

    /**
     * Define o valor da propriedade individualIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalIdentityCardIdentification3 }
     *     
     */
    public void setIndividualIdentification(NationalIdentityCardIdentification3 value) {
        this.individualIdentification = value;
    }

    /**
     * Obtém o valor da propriedade msisdn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Define o valor da propriedade msisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Obtém o valor da propriedade organizationIdentification.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationOnlyID }
     *     
     */
    public OrganizationOnlyID getOrganizationIdentification() {
        return organizationIdentification;
    }

    /**
     * Define o valor da propriedade organizationIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationOnlyID }
     *     
     */
    public void setOrganizationIdentification(OrganizationOnlyID value) {
        this.organizationIdentification = value;
    }

}
