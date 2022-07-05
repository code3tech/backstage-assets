//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.07.22 às 08:55:05 AM BRT 
//


package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.out.stub.amdocs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CountryCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CountryCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AFG"/&gt;
 *     &lt;enumeration value="ALA"/&gt;
 *     &lt;enumeration value="ALB"/&gt;
 *     &lt;enumeration value="DZA"/&gt;
 *     &lt;enumeration value="ASM"/&gt;
 *     &lt;enumeration value="AND"/&gt;
 *     &lt;enumeration value="AGO"/&gt;
 *     &lt;enumeration value="AIA"/&gt;
 *     &lt;enumeration value="ATA"/&gt;
 *     &lt;enumeration value="ATG"/&gt;
 *     &lt;enumeration value="ARG"/&gt;
 *     &lt;enumeration value="ARM"/&gt;
 *     &lt;enumeration value="ABW"/&gt;
 *     &lt;enumeration value="AUS"/&gt;
 *     &lt;enumeration value="AUT"/&gt;
 *     &lt;enumeration value="AZE"/&gt;
 *     &lt;enumeration value="BHS"/&gt;
 *     &lt;enumeration value="BHR"/&gt;
 *     &lt;enumeration value="BGD"/&gt;
 *     &lt;enumeration value="BRB"/&gt;
 *     &lt;enumeration value="BLR"/&gt;
 *     &lt;enumeration value="BEL"/&gt;
 *     &lt;enumeration value="BLZ"/&gt;
 *     &lt;enumeration value="BEN"/&gt;
 *     &lt;enumeration value="BMU"/&gt;
 *     &lt;enumeration value="BTN"/&gt;
 *     &lt;enumeration value="BOL"/&gt;
 *     &lt;enumeration value="BES"/&gt;
 *     &lt;enumeration value="BIH"/&gt;
 *     &lt;enumeration value="BWA"/&gt;
 *     &lt;enumeration value="BVT"/&gt;
 *     &lt;enumeration value="BRA"/&gt;
 *     &lt;enumeration value="IOT"/&gt;
 *     &lt;enumeration value="BRN"/&gt;
 *     &lt;enumeration value="BGR"/&gt;
 *     &lt;enumeration value="BFA"/&gt;
 *     &lt;enumeration value="BDI"/&gt;
 *     &lt;enumeration value="KHM"/&gt;
 *     &lt;enumeration value="CMR"/&gt;
 *     &lt;enumeration value="CAN"/&gt;
 *     &lt;enumeration value="CPV"/&gt;
 *     &lt;enumeration value="CYM"/&gt;
 *     &lt;enumeration value="CAF"/&gt;
 *     &lt;enumeration value="TCD"/&gt;
 *     &lt;enumeration value="CHL"/&gt;
 *     &lt;enumeration value="CHN"/&gt;
 *     &lt;enumeration value="CXR"/&gt;
 *     &lt;enumeration value="CCK"/&gt;
 *     &lt;enumeration value="COL"/&gt;
 *     &lt;enumeration value="COM"/&gt;
 *     &lt;enumeration value="COG"/&gt;
 *     &lt;enumeration value="COD"/&gt;
 *     &lt;enumeration value="COK"/&gt;
 *     &lt;enumeration value="CRI"/&gt;
 *     &lt;enumeration value="CIV"/&gt;
 *     &lt;enumeration value="HRV"/&gt;
 *     &lt;enumeration value="CUB"/&gt;
 *     &lt;enumeration value="CUW"/&gt;
 *     &lt;enumeration value="CYP"/&gt;
 *     &lt;enumeration value="CZE"/&gt;
 *     &lt;enumeration value="DNK"/&gt;
 *     &lt;enumeration value="DJI"/&gt;
 *     &lt;enumeration value="DMA"/&gt;
 *     &lt;enumeration value="DOM"/&gt;
 *     &lt;enumeration value="ECU"/&gt;
 *     &lt;enumeration value="EGY"/&gt;
 *     &lt;enumeration value="SLV"/&gt;
 *     &lt;enumeration value="GNQ"/&gt;
 *     &lt;enumeration value="ERI"/&gt;
 *     &lt;enumeration value="EST"/&gt;
 *     &lt;enumeration value="ETH"/&gt;
 *     &lt;enumeration value="FLK"/&gt;
 *     &lt;enumeration value="FRO"/&gt;
 *     &lt;enumeration value="FJI"/&gt;
 *     &lt;enumeration value="FIN"/&gt;
 *     &lt;enumeration value="FRA"/&gt;
 *     &lt;enumeration value="GUF"/&gt;
 *     &lt;enumeration value="PYF"/&gt;
 *     &lt;enumeration value="ATF"/&gt;
 *     &lt;enumeration value="GAB"/&gt;
 *     &lt;enumeration value="GMB"/&gt;
 *     &lt;enumeration value="GEO"/&gt;
 *     &lt;enumeration value="DEU"/&gt;
 *     &lt;enumeration value="GHA"/&gt;
 *     &lt;enumeration value="GIB"/&gt;
 *     &lt;enumeration value="GRC"/&gt;
 *     &lt;enumeration value="GRL"/&gt;
 *     &lt;enumeration value="GRD"/&gt;
 *     &lt;enumeration value="GLP"/&gt;
 *     &lt;enumeration value="GUM"/&gt;
 *     &lt;enumeration value="GTM"/&gt;
 *     &lt;enumeration value="GGY"/&gt;
 *     &lt;enumeration value="GIN"/&gt;
 *     &lt;enumeration value="GNB"/&gt;
 *     &lt;enumeration value="GUY"/&gt;
 *     &lt;enumeration value="HTI"/&gt;
 *     &lt;enumeration value="HMD"/&gt;
 *     &lt;enumeration value="VAT"/&gt;
 *     &lt;enumeration value="HND"/&gt;
 *     &lt;enumeration value="HKG"/&gt;
 *     &lt;enumeration value="HUN"/&gt;
 *     &lt;enumeration value="ISL"/&gt;
 *     &lt;enumeration value="IND"/&gt;
 *     &lt;enumeration value="IDN"/&gt;
 *     &lt;enumeration value="IRN"/&gt;
 *     &lt;enumeration value="IRQ"/&gt;
 *     &lt;enumeration value="IRL"/&gt;
 *     &lt;enumeration value="IMN"/&gt;
 *     &lt;enumeration value="ISR"/&gt;
 *     &lt;enumeration value="ITA"/&gt;
 *     &lt;enumeration value="JAM"/&gt;
 *     &lt;enumeration value="JPN"/&gt;
 *     &lt;enumeration value="JEY"/&gt;
 *     &lt;enumeration value="JOR"/&gt;
 *     &lt;enumeration value="KAZ"/&gt;
 *     &lt;enumeration value="KEN"/&gt;
 *     &lt;enumeration value="KIR"/&gt;
 *     &lt;enumeration value="PRK"/&gt;
 *     &lt;enumeration value="KOR"/&gt;
 *     &lt;enumeration value="KWT"/&gt;
 *     &lt;enumeration value="KGZ"/&gt;
 *     &lt;enumeration value="LAO"/&gt;
 *     &lt;enumeration value="LVA"/&gt;
 *     &lt;enumeration value="LBN"/&gt;
 *     &lt;enumeration value="LSO"/&gt;
 *     &lt;enumeration value="LBR"/&gt;
 *     &lt;enumeration value="LBY"/&gt;
 *     &lt;enumeration value="LIE"/&gt;
 *     &lt;enumeration value="LTU"/&gt;
 *     &lt;enumeration value="LUX"/&gt;
 *     &lt;enumeration value="MAC"/&gt;
 *     &lt;enumeration value="MKD"/&gt;
 *     &lt;enumeration value="MDG"/&gt;
 *     &lt;enumeration value="MWI"/&gt;
 *     &lt;enumeration value="MYS"/&gt;
 *     &lt;enumeration value="MDV"/&gt;
 *     &lt;enumeration value="MLI"/&gt;
 *     &lt;enumeration value="MLT"/&gt;
 *     &lt;enumeration value="MHL"/&gt;
 *     &lt;enumeration value="MTQ"/&gt;
 *     &lt;enumeration value="MRT"/&gt;
 *     &lt;enumeration value="MUS"/&gt;
 *     &lt;enumeration value="MYT"/&gt;
 *     &lt;enumeration value="MEX"/&gt;
 *     &lt;enumeration value="FSM"/&gt;
 *     &lt;enumeration value="MDA"/&gt;
 *     &lt;enumeration value="MCO"/&gt;
 *     &lt;enumeration value="MNG"/&gt;
 *     &lt;enumeration value="MNE"/&gt;
 *     &lt;enumeration value="MSR"/&gt;
 *     &lt;enumeration value="MAR"/&gt;
 *     &lt;enumeration value="MOZ"/&gt;
 *     &lt;enumeration value="MMR"/&gt;
 *     &lt;enumeration value="NAM"/&gt;
 *     &lt;enumeration value="NRU"/&gt;
 *     &lt;enumeration value="NPL"/&gt;
 *     &lt;enumeration value="NLD"/&gt;
 *     &lt;enumeration value="NCL"/&gt;
 *     &lt;enumeration value="NZL"/&gt;
 *     &lt;enumeration value="NIC"/&gt;
 *     &lt;enumeration value="NER"/&gt;
 *     &lt;enumeration value="NGA"/&gt;
 *     &lt;enumeration value="NIU"/&gt;
 *     &lt;enumeration value="NFK"/&gt;
 *     &lt;enumeration value="MNP"/&gt;
 *     &lt;enumeration value="NOR"/&gt;
 *     &lt;enumeration value="OMN"/&gt;
 *     &lt;enumeration value="PAK"/&gt;
 *     &lt;enumeration value="PLW"/&gt;
 *     &lt;enumeration value="PSE"/&gt;
 *     &lt;enumeration value="PAN"/&gt;
 *     &lt;enumeration value="PNG"/&gt;
 *     &lt;enumeration value="PRY"/&gt;
 *     &lt;enumeration value="PER"/&gt;
 *     &lt;enumeration value="PHL"/&gt;
 *     &lt;enumeration value="PCN"/&gt;
 *     &lt;enumeration value="POL"/&gt;
 *     &lt;enumeration value="PRT"/&gt;
 *     &lt;enumeration value="PRI"/&gt;
 *     &lt;enumeration value="QAT"/&gt;
 *     &lt;enumeration value="REU"/&gt;
 *     &lt;enumeration value="ROU"/&gt;
 *     &lt;enumeration value="RUS"/&gt;
 *     &lt;enumeration value="RWA"/&gt;
 *     &lt;enumeration value="BLM"/&gt;
 *     &lt;enumeration value="SHN"/&gt;
 *     &lt;enumeration value="KNA"/&gt;
 *     &lt;enumeration value="LCA"/&gt;
 *     &lt;enumeration value="MAF"/&gt;
 *     &lt;enumeration value="SPM"/&gt;
 *     &lt;enumeration value="VCT"/&gt;
 *     &lt;enumeration value="WSM"/&gt;
 *     &lt;enumeration value="SMR"/&gt;
 *     &lt;enumeration value="STP"/&gt;
 *     &lt;enumeration value="SAU"/&gt;
 *     &lt;enumeration value="SEN"/&gt;
 *     &lt;enumeration value="SRB"/&gt;
 *     &lt;enumeration value="SYC"/&gt;
 *     &lt;enumeration value="SLE"/&gt;
 *     &lt;enumeration value="SGP"/&gt;
 *     &lt;enumeration value="SXM"/&gt;
 *     &lt;enumeration value="SVK"/&gt;
 *     &lt;enumeration value="SVN"/&gt;
 *     &lt;enumeration value="SLB"/&gt;
 *     &lt;enumeration value="SOM"/&gt;
 *     &lt;enumeration value="ZAF"/&gt;
 *     &lt;enumeration value="SGS"/&gt;
 *     &lt;enumeration value="SSD"/&gt;
 *     &lt;enumeration value="ESP"/&gt;
 *     &lt;enumeration value="LKA"/&gt;
 *     &lt;enumeration value="SDN"/&gt;
 *     &lt;enumeration value="SUR"/&gt;
 *     &lt;enumeration value="SJM"/&gt;
 *     &lt;enumeration value="SWZ"/&gt;
 *     &lt;enumeration value="SWE"/&gt;
 *     &lt;enumeration value="CHE"/&gt;
 *     &lt;enumeration value="SYR"/&gt;
 *     &lt;enumeration value="TWN"/&gt;
 *     &lt;enumeration value="TJK"/&gt;
 *     &lt;enumeration value="TZA"/&gt;
 *     &lt;enumeration value="THA"/&gt;
 *     &lt;enumeration value="TLS"/&gt;
 *     &lt;enumeration value="TGO"/&gt;
 *     &lt;enumeration value="TKL"/&gt;
 *     &lt;enumeration value="TON"/&gt;
 *     &lt;enumeration value="TTO"/&gt;
 *     &lt;enumeration value="TUN"/&gt;
 *     &lt;enumeration value="TUR"/&gt;
 *     &lt;enumeration value="TKM"/&gt;
 *     &lt;enumeration value="TCA"/&gt;
 *     &lt;enumeration value="TUV"/&gt;
 *     &lt;enumeration value="UGA"/&gt;
 *     &lt;enumeration value="UKR"/&gt;
 *     &lt;enumeration value="ARE"/&gt;
 *     &lt;enumeration value="GBR"/&gt;
 *     &lt;enumeration value="USA"/&gt;
 *     &lt;enumeration value="UMI"/&gt;
 *     &lt;enumeration value="URY"/&gt;
 *     &lt;enumeration value="UZB"/&gt;
 *     &lt;enumeration value="VUT"/&gt;
 *     &lt;enumeration value="VEN"/&gt;
 *     &lt;enumeration value="VNM"/&gt;
 *     &lt;enumeration value="VGB"/&gt;
 *     &lt;enumeration value="VIR"/&gt;
 *     &lt;enumeration value="WLF"/&gt;
 *     &lt;enumeration value="ESH"/&gt;
 *     &lt;enumeration value="YEM"/&gt;
 *     &lt;enumeration value="ZMB"/&gt;
 *     &lt;enumeration value="ZWE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CountryCode", namespace = "http://amdocs/tef-vivo/core/types/v1")
