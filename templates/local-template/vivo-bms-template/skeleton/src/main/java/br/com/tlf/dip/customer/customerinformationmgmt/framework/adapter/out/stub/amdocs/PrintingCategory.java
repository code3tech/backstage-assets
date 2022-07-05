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
 * <p>Classe Java de PrintingCategory.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PrintingCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="SMS_NONE"/&gt;
 *     &lt;enumeration value="PAPER"/&gt;
 *     &lt;enumeration value="PAPER_AND_EMAIL"/&gt;
 *     &lt;enumeration value="SMS_AND_PAPER"/&gt;
 *     &lt;enumeration value="SMS_AND_PAPER_AND_EMAIL"/&gt;
 *     &lt;enumeration value="EMAIL"/&gt;
 *     &lt;enumeration value="SMS_EMAIL"/&gt;
 *     &lt;enumeration value="BRAILLE"/&gt;
 *     &lt;enumeration value="SMS_AND_BRAILLE"/&gt;
 *     &lt;enumeration value="SMS_AND_BRAILLE_AND_EMAIL"/&gt;
 *     &lt;enumeration value="BRAILLE_AND_EMAIL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PrintingCategory", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1")
@XmlEnum
public enum PrintingCategory {


    /**
     * No delivery of communication to customer
     * 
     */
    NONE,

    /**
     * SMS + NONE
     * 
     */
    SMS_NONE,

    /**
     * Delivery bill as paper format
     * 
     */
    PAPER,

    /**
     * EMAIL+PAPER
     * 
     */
    PAPER_AND_EMAIL,

    /**
     * Delivery bill as paper format and SMS
     * 
     */
    SMS_AND_PAPER,

    /**
     * SMS+EMAIL+PAPER
     * 
     */
    SMS_AND_PAPER_AND_EMAIL,

    /**
     * Delivery email with PDF attached
     * 
     */
    EMAIL,

    /**
     * Delivery email with PDF attached and SMS
     * 
     */
    SMS_EMAIL,

    /**
     * Delivery paper braille format
     * 
     */
    BRAILLE,

    /**
     * Delivery paper braille format and SMS
     * 
     */
    SMS_AND_BRAILLE,

    /**
     * SMS+BRAILE+EMAIL
     * 
     */
    SMS_AND_BRAILLE_AND_EMAIL,

    /**
     * BRAILE+EMAIL
     * 
     */
    BRAILLE_AND_EMAIL;

    public String value() {
        return name();
    }

    public static PrintingCategory fromValue(String v) {
        return valueOf(v);
    }

}
