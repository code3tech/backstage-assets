//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The financial reflection of the Customer relationship. A financial bottom line, in terms of outstanding balance and
 * debt amounts, of the log of financial transactions such as invoices and payments that stem from the Customer
 * relationship.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerprofile/types-unqualified/v1}CustomerAccount,
 * Derived from PIM entity CustomerAccount in the domain customer.
 * 
 * <p>Classe Java de CustomerAccountForCreate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccountForCreate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="balancePolicy" type="{http://amdocs/tef-vivo/customerprofile-common/types/v1}BalancePolicy" minOccurs="0"/&gt;
 *         &lt;element name="name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
@XmlType(name = "CustomerAccountForCreate", propOrder = {
    "balancePolicy",
    "name"
})
public class CustomerAccountForCreate {

    @XmlSchemaType(name = "string")
    protected BalancePolicy balancePolicy;
    protected String name;

    /**
     * Obtém o valor da propriedade balancePolicy.
     * 
     * @return
     *     possible object is
     *     {@link BalancePolicy }
     *     
     */
    public BalancePolicy getBalancePolicy() {
        return balancePolicy;
    }

    /**
     * Define o valor da propriedade balancePolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link BalancePolicy }
     *     
     */
    public void setBalancePolicy(BalancePolicy value) {
        this.balancePolicy = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