@XmlEnum
public enum CountryCode {


    /**
     * Afghanistan
     * 
     */
    AFG,

    /**
     * Aland Islands
     * 
     */
    ALA,

    /**
     * Albania
     * 
     */
    ALB,

    /**
     * Algeria
     * 
     */
    DZA,

    /**
     * American Samoa
     * 
     */
    ASM,

    /**
     * Andorra
     * 
     */
    AND,

    /**
     * Angola
     * 
     */
    AGO,

    /**
     * Anguilla
     * 
     */
    AIA,

    /**
     * Antarctica
     * 
     */
    ATA,

    /**
     * Antigua and Barbuda
     * 
     */
    ATG,

    /**
     * Argentina
     * 
     */
    ARG,

    /**
     * Armenia
     * 
     */
    ARM,

    /**
     * Aruba
     * 
     */
    ABW,

    /**
     * Australia
     * 
     */
    AUS,

    /**
     * Austria
     * 
     */
    AUT,

    /**
     * Azerbaijan
     * 
     */
    AZE,

    /**
     * Bahamas
     * 
     */
    BHS,

    /**
     * Bahrain
     * 
     */
    BHR,

    /**
     * Bangladesh
     * 
     */
    BGD,

    /**
     * Barbados
     * 
     */
    BRB,

