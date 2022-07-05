//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:52:08 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.siebel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import lombok.Builder;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.siebel package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
@Builder
public class ObjectFactory {

    private final static QName _NVGetCustomerOut_QNAME = new QName("http://www.siebel.com/xml/NVGetCustomerOut", "NVGetCustomerOut");
    private final static QName _NVGetCustomerWSOutput_QNAME = new QName("http://siebel.com/CustomUI", "NVGetCustomerWSOutput");

    
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.siebel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NVGetCustomerWSInput }
     * 
     */
    public NVGetCustomerWSInput createNVGetCustomerWSInput() {
        return new NVGetCustomerWSInput();
    }

    /**
     * Create an instance of {@link NVGetCustomerWSOutput }
     * 
     */
    public NVGetCustomerWSOutput createNVGetCustomerWSOutput() {
        return new NVGetCustomerWSOutput();
    }

    /**
     * Create an instance of {@link NVGetCustomerOut }
     * 
     */
    public NVGetCustomerOut createNVGetCustomerOut() {
        return new NVGetCustomerOut();
    }

    /**
     * Create an instance of {@link NVGetCustomerOutTopElmt }
     * 
     */
    public NVGetCustomerOutTopElmt createNVGetCustomerOutTopElmt() {
        return new NVGetCustomerOutTopElmt();
    }

    /**
     * Create an instance of {@link Conta }
     * 
     */
    public Conta createConta() {
        return new Conta();
    }

    /**
     * Create an instance of {@link Contato }
     * 
     */
    public Contato createContato() {
        return new Contato();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NVGetCustomerOut }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NVGetCustomerOut }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/xml/NVGetCustomerOut", name = "NVGetCustomerOut")
    public JAXBElement<NVGetCustomerOut> createNVGetCustomerOut(NVGetCustomerOut value) {
        return new JAXBElement<NVGetCustomerOut>(_NVGetCustomerOut_QNAME, NVGetCustomerOut.class, null, value);
    }
    
    @XmlElementDecl(namespace = "http://siebel.com/CustomUI", name = "NVGetCustomerWS_Output")
    public JAXBElement<NVGetCustomerWSOutput> createNVGetCustomerWSOutput(NVGetCustomerWSOutput value) {
        return new JAXBElement<NVGetCustomerWSOutput>(_NVGetCustomerWSOutput_QNAME, NVGetCustomerWSOutput.class, null, value);
    }
    
    
    

}
