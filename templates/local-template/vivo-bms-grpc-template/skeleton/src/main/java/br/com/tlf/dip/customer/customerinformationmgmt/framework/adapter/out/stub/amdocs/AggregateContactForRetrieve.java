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
 * An aggregation of Contact details and associated Cardss and BankAccounts.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerinformationmanagement/types-unqualified/v1}AggregateContactForRetrieve.
 * 
 * <p>Classe Java de AggregateContactForRetrieve complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AggregateContactForRetrieve"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bankAccounts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="bankAccount" type="{http://amdocs/tef-vivo/customerprofile/types/v1}BankAccount" maxOccurs="unbounded" minOccurs="0"/&gt;
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
 *                   &lt;element name="card" type="{http://amdocs/tef-vivo/customerprofile/types/v1}Card" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="contactDetails" type="{http://amdocs/tef-vivo/customerprofile/types/v1}Contact"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateContactForRetrieve", propOrder = {
    "bankAccounts",
    "cards",
    "contactDetails"
})
public class AggregateContactForRetrieve {

    protected AggregateContactForRetrieve.BankAccounts bankAccounts;
    protected AggregateContactForRetrieve.Cards cards;
    @XmlElement(required = true)
    protected Contact contactDetails;

    /**
     * Obtém o valor da propriedade bankAccounts.
     * 
     * @return
     *     possible object is
     *     {@link AggregateContactForRetrieve.BankAccounts }
     *     
     */
    public AggregateContactForRetrieve.BankAccounts getBankAccounts() {
        return bankAccounts;
    }

    /**
     * Define o valor da propriedade bankAccounts.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregateContactForRetrieve.BankAccounts }
     *     
     */
    public void setBankAccounts(AggregateContactForRetrieve.BankAccounts value) {
        this.bankAccounts = value;
    }

    /**
     * Obtém o valor da propriedade cards.
     * 
     * @return
     *     possible object is
     *     {@link AggregateContactForRetrieve.Cards }
     *     
     */
    public AggregateContactForRetrieve.Cards getCards() {
        return cards;
    }

    /**
     * Define o valor da propriedade cards.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregateContactForRetrieve.Cards }
     *     
     */
    public void setCards(AggregateContactForRetrieve.Cards value) {
        this.cards = value;
    }

    /**
     * Obtém o valor da propriedade contactDetails.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContactDetails() {
        return contactDetails;
    }

    /**
     * Define o valor da propriedade contactDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContactDetails(Contact value) {
        this.contactDetails = value;
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
     *         &lt;element name="bankAccount" type="{http://amdocs/tef-vivo/customerprofile/types/v1}BankAccount" maxOccurs="unbounded" minOccurs="0"/&gt;
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

        protected List<BankAccount> bankAccount;

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
         * {@link BankAccount }
         * 
         * 
         */
        public List<BankAccount> getBankAccount() {
            if (bankAccount == null) {
                bankAccount = new ArrayList<BankAccount>();
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
     *         &lt;element name="card" type="{http://amdocs/tef-vivo/customerprofile/types/v1}Card" maxOccurs="unbounded" minOccurs="0"/&gt;
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

        protected List<Card> card;

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
         * {@link Card }
         * 
         * 
         */
        public List<Card> getCard() {
            if (card == null) {
                card = new ArrayList<Card>();
            }
            return this.card;
        }

    }

}
