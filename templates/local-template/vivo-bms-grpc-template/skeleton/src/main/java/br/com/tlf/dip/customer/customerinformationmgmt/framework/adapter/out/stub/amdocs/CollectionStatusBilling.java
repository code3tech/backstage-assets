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
 * <p>Classe Java de CollectionStatusBilling.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CollectionStatusBilling"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CANCEL"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="RESTORE"/&gt;
 *     &lt;enumeration value="SUSPEND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollectionStatusBilling", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1")
@XmlEnum
public enum CollectionStatusBilling {

    CANCEL,
    NONE,
    RESTORE,
    SUSPEND;

    public String value() {
        return name();
    }

    public static CollectionStatusBilling fromValue(String v) {
        return valueOf(v);
    }

}
