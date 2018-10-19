
package tns;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import rules.Rules;


/**
 * <p>get_recommend complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="get_recommend">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rules" type="{Rules}Rules" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_recommend", propOrder = {
    "rules"
})
public class GetRecommend {

    @XmlElementRef(name = "rules", namespace = "tns", type = JAXBElement.class, required = false)
    protected JAXBElement<Rules> rules;

    /**
     * ��ȡrules���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Rules }{@code >}
     *     
     */
    public JAXBElement<Rules> getRules() {
        return rules;
    }

    /**
     * ����rules���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Rules }{@code >}
     *     
     */
    public void setRules(JAXBElement<Rules> value) {
        this.rules = value;
    }

}
