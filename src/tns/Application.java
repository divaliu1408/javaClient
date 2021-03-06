
package tns;

import java.math.BigInteger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import rules.Rules;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Application", targetNamespace = "tns")
@XmlSeeAlso({
    rules.ObjectFactory.class,
    tns.ObjectFactory.class
})
public interface Application {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "get_graph", action = "get_graph")
    @WebResult(name = "get_graphResult", targetNamespace = "tns")
    @RequestWrapper(localName = "get_graph", targetNamespace = "tns", className = "tns.GetGraph")
    @ResponseWrapper(localName = "get_graphResponse", targetNamespace = "tns", className = "tns.GetGraphResponse")
    public String getGraph(
        @WebParam(name = "name", targetNamespace = "tns")
        String name);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "get_hi", action = "get_hi")
    @WebResult(name = "get_hiResult", targetNamespace = "tns")
    @RequestWrapper(localName = "get_hi", targetNamespace = "tns", className = "tns.GetHi")
    @ResponseWrapper(localName = "get_hiResponse", targetNamespace = "tns", className = "tns.GetHiResponse")
    public String getHi(
        @WebParam(name = "name", targetNamespace = "tns")
        String name);

    /**
     * 
     * @param rules
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "get_recommend", action = "get_recommend")
    @WebResult(name = "get_recommendResult", targetNamespace = "tns")
    @RequestWrapper(localName = "get_recommend", targetNamespace = "tns", className = "tns.GetRecommend")
    @ResponseWrapper(localName = "get_recommendResponse", targetNamespace = "tns", className = "tns.GetRecommendResponse")
    public Boolean getRecommend(
        @WebParam(name = "rules", targetNamespace = "tns")
        Rules rules);

    /**
     * 
     * @param times
     * @param name
     * @return
     *     returns tns.StringArray
     */
    @WebMethod(operationName = "say_hello", action = "say_hello")
    @WebResult(name = "say_helloResult", targetNamespace = "tns")
    @RequestWrapper(localName = "say_hello", targetNamespace = "tns", className = "tns.SayHello")
    @ResponseWrapper(localName = "say_helloResponse", targetNamespace = "tns", className = "tns.SayHelloResponse")
    public StringArray sayHello(
        @WebParam(name = "name", targetNamespace = "tns")
        String name,
        @WebParam(name = "times", targetNamespace = "tns")
        BigInteger times);

}
