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
 * Geographic Location type created to for wireline flows
 * 
 * <p>Classe Java de GeographicLocation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GeographicLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accurany" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="geometryList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="geometry" type="{http://amdocs/tef-vivo/customerprofile/types/v1}Geometry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="geometryType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;whiteSpace value="collapse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="spatialRef" minOccurs="0"&gt;
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
@XmlType(name = "GeographicLocation", propOrder = {
    "accurany",
    "geometryList",
    "geometryType",
    "spatialRef"
})
public class GeographicLocation {

    protected String accurany;
    protected GeographicLocation.GeometryList geometryList;
    protected String geometryType;
    protected String spatialRef;

    /**
     * Obtém o valor da propriedade accurany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccurany() {
        return accurany;
    }

    /**
     * Define o valor da propriedade accurany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccurany(String value) {
        this.accurany = value;
    }

    /**
     * Obtém o valor da propriedade geometryList.
     * 
     * @return
     *     possible object is
     *     {@link GeographicLocation.GeometryList }
     *     
     */
    public GeographicLocation.GeometryList getGeometryList() {
        return geometryList;
    }

    /**
     * Define o valor da propriedade geometryList.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicLocation.GeometryList }
     *     
     */
    public void setGeometryList(GeographicLocation.GeometryList value) {
        this.geometryList = value;
    }

    /**
     * Obtém o valor da propriedade geometryType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeometryType() {
        return geometryType;
    }

    /**
     * Define o valor da propriedade geometryType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeometryType(String value) {
        this.geometryType = value;
    }

    /**
     * Obtém o valor da propriedade spatialRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpatialRef() {
        return spatialRef;
    }

    /**
     * Define o valor da propriedade spatialRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpatialRef(String value) {
        this.spatialRef = value;
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
     *         &lt;element name="geometry" type="{http://amdocs/tef-vivo/customerprofile/types/v1}Geometry" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "geometry"
    })
    public static class GeometryList {

        protected List<Geometry> geometry;

        /**
         * Gets the value of the geometry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the geometry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGeometry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Geometry }
         * 
         * 
         */
        public List<Geometry> getGeometry() {
            if (geometry == null) {
                geometry = new ArrayList<Geometry>();
            }
            return this.geometry;
        }

    }

}
