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
import javax.xml.bind.annotation.XmlType;


/**
 * The specification for a periodical document that is rendered to a Customer. The document lists charges and usually
 * requires remittance.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerprofile/types-unqualified/v1}CustomerBillSpec,
 * Derived from PIM entity CustomerBillSpec in the domain customer.
 * 
 * <p>Classe Java de CustomerBillSpecForInvolvement complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerBillSpecForInvolvement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="partyRoleInvolvements" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="partyRoleInvolvement" type="{http://amdocs/tef-vivo/customerprofile/types/v1}PartyRoleCustomerBillSpecInvolvement" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerBillSpecForInvolvement", propOrder = {
    "id",
    "partyRoleInvolvements"
})
public class CustomerBillSpecForInvolvement {

    protected String id;
    protected CustomerBillSpecForInvolvement.PartyRoleInvolvements partyRoleInvolvements;

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade partyRoleInvolvements.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBillSpecForInvolvement.PartyRoleInvolvements }
     *     
     */
    public CustomerBillSpecForInvolvement.PartyRoleInvolvements getPartyRoleInvolvements() {
        return partyRoleInvolvements;
    }

    /**
     * Define o valor da propriedade partyRoleInvolvements.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBillSpecForInvolvement.PartyRoleInvolvements }
     *     
     */
    public void setPartyRoleInvolvements(CustomerBillSpecForInvolvement.PartyRoleInvolvements value) {
        this.partyRoleInvolvements = value;
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
     *         &lt;element name="partyRoleInvolvement" type="{http://amdocs/tef-vivo/customerprofile/types/v1}PartyRoleCustomerBillSpecInvolvement" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "partyRoleInvolvement"
    })
    public static class PartyRoleInvolvements {

        protected List<PartyRoleCustomerBillSpecInvolvement> partyRoleInvolvement;

        /**
         * Gets the value of the partyRoleInvolvement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the partyRoleInvolvement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPartyRoleInvolvement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PartyRoleCustomerBillSpecInvolvement }
         * 
         * 
         */
        public List<PartyRoleCustomerBillSpecInvolvement> getPartyRoleInvolvement() {
            if (partyRoleInvolvement == null) {
                partyRoleInvolvement = new ArrayList<PartyRoleCustomerBillSpecInvolvement>();
            }
            return this.partyRoleInvolvement;
        }

    }

}
