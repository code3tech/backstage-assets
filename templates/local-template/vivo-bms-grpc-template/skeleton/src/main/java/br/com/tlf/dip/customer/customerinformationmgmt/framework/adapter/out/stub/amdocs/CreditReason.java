//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CreditReason.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACLCRD"/&gt;
 *     &lt;enumeration value="BEALCD"/&gt;
 *     &lt;enumeration value="CRASLA"/&gt;
 *     &lt;enumeration value="CRMVBL"/&gt;
 *     &lt;enumeration value="CROLDB"/&gt;
 *     &lt;enumeration value="DPSINT"/&gt;
 *     &lt;enumeration value="GDWADI"/&gt;
 *     &lt;enumeration value="GDWADP"/&gt;
 *     &lt;enumeration value="GNCR"/&gt;
 *     &lt;enumeration value="OUTACC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreditReason", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1")
@XmlEnum
public enum CreditReason {


    /**
     * Account level Credit
     * 
     */
    ACLCRD,

    /**
     * Account level Credit for Europe market
     * 
     */
    BEALCD,

    /**
     * Account level  Credit due to performance below an agreed SLA
     * 
     */
    CRASLA,

    /**
     * Account level Credit due to the need to move balance between Accounts
     * 
     */
    CRMVBL,

    /**
     * Account level Credit due to an error in a very old (already archived) Bill
     * 
     */
    CROLDB,

    /**
     * Account level due to Deposit Interest
     * 
     */
    DPSINT,

    /**
     * Account level credit due to Goodwill Adjust (IMM)
     * 
     */
    GDWADI,

    /**
     * Account level credit due to Goodwill Adjust (PND)
     * 
     */
    GDWADP,

    /**
     * Account level General Credit
     * 
     */
    GNCR,

    /**
     * Account level Credit due to outage of service
     * 
     */
    OUTACC;

    public String value() {
        return name();
    }

    public static CreditReason fromValue(String v) {
        return valueOf(v);
    }

}
