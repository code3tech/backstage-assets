//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The status of portability.
 * 
 * <p>Classe Java de PortabilityStatus complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PortabilityStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberPortabilityStatus" type="{http://amdocs/tef-vivo/resource-common/types/v1}NumberPortabilityStatus"/&gt;
 *         &lt;element name="numberPortabilityStatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="numberPortabilityStatusDetail" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
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
@XmlType(name = "PortabilityStatus", namespace = "http://amdocs/tef-vivo/resource-common/types/v1", propOrder = {
    "numberPortabilityStatus",
    "numberPortabilityStatusDate",
    "numberPortabilityStatusDetail"
})
public class PortabilityStatus {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected NumberPortabilityStatus numberPortabilityStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar numberPortabilityStatusDate;
    protected String numberPortabilityStatusDetail;

    /**
     * Obtém o valor da propriedade numberPortabilityStatus.
     * 
     * @return
     *     possible object is
     *     {@link NumberPortabilityStatus }
     *     
     */
    public NumberPortabilityStatus getNumberPortabilityStatus() {
        return numberPortabilityStatus;
    }

    /**
     * Define o valor da propriedade numberPortabilityStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberPortabilityStatus }
     *     
     */
    public void setNumberPortabilityStatus(NumberPortabilityStatus value) {
        this.numberPortabilityStatus = value;
    }

    /**
     * Obtém o valor da propriedade numberPortabilityStatusDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNumberPortabilityStatusDate() {
        return numberPortabilityStatusDate;
    }

    /**
     * Define o valor da propriedade numberPortabilityStatusDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNumberPortabilityStatusDate(XMLGregorianCalendar value) {
        this.numberPortabilityStatusDate = value;
    }

    /**
     * Obtém o valor da propriedade numberPortabilityStatusDetail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberPortabilityStatusDetail() {
        return numberPortabilityStatusDetail;
    }

    /**
     * Define o valor da propriedade numberPortabilityStatusDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberPortabilityStatusDetail(String value) {
        this.numberPortabilityStatusDetail = value;
    }

}