    /**
     * Belarus
     * 
     */
    BLR,

    /**
     * Belgium
     * 
     */
    BEL,

    /**
     * Belize
     * 
     */
    BLZ,

    /**
     * Benin
     * 
     */
    BEN,

    /**
     * Bermuda
     * 
     */
    BMU,

    /**
     * Bhutan
     * 
     */
    BTN,

    /**
     * Plurinational State of Bolivia
     * 
     */
    BOL,

    /**
     * Bonaire, Sint Eustatius and Saba
     * 
     */
    BES,

    /**
     * Bosnia and Herzegovina
     * 
     */
    BIH,

    /**
     * Botswana
     * 
     */
    BWA,

    /**
     * Bouvet Island
     * 
     */
    BVT,

    /**
     * Brazil
     * 
     */
    BRA,

    /**
     * British Indian Ocean Territory
     * 
     */
    IOT,

    /**
     * Brunei Darussalam
     * 
     */
    BRN,

    /**
     * Bulgaria
     * 
     */
    BGR,

    /**
     * Burkina Faso
     * 
     */
    BFA,

    /**
     * Burundi
     * 
     */
    BDI,

    /**
     * Cambodia
     * 
     */
    KHM,

    /**
     * Cameroon
     * 
     */
    CMR,

    /**
     * Canada
     * 
     */
    CAN,

