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
 * A response to retrieve more information about port in/out.
 * 
 * <p>Classe Java de PortabilityInformationResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PortabilityInformationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mainItemId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="message" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="orderActionId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="portabilityNumber" type="{http://amdocs/tef-vivo/resource-common/types/v1}MSISDNTelephoneNumberResource"/&gt;
 *         &lt;element name="portabilityWindow" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="serviceProvider" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="status" type="{http://amdocs/tef-vivo/resource-common/types/v1}RetrieveNumberPortabilityStatus"/&gt;
 *         &lt;element name="temporaryNumber" type="{http://amdocs/tef-vivo/resource-common/types/v1}MSISDNTelephoneNumberResource" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortabilityInformationResponse", namespace = "http://amdocs/tef-vivo/resource-common/types/v1", propOrder = {
    "externalId",
    "mainItemId",
    "message",
    "orderActionId",
    "portabilityNumber",
    "portabilityWindow",
    "serviceProvider",
    "status",
    "temporaryNumber"
})
public class PortabilityInformationResponse {

    protected String externalId;
    @XmlElement(required = true)
    protected String mainItemId;
    protected String message;
    protected String orderActionId;
    @XmlElement(required = true)
    protected MSISDNTelephoneNumberResource portabilityNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar portabilityWindow;
    protected String serviceProvider;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RetrieveNumberPortabilityStatus status;
    protected MSISDNTelephoneNumberResource temporaryNumber;

    /**
     * Obtém o valor da propriedade externalId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Define o valor da propriedade externalId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Obtém o valor da propriedade mainItemId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainItemId() {
        return mainItemId;
    }

    /**
     * Define o valor da propriedade mainItemId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainItemId(String value) {
        this.mainItemId = value;
    }

    /**
     * Obtém o valor da propriedade message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define o valor da propriedade message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Obtém o valor da propriedade orderActionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderActionId() {
        return orderActionId;
    }

    /**
     * Define o valor da propriedade orderActionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderActionId(String value) {
        this.orderActionId = value;
    }

    /**
     * Obtém o valor da propriedade portabilityNumber.
     * 
     * @return
     *     possible object is
     *     {@link MSISDNTelephoneNumberResource }
     *     
     */
    public MSISDNTelephoneNumberResource getPortabilityNumber() {
        return portabilityNumber;
    }

    /**
     * Define o valor da propriedade portabilityNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link MSISDNTelephoneNumberResource }
     *     
     */
    public void setPortabilityNumber(MSISDNTelephoneNumberResource value) {
        this.portabilityNumber = value;
    }

    /**
     * Obtém o valor da propriedade portabilityWindow.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPortabilityWindow() {
        return portabilityWindow;
    }

    /**
     * Define o valor da propriedade portabilityWindow.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPortabilityWindow(XMLGregorianCalendar value) {
        this.portabilityWindow = value;
    }

    /**
     * Obtém o valor da propriedade serviceProvider.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Define o valor da propriedade serviceProvider.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProvider(String value) {
        this.serviceProvider = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveNumberPortabilityStatus }
     *     
     */
    public RetrieveNumberPortabilityStatus getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveNumberPortabilityStatus }
     *     
     */
    public void setStatus(RetrieveNumberPortabilityStatus value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade temporaryNumber.
     * 
     * @return
     *     possible object is
     *     {@link MSISDNTelephoneNumberResource }
     *     
     */
    public MSISDNTelephoneNumberResource getTemporaryNumber() {
        return temporaryNumber;
    }

    /**
     * Define o valor da propriedade temporaryNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link MSISDNTelephoneNumberResource }
     *     
     */
    public void setTemporaryNumber(MSISDNTelephoneNumberResource value) {
        this.temporaryNumber = value;
    }

}
