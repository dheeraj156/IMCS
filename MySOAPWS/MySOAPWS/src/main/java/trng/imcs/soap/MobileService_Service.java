
package trng.imcs.soap;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "MobileService", targetNamespace = "http://www.imcs.trng/MobileService/", wsdlLocation = "file:/C:/Manohar/workspace-imcs4-training-advJava/MySOAPWS/src/main/resources/wsdl/MobileService.wsdl")
public class MobileService_Service
    extends Service
{

    private final static URL MOBILESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(trng.imcs.soap.MobileService_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = trng.imcs.soap.MobileService_Service.class.getResource(".");
            url = new URL(baseUrl, "file:/C:/Manohar/workspace-imcs4-training-advJava/MySOAPWS/src/main/resources/wsdl/MobileService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/C:/Manohar/workspace-imcs4-training-advJava/MySOAPWS/src/main/resources/wsdl/MobileService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        MOBILESERVICE_WSDL_LOCATION = url;
    }

    public MobileService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MobileService_Service() {
        super(MOBILESERVICE_WSDL_LOCATION, new QName("http://www.imcs.trng/MobileService/", "MobileService"));
    }

    /**
     * 
     * @return
     *     returns MobileService
     */
    @WebEndpoint(name = "MobileServiceSOAP")
    public MobileService getMobileServiceSOAP() {
        return super.getPort(new QName("http://www.imcs.trng/MobileService/", "MobileServiceSOAP"), MobileService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MobileService
     */
    @WebEndpoint(name = "MobileServiceSOAP")
    public MobileService getMobileServiceSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.imcs.trng/MobileService/", "MobileServiceSOAP"), MobileService.class, features);
    }

}
