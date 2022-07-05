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
import javax.xml.bind.annotation.XmlType;


/**
 * A ProductSpecification procured by a Customer. A Product models this instance of a ProductSpecification.
 * 
 * Note:  In Amdocs Ordering this serves as both an Assigned Product and an Ordered Product. An Ordered Product has no
 * activation date and has a status indicating that it is ordered.
 * 
 * A Product may be part of a complex structure of Products. The structure is typically based on relationships between
 * ProductSpecifications defined in ProductSpecContainment and ProductSpecRelationship. The structure is instantiated
 * through ProductContainment and ProductRelationship.
 * 
 * A Product is uniquely identified by its Product.ID and Product.version. When information regarding an existing Product
 * is changed a new instance is created with the same Product.ID and different Product.version. If a Product has
 * associated contained Products defined in ProductContainment then when it changes by definition all of the contained
 * Products must have new instances created for them. The history of a product is described by multiple Products with the
 * same Product.ID value.
 * 
 * The permitted status transitions of a Product are defined by the provider of any status update operations.
 * :
 * Restriction of {http://amdocs/pbg-portfolio/customerproduct/types-unqualified/v1}Product,
 * Derived from PIM entity Product in the domain product.
 * 
 * <p>Classe Java de ProductForInvolvement complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProductForInvolvement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="partyRoleInvolvements" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="partyRoleInvolvement" type="{http://amdocs/tef-vivo/customerprofile/types/v1}PartyRoleProductInvolvement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="serviceID" minOccurs="0"&gt;
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
@XmlType(name = "ProductForInvolvement", propOrder = {
    "id",
    "partyRoleInvolvements",
    "serviceID"
})
public class ProductForInvolvement {

    protected String id;
    protected ProductForInvolvement.PartyRoleInvolvements partyRoleInvolvements;
    protected String serviceID;

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade partyRoleInvolvements.
     * 
     * @return
     *     possible object is
     *     {@link ProductForInvolvement.PartyRoleInvolvements }
     *     
     */
    public ProductForInvolvement.PartyRoleInvolvements getPartyRoleInvolvements() {
        return partyRoleInvolvements;
    }

    /**
     * Define o valor da propriedade partyRoleInvolvements.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductForInvolvement.PartyRoleInvolvements }
     *     
     */
    public void setPartyRoleInvolvements(ProductForInvolvement.PartyRoleInvolvements value) {
        this.partyRoleInvolvements = value;
    }

    /**
     * Obtém o valor da propriedade serviceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Define o valor da propriedade serviceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
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
     *         &lt;element name="partyRoleInvolvement" type="{http://amdocs/tef-vivo/customerprofile/types/v1}PartyRoleProductInvolvement" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "partyRoleInvolvement"
    })
    public static class PartyRoleInvolvements {

        protected List<PartyRoleProductInvolvement> partyRoleInvolvement;

        /**
         * Gets the value of the partyRoleInvolvement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the partyRoleInvolvement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPartyRoleInvolvement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PartyRoleProductInvolvement }
         * 
         * 
         */
        public List<PartyRoleProductInvolvement> getPartyRoleInvolvement() {
            if (partyRoleInvolvement == null) {
                partyRoleInvolvement = new ArrayList<PartyRoleProductInvolvement>();
            }
            return this.partyRoleInvolvement;
        }

    }

}
