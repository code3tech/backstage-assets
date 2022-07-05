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
 * The object holds information on the activities that can be performed on the Account by collection.
 * 
 * <p>Classe Java de AccountCollectionFixInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AccountCollectionFixInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collectionFixCsrCd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="collectionFixPolicy" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="collectionPermanentWaiveInd" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
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
@XmlType(name = "AccountCollectionFixInfo", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1", propOrder = {
    "collectionFixCsrCd",
    "collectionFixPolicy",
    "collectionPermanentWaiveInd"
})
public class AccountCollectionFixInfo {

    protected String collectionFixCsrCd;
    protected String collectionFixPolicy;
    protected String collectionPermanentWaiveInd;

    /**
     * Obtém o valor da propriedade collectionFixCsrCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionFixCsrCd() {
        return collectionFixCsrCd;
    }

    /**
     * Define o valor da propriedade collectionFixCsrCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionFixCsrCd(String value) {
        this.collectionFixCsrCd = value;
    }

    /**
     * Obtém o valor da propriedade collectionFixPolicy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionFixPolicy() {
        return collectionFixPolicy;
    }

    /**
     * Define o valor da propriedade collectionFixPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionFixPolicy(String value) {
        this.collectionFixPolicy = value;
    }

    /**
     * Obtém o valor da propriedade collectionPermanentWaiveInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionPermanentWaiveInd() {
        return collectionPermanentWaiveInd;
    }

    /**
     * Define o valor da propriedade collectionPermanentWaiveInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionPermanentWaiveInd(String value) {
        this.collectionPermanentWaiveInd = value;
    }

}
