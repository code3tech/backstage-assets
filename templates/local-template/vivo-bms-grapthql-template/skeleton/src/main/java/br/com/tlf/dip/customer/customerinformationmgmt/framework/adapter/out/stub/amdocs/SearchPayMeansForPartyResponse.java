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
 * <p>Classe Java de SearchPayMeansForPartyResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SearchPayMeansForPartyResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bankAccounts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="bankAccount" type="{http://amdocs/tef-vivo/customerprofile/types/v1}BankAccountSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cards" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="card" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CardSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "SearchPayMeansForPartyResponse", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "bankAccounts",
    "cards"
})
public class SearchPayMeansForPartyResponse {

    protected SearchPayMeansForPartyResponse.BankAccounts bankAccounts;
    protected SearchPayMeansForPartyResponse.Cards cards;

    /**
     * Obtém o valor da propriedade bankAccounts.
     * 
     * @return
     *     possible object is
     *     {@link SearchPayMeansForPartyResponse.BankAccounts }
     *     
     */
    public SearchPayMeansForPartyResponse.BankAccounts getBankAccounts() {
        return bankAccounts;
    }

    /**
     * Define o valor da propriedade bankAccounts.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPayMeansForPartyResponse.BankAccounts }
     *     
     */
    public void setBankAccounts(SearchPayMeansForPartyResponse.BankAccounts value) {
        this.bankAccounts = value;
    }

    /**
     * Obtém o valor da propriedade cards.
     * 
     * @return
     *     possible object is
     *     {@link SearchPayMeansForPartyResponse.Cards }
     *     
     */
    public SearchPayMeansForPartyResponse.Cards getCards() {
        return cards;
    }

    /**
     * Define o valor da propriedade cards.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPayMeansForPartyResponse.Cards }
     *     
     */
    public void setCards(SearchPayMeansForPartyResponse.Cards value) {
        this.cards = value;
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
     *         &lt;element name="bankAccount" type="{http://amdocs/tef-vivo/customerprofile/types/v1}BankAccountSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "bankAccount"
    })
    public static class BankAccounts {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<BankAccountSummary> bankAccount;

        /**
         * Gets the value of the bankAccount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bankAccount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBankAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BankAccountSummary }
         * 
         * 
         */
        public List<BankAccountSummary> getBankAccount() {
            if (bankAccount == null) {
                bankAccount = new ArrayList<BankAccountSummary>();
            }
            return this.bankAccount;
        }

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
     *         &lt;element name="card" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CardSummary" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "card"
    })
    public static class Cards {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<CardSummary> card;

        /**
         * Gets the value of the card property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the card property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCard().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CardSummary }
         * 
         * 
         */
        public List<CardSummary> getCard() {
            if (card == null) {
                card = new ArrayList<CardSummary>();
            }
            return this.card;
        }

    }

}
