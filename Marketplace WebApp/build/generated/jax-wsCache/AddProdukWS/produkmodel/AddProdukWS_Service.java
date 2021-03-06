
package produkmodel;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AddProdukWS", targetNamespace = "http://ProdukModel/", wsdlLocation = "http://localhost:8081/Marketplace_WebService/AddProdukWS?wsdl")
public class AddProdukWS_Service
    extends Service
{

    private final static URL ADDPRODUKWS_WSDL_LOCATION;
    private final static WebServiceException ADDPRODUKWS_EXCEPTION;
    private final static QName ADDPRODUKWS_QNAME = new QName("http://ProdukModel/", "AddProdukWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/Marketplace_WebService/AddProdukWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADDPRODUKWS_WSDL_LOCATION = url;
        ADDPRODUKWS_EXCEPTION = e;
    }

    public AddProdukWS_Service() {
        super(__getWsdlLocation(), ADDPRODUKWS_QNAME);
    }

    public AddProdukWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADDPRODUKWS_QNAME, features);
    }

    public AddProdukWS_Service(URL wsdlLocation) {
        super(wsdlLocation, ADDPRODUKWS_QNAME);
    }

    public AddProdukWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADDPRODUKWS_QNAME, features);
    }

    public AddProdukWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AddProdukWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AddProdukWS
     */
    @WebEndpoint(name = "AddProdukWSPort")
    public AddProdukWS getAddProdukWSPort() {
        return super.getPort(new QName("http://ProdukModel/", "AddProdukWSPort"), AddProdukWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AddProdukWS
     */
    @WebEndpoint(name = "AddProdukWSPort")
    public AddProdukWS getAddProdukWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ProdukModel/", "AddProdukWSPort"), AddProdukWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADDPRODUKWS_EXCEPTION!= null) {
            throw ADDPRODUKWS_EXCEPTION;
        }
        return ADDPRODUKWS_WSDL_LOCATION;
    }

}
