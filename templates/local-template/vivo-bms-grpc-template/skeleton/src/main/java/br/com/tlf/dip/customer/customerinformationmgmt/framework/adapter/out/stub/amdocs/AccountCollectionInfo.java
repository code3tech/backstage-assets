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
 * The object holds information regarding the Account collection steps.
 * 
 * <p>Classe Java de AccountCollectionInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AccountCollectionInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountCollectionDateInfo" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}AccountCollectionDateInfo" minOccurs="0"/&gt;
 *         &lt;element name="accountCollectionFixInfo" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}AccountCollectionFixInfo" minOccurs="0"/&gt;
 *         &lt;element name="collectionStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fullSuspensionIndicator" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="punishmentLevel" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="punishmentLevels" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}PunishmentLevelInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="suspensionType" minOccurs="0"&gt;
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
@XmlType(name = "AccountCollectionInfo", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1", propOrder = {
    "accountCollectionDateInfo",
    "accountCollectionFixInfo",
    "collectionStatus",
    "fullSuspensionIndicator",
    "punishmentLevel",
    "suspensionType"
})
public class AccountCollectionInfo {

    protected AccountCollectionDateInfo accountCollectionDateInfo;
    protected AccountCollectionFixInfo accountCollectionFixInfo;
    protected String collectionStatus;
    protected String fullSuspensionIndicator;
    protected AccountCollectionInfo.PunishmentLevel punishmentLevel;
    protected String suspensionType;

    /**
     * Obtém o valor da propriedade accountCollectionDateInfo.
     * 
     * @return
     *     possible object is
     *     {@link AccountCollectionDateInfo }
     *     
     */
    public AccountCollectionDateInfo getAccountCollectionDateInfo() {
        return accountCollectionDateInfo;
    }

    /**
     * Define o valor da propriedade accountCollectionDateInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCollectionDateInfo }
     *     
     */
    public void setAccountCollectionDateInfo(AccountCollectionDateInfo value) {
        this.accountCollectionDateInfo = value;
    }

    /**
     * Obtém o valor da propriedade accountCollectionFixInfo.
     * 
     * @return
     *     possible object is
     *     {@link AccountCollectionFixInfo }
     *     
     */
    public AccountCollectionFixInfo getAccountCollectionFixInfo() {
        return accountCollectionFixInfo;
    }

    /**
     * Define o valor da propriedade accountCollectionFixInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCollectionFixInfo }
     *     
     */
    public void setAccountCollectionFixInfo(AccountCollectionFixInfo value) {
        this.accountCollectionFixInfo = value;
    }

    /**
     * Obtém o valor da propriedade collectionStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionStatus() {
        return collectionStatus;
    }

    /**
     * Define o valor da propriedade collectionStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionStatus(String value) {
        this.collectionStatus = value;
    }

    /**
     * Obtém o valor da propriedade fullSuspensionIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullSuspensionIndicator() {
        return fullSuspensionIndicator;
    }

    /**
     * Define o valor da propriedade fullSuspensionIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullSuspensionIndicator(String value) {
        this.fullSuspensionIndicator = value;
    }

    /**
     * Obtém o valor da propriedade punishmentLevel.
     * 
     * @return
     *     possible object is
     *     {@link AccountCollectionInfo.PunishmentLevel }
     *     
     */
    public AccountCollectionInfo.PunishmentLevel getPunishmentLevel() {
        return punishmentLevel;
    }

    /**
     * Define o valor da propriedade punishmentLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCollectionInfo.PunishmentLevel }
     *     
     */
    public void setPunishmentLevel(AccountCollectionInfo.PunishmentLevel value) {
        this.punishmentLevel = value;
    }

    /**
     * Obtém o valor da propriedade suspensionType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspensionType() {
        return suspensionType;
    }

    /**
     * Define o valor da propriedade suspensionType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspensionType(String value) {
        this.suspensionType = value;
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
     *         &lt;element name="punishmentLevels" type="{http://amdocs/tef-vivo/customerbilling-common/types/v1}PunishmentLevelInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "punishmentLevels"
    })
    public static class PunishmentLevel {

        @XmlElement(namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1")
        protected List<PunishmentLevelInfo> punishmentLevels;

        /**
         * Gets the value of the punishmentLevels property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the punishmentLevels property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPunishmentLevels().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PunishmentLevelInfo }
         * 
         * 
         */
        public List<PunishmentLevelInfo> getPunishmentLevels() {
            if (punishmentLevels == null) {
                punishmentLevels = new ArrayList<PunishmentLevelInfo>();
            }
            return this.punishmentLevels;
        }

    }

}
