
package tns;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import rules.Rules;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tns package. 
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

    private final static QName _GetHiResponse_QNAME = new QName("tns", "get_hiResponse");
    private final static QName _SayHello_QNAME = new QName("tns", "say_hello");
    private final static QName _GetGraph_QNAME = new QName("tns", "get_graph");
    private final static QName _StringArray_QNAME = new QName("tns", "stringArray");
    private final static QName _GetGraphResponse_QNAME = new QName("tns", "get_graphResponse");
    private final static QName _GetRecommendResponse_QNAME = new QName("tns", "get_recommendResponse");
    private final static QName _GetHi_QNAME = new QName("tns", "get_hi");
    private final static QName _SayHelloResponse_QNAME = new QName("tns", "say_helloResponse");
    private final static QName _GetRecommend_QNAME = new QName("tns", "get_recommend");
    private final static QName _GetGraphName_QNAME = new QName("tns", "name");
    private final static QName _SayHelloResponseSayHelloResult_QNAME = new QName("tns", "say_helloResult");
    private final static QName _GetRecommendRules_QNAME = new QName("tns", "rules");
    private final static QName _GetHiResponseGetHiResult_QNAME = new QName("tns", "get_hiResult");
    private final static QName _SayHelloTimes_QNAME = new QName("tns", "times");
    private final static QName _GetRecommendResponseGetRecommendResult_QNAME = new QName("tns", "get_recommendResult");
    private final static QName _GetGraphResponseGetGraphResult_QNAME = new QName("tns", "get_graphResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tns
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRecommendResponse }
     * 
     */
    public GetRecommendResponse createGetRecommendResponse() {
        return new GetRecommendResponse();
    }

    /**
     * Create an instance of {@link GetHi }
     * 
     */
    public GetHi createGetHi() {
        return new GetHi();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link GetRecommend }
     * 
     */
    public GetRecommend createGetRecommend() {
        return new GetRecommend();
    }

    /**
     * Create an instance of {@link GetHiResponse }
     * 
     */
    public GetHiResponse createGetHiResponse() {
        return new GetHiResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link GetGraph }
     * 
     */
    public GetGraph createGetGraph() {
        return new GetGraph();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link GetGraphResponse }
     * 
     */
    public GetGraphResponse createGetGraphResponse() {
        return new GetGraphResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_hiResponse")
    public JAXBElement<GetHiResponse> createGetHiResponse(GetHiResponse value) {
        return new JAXBElement<GetHiResponse>(_GetHiResponse_QNAME, GetHiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "say_hello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGraph }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_graph")
    public JAXBElement<GetGraph> createGetGraph(GetGraph value) {
        return new JAXBElement<GetGraph>(_GetGraph_QNAME, GetGraph.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "stringArray")
    public JAXBElement<StringArray> createStringArray(StringArray value) {
        return new JAXBElement<StringArray>(_StringArray_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGraphResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_graphResponse")
    public JAXBElement<GetGraphResponse> createGetGraphResponse(GetGraphResponse value) {
        return new JAXBElement<GetGraphResponse>(_GetGraphResponse_QNAME, GetGraphResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecommendResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_recommendResponse")
    public JAXBElement<GetRecommendResponse> createGetRecommendResponse(GetRecommendResponse value) {
        return new JAXBElement<GetRecommendResponse>(_GetRecommendResponse_QNAME, GetRecommendResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_hi")
    public JAXBElement<GetHi> createGetHi(GetHi value) {
        return new JAXBElement<GetHi>(_GetHi_QNAME, GetHi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "say_helloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecommend }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_recommend")
    public JAXBElement<GetRecommend> createGetRecommend(GetRecommend value) {
        return new JAXBElement<GetRecommend>(_GetRecommend_QNAME, GetRecommend.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "name", scope = GetGraph.class)
    public JAXBElement<String> createGetGraphName(String value) {
        return new JAXBElement<String>(_GetGraphName_QNAME, String.class, GetGraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "say_helloResult", scope = SayHelloResponse.class)
    public JAXBElement<StringArray> createSayHelloResponseSayHelloResult(StringArray value) {
        return new JAXBElement<StringArray>(_SayHelloResponseSayHelloResult_QNAME, StringArray.class, SayHelloResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "rules", scope = GetRecommend.class)
    public JAXBElement<Rules> createGetRecommendRules(Rules value) {
        return new JAXBElement<Rules>(_GetRecommendRules_QNAME, Rules.class, GetRecommend.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_hiResult", scope = GetHiResponse.class)
    public JAXBElement<String> createGetHiResponseGetHiResult(String value) {
        return new JAXBElement<String>(_GetHiResponseGetHiResult_QNAME, String.class, GetHiResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "name", scope = SayHello.class)
    public JAXBElement<String> createSayHelloName(String value) {
        return new JAXBElement<String>(_GetGraphName_QNAME, String.class, SayHello.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "times", scope = SayHello.class)
    public JAXBElement<BigInteger> createSayHelloTimes(BigInteger value) {
        return new JAXBElement<BigInteger>(_SayHelloTimes_QNAME, BigInteger.class, SayHello.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_recommendResult", scope = GetRecommendResponse.class)
    public JAXBElement<Boolean> createGetRecommendResponseGetRecommendResult(Boolean value) {
        return new JAXBElement<Boolean>(_GetRecommendResponseGetRecommendResult_QNAME, Boolean.class, GetRecommendResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "name", scope = GetHi.class)
    public JAXBElement<String> createGetHiName(String value) {
        return new JAXBElement<String>(_GetGraphName_QNAME, String.class, GetHi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "tns", name = "get_graphResult", scope = GetGraphResponse.class)
    public JAXBElement<String> createGetGraphResponseGetGraphResult(String value) {
        return new JAXBElement<String>(_GetGraphResponseGetGraphResult_QNAME, String.class, GetGraphResponse.class, value);
    }

}
