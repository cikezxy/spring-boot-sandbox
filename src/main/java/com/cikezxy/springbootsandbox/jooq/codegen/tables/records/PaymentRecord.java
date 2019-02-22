/*
 * This file is generated by jOOQ.
 */
package com.cikezxy.springbootsandbox.jooq.codegen.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import com.cikezxy.springbootsandbox.jooq.codegen.tables.Payment;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.UShort;

/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaymentRecord extends UpdatableRecordImpl<PaymentRecord> implements Record7<UShort, UShort, UByte, Integer, BigDecimal, Timestamp, Timestamp> {

    private static final long serialVersionUID = -572195400;

    /**
     * Setter for <code>sakila.payment.payment_id</code>.
     */
    public void setPaymentId(UShort value) {
        set(0, value);
    }

    /**
     * Getter for <code>sakila.payment.payment_id</code>.
     */
    public UShort getPaymentId() {
        return (UShort) get(0);
    }

    /**
     * Setter for <code>sakila.payment.customer_id</code>.
     */
    public void setCustomerId(UShort value) {
        set(1, value);
    }

    /**
     * Getter for <code>sakila.payment.customer_id</code>.
     */
    public UShort getCustomerId() {
        return (UShort) get(1);
    }

    /**
     * Setter for <code>sakila.payment.staff_id</code>.
     */
    public void setStaffId(UByte value) {
        set(2, value);
    }

    /**
     * Getter for <code>sakila.payment.staff_id</code>.
     */
    public UByte getStaffId() {
        return (UByte) get(2);
    }

    /**
     * Setter for <code>sakila.payment.rental_id</code>.
     */
    public void setRentalId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>sakila.payment.rental_id</code>.
     */
    public Integer getRentalId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>sakila.payment.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>sakila.payment.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>sakila.payment.payment_date</code>.
     */
    public void setPaymentDate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>sakila.payment.payment_date</code>.
     */
    public Timestamp getPaymentDate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>sakila.payment.last_update</code>.
     */
    public void setLastUpdate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>sakila.payment.last_update</code>.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UShort> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UShort, UShort, UByte, Integer, BigDecimal, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UShort, UShort, UByte, Integer, BigDecimal, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UShort> field1() {
        return Payment.PAYMENT.PAYMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UShort> field2() {
        return Payment.PAYMENT.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field3() {
        return Payment.PAYMENT.STAFF_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Payment.PAYMENT.RENTAL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return Payment.PAYMENT.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Payment.PAYMENT.PAYMENT_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Payment.PAYMENT.LAST_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort component1() {
        return getPaymentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort component2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component3() {
        return getStaffId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getRentalId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getPaymentDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort value1() {
        return getPaymentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort value2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value3() {
        return getStaffId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getRentalId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getPaymentDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value1(UShort value) {
        setPaymentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value2(UShort value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value3(UByte value) {
        setStaffId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value4(Integer value) {
        setRentalId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value5(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value6(Timestamp value) {
        setPaymentDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord value7(Timestamp value) {
        setLastUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentRecord values(UShort value1, UShort value2, UByte value3, Integer value4, BigDecimal value5, Timestamp value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentRecord
     */
    public PaymentRecord() {
        super(Payment.PAYMENT);
    }

    /**
     * Create a detached, initialised PaymentRecord
     */
    public PaymentRecord(UShort paymentId, UShort customerId, UByte staffId, Integer rentalId, BigDecimal amount, Timestamp paymentDate, Timestamp lastUpdate) {
        super(Payment.PAYMENT);

        set(0, paymentId);
        set(1, customerId);
        set(2, staffId);
        set(3, rentalId);
        set(4, amount);
        set(5, paymentDate);
        set(6, lastUpdate);
    }
}