//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CharacterSetCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CharacterSetCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="US-ASCII"/&gt;
 *     &lt;enumeration value="ISO-8859-1"/&gt;
 *     &lt;enumeration value="ISO-8859-2"/&gt;
 *     &lt;enumeration value="ISO-8859-4"/&gt;
 *     &lt;enumeration value="ISO-8859-5"/&gt;
 *     &lt;enumeration value="ISO-8859-7"/&gt;
 *     &lt;enumeration value="ISO-8859-9"/&gt;
 *     &lt;enumeration value="ISO-8859-13"/&gt;
 *     &lt;enumeration value="ISO-8859-15"/&gt;
 *     &lt;enumeration value="UTF-8"/&gt;
 *     &lt;enumeration value="UTF-16BE"/&gt;
 *     &lt;enumeration value="UTF-16LE"/&gt;
 *     &lt;enumeration value="UTF-16"/&gt;
 *     &lt;enumeration value="UTF-32"/&gt;
 *     &lt;enumeration value="UTF-32BE"/&gt;
 *     &lt;enumeration value="UTF-32LE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CharacterSetCode", namespace = "http://amdocs/tef-vivo/core/types/v1")
@XmlEnum
public enum CharacterSetCode {


    /**
     * Seven-bit ASCII, a.k.a. ISO646-US, a.k.a. the Basic Latin block of the Unicode character set
     * 
     */
    @XmlEnumValue("US-ASCII")
    US_ASCII("US-ASCII"),

    /**
     * ISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1
     * 
     */
    @XmlEnumValue("ISO-8859-1")
    ISO_8859_1("ISO-8859-1"),

    /**
     * Latin Alphabet No. 2
     * 
     */
    @XmlEnumValue("ISO-8859-2")
    ISO_8859_2("ISO-8859-2"),

    /**
     * Latin Alphabet No. 4
     * 
     */
    @XmlEnumValue("ISO-8859-4")
    ISO_8859_4("ISO-8859-4"),

    /**
     * Latin/Cyrillic Alphabet
     * 
     */
    @XmlEnumValue("ISO-8859-5")
    ISO_8859_5("ISO-8859-5"),

    /**
     * Latin/Greek Alphabet (ISO-8859-7:2003)
     * 
     */
    @XmlEnumValue("ISO-8859-7")
    ISO_8859_7("ISO-8859-7"),

    /**
     * Latin Alphabet No. 5
     * 
     */
    @XmlEnumValue("ISO-8859-9")
    ISO_8859_9("ISO-8859-9"),

    /**
     * Latin Alphabet No. 7
     * 
     */
    @XmlEnumValue("ISO-8859-13")
    ISO_8859_13("ISO-8859-13"),

    /**
     * Latin Alphabet No. 9
     * 
     */
    @XmlEnumValue("ISO-8859-15")
    ISO_8859_15("ISO-8859-15"),

    /**
     * Eight-bit UCS Transformation Format
     * 
     */
    @XmlEnumValue("UTF-8")
    UTF_8("UTF-8"),

    /**
     * Sixteen-bit UCS Transformation Format, big-endian byte order
     * 
     */
    @XmlEnumValue("UTF-16BE")
    UTF_16_BE("UTF-16BE"),

    /**
     * Sixteen-bit UCS Transformation Format, little-endian byte order
     * 
     */
    @XmlEnumValue("UTF-16LE")
    UTF_16_LE("UTF-16LE"),

    /**
     * Sixteen-bit UCS Transformation Format, byte order identified by an optional byte-order mark
     * 
     */
    @XmlEnumValue("UTF-16")
    UTF_16("UTF-16"),

    /**
     *  32-bit Unicode (or UCS) Transformation Format, byte order identified by an optional byte-order mark
     * 
     */
    @XmlEnumValue("UTF-32")
    UTF_32("UTF-32"),

    /**
     *  32-bit Unicode (or UCS) Transformation Format, big-endian byte order
     * 
     */
    @XmlEnumValue("UTF-32BE")
    UTF_32_BE("UTF-32BE"),

    /**
     *  32-bit Unicode (or UCS) Transformation Format, little-endian byte order
     * 
     */
    @XmlEnumValue("UTF-32LE")
    UTF_32_LE("UTF-32LE");
    private final String value;

    CharacterSetCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CharacterSetCode fromValue(String v) {
        for (CharacterSetCode c: CharacterSetCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
