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
 * Holds the name and address information of a specified link type.
 * 
 * <p>Classe Java de NameAddressInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NameAddressInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressInfo" type="{http://amdocs/tef-vivo/customerprofile/types/v1}AddressInfo" minOccurs="0"/&gt;
 *         &lt;element name="addressNameLinkInfo" type="{http://amdocs/tef-vivo/customerprofile/types/v1}AddressNameLinkInfo" minOccurs="0"/&gt;
 *         &lt;element name="nameInfo" type="{http://amdocs/tef-vivo/customerprofile/types/v1}NameInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameAddressInfo", propOrder = {
    "addressInfo",
    "addressNameLinkInfo",
    "nameInfo"
})
public class NameAddressInfo {

    protected AddressInfo addressInfo;
    protected AddressNameLinkInfo addressNameLinkInfo;
    protected NameInfo nameInfo;

    /**
     * Obtém o valor da propriedade addressInfo.
     * 
     * @return
     *     possible object is
     *     {@link AddressInfo }
     *     
     */
    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    /**
     * Define o valor da propriedade addressInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInfo }
     *     
     */
    public void setAddressInfo(AddressInfo value) {
        this.addressInfo = value;
    }

    /**
     * Obtém o valor da propriedade addressNameLinkInfo.
     * 
     * @return
     *     possible object is
     *     {@link AddressNameLinkInfo }
     *     
     */
    public AddressNameLinkInfo getAddressNameLinkInfo() {
        return addressNameLinkInfo;
    }

    /**
     * Define o valor da propriedade addressNameLinkInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressNameLinkInfo }
     *     
     */
    public void setAddressNameLinkInfo(AddressNameLinkInfo value) {
        this.addressNameLinkInfo = value;
    }

    /**
     * Obtém o valor da propriedade nameInfo.
     * 
     * @return
     *     possible object is
     *     {@link NameInfo }
     *     
     */
    public NameInfo getNameInfo() {
        return nameInfo;
    }

    /**
     * Define o valor da propriedade nameInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link NameInfo }
     *     
     */
    public void setNameInfo(NameInfo value) {
        this.nameInfo = value;
    }

}
