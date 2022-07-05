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
 * A standing order for automatic collection of payments (in order to pay bills - for example) via electronic fund
 * transfer.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerprofile/types-unqualified/v1}PayInstruction,
 * Derived from PIM entity PayInstruction in the domain customer.
 * 
 * <p>Classe Java de PayInstructionForCreate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PayInstructionForCreate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bankAccount" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}BankAccountID" minOccurs="0"/&gt;
 *         &lt;element name="card" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}CardID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayInstructionForCreate", propOrder = {
    "bankAccount",
    "card"
})
public class PayInstructionForCreate {

    protected BankAccountID bankAccount;
    protected CardID card;

    /**
     * Obtém o valor da propriedade bankAccount.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountID }
     *     
     */
    public BankAccountID getBankAccount() {
        return bankAccount;
    }

    /**
     * Define o valor da propriedade bankAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountID }
     *     
     */
    public void setBankAccount(BankAccountID value) {
        this.bankAccount = value;
    }

    /**
     * Obtém o valor da propriedade card.
     * 
     * @return
     *     possible object is
     *     {@link CardID }
     *     
     */
    public CardID getCard() {
        return card;
    }

    /**
     * Define o valor da propriedade card.
     * 
     * @param value
     *     allowed object is
     *     {@link CardID }
     *     
     */
    public void setCard(CardID value) {
        this.card = value;
    }

}
