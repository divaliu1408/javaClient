
package rules;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rules package. 
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

    private final static QName _Rules_QNAME = new QName("Rules", "Rules");
    private final static QName _RulesUsername_QNAME = new QName("Rules", "username");
    private final static QName _RulesEmotion_QNAME = new QName("Rules", "emotion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rules
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Rules }
     * 
     */
    public Rules createRules() {
        return new Rules();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Rules", name = "Rules")
    public JAXBElement<Rules> createRules(Rules value) {
        return new JAXBElement<Rules>(_Rules_QNAME, Rules.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Rules", name = "username", scope = Rules.class)
    public JAXBElement<String> createRulesUsername(String value) {
        return new JAXBElement<String>(_RulesUsername_QNAME, String.class, Rules.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Rules", name = "emotion", scope = Rules.class)
    public JAXBElement<String> createRulesEmotion(String value) {
        return new JAXBElement<String>(_RulesEmotion_QNAME, String.class, Rules.class, value);
    }

}