    /**
     * Cape Verde
     * 
     */
    CPV,

    /**
     * Cayman Islands
     * 
     */
    CYM,

    /**
     * Central African Republic
     * 
     */
    CAF,

    /**
     * Chad
     * 
     */
    TCD,

    /**
     * Chile
     * 
     */
    CHL,

    /**
     * China
     * 
     */
    CHN,

    /**
     * Christmas Island
     * 
     */
    CXR,

    /**
     * Cocos (Keeling)	Islands
     * 
     */
    CCK,

    /**
     * Colombia
     * 
     */
    COL,

    /**
     * Comoros
     * 
     */
    COM,

    /**
     * Congo
     * 
     */
    COG,

    /**
     * Congo, the Democratic Republic of the
     * 
     */
    COD,

    /**
     * Cook Islands
     * 
     */
    COK,

    /**
     * Costa Rica
     * 
     */
    CRI,

    /**
     * Ivory Coast
     * 
     */
    CIV,

    /**
     * Croatia
     * 
     */
    HRV,

    /**
     * Cuba
     * 
     */
    CUB,

    /**
     * Curacoa
     * 
     */
    CUW,

    /**
     * Cyprus
     * 
     */
    CYP,

    /**
     * Czech Republic
     * 
     */
    CZE,

    /**
     * Denmark
     * 
     */
    DNK,

