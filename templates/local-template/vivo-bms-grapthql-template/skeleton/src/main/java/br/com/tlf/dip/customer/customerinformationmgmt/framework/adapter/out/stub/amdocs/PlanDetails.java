//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The PlanDetails will contain all the postpaid and controle plan details
 * 
 * <p>Classe Java de PlanDetails complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PlanDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dataAllownceExhaustionCondition" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="downloadSpeed" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hiredDataAllowance" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hiredSMSAndVoiceAlwnc" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hiredVoiceAlwncCNDFP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hiredVoiceAlwncCNDMP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hiredVoiceAlwncCNFP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hiredVoiceAlwncCNLDFP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hiredVoiceAlwncCNLDMP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hiredVoiceAlwncCNLFP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hiredVoiceAlwncCNLMP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hiredVoiceAlwncCNMP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="offerClassification" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="127"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="planAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanDetails", namespace = "http://amdocs/tef-vivo/productcatalog-common/types/v1", propOrder = {
    "activationDate",
    "dataAllownceExhaustionCondition",
    "downloadSpeed",
    "hiredDataAllowance",
    "hiredSMSAndVoiceAlwnc",
    "hiredVoiceAlwncCNDFP",
    "hiredVoiceAlwncCNDMP",
    "hiredVoiceAlwncCNFP",
    "hiredVoiceAlwncCNLDFP",
    "hiredVoiceAlwncCNLDMP",
    "hiredVoiceAlwncCNLFP",
    "hiredVoiceAlwncCNLMP",
    "hiredVoiceAlwncCNMP",
    "name",
    "offerClassification",
    "planAmount"
})
public class PlanDetails {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activationDate;
    protected String dataAllownceExhaustionCondition;
    protected String downloadSpeed;
    protected String hiredDataAllowance;
    protected String hiredSMSAndVoiceAlwnc;
    protected String hiredVoiceAlwncCNDFP;
    protected String hiredVoiceAlwncCNDMP;
    protected String hiredVoiceAlwncCNFP;
    protected String hiredVoiceAlwncCNLDFP;
    protected String hiredVoiceAlwncCNLDMP;
    protected String hiredVoiceAlwncCNLFP;
    protected String hiredVoiceAlwncCNLMP;
    protected String hiredVoiceAlwncCNMP;
    protected String name;
    protected String offerClassification;
    protected BigDecimal planAmount;

    /**
     * Obtém o valor da propriedade activationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivationDate() {
        return activationDate;
    }

    /**
     * Define o valor da propriedade activationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivationDate(XMLGregorianCalendar value) {
        this.activationDate = value;
    }

    /**
     * Obtém o valor da propriedade dataAllownceExhaustionCondition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAllownceExhaustionCondition() {
        return dataAllownceExhaustionCondition;
    }

    /**
     * Define o valor da propriedade dataAllownceExhaustionCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAllownceExhaustionCondition(String value) {
        this.dataAllownceExhaustionCondition = value;
    }

    /**
     * Obtém o valor da propriedade downloadSpeed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadSpeed() {
        return downloadSpeed;
    }

    /**
     * Define o valor da propriedade downloadSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadSpeed(String value) {
        this.downloadSpeed = value;
    }

    /**
     * Obtém o valor da propriedade hiredDataAllowance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiredDataAllowance() {
        return hiredDataAllowance;
    }

    /**
     * Define o valor da propriedade hiredDataAllowance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiredDataAllowance(String value) {
        this.hiredDataAllowance = value;
    }

    /**
     * Obtém o valor da propriedade hiredSMSAndVoiceAlwnc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiredSMSAndVoiceAlwnc() {
        return hiredSMSAndVoiceAlwnc;
    }

    /**
     * Define o valor da propriedade hiredSMSAndVoiceAlwnc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiredSMSAndVoiceAlwnc(String value) {
        this.hiredSMSAndVoiceAlwnc = value;
    }

    /**
     * Obtém o valor da propriedade hiredVoiceAlwncCNDFP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiredVoiceAlwncCNDFP() {
        return hiredVoiceAlwncCNDFP;
    }

    /**
     * Define o valor da propriedade hiredVoiceAlwncCNDFP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiredVoiceAlwncCNDFP(String value) {
        this.hiredVoiceAlwncCNDFP = value;
    }

    /**
     * Obtém o valor da propriedade hiredVoiceAlwncCNDMP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiredVoiceAlwncCNDMP() {
        return hiredVoiceAlwncCNDMP;
    }

    /**
     * Define o valor da propriedade hiredVoiceAlwncCNDMP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiredVoiceAlwncCNDMP(String value) {
        this.hiredVoiceAlwncCNDMP = value;
    }

    /**
     * Obtém o valor da propriedade hiredVoiceAlwncCNFP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiredVoiceAlwncCNFP() {
        return hiredVoiceAlwncCNFP;
    }

    /**
     * Define o valor da propriedade hiredVoiceAlwncCNFP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiredVoiceAlwncCNFP(String value) {
        this.hiredVoiceAlwncCNFP = value;
    }

    /**
     * Obtém o valor da propriedade hiredVoiceAlwncCNLDFP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiredVoiceAlwncCNLDFP() {
        return hiredVoiceAlwncCNLDFP;
    }

    /**
     * Define o valor da propriedade hiredVoiceAlwncCNLDFP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiredVoiceAlwncCNLDFP(String value) {
        this.hiredVoiceAlwncCNLDFP = value;
    }

    /**
     * Obtém o valor da propriedade hiredVoiceAlwncCNLDMP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiredVoiceAlwncCNLDMP() {
        return hiredVoiceAlwncCNLDMP;
    }

    /**
     * Define o valor da propriedade hiredVoiceAlwncCNLDMP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiredVoiceAlwncCNLDMP(String value) {
        this.hiredVoiceAlwncCNLDMP = value;
    }

    /**
     * Obtém o valor da propriedade hiredVoiceAlwncCNLFP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiredVoiceAlwncCNLFP() {
        return hiredVoiceAlwncCNLFP;
    }

    /**
     * Define o valor da propriedade hiredVoiceAlwncCNLFP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiredVoiceAlwncCNLFP(String value) {
        this.hiredVoiceAlwncCNLFP = value;
    }

    /**
     * Obtém o valor da propriedade hiredVoiceAlwncCNLMP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiredVoiceAlwncCNLMP() {
        return hiredVoiceAlwncCNLMP;
    }

    /**
     * Define o valor da propriedade hiredVoiceAlwncCNLMP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiredVoiceAlwncCNLMP(String value) {
        this.hiredVoiceAlwncCNLMP = value;
    }

    /**
     * Obtém o valor da propriedade hiredVoiceAlwncCNMP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiredVoiceAlwncCNMP() {
        return hiredVoiceAlwncCNMP;
    }

    /**
     * Define o valor da propriedade hiredVoiceAlwncCNMP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiredVoiceAlwncCNMP(String value) {
        this.hiredVoiceAlwncCNMP = value;
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

    /**
     * Obtém o valor da propriedade offerClassification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferClassification() {
        return offerClassification;
    }

    /**
     * Define o valor da propriedade offerClassification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferClassification(String value) {
        this.offerClassification = value;
    }

    /**
     * Obtém o valor da propriedade planAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPlanAmount() {
        return planAmount;
    }

    /**
     * Define o valor da propriedade planAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPlanAmount(BigDecimal value) {
        this.planAmount = value;
    }

}
