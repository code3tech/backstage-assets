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
 * <p>Classe Java de CreateContactAndIndividual complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CreateContactAndIndividual"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appCtx" type="{http://amdocs/tef-vivo/core/types/v1}ApplicationContext"/&gt;
 *         &lt;element name="contactDetails" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactForCreate"/&gt;
 *         &lt;element name="individual" type="{http://amdocs/tef-vivo/customerprofile/types/v1}IndividualForCreate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateContactAndIndividual", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "appCtx",
    "contactDetails",
    "individual"
})
public class CreateContactAndIndividual {

    @XmlElement(required = true)
    protected ApplicationContext appCtx;
    @XmlElement(required = true)
    protected ContactForCreate contactDetails;
    @XmlElement(required = true)
    protected IndividualForCreate individual;

    /**
     * Obtém o valor da propriedade appCtx.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationContext }
     *     
     */
    public ApplicationContext getAppCtx() {
        return appCtx;
    }

    /**
     * Define o valor da propriedade appCtx.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationContext }
     *     
     */
    public void setAppCtx(ApplicationContext value) {
        this.appCtx = value;
    }

    /**
     * Obtém o valor da propriedade contactDetails.
     * 
     * @return
     *     possible object is
     *     {@link ContactForCreate }
     *     
     */
    public ContactForCreate getContactDetails() {
        return contactDetails;
    }

    /**
     * Define o valor da propriedade contactDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactForCreate }
     *     
     */
    public void setContactDetails(ContactForCreate value) {
        this.contactDetails = value;
    }

    /**
     * Obtém o valor da propriedade individual.
     * 
     * @return
     *     possible object is
     *     {@link IndividualForCreate }
     *     
     */
    public IndividualForCreate getIndividual() {
        return individual;
    }

    /**
     * Define o valor da propriedade individual.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualForCreate }
     *     
     */
    public void setIndividual(IndividualForCreate value) {
        this.individual = value;
    }

}
