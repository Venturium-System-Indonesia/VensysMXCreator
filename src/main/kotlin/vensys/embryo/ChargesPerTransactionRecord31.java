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
import java.util.ArrayList;
import java.util.List;


/**
 * Provides a detailed breakdown of the charges per payment transaction.
 * 
 * <p>Java class for ChargesPerTransactionRecord3__1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargesPerTransactionRecord3__1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UndrlygTx" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT5camt.106.001.02}TransactionReferences7__1"/&gt;
 *         &lt;element name="TtlChrgsPerRcrd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT5camt.106.001.02}TotalCharges8__1"/&gt;
 *         &lt;element name="ChrgsBrkdwn" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT5camt.106.001.02}ChargesBreakdown1__1" maxOccurs="unbounded"/&gt;
 *         &lt;element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT5camt.106.001.02}BranchAndFinancialInstitutionIdentification8__1" minOccurs="0"/&gt;
 *         &lt;element name="DbtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT5camt.106.001.02}CashAccount40__1" minOccurs="0"/&gt;
 *         &lt;element name="InstrForInstdAgt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT5camt.106.001.02}InstructionForInstructedAgent1__1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargesPerTransactionRecord3__1", propOrder = {
    "undrlygTx",
    "ttlChrgsPerRcrd",
    "chrgsBrkdwn",
    "dbtrAgt",
    "dbtrAgtAcct",
    "instrForInstdAgt"
})
public class ChargesPerTransactionRecord31 {

    @XmlElement(name = "UndrlygTx", required = true)
    protected TransactionReferences71 undrlygTx;
    @XmlElement(name = "TtlChrgsPerRcrd", required = true)
    protected TotalCharges81 ttlChrgsPerRcrd;
    @XmlElement(name = "ChrgsBrkdwn", required = true)
    protected List<ChargesBreakdown11> chrgsBrkdwn;
    @XmlElement(name = "DbtrAgt")
    protected BranchAndFinancialInstitutionIdentification81 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    protected CashAccount401 dbtrAgtAcct;
    @XmlElement(name = "InstrForInstdAgt")
    protected InstructionForInstructedAgent11 instrForInstdAgt;

    /**
     * Gets the value of the undrlygTx property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReferences71 }
     *     
     */
    public TransactionReferences71 getUndrlygTx() {
        return undrlygTx;
    }

    /**
     * Sets the value of the undrlygTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReferences71 }
     *     
     */
    public void setUndrlygTx(TransactionReferences71 value) {
        this.undrlygTx = value;
    }

    /**
     * Gets the value of the ttlChrgsPerRcrd property.
     * 
     * @return
     *     possible object is
     *     {@link TotalCharges81 }
     *     
     */
    public TotalCharges81 getTtlChrgsPerRcrd() {
        return ttlChrgsPerRcrd;
    }

    /**
     * Sets the value of the ttlChrgsPerRcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalCharges81 }
     *     
     */
    public void setTtlChrgsPerRcrd(TotalCharges81 value) {
        this.ttlChrgsPerRcrd = value;
    }

    /**
     * Gets the value of the chrgsBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the chrgsBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgsBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesBreakdown11 }
     * 
     * 
     */
    public List<ChargesBreakdown11> getChrgsBrkdwn() {
        if (chrgsBrkdwn == null) {
            chrgsBrkdwn = new ArrayList<ChargesBreakdown11>();
        }
        return this.chrgsBrkdwn;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification81 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification81 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification81 }
     *     
     */
    public void setDbtrAgt(BranchAndFinancialInstitutionIdentification81 value) {
        this.dbtrAgt = value;
    }

    /**
     * Gets the value of the dbtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount401 }
     *     
     */
    public CashAccount401 getDbtrAgtAcct() {
        return dbtrAgtAcct;
    }

    /**
     * Sets the value of the dbtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount401 }
     *     
     */
    public void setDbtrAgtAcct(CashAccount401 value) {
        this.dbtrAgtAcct = value;
    }

    /**
     * Gets the value of the instrForInstdAgt property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionForInstructedAgent11 }
     *     
     */
    public InstructionForInstructedAgent11 getInstrForInstdAgt() {
        return instrForInstdAgt;
    }

    /**
     * Sets the value of the instrForInstdAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionForInstructedAgent11 }
     *     
     */
    public void setInstrForInstdAgt(InstructionForInstructedAgent11 value) {
        this.instrForInstdAgt = value;
    }

}