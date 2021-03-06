/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables.records;


import com.oneops.crawler.jooq.cms.tables.CmCiState;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CmCiStateRecord extends UpdatableRecordImpl<CmCiStateRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 199868276;

    /**
     * Setter for <code>kloopzcm.cm_ci_state.ci_state_id</code>.
     */
    public void setCiStateId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>kloopzcm.cm_ci_state.ci_state_id</code>.
     */
    public Integer getCiStateId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>kloopzcm.cm_ci_state.state_name</code>.
     */
    public void setStateName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>kloopzcm.cm_ci_state.state_name</code>.
     */
    public String getStateName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return CmCiState.CM_CI_STATE.CI_STATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CmCiState.CM_CI_STATE.STATE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCiStateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getStateName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getCiStateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getStateName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmCiStateRecord value1(Integer value) {
        setCiStateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmCiStateRecord value2(String value) {
        setStateName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmCiStateRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CmCiStateRecord
     */
    public CmCiStateRecord() {
        super(CmCiState.CM_CI_STATE);
    }

    /**
     * Create a detached, initialised CmCiStateRecord
     */
    public CmCiStateRecord(Integer ciStateId, String stateName) {
        super(CmCiState.CM_CI_STATE);

        set(0, ciStateId);
        set(1, stateName);
    }
}
