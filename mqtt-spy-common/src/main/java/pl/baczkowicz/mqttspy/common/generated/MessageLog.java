//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.07 at 11:02:11 PM GMT 
//


package pl.baczkowicz.mqttspy.common.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for MessageLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageLog"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://baczkowicz.pl/mqtt-spy/common&gt;MessageLogEnum"&gt;
 *       &lt;attribute name="logFile" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="logQos" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="logRetained" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="logConnection" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="logSubscription" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="logBeforeScripts" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageLog", propOrder = {
    "value"
})
public class MessageLog implements Serializable, Cloneable, CopyTo, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected MessageLogEnum value;
    @XmlAttribute(name = "logFile")
    protected String logFile;
    @XmlAttribute(name = "logQos")
    protected Boolean logQos;
    @XmlAttribute(name = "logRetained")
    protected Boolean logRetained;
    @XmlAttribute(name = "logConnection")
    protected Boolean logConnection;
    @XmlAttribute(name = "logSubscription")
    protected Boolean logSubscription;
    @XmlAttribute(name = "logBeforeScripts")
    protected Boolean logBeforeScripts;

    /**
     * Default no-arg constructor
     * 
     */
    public MessageLog() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public MessageLog(final MessageLogEnum value, final String logFile, final Boolean logQos, final Boolean logRetained, final Boolean logConnection, final Boolean logSubscription, final Boolean logBeforeScripts) {
        this.value = value;
        this.logFile = logFile;
        this.logQos = logQos;
        this.logRetained = logRetained;
        this.logConnection = logConnection;
        this.logSubscription = logSubscription;
        this.logBeforeScripts = logBeforeScripts;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link MessageLogEnum }
     *     
     */
    public MessageLogEnum getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageLogEnum }
     *     
     */
    public void setValue(MessageLogEnum value) {
        this.value = value;
    }

    /**
     * Gets the value of the logFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogFile() {
        return logFile;
    }

    /**
     * Sets the value of the logFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogFile(String value) {
        this.logFile = value;
    }

    /**
     * Gets the value of the logQos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogQos() {
        return logQos;
    }

    /**
     * Sets the value of the logQos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogQos(Boolean value) {
        this.logQos = value;
    }

    /**
     * Gets the value of the logRetained property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogRetained() {
        return logRetained;
    }

    /**
     * Sets the value of the logRetained property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogRetained(Boolean value) {
        this.logRetained = value;
    }

    /**
     * Gets the value of the logConnection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogConnection() {
        return logConnection;
    }

    /**
     * Sets the value of the logConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogConnection(Boolean value) {
        this.logConnection = value;
    }

    /**
     * Gets the value of the logSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogSubscription() {
        return logSubscription;
    }

    /**
     * Sets the value of the logSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogSubscription(Boolean value) {
        this.logSubscription = value;
    }

    /**
     * Gets the value of the logBeforeScripts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogBeforeScripts() {
        return logBeforeScripts;
    }

    /**
     * Sets the value of the logBeforeScripts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogBeforeScripts(Boolean value) {
        this.logBeforeScripts = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            MessageLogEnum theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            String theLogFile;
            theLogFile = this.getLogFile();
            strategy.appendField(locator, this, "logFile", buffer, theLogFile);
        }
        {
            Boolean theLogQos;
            theLogQos = this.isLogQos();
            strategy.appendField(locator, this, "logQos", buffer, theLogQos);
        }
        {
            Boolean theLogRetained;
            theLogRetained = this.isLogRetained();
            strategy.appendField(locator, this, "logRetained", buffer, theLogRetained);
        }
        {
            Boolean theLogConnection;
            theLogConnection = this.isLogConnection();
            strategy.appendField(locator, this, "logConnection", buffer, theLogConnection);
        }
        {
            Boolean theLogSubscription;
            theLogSubscription = this.isLogSubscription();
            strategy.appendField(locator, this, "logSubscription", buffer, theLogSubscription);
        }
        {
            Boolean theLogBeforeScripts;
            theLogBeforeScripts = this.isLogBeforeScripts();
            strategy.appendField(locator, this, "logBeforeScripts", buffer, theLogBeforeScripts);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MessageLog)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MessageLog that = ((MessageLog) object);
        {
            MessageLogEnum lhsValue;
            lhsValue = this.getValue();
            MessageLogEnum rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            String lhsLogFile;
            lhsLogFile = this.getLogFile();
            String rhsLogFile;
            rhsLogFile = that.getLogFile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logFile", lhsLogFile), LocatorUtils.property(thatLocator, "logFile", rhsLogFile), lhsLogFile, rhsLogFile)) {
                return false;
            }
        }
        {
            Boolean lhsLogQos;
            lhsLogQos = this.isLogQos();
            Boolean rhsLogQos;
            rhsLogQos = that.isLogQos();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logQos", lhsLogQos), LocatorUtils.property(thatLocator, "logQos", rhsLogQos), lhsLogQos, rhsLogQos)) {
                return false;
            }
        }
        {
            Boolean lhsLogRetained;
            lhsLogRetained = this.isLogRetained();
            Boolean rhsLogRetained;
            rhsLogRetained = that.isLogRetained();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logRetained", lhsLogRetained), LocatorUtils.property(thatLocator, "logRetained", rhsLogRetained), lhsLogRetained, rhsLogRetained)) {
                return false;
            }
        }
        {
            Boolean lhsLogConnection;
            lhsLogConnection = this.isLogConnection();
            Boolean rhsLogConnection;
            rhsLogConnection = that.isLogConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logConnection", lhsLogConnection), LocatorUtils.property(thatLocator, "logConnection", rhsLogConnection), lhsLogConnection, rhsLogConnection)) {
                return false;
            }
        }
        {
            Boolean lhsLogSubscription;
            lhsLogSubscription = this.isLogSubscription();
            Boolean rhsLogSubscription;
            rhsLogSubscription = that.isLogSubscription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logSubscription", lhsLogSubscription), LocatorUtils.property(thatLocator, "logSubscription", rhsLogSubscription), lhsLogSubscription, rhsLogSubscription)) {
                return false;
            }
        }
        {
            Boolean lhsLogBeforeScripts;
            lhsLogBeforeScripts = this.isLogBeforeScripts();
            Boolean rhsLogBeforeScripts;
            rhsLogBeforeScripts = that.isLogBeforeScripts();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "logBeforeScripts", lhsLogBeforeScripts), LocatorUtils.property(thatLocator, "logBeforeScripts", rhsLogBeforeScripts), lhsLogBeforeScripts, rhsLogBeforeScripts)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            MessageLogEnum theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        {
            String theLogFile;
            theLogFile = this.getLogFile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logFile", theLogFile), currentHashCode, theLogFile);
        }
        {
            Boolean theLogQos;
            theLogQos = this.isLogQos();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logQos", theLogQos), currentHashCode, theLogQos);
        }
        {
            Boolean theLogRetained;
            theLogRetained = this.isLogRetained();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logRetained", theLogRetained), currentHashCode, theLogRetained);
        }
        {
            Boolean theLogConnection;
            theLogConnection = this.isLogConnection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logConnection", theLogConnection), currentHashCode, theLogConnection);
        }
        {
            Boolean theLogSubscription;
            theLogSubscription = this.isLogSubscription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logSubscription", theLogSubscription), currentHashCode, theLogSubscription);
        }
        {
            Boolean theLogBeforeScripts;
            theLogBeforeScripts = this.isLogBeforeScripts();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "logBeforeScripts", theLogBeforeScripts), currentHashCode, theLogBeforeScripts);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof MessageLog) {
            final MessageLog copy = ((MessageLog) draftCopy);
            if (this.value!= null) {
                MessageLogEnum sourceValue;
                sourceValue = this.getValue();
                MessageLogEnum copyValue = ((MessageLogEnum) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue));
                copy.setValue(copyValue);
            } else {
                copy.value = null;
            }
            if (this.logFile!= null) {
                String sourceLogFile;
                sourceLogFile = this.getLogFile();
                String copyLogFile = ((String) strategy.copy(LocatorUtils.property(locator, "logFile", sourceLogFile), sourceLogFile));
                copy.setLogFile(copyLogFile);
            } else {
                copy.logFile = null;
            }
            if (this.logQos!= null) {
                Boolean sourceLogQos;
                sourceLogQos = this.isLogQos();
                Boolean copyLogQos = ((Boolean) strategy.copy(LocatorUtils.property(locator, "logQos", sourceLogQos), sourceLogQos));
                copy.setLogQos(copyLogQos);
            } else {
                copy.logQos = null;
            }
            if (this.logRetained!= null) {
                Boolean sourceLogRetained;
                sourceLogRetained = this.isLogRetained();
                Boolean copyLogRetained = ((Boolean) strategy.copy(LocatorUtils.property(locator, "logRetained", sourceLogRetained), sourceLogRetained));
                copy.setLogRetained(copyLogRetained);
            } else {
                copy.logRetained = null;
            }
            if (this.logConnection!= null) {
                Boolean sourceLogConnection;
                sourceLogConnection = this.isLogConnection();
                Boolean copyLogConnection = ((Boolean) strategy.copy(LocatorUtils.property(locator, "logConnection", sourceLogConnection), sourceLogConnection));
                copy.setLogConnection(copyLogConnection);
            } else {
                copy.logConnection = null;
            }
            if (this.logSubscription!= null) {
                Boolean sourceLogSubscription;
                sourceLogSubscription = this.isLogSubscription();
                Boolean copyLogSubscription = ((Boolean) strategy.copy(LocatorUtils.property(locator, "logSubscription", sourceLogSubscription), sourceLogSubscription));
                copy.setLogSubscription(copyLogSubscription);
            } else {
                copy.logSubscription = null;
            }
            if (this.logBeforeScripts!= null) {
                Boolean sourceLogBeforeScripts;
                sourceLogBeforeScripts = this.isLogBeforeScripts();
                Boolean copyLogBeforeScripts = ((Boolean) strategy.copy(LocatorUtils.property(locator, "logBeforeScripts", sourceLogBeforeScripts), sourceLogBeforeScripts));
                copy.setLogBeforeScripts(copyLogBeforeScripts);
            } else {
                copy.logBeforeScripts = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MessageLog();
    }

}
