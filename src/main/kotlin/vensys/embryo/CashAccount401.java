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
 * Provides the details to identify an account.
 * 
 * <p>Java class for CashAccount40__1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashAccount40__1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT5camt.106.001.02}AccountIdentification4Choice__1"/&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT5camt.106.001.02}CashAccountType2Choice__1" minOccurs="0"/&gt;
 *         &lt;element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT5camt.106.001.02}ActiveOrHistoricCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT5camt.106.001.02}CBPR_RestrictedFINXMax70Text" minOccurs="0"/&gt;
 *         &lt;element name="Prxy" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT5camt.106.001.02}ProxyAccountIdentification1__1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount40__1", propOrder = {
    "id",
    "tp",
    "ccy",
    "nm",
    "prxy"
})
public class CashAccount401 {

    @XmlElement(name = "Id", required = true)
    protected AccountIdentification4Choice1 id;
    @XmlElement(name = "Tp")
    protected CashAccountType2Choice1 tp;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Prxy")
    protected ProxyAccountIdentification11 prxy;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice1 }
     *     
     */
    public AccountIdentification4Choice1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice1 }
     *     
     */
    public void setId(AccountIdentification4Choice1 value) {
        this.id = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountType2Choice1 }
     *     
     */
    public CashAccountType2Choice1 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountType2Choice1 }
     *     
     */
    public void setTp(CashAccountType2Choice1 value) {
        this.tp = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyAccountIdentification11 }
     *     
     */
    public ProxyAccountIdentification11 getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyAccountIdentification11 }
     *     
     */
    public void setPrxy(ProxyAccountIdentification11 value) {
        this.prxy = value;
    }

}