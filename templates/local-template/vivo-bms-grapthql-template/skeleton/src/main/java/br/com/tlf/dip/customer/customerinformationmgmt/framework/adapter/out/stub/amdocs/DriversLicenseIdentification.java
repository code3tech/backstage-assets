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
 * A drivers license document which is used to identify an Individual.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/commonbusinessentities/types-unqualified/v1}DriversLicenseIdentification,
 * Derived from PIM entity DriversLicenseIdentification in the domain party.
 * 
 * <p>Classe Java de DriversLicenseIdentification complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DriversLicenseIdentification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://amdocs/tef-vivo/customerprofile/types/v1}IndividualIdentification"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="issuingState" type="{http://amdocs/tef-vivo/commonbusinessentities-common/types/v1}StateID" minOccurs="0"/&gt;
 *         &lt;element name="licenseNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriversLicenseIdentification", propOrder = {
    "issuingState",
    "licenseNumber"
})
public class DriversLicenseIdentification
    extends IndividualIdentification2
{

    protected StateID issuingState;
    @XmlElement(required = true)
    protected String licenseNumber;

    /**
     * Obtém o valor da propriedade issuingState.
     * 
     * @return
     *     possible object is
     *     {@link StateID }
     *     
     */
    public StateID getIssuingState() {
        return issuingState;
    }

    /**
     * Define o valor da propriedade issuingState.
     * 
     * @param value
     *     allowed object is
     *     {@link StateID }
     *     
     */
    public void setIssuingState(StateID value) {
        this.issuingState = value;
    }

    /**
     * Obtém o valor da propriedade licenseNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Define o valor da propriedade licenseNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

}
