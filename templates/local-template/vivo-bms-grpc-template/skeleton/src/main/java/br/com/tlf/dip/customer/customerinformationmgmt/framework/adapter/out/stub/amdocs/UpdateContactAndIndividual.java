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
 * <p>Classe Java de UpdateContactAndIndividual complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateContactAndIndividual"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appCtx" type="{http://amdocs/tef-vivo/core/types/v1}ApplicationContext" minOccurs="0"/&gt;
 *         &lt;element name="contact" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactForUpdate" minOccurs="0"/&gt;
 *         &lt;element name="individual" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualAllID"/&gt;
 *         &lt;element name="individualDetails" type="{http://amdocs/tef-vivo/customerprofile/types/v1}IndividualForUpdate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateContactAndIndividual", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "appCtx",
    "contact",
    "individual",
    "individualDetails"
})
public class UpdateContactAndIndividual {

    protected ApplicationContext appCtx;
    protected ContactForUpdate contact;
    @XmlElement(required = true)
    protected IndividualAllID individual;
    protected IndividualForUpdate individualDetails;

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
     * Obtém o valor da propriedade contact.
     * 
     * @return
     *     possible object is
     *     {@link ContactForUpdate }
     *     
     */
    public ContactForUpdate getContact() {
        return contact;
    }

    /**
     * Define o valor da propriedade contact.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactForUpdate }
     *     
     */
    public void setContact(ContactForUpdate value) {
        this.contact = value;
    }

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
     * Obtém o valor da propriedade individualDetails.
     * 
     * @return
     *     possible object is
     *     {@link IndividualForUpdate }
     *     
     */
    public IndividualForUpdate getIndividualDetails() {
        return individualDetails;
    }

    /**
     * Define o valor da propriedade individualDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualForUpdate }
     *     
     */
    public void setIndividualDetails(IndividualForUpdate value) {
        this.individualDetails = value;
    }

}
