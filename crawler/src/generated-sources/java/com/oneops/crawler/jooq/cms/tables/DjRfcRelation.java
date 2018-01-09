/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables;


import com.oneops.crawler.jooq.cms.Indexes;
import com.oneops.crawler.jooq.cms.Keys;
import com.oneops.crawler.jooq.cms.Kloopzcm;
import com.oneops.crawler.jooq.cms.tables.records.DjRfcRelationRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class DjRfcRelation extends TableImpl<DjRfcRelationRecord> {

    private static final long serialVersionUID = 416337632;

    /**
     * The reference instance of <code>kloopzcm.dj_rfc_relation</code>
     */
    public static final DjRfcRelation DJ_RFC_RELATION = new DjRfcRelation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DjRfcRelationRecord> getRecordType() {
        return DjRfcRelationRecord.class;
    }

    /**
     * The column <code>kloopzcm.dj_rfc_relation.rfc_id</code>.
     */
    public final TableField<DjRfcRelationRecord, Long> RFC_ID = createField("rfc_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_rfc_relation.release_id</code>.
     */
    public final TableField<DjRfcRelationRecord, Long> RELEASE_ID = createField("release_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_rfc_relation.ns_id</code>.
     */
    public final TableField<DjRfcRelationRecord, Long> NS_ID = createField("ns_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_rfc_relation.ci_relation_id</code>.
     */
    public final TableField<DjRfcRelationRecord, Long> CI_RELATION_ID = createField("ci_relation_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_rfc_relation.from_rfc_id</code>.
     */
    public final TableField<DjRfcRelationRecord, Long> FROM_RFC_ID = createField("from_rfc_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>kloopzcm.dj_rfc_relation.from_ci_id</code>.
     */
    public final TableField<DjRfcRelationRecord, Long> FROM_CI_ID = createField("from_ci_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_rfc_relation.relation_id</code>.
     */
    public final TableField<DjRfcRelationRecord, Integer> RELATION_ID = createField("relation_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_rfc_relation.relation_goid</code>.
     */
    public final TableField<DjRfcRelationRecord, String> RELATION_GOID = createField("relation_goid", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_rfc_relation.to_rfc_id</code>.
     */
    public final TableField<DjRfcRelationRecord, Long> TO_RFC_ID = createField("to_rfc_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>kloopzcm.dj_rfc_relation.to_ci_id</code>.
     */
    public final TableField<DjRfcRelationRecord, Long> TO_CI_ID = createField("to_ci_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_rfc_relation.action_id</code>.
     */
    public final TableField<DjRfcRelationRecord, Integer> ACTION_ID = createField("action_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_rfc_relation.created_by</code>.
     */
    public final TableField<DjRfcRelationRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>kloopzcm.dj_rfc_relation.updated_by</code>.
     */
    public final TableField<DjRfcRelationRecord, String> UPDATED_BY = createField("updated_by", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>kloopzcm.dj_rfc_relation.execution_order</code>.
     */
    public final TableField<DjRfcRelationRecord, Short> EXECUTION_ORDER = createField("execution_order", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_rfc_relation.is_active_in_release</code>.
     */
    public final TableField<DjRfcRelationRecord, Boolean> IS_ACTIVE_IN_RELEASE = createField("is_active_in_release", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>kloopzcm.dj_rfc_relation.last_rfc_id</code>.
     */
    public final TableField<DjRfcRelationRecord, Long> LAST_RFC_ID = createField("last_rfc_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>kloopzcm.dj_rfc_relation.comments</code>.
     */
    public final TableField<DjRfcRelationRecord, String> COMMENTS = createField("comments", org.jooq.impl.SQLDataType.VARCHAR(2000), this, "");

    /**
     * The column <code>kloopzcm.dj_rfc_relation.created</code>.
     */
    public final TableField<DjRfcRelationRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>kloopzcm.dj_rfc_relation.updated</code>.
     */
    public final TableField<DjRfcRelationRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>kloopzcm.dj_rfc_relation</code> table reference
     */
    public DjRfcRelation() {
        this(DSL.name("dj_rfc_relation"), null);
    }

    /**
     * Create an aliased <code>kloopzcm.dj_rfc_relation</code> table reference
     */
    public DjRfcRelation(String alias) {
        this(DSL.name(alias), DJ_RFC_RELATION);
    }

    /**
     * Create an aliased <code>kloopzcm.dj_rfc_relation</code> table reference
     */
    public DjRfcRelation(Name alias) {
        this(alias, DJ_RFC_RELATION);
    }

    private DjRfcRelation(Name alias, Table<DjRfcRelationRecord> aliased) {
        this(alias, aliased, null);
    }

    private DjRfcRelation(Name alias, Table<DjRfcRelationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Kloopzcm.KLOOPZCM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DJ_RFC_REL_FCI_IDX, Indexes.DJ_RFC_REL_FCIRELTOCI_IDX, Indexes.DJ_RFC_REL_FRFC_IDX, Indexes.DJ_RFC_REL_NS_IDX, Indexes.DJ_RFC_REL_R_IDX, Indexes.DJ_RFC_REL_RL_IDX, Indexes.DJ_RFC_REL_TCI_IDX, Indexes.DJ_RFC_REL_TCIRLSFROMCI_IDX, Indexes.DJ_RFC_REL_TRFC_IDX, Indexes.DJ_RFC_RELATION_CRID_IDX, Indexes.DJ_RFC_RELATION_FROMIDX, Indexes.DJ_RFC_RELATION_PK, Indexes.DJ_RFC_RELATION_TOIDX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DjRfcRelationRecord> getPrimaryKey() {
        return Keys.DJ_RFC_RELATION_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DjRfcRelationRecord>> getKeys() {
        return Arrays.<UniqueKey<DjRfcRelationRecord>>asList(Keys.DJ_RFC_RELATION_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DjRfcRelationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DjRfcRelationRecord, ?>>asList(Keys.DJ_RFC_RELATION__DJ_RELATION_RFC_RELID_FK, Keys.DJ_RFC_RELATION__DJ_RFC_RELATION_NS_FK, Keys.DJ_RFC_RELATION__DJ_RFC_CI_DJ_RFC_RELATION_FK, Keys.DJ_RFC_RELATION__DJ_RELATION_RFC_RID_FK, Keys.DJ_RFC_RELATION__DJ_RFC_CI_DJ_RFC_RELATION_FK1, Keys.DJ_RFC_RELATION__DJ_RELATION_RFC_ACTID_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjRfcRelation as(String alias) {
        return new DjRfcRelation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjRfcRelation as(Name alias) {
        return new DjRfcRelation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DjRfcRelation rename(String name) {
        return new DjRfcRelation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DjRfcRelation rename(Name name) {
        return new DjRfcRelation(name, null);
    }
}
