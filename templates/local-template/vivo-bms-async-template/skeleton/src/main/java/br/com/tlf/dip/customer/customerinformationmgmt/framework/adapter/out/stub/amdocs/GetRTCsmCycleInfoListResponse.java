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
 * <p>Classe Java de GetRTCsmCycleInfoListResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GetRTCsmCycleInfoListResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rTCsmCycleInfoList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="rTCsmCycleInfo" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerTypeCycleDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "GetRTCsmCycleInfoListResponse", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "rtCsmCycleInfoList"
})
public class GetRTCsmCycleInfoListResponse {

    @XmlElement(name = "rTCsmCycleInfoList")
    protected GetRTCsmCycleInfoListResponse.RTCsmCycleInfoList rtCsmCycleInfoList;

    /**
     * Obtém o valor da propriedade rtCsmCycleInfoList.
     * 
     * @return
     *     possible object is
     *     {@link GetRTCsmCycleInfoListResponse.RTCsmCycleInfoList }
     *     
     */
    public GetRTCsmCycleInfoListResponse.RTCsmCycleInfoList getRTCsmCycleInfoList() {
        return rtCsmCycleInfoList;
    }

    /**
     * Define o valor da propriedade rtCsmCycleInfoList.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRTCsmCycleInfoListResponse.RTCsmCycleInfoList }
     *     
     */
    public void setRTCsmCycleInfoList(GetRTCsmCycleInfoListResponse.RTCsmCycleInfoList value) {
        this.rtCsmCycleInfoList = value;
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
     *         &lt;element name="rTCsmCycleInfo" type="{http://amdocs/tef-vivo/customerprofile/types/v1}CustomerTypeCycleDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "rtCsmCycleInfo"
    })
    public static class RTCsmCycleInfoList {

        @XmlElement(name = "rTCsmCycleInfo", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1")
        protected List<CustomerTypeCycleDescription> rtCsmCycleInfo;

        /**
         * Gets the value of the rtCsmCycleInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rtCsmCycleInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRTCsmCycleInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomerTypeCycleDescription }
         * 
         * 
         */
        public List<CustomerTypeCycleDescription> getRTCsmCycleInfo() {
            if (rtCsmCycleInfo == null) {
                rtCsmCycleInfo = new ArrayList<CustomerTypeCycleDescription>();
            }
            return this.rtCsmCycleInfo;
        }

    }

}
