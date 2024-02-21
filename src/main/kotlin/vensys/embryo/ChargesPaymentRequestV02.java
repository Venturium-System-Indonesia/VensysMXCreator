//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.19 at 11:46:10 PM ICT 
//


package vensys.embryo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The ChargesPaymentRequest message is sent by a financial institution to another financial institution to request the payment of charges, interest and/or other expenses which are previously unknown to the receiver.
 * 
 * <p>Java class for ChargesPaymentRequestV02 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargesPaymentRequestV02"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT5camt.106.001.02}GroupHeader115__1"/&gt;
 *         &lt;element name="Chrgs" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT5camt.106.001.02}Charges3Choice__1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesPaymentRequestV02", propOrder = {
    "grpHdr",
    "chrgs"
})
public class ChargesPaymentRequestV02 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1151 grpHdr;
    @XmlElement(name = "Chrgs", required = true)
    protected Charges3Choice1 chrgs;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader1151 }
     *     
     */
    public GroupHeader1151 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader1151 }
     *     
     */
    public void setGrpHdr(GroupHeader1151 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * @return
     *     possible object is
     *     {@link Charges3Choice1 }
     *     
     */
    public Charges3Choice1 getChrgs() {
        return chrgs;
    }

    /**
     * Sets the value of the chrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charges3Choice1 }
     *     
     */
    public void setChrgs(Charges3Choice1 value) {
        this.chrgs = value;
    }

}
