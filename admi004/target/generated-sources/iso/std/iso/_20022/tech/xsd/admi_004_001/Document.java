//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.20 at 11:42:59 AM IST 
//


package iso.std.iso._20022.tech.xsd.admi_004_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SysEvtNtfctn" type="{urn:iso:std:iso:20022:tech:xsd:admi.004.001.02}SystemEventNotificationV02"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sysEvtNtfctn"
})
public class Document {

    @XmlElement(name = "SysEvtNtfctn", required = true)
    protected SystemEventNotificationV02 sysEvtNtfctn;

    /**
     * Gets the value of the sysEvtNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link SystemEventNotificationV02 }
     *     
     */
    public SystemEventNotificationV02 getSysEvtNtfctn() {
        return sysEvtNtfctn;
    }

    /**
     * Sets the value of the sysEvtNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemEventNotificationV02 }
     *     
     */
    public void setSysEvtNtfctn(SystemEventNotificationV02 value) {
        this.sysEvtNtfctn = value;
    }

}
