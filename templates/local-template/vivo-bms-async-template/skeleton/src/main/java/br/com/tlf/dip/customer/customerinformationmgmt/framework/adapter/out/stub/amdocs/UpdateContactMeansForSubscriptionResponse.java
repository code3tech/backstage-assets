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


/**
 * <p>Classe Java de UpdateContactMeansForSubscriptionResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateContactMeansForSubscriptionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operationCompletionStatus" type="{http://amdocs/tef-vivo/core/types/v1}OperationStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateContactMeansForSubscriptionResponse", namespace = "http://amdocs/tef-vivo/customerinformationmanagement/customerprofilemanagement/v1", propOrder = {
    "operationCompletionStatus"
})
public class UpdateContactMeansForSubscriptionResponse {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OperationStatus operationCompletionStatus;

    /**
     * Obtém o valor da propriedade operationCompletionStatus.
     * 
     * @return
     *     possible object is
     *     {@link OperationStatus }
     *     
     */
    public OperationStatus getOperationCompletionStatus() {
        return operationCompletionStatus;
    }

    /**
     * Define o valor da propriedade operationCompletionStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationStatus }
     *     
     */
    public void setOperationCompletionStatus(OperationStatus value) {
        this.operationCompletionStatus = value;
    }

}
