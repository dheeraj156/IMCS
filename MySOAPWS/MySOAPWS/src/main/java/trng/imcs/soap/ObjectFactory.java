
package trng.imcs.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the trng.imcs.soap package. 
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
public class ObjectFactory {

    private final static QName _RechargeMobileResponse_QNAME = new QName("http://www.imcs.trng/RechargeMobile", "RechargeMobileResponse");
    private final static QName _RechargeMobileRequest_QNAME = new QName("http://www.imcs.trng/RechargeMobile", "RechargeMobileRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: trng.imcs.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RechargeMobileResponse }
     * 
     */
    public RechargeMobileResponse createRechargeMobileResponse() {
        return new RechargeMobileResponse();
    }

    /**
     * Create an instance of {@link RechargeMobileRequest }
     * 
     */
    public RechargeMobileRequest createRechargeMobileRequest() {
        return new RechargeMobileRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechargeMobileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.imcs.trng/RechargeMobile", name = "RechargeMobileResponse")
    public JAXBElement<RechargeMobileResponse> createRechargeMobileResponse(RechargeMobileResponse value) {
        return new JAXBElement<RechargeMobileResponse>(_RechargeMobileResponse_QNAME, RechargeMobileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechargeMobileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.imcs.trng/RechargeMobile", name = "RechargeMobileRequest")
    public JAXBElement<RechargeMobileRequest> createRechargeMobileRequest(RechargeMobileRequest value) {
        return new JAXBElement<RechargeMobileRequest>(_RechargeMobileRequest_QNAME, RechargeMobileRequest.class, null, value);
    }

}
