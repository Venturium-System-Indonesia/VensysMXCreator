//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.19 at 11:46:10 PM ICT 
//


package vensys.embryo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import java.io.StringWriter;


/**
 * Specifies the total amount of records and charges included in the block.
 * 
 * <p>Java class for TotalCharges8__1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalCharges8__1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NbOfChrgsBrkdwnItms" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT5camt.106.001.02}Max15NumericText"/&gt;
 *         &lt;element name="TtlChrgsAmt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT5camt.106.001.02}CBPR_Amount"/&gt;
 *         &lt;element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT5camt.106.001.02}CreditDebitCode__1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalCharges8__1", propOrder = {
    "nbOfChrgsBrkdwnItms",
    "ttlChrgsAmt",
    "cdtDbtInd"
})
public class TotalCharges81 {

    @XmlElement(name = "NbOfChrgsBrkdwnItms", required = true)
    protected String nbOfChrgsBrkdwnItms;
    @XmlElement(name = "TtlChrgsAmt", required = true)
    protected CBPRAmount ttlChrgsAmt;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode1 cdtDbtInd;

    /**
     * Gets the value of the nbOfChrgsBrkdwnItms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfChrgsBrkdwnItms() {
        return nbOfChrgsBrkdwnItms;
    }

    /**
     * Sets the value of the nbOfChrgsBrkdwnItms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfChrgsBrkdwnItms(String value) {
        this.nbOfChrgsBrkdwnItms = value;
    }

    /**
     * Gets the value of the ttlChrgsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CBPRAmount }
     *     
     */
    public CBPRAmount getTtlChrgsAmt() {
        return ttlChrgsAmt;
    }

    /**
     * Sets the value of the ttlChrgsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CBPRAmount }
     *     
     */
    public void setTtlChrgsAmt(CBPRAmount value) {
        this.ttlChrgsAmt = value;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode1 }
     *     
     */
    public CreditDebitCode1 getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode1 }
     *     
     */
    public void setCdtDbtInd(CreditDebitCode1 value) {
        this.cdtDbtInd = value;
    }

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
     *         &lt;element name="ChrgsPmtReq" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT5camt.106.001.02}ChargesPaymentRequestV02"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */

    @XmlRootElement (name = "Document")
    @XmlAccessorType(XmlAccessType.FIELD)

    @XmlType(name = "Document", propOrder = {
        "chrgsPmtReq"
    })
    public static class VensysCamt10600101 {

        @XmlElement(name = "ChrgsPmtReq", required = true)
        protected ChargesPaymentRequestV02 chrgsPmtReq;

        /**
         * Gets the value of the chrgsPmtReq property.
         *
         * @return
         *     possible object is
         *     {@link ChargesPaymentRequestV02 }
         *
         */
        public ChargesPaymentRequestV02 getChrgsPmtReq() {
            return chrgsPmtReq;
        }

        /**
         * Sets the value of the chrgsPmtReq property.
         *
         * @param value
         *     allowed object is
         *     {@link ChargesPaymentRequestV02 }
         *
         */
        public void setChrgsPmtReq(ChargesPaymentRequestV02 value) {
            this.chrgsPmtReq = value;
        }


        public String buatKeString() throws JAXBException {
            JAXBContext context = JAXBContext.newInstance(new Class[]{VensysCamt10600101.class});
            StringWriter sw = new StringWriter();
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty("jaxb.encoding", "UTF-8");
            marshaller.marshal(this, sw);
            return sw.toString();
        }

    }
}