    /**
     * Djibouti
     * 
     */
    DJI,

    /**
     * Dominica
     * 
     */
    DMA,

    /**
     * Dominican Republic
     * 
     */
    DOM,

    /**
     * Ecuador
     * 
     */
    ECU,

    /**
     * Egypt
     * 
     */
    EGY,

    /**
     * El Salvador
     * 
     */
    SLV,

    /**
     * Equatorial Guinea
     * 
     */
    GNQ,

    /**
     * Eritrea
     * 
     */
    ERI,

    /**
     * Estonia
     * 
     */
    EST,

    /**
     * Ethiopia
     * 
     */
    ETH,

    /**
     * Falkland Islands (Malvinas)
     * 
     */
    FLK,

    /**
     * Faroe Islands
     * 
     */
    FRO,

    /**
     * Fiji
     * 
     */
    FJI,

    /**
     * Finland
     * 
     */
    FIN,

    /**
     * France
     * 
     */
    FRA,

    /**
     * French Guiana
     * 
     */
    GUF,

    /**
     * French Polynesia
     * 
     */
    PYF,

    /**
     * French Southern Territories
     * 
     */
    ATF,

    /**
     * Gabon
     * 
     */
    GAB,

    /**
     * Gambia
     * 
     */
    GMB,

    /**
     * Georgia
     * 
     */
    GEO,

