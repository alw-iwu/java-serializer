//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.07.19 um 12:09:30 PM CEST 
//


package org.opcfoundation.ua._2008._02.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BrowseDirection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BrowseDirection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Forward_0"/&gt;
 *     &lt;enumeration value="Inverse_1"/&gt;
 *     &lt;enumeration value="Both_2"/&gt;
 *     &lt;enumeration value="Invalid_3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BrowseDirection")
@XmlEnum
public enum BrowseDirection {

    @XmlEnumValue("Forward_0")
    FORWARD_0("Forward_0"),
    @XmlEnumValue("Inverse_1")
    INVERSE_1("Inverse_1"),
    @XmlEnumValue("Both_2")
    BOTH_2("Both_2"),
    @XmlEnumValue("Invalid_3")
    INVALID_3("Invalid_3");
    private final String value;

    BrowseDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BrowseDirection fromValue(String v) {
        for (BrowseDirection c: BrowseDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
