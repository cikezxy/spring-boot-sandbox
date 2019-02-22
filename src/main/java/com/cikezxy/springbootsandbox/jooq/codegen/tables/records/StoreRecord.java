/*
 * This file is generated by jOOQ.
 */
package com.cikezxy.springbootsandbox.jooq.codegen.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import com.cikezxy.springbootsandbox.jooq.codegen.tables.Store;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class StoreRecord extends UpdatableRecordImpl<StoreRecord> implements Record4<UByte, UByte, UShort, Timestamp> {

    private static final long serialVersionUID = -744776221;

    /**
     * Setter for <code>sakila.store.store_id</code>.
     */
    public void setStoreId(UByte value) {
        set(0, value);
    }

    /**
     * Getter for <code>sakila.store.store_id</code>.
     */
    public UByte getStoreId() {
        return (UByte) get(0);
    }

    /**
     * Setter for <code>sakila.store.manager_staff_id</code>.
     */
    public void setManagerStaffId(UByte value) {
        set(1, value);
    }

    /**
     * Getter for <code>sakila.store.manager_staff_id</code>.
     */
    public UByte getManagerStaffId() {
        return (UByte) get(1);
    }

    /**
     * Setter for <code>sakila.store.address_id</code>.
     */
    public void setAddressId(UShort value) {
        set(2, value);
    }

    /**
     * Getter for <code>sakila.store.address_id</code>.
     */
    public UShort getAddressId() {
        return (UShort) get(2);
    }

    /**
     * Setter for <code>sakila.store.last_update</code>.
     */
    public void setLastUpdate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>sakila.store.last_update</code>.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UByte> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UByte, UByte, UShort, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UByte, UByte, UShort, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field1() {
        return Store.STORE.STORE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field2() {
        return Store.STORE.MANAGER_STAFF_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UShort> field3() {
        return Store.STORE.ADDRESS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Store.STORE.LAST_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component1() {
        return getStoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component2() {
        return getManagerStaffId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort component3() {
        return getAddressId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value1() {
        return getStoreId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value2() {
        return getManagerStaffId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UShort value3() {
        return getAddressId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreRecord value1(UByte value) {
        setStoreId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreRecord value2(UByte value) {
        setManagerStaffId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreRecord value3(UShort value) {
        setAddressId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreRecord value4(Timestamp value) {
        setLastUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StoreRecord values(UByte value1, UByte value2, UShort value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StoreRecord
     */
    public StoreRecord() {
        super(Store.STORE);
    }

    /**
     * Create a detached, initialised StoreRecord
     */
    public StoreRecord(UByte storeId, UByte managerStaffId, UShort addressId, Timestamp lastUpdate) {
        super(Store.STORE);

        set(0, storeId);
        set(1, managerStaffId);
        set(2, addressId);
        set(3, lastUpdate);
    }
}