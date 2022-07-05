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
 * <p>Classe Java de CreateContactAndIndividualByNameResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CreateContactAndIndividualByNameResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="individualID" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}IndividualOnlyID" minOccurs="0"/&gt;
 *         &lt;element name="matchingIndividuals" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="matchingIndividual" type="{http://amdocs/tef-vivo/customerprofile/types/v1}IndividualSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateContactAndIndividualByNameResponse", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "individualID",
    "matchingIndividuals"
})
public class CreateContactAndIndividualByNameResponse {

    protected IndividualOnlyID individualID;
    protected CreateContactAndIndividualByNameResponse.MatchingIndividuals matchingIndividuals;

    /**
     * Obtém o valor da propriedade individualID.
     * 
     * @return
     *     possible object is
     *     {@link IndividualOnlyID }
     *     
     */
    public IndividualOnlyID getIndividualID() {
        return individualID;
    }

    /**
     * Define o valor da propriedade individualID.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualOnlyID }
     *     
     */
    public void setIndividualID(IndividualOnlyID value) {
        this.individualID = value;
    }

    /**
     * Obtém o valor da propriedade matchingIndividuals.
     * 
     * @return
     *     possible object is
     *     {@link CreateContactAndIndividualByNameResponse.MatchingIndividuals }
     *     
     */
    public CreateContactAndIndividualByNameResponse.MatchingIndividuals getMatchingIndividuals() {
        return matchingIndividuals;
    }

    /**
     * Define o valor da propriedade matchingIndividuals.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateContactAndIndividualByNameResponse.MatchingIndividuals }
     *     
     */
    public void setMatchingIndividuals(CreateContactAndIndividualByNameResponse.MatchingIndividuals value) {
        this.matchingIndividuals = value;
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
     *         &lt;element name="matchingIndividual" type="{http://amdocs/tef-vivo/customerprofile/types/v1}IndividualSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "matchingIndividual"
    })
    public static class MatchingIndividuals {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<IndividualSummary> matchingIndividual;

        /**
         * Gets the value of the matchingIndividual property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the matchingIndividual property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMatchingIndividual().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IndividualSummary }
         * 
         * 
         */
        public List<IndividualSummary> getMatchingIndividual() {
            if (matchingIndividual == null) {
                matchingIndividual = new ArrayList<IndividualSummary>();
            }
            return this.matchingIndividual;
        }

    }

}
