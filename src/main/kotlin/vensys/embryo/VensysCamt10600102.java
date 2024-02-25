package vensys.embryo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import java.io.StringWriter;

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
 */

@XmlRootElement(name = "Document")
@XmlAccessorType(XmlAccessType.FIELD)

@XmlType(name = "Document", propOrder = {
        "chrgsPmtReq"
})
public class VensysCamt10600102 {

    @XmlElement(name = "ChrgsPmtReq", required = true)
    protected ChargesPaymentRequestV02 chrgsPmtReq;

    /**
     * Gets the value of the chrgsPmtReq property.
     *
     * @return possible object is
     * {@link ChargesPaymentRequestV02 }
     */
    public ChargesPaymentRequestV02 getChrgsPmtReq() {
        return chrgsPmtReq;
    }

    /**
     * Sets the value of the chrgsPmtReq property.
     *
     * @param value allowed object is
     *              {@link ChargesPaymentRequestV02 }
     */
    public void setChrgsPmtReq(ChargesPaymentRequestV02 value) {
        this.chrgsPmtReq = value;
    }


    public String buatKeString() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(new Class[]{VensysCamt10600102.class});
        StringWriter sw = new StringWriter();
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty("jaxb.encoding", "UTF-8");
        marshaller.marshal(this, sw);
        return sw.toString();
    }

}
