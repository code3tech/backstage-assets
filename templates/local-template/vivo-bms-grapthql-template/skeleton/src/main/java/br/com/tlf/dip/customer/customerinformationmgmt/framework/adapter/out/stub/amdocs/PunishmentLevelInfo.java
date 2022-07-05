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
 * Specifies the punishment level to be applied to the account.
 * 
 * <p>Classe Java de PunishmentLevelInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PunishmentLevelInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="punishmentLevel" minOccurs="0"&gt;
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
@XmlType(name = "PunishmentLevelInfo", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1", propOrder = {
    "punishmentLevel"
})
public class PunishmentLevelInfo {

    protected String punishmentLevel;

    /**
     * Obtém o valor da propriedade punishmentLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunishmentLevel() {
        return punishmentLevel;
    }

    /**
     * Define o valor da propriedade punishmentLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunishmentLevel(String value) {
        this.punishmentLevel = value;
    }

}