    /**
     * Germany
     * 
     */
    DEU,

    /**
     * Ghana
     * 
     */
    GHA,

    /**
     * Gibraltar
     * 
     */
    GIB,

    /**
     * Greece
     * 
     */
    GRC,

    /**
     * Greenland
     * 
     */
    GRL,

    /**
     * Grenada
     * 
     */
    GRD,

    /**
     * Guadeloupe
     * 
     */
    GLP,

    /**
     * Guam
     * 
     */
    GUM,

    /**
     * Guatemala
     * 
     */
    GTM,

    /**
     * Guernsey
     * 
     */
    GGY,

    /**
     * Guinea
     * 
     */
    GIN,

    /**
     * Guinea-Bissau
     * 
     */
    GNB,

    /**
     * Guyana
     * 
     */
    GUY,

    /**
     * Haiti
     * 
     */
    HTI,

    /**
     * Heard Island and McDonald Islands
     * 
     */
    HMD,

    /**
     * Holy See (Vatican City State)
     * 
     */
    VAT,

    /**
     * Honduras
     * 
     */
    HND,

    /**
     * Hong Kong
     * 
     */
    HKG,

    /**
     * Hungary
     * 
     */
    HUN,

    /**
     * Iceland
     * 
     */
    ISL,

    /**
     * India
     * 
     */
    IND,

    /**
     * Indonesia
     * 
     */
    IDN,

    /**
     * Iran, Islamic Republic of
     * 
     */
    IRN,

    /**
     * Iraq
     * 
     */
    IRQ,

    /**
     * Ireland
     * 
     */
    IRL,

    /**
     * Isle of Man
     * 
     */
    IMN,

    /**
     * Israel
     * 
     */
    ISR,

    /**
     * Italy
     * 
     */
    ITA,

    /**
     * Jamaica
     * 
     */
    JAM,

    /**
     * Japan
     * 
     */
    JPN,

    /**
     * Jersey
     * 
     */
    JEY,

    /**
     * Jordan
     * 
     */
    JOR,

    /**
     * Kazakhstan
     * 
     */
    KAZ,

    /**
     * Kenya
     * 
     */
    KEN,

    /**
     * Kiribati
     * 
     */
    KIR,

    /**
     * Korea, Democratic People's Republic of
     * 
     */
    PRK,

    /**
     * Korea, Republic of
     * 
     */
    KOR,

    /**
     * Kuwait
     * 
     */
    KWT,

    /**
     * Kyrgyzstan
     * 
     */
    KGZ,

    /**
     * Lao People's Democratic Republic
     * 
     */
    LAO,

    /**
     * Latvia
     * 
     */
    LVA,

    /**
     * Lebanon
     * 
     */
    LBN,

    /**
     * Lesotho
     * 
     */
    LSO,

    /**
     * Liberia
     * 
     */
    LBR,

    /**
     * Libya
     * 
     */
    LBY,

    /**
     * Liechtenstein
     * 
     */
    LIE,

    /**
     * Lithuania
     * 
     */
    LTU,

    /**
     * Luxembourg
     * 
     */
    LUX,

    /**
     * Macao
     * 
     */
    MAC,

    /**
     * Macedonia, The Former Yugoslav Republic of
     * 
     */
    MKD,

    /**
     * Madagascar
     * 
     */
    MDG,

    /**
     * Malawi
     * 
     */
    MWI,

