//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CreateContactAndIndividualByName complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CreateContactAndIndividualByName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appCtx" type="{http://amdocs/tef-vivo/core/types/v1}ApplicationContext"/&gt;
 *         &lt;element name="contactMediums"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="contactMedium" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactMediumForCreateByName" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="individual" type="{http://amdocs/tef-vivo/customerprofile/types/v1}IndividualForCreateByName"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateContactAndIndividualByName", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "appCtx",
    "contactMediums",
    "individual"
})
public class CreateContactAndIndividualByName {

    @XmlElement(required = true)
    protected ApplicationContext appCtx;
    @XmlElement(required = true)
    protected CreateContactAndIndividualByName.ContactMediums contactMediums;
    @XmlElement(required = true)
    protected IndividualForCreateByName individual;

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
     * Obtém o valor da propriedade contactMediums.
     * 
     * @return
     *     possible object is
     *     {@link CreateContactAndIndividualByName.ContactMediums }
     *     
     */
    public CreateContactAndIndividualByName.ContactMediums getContactMediums() {
        return contactMediums;
    }

    /**
     * Define o valor da propriedade contactMediums.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateContactAndIndividualByName.ContactMediums }
     *     
     */
    public void setContactMediums(CreateContactAndIndividualByName.ContactMediums value) {
        this.contactMediums = value;
    }

    /**
     * Obtém o valor da propriedade individual.
     * 
     * @return
     *     possible object is
     *     {@link IndividualForCreateByName }
     *     
     */
    public IndividualForCreateByName getIndividual() {
        return individual;
    }

    /**
     * Define o valor da propriedade individual.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualForCreateByName }
     *     
     */
    public void setIndividual(IndividualForCreateByName value) {
        this.individual = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="contactMedium" type="{http://amdocs/tef-vivo/customerprofile/types/v1}ContactMediumForCreateByName" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contactMedium"
    })
    public static class ContactMediums {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", required = true)
        protected List<ContactMediumForCreateByName> contactMedium;

        /**
         * Gets the value of the contactMedium property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contactMedium property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContactMedium().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactMediumForCreateByName }
         * 
         * 
         */
        public List<ContactMediumForCreateByName> getContactMedium() {
            if (contactMedium == null) {
                contactMedium = new ArrayList<ContactMediumForCreateByName>();
            }
            return this.contactMedium;
        }

    }

}
