//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.20 at 11:10:41 AM BRT 
//


package br.com.deere.john.exercisesoap.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getVersaoResult" type="{http://tempuri.org/}versao"/&gt;
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
    "getVersaoResult"
})
@XmlRootElement(name = "getVersaoResponse")
public class GetVersaoResponse {

    @XmlElement(required = true)
    protected Versao getVersaoResult;

    /**
     * Gets the value of the getVersaoResult property.
     * 
     * @return
     *     possible object is
     *     {@link Versao }
     *     
     */
    public Versao getGetVersaoResult() {
        return getVersaoResult;
    }

    /**
     * Sets the value of the getVersaoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Versao }
     *     
     */
    public void setGetVersaoResult(Versao value) {
        this.getVersaoResult = value;
    }

}