    /**
     * Malaysia
     * 
     */
    MYS,

    /**
     * Maldives
     * 
     */
    MDV,

    /**
     * Mali
     * 
     */
    MLI,

    /**
     * Malta
     * 
     */
    MLT,

    /**
     * Marshall Islands
     * 
     */
    MHL,

    /**
     * Martinique
     * 
     */
    MTQ,

    /**
     * Mauritania
     * 
     */
    MRT,

    /**
     * Mauritius
     * 
     */
    MUS,

    /**
     * Mayotte
     * 
     */
    MYT,

    /**
     * Mexico
     * 
     */
    MEX,

    /**
     * Micronesia, Federated States of
     * 
     */
    FSM,

    /**
     * Moldova, Republic of
     * 
     */
    MDA,

    /**
     * Monaco
     * 
     */
    MCO,

    /**
     * Mongolia
     * 
     */
    MNG,

    /**
     * Montenegro
     * 
     */
    MNE,

    /**
     * Montserrat
     * 
     */
    MSR,

    /**
     * Morocco
     * 
     */
    MAR,

    /**
     * Mozambique
     * 
     */
    MOZ,

    /**
     * Myanmar
     * 
     */
    MMR,

    /**
     * Namibia
     * 
     */
    NAM,

    /**
     * Nauru
     * 
     */
    NRU,

    /**
     * Nepal
     * 
     */
    NPL,

    /**
     * Netherlands
     * 
     */
    NLD,

    /**
     * New Caledonia
     * 
     */
    NCL,

    /**
     * New Zealand
     * 
     */
    NZL,

    /**
     * Nicaragua
     * 
     */
    NIC,

    /**
     * Niger
     * 
     */
    NER,

    /**
     * Nigeria
     * 
     */
    NGA,

    /**
     * Niue
     * 
     */
    NIU,

    /**
     * Norfolk Island
     * 
     */
    NFK,

    /**
     * Northern Mariana Islands
     * 
     */
    MNP,

    /**
     * Norway
     * 
     */
    NOR,

    /**
     * Oman
     * 
     */
    OMN,

    /**
     * Pakistan
     * 
     */
    PAK,

    /**
     * Palau
     * 
     */
    PLW,

    /**
     * Palestinian Territory, Occupied
     * 
     */
    PSE,

    /**
     * Panama
     * 
     */
    PAN,

    /**
     * Papua New Guinea
     * 
     */
    PNG,

    /**
     * Paraguay
     * 
     */
    PRY,

    /**
     * Peru
     * 
     */
    PER,

    /**
     * Philippines
     * 
     */
    PHL,

    /**
     * Pitcairn
     * 
     */
    PCN,

    /**
     * Poland
     * 
     */
    POL,

    /**
     * Portugal
     * 
     */
    PRT,

    /**
     * Puerto Rico
     * 
     */
    PRI,

    /**
     * Qatar
     * 
     */
    QAT,

    /**
     * Reunion
     * 
     */
    REU,

    /**
     * Romania
     * 
     */
    ROU,

    /**
     * Russian Federation
     * 
     */
    RUS,

    /**
     * Rwanda
     * 
     */
    RWA,

    /**
     * Saint Barthelemy
     * 
     */
    BLM,

    /**
     * Saint Helena, Ascension and Tristan da Cunha
     * 
     */
    SHN,

    /**
     * Saint Kitts and Nevis
     * 
     */
    KNA,

    /**
     * Saint Lucia
     * 
     */
    LCA,

    /**
     * Saint Martin (French part)
     * 
     */
    MAF,

    /**
     * Saint Pierre and Miquelon
     * 
     */
    SPM,

    /**
     * Saint Vincent and the Grenadines
     * 
     */
    VCT,

    /**
     * Samoa
     * 
     */
    WSM,

    /**
     * San Marino
     * 
     */
    SMR,

