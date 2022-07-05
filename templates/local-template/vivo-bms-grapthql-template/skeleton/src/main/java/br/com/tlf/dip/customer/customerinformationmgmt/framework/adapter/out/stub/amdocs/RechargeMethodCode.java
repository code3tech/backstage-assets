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
 * <p>Classe Java de RechargeMethodCode.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="RechargeMethodCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADJUSTMENT"/&gt;
 *     &lt;enumeration value="BANK"/&gt;
 *     &lt;enumeration value="CANCEL_RECHARGE"/&gt;
 *     &lt;enumeration value="CANCEL_SPLIT_RECHARGE"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CHANGE_CYCLE_ADJUST_NEGATIVE"/&gt;
 *     &lt;enumeration value="CHANGE_CYCLE_ADJUST_POSITIVE"/&gt;
 *     &lt;enumeration value="CHEQUE"/&gt;
 *     &lt;enumeration value="CREATE_CHARGE"/&gt;
 *     &lt;enumeration value="CREDIT_CARD"/&gt;
 *     &lt;enumeration value="GOOD_WILL"/&gt;
 *     &lt;enumeration value="INCREASE"/&gt;
 *     &lt;enumeration value="INCREASE_RECHARGE"/&gt;
 *     &lt;enumeration value="INITIAL_BALANCE"/&gt;
 *     &lt;enumeration value="INTERNAL_SET_EXPIRATION_DATE"/&gt;
 *     &lt;enumeration value="LEFT_AMOUNT_NEGATIVE"/&gt;
 *     &lt;enumeration value="LEFT_AMOUNT_POSITIVE"/&gt;
 *     &lt;enumeration value="LOAN"/&gt;
 *     &lt;enumeration value="LOAN_NEXT_BILL"/&gt;
 *     &lt;enumeration value="POST_PAID"/&gt;
 *     &lt;enumeration value="PRE_INITIAL_BALANCE"/&gt;
 *     &lt;enumeration value="PREPAID_BONUS"/&gt;
 *     &lt;enumeration value="RECHARGE_BY_PIN"/&gt;
 *     &lt;enumeration value="REDUCE"/&gt;
 *     &lt;enumeration value="RETURNING_BANK"/&gt;
 *     &lt;enumeration value="RETURNING_CREDIT_CARD"/&gt;
 *     &lt;enumeration value="SET_EXPIRATION_DATE"/&gt;
 *     &lt;enumeration value="SET_EXPIRATION_DATE_BY_NUM_DAYS"/&gt;
 *     &lt;enumeration value="SPLIT_VOUCHER_RECHARGE"/&gt;
 *     &lt;enumeration value="TRIGGER_BANK"/&gt;
 *     &lt;enumeration value="TRIGGER_CREDIT_CARD"/&gt;
 *     &lt;enumeration value="TRIGGER_PIN"/&gt;
 *     &lt;enumeration value="USAGE_RECHARGE"/&gt;
 *     &lt;enumeration value="VOUCHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RechargeMethodCode", namespace = "http://amdocs/tef-vivo/customerbilling-common/types/v1")
@XmlEnum
public enum RechargeMethodCode {


    /**
     * Adjustment
     * 
     */
    ADJUSTMENT,

    /**
     * Bank
     * 
     */
    BANK,

    /**
     * Cancel recharge
     * 
     */
    CANCEL_RECHARGE,

    /**
     * Cancel split recharge
     * 
     */
    CANCEL_SPLIT_RECHARGE,

    /**
     * Cash
     * 
     */
    CASH,

    /**
     * Change cycle adjustment negative
     * 
     */
    CHANGE_CYCLE_ADJUST_NEGATIVE,

    /**
     * Change cycle adjustment positive
     * 
     */
    CHANGE_CYCLE_ADJUST_POSITIVE,

    /**
     * Cheque
     * 
     */
    CHEQUE,

    /**
     * One time charge
     * 
     */
    CREATE_CHARGE,

    /**
     * Credit Card
     * 
     */
    CREDIT_CARD,

    /**
     * Good will
     * 
     */
    GOOD_WILL,

    /**
     * Increase
     * 
     */
    INCREASE,

    /**
     * Increase recharge
     * 
     */
    INCREASE_RECHARGE,

    /**
     * Intial balance
     * 
     */
    INITIAL_BALANCE,
    INTERNAL_SET_EXPIRATION_DATE,

    /**
     * Left amount negative
     * 
     */
    LEFT_AMOUNT_NEGATIVE,

    /**
     * Left amount positive
     * 
     */
    LEFT_AMOUNT_POSITIVE,

    /**
     * Loan
     * 
     */
    LOAN,

    /**
     * Loan next bill
     * 
     */
    LOAN_NEXT_BILL,

    /**
     * Post paid
     * 
     */
    POST_PAID,

    /**
     * Pre initial balance
     * 
     */
    PRE_INITIAL_BALANCE,

    /**
     * Prepaid bonnus
     * 
     */
    PREPAID_BONUS,

    /**
     * Recharge by pin
     * 
     */
    RECHARGE_BY_PIN,

    /**
     * Reduce
     * 
     */
    REDUCE,

    /**
     * Returning bank
     * 
     */
    RETURNING_BANK,

    /**
     * Returning credit card
     * 
     */
    RETURNING_CREDIT_CARD,
    SET_EXPIRATION_DATE,
    SET_EXPIRATION_DATE_BY_NUM_DAYS,

    /**
     * Split voucher recharge
     * 
     */
    SPLIT_VOUCHER_RECHARGE,

    /**
     * Trigger bank
     * 
     */
    TRIGGER_BANK,

    /**
     * Trigger credit card
     * 
     */
    TRIGGER_CREDIT_CARD,

    /**
     * Trigger pin
     * 
     */
    TRIGGER_PIN,

    /**
     * Usage recharge
     * 
     */
    USAGE_RECHARGE,

    /**
     * Voucher
     * 
     */
    VOUCHER;

    public String value() {
        return name();
    }

    public static RechargeMethodCode fromValue(String v) {
        return valueOf(v);
    }

}
