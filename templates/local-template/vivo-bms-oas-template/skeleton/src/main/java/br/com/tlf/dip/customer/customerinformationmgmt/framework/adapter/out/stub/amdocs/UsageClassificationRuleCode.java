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
 * A rule defining how charges for usage events can be distributed to different CustomerBillSpecs.
 * 
 * For example a corporate customer might decide that for a fixed line owned by the corporate customer in an employees
 * home might have the following usage event types:
 * 
 * 
 * 	Local calls that will be charged to the corporate customer
 * 	Long-distance calls will be charged to the employee
 * 
 * 
 * 
 * For example parents might decide that for a mobile used by their child
 * 
 * 	Content usage will be charged to pre-paid account thus limiting the potential spend
 * 	Calls will be charged to post-paid channel
 * 
 * In both examples, there would be an UsageClassificationRule for each of the above call types.
 * :
 * Derived from PIM entity UsageClassificationRule in the domain productspecification.
 * 
 * <p>Classe Java de UsageClassificationRuleCode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UsageClassificationRuleCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code"&gt;
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
@XmlType(name = "UsageClassificationRuleCode", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1", propOrder = {
    "code"
})
public class UsageClassificationRuleCode {

    @XmlElement(required = true)
    protected String code;

    /**
     * Obtém o valor da propriedade code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define o valor da propriedade code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

}
