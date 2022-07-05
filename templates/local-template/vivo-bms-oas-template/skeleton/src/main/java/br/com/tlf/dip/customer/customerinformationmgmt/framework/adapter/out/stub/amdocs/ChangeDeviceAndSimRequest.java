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
import javax.xml.bind.annotation.XmlType;


/**
 * ChangeDeviceAndSimRequest type to be used by changeDeviceAndSim WSF.
 * 
 * <p>Classe Java de ChangeDeviceAndSimRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ChangeDeviceAndSimRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amdocsAddressId" type="{http://amdocs/tef-vivo/resource-common/types/v1}ShippingAddress" minOccurs="0"/&gt;
 *         &lt;element name="billingProfile" type="{http://amdocs/tef-vivo/resource-common/types/v1}BaIdInfo"/&gt;
 *         &lt;element name="contact" type="{http://amdocs/tef-vivo/resource-common/types/v1}Contact"/&gt;
 *         &lt;element name="deliveryMethod"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="device" type="{http://amdocs/tef-vivo/resource-common/types/v1}EquipmentDevice" minOccurs="0"/&gt;
 *         &lt;element name="msisdn" type="{http://amdocs/tef-vivo/resource-common/types/v1}TelephoneNumberResource"/&gt;
 *         &lt;element name="payment" type="{http://amdocs/tef-vivo/resource-common/types/v1}Payment"/&gt;
 *         &lt;element name="salesDepartment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sapReservationId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="simCard" type="{http://amdocs/tef-vivo/resource-common/types/v1}SimCardDevice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeDeviceAndSimRequest", namespace = "http://amdocs/tef-vivo/resource-common/types/v1", propOrder = {
    "amdocsAddressId",
    "billingProfile",
    "contact",
    "deliveryMethod",
    "device",
    "msisdn",
    "payment",
    "salesDepartment",
    "sapReservationId",
    "simCard"
})
public class ChangeDeviceAndSimRequest {

    protected ShippingAddress amdocsAddressId;
    @XmlElement(required = true)
    protected BaIdInfo billingProfile;
    @XmlElement(required = true)
    protected Contact2 contact;
    @XmlElement(required = true)
    protected String deliveryMethod;
    protected EquipmentDevice device;
    @XmlElement(required = true)
    protected TelephoneNumberResource msisdn;
    @XmlElement(required = true)
    protected Payment payment;
    protected String salesDepartment;
    @XmlElement(required = true)
    protected String sapReservationId;
    protected SimCardDevice simCard;

    /**
     * Obtém o valor da propriedade amdocsAddressId.
     * 
     * @return
     *     possible object is
     *     {@link ShippingAddress }
     *     
     */
    public ShippingAddress getAmdocsAddressId() {
        return amdocsAddressId;
    }

    /**
     * Define o valor da propriedade amdocsAddressId.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingAddress }
     *     
     */
    public void setAmdocsAddressId(ShippingAddress value) {
        this.amdocsAddressId = value;
    }

    /**
     * Obtém o valor da propriedade billingProfile.
     * 
     * @return
     *     possible object is
     *     {@link BaIdInfo }
     *     
     */
    public BaIdInfo getBillingProfile() {
        return billingProfile;
    }

    /**
     * Define o valor da propriedade billingProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link BaIdInfo }
     *     
     */
    public void setBillingProfile(BaIdInfo value) {
        this.billingProfile = value;
    }

    /**
     * Obtém o valor da propriedade contact.
     * 
     * @return
     *     possible object is
     *     {@link Contact2 }
     *     
     */
    public Contact2 getContact() {
        return contact;
    }

    /**
     * Define o valor da propriedade contact.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact2 }
     *     
     */
    public void setContact(Contact2 value) {
        this.contact = value;
    }

    /**
     * Obtém o valor da propriedade deliveryMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Define o valor da propriedade deliveryMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMethod(String value) {
        this.deliveryMethod = value;
    }

    /**
     * Obtém o valor da propriedade device.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentDevice }
     *     
     */
    public EquipmentDevice getDevice() {
        return device;
    }

    /**
     * Define o valor da propriedade device.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentDevice }
     *     
     */
    public void setDevice(EquipmentDevice value) {
        this.device = value;
    }

    /**
     * Obtém o valor da propriedade msisdn.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneNumberResource }
     *     
     */
    public TelephoneNumberResource getMsisdn() {
        return msisdn;
    }

    /**
     * Define o valor da propriedade msisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneNumberResource }
     *     
     */
    public void setMsisdn(TelephoneNumberResource value) {
        this.msisdn = value;
    }

    /**
     * Obtém o valor da propriedade payment.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Define o valor da propriedade payment.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

    /**
     * Obtém o valor da propriedade salesDepartment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesDepartment() {
        return salesDepartment;
    }

    /**
     * Define o valor da propriedade salesDepartment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesDepartment(String value) {
        this.salesDepartment = value;
    }

    /**
     * Obtém o valor da propriedade sapReservationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSapReservationId() {
        return sapReservationId;
    }

    /**
     * Define o valor da propriedade sapReservationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSapReservationId(String value) {
        this.sapReservationId = value;
    }

    /**
     * Obtém o valor da propriedade simCard.
     * 
     * @return
     *     possible object is
     *     {@link SimCardDevice }
     *     
     */
    public SimCardDevice getSimCard() {
        return simCard;
    }

    /**
     * Define o valor da propriedade simCard.
     * 
     * @param value
     *     allowed object is
     *     {@link SimCardDevice }
     *     
     */
    public void setSimCard(SimCardDevice value) {
        this.simCard = value;
    }

}