    /**
     * Sao Tome and Principe
     * 
     */
    STP,

    /**
     * Saudi Arabia
     * 
     */
    SAU,

    /**
     * Senegal
     * 
     */
    SEN,

    /**
     * Serbia
     * 
     */
    SRB,

    /**
     * Seychelles
     * 
     */
    SYC,

    /**
     * Sierra Leone
     * 
     */
    SLE,

    /**
     * Singapore
     * 
     */
    SGP,

    /**
     * Sint Maarten (Dutch part)
     * 
     */
    SXM,

    /**
     * Slovakia
     * 
     */
    SVK,

    /**
     * Slovenia
     * 
     */
    SVN,

    /**
     * Solomon Islands
     * 
     */
    SLB,

    /**
     * Somalia
     * 
     */
    SOM,

    /**
     * South Africa
     * 
     */
    ZAF,

    /**
     * South Georgia and the South Sandwich Islands
     * 
     */
    SGS,

    /**
     * South Sudan
     * 
     */
    SSD,

    /**
     * Spain
     * 
     */
    ESP,

    /**
     * Sri Lanka
     * 
     */
    LKA,

    /**
     * Sudan
     * 
     */
    SDN,

    /**
     * Suriname
     * 
     */
    SUR,

    /**
     * Svalbard and Jan Mayen
     * 
     */
    SJM,

    /**
     * Swaziland
     * 
     */
    SWZ,

    /**
     * Sweden
     * 
     */
    SWE,

    /**
     * Switzerland
     * 
     */
    CHE,

    /**
     * Syrian Arab Republic
     * 
     */
    SYR,

    /**
     * Taiwan, Province of China
     * 
     */
    TWN,

    /**
     * Tajikistan
     * 
     */
    TJK,

    /**
     * Tanzania, United Republic of
     * 
     */
    TZA,

    /**
     * Thailand
     * 
     */
    THA,

    /**
     * Timor-Leste
     * 
     */
    TLS,

    /**
     * Togo
     * 
     */
    TGO,

    /**
     * Tokelau
     * 
     */
    TKL,

    /**
     * Tonga
     * 
     */
    TON,

    /**
     * Trinidad and Tobago
     * 
     */
    TTO,

    /**
     * Tunisia
     * 
     */
    TUN,

    /**
     * Turkey
     * 
     */
    TUR,

    /**
     * Turkmenistan
     * 
     */
    TKM,

    /**
     * Turks and Caicos Islands
     * 
     */
    TCA,

    /**
     * Tuvalu
     * 
     */
    TUV,

    /**
     * Uganda
     * 
     */
    UGA,

    /**
     * Ukraine
     * 
     */
    UKR,

    /**
     * United Arab Emirates
     * 
     */
    ARE,

    /**
     * United Kingdom
     * 
     */
    GBR,

    /**
     * United States
     * 
     */
    USA,

    /**
     * United States Minor Outlying Islands
     * 
     */
    UMI,

    /**
     * Uruguay
     * 
     */
    URY,

    /**
     * Uzbekistan
     * 
     */
    UZB,

    /**
     * Vanuatu
     * 
     */
    VUT,

    /**
     * Venezuela, Bolivarian Republic of
     * 
     */
    VEN,

    /**
     * Viet Nam
     * 
     */
    VNM,

    /**
     * Virgin Islands, British
     * 
     */
    VGB,

    /**
     * Virgin Islands, U.S.
     * 
     */
    VIR,

    /**
     * Wallis and Futuna
     * 
     */
    WLF,

    /**
     * Western Sahara
     * 
     */
    ESH,

    /**
     * Yemen
     * 
     */
    YEM,

    /**
     * Zambia
     * 
     */
    ZMB,

    /**
     * Zimbabwe
     * 
     */
    ZWE;

    public String value() {
        return name();
    }

    public static CountryCode fromValue(String v) {
        return valueOf(v);
    }

}
