/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables;


import com.oneops.crawler.jooq.cms.Indexes;
import com.oneops.crawler.jooq.cms.Keys;
import com.oneops.crawler.jooq.cms.Kloopzcm;
import com.oneops.crawler.jooq.cms.tables.records.DjReleasesRecord;

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
public class DjReleases extends TableImpl<DjReleasesRecord> {

    private static final long serialVersionUID = -1936012678;

    /**
     * The reference instance of <code>kloopzcm.dj_releases</code>
     */
    public static final DjReleases DJ_RELEASES = new DjReleases();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DjReleasesRecord> getRecordType() {
        return DjReleasesRecord.class;
    }

    /**
     * The column <code>kloopzcm.dj_releases.release_id</code>.
     */
    public final TableField<DjReleasesRecord, Long> RELEASE_ID = createField("release_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_releases.ns_id</code>.
     */
    public final TableField<DjReleasesRecord, Long> NS_ID = createField("ns_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_releases.parent_release_id</code>.
     */
    public final TableField<DjReleasesRecord, Long> PARENT_RELEASE_ID = createField("parent_release_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>kloopzcm.dj_releases.release_name</code>.
     */
    public final TableField<DjReleasesRecord, String> RELEASE_NAME = createField("release_name", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_releases.created_by</code>.
     */
    public final TableField<DjReleasesRecord, String> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_releases.commited_by</code>.
     */
    public final TableField<DjReleasesRecord, String> COMMITED_BY = createField("commited_by", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>kloopzcm.dj_releases.release_state_id</code>.
     */
    public final TableField<DjReleasesRecord, Integer> RELEASE_STATE_ID = createField("release_state_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_releases.release_type</code>.
     */
    public final TableField<DjReleasesRecord, String> RELEASE_TYPE = createField("release_type", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>kloopzcm.dj_releases.description</code>.
     */
    public final TableField<DjReleasesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>kloopzcm.dj_releases.revision</code>.
     */
    public final TableField<DjReleasesRecord, Short> REVISION = createField("revision", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_releases.created</code>.
     */
    public final TableField<DjReleasesRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>kloopzcm.dj_releases.updated</code>.
     */
    public final TableField<DjReleasesRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>kloopzcm.dj_releases</code> table reference
     */
    public DjReleases() {
        this(DSL.name("dj_releases"), null);
    }

    /**
     * Create an aliased <code>kloopzcm.dj_releases</code> table reference
     */
    public DjReleases(String alias) {
        this(DSL.name(alias), DJ_RELEASES);
    }

    /**
     * Create an aliased <code>kloopzcm.dj_releases</code> table reference
     */
    public DjReleases(Name alias) {
        this(alias, DJ_RELEASES);
    }

    private DjReleases(Name alias, Table<DjReleasesRecord> aliased) {
        this(alias, aliased, null);
    }

    private DjReleases(Name alias, Table<DjReleasesRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.DJ_RELEASE_STATE_IDX, Indexes.DJ_RELEASES_NS_IDX, Indexes.DJ_RELEASES_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DjReleasesRecord> getPrimaryKey() {
        return Keys.DJ_RELEASES_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DjReleasesRecord>> getKeys() {
        return Arrays.<UniqueKey<DjReleasesRecord>>asList(Keys.DJ_RELEASES_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DjReleasesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DjReleasesRecord, ?>>asList(Keys.DJ_RELEASES__CM_NAMESPACES_DJ_RELEASES_FK, Keys.DJ_RELEASES__DJ_RELEASES_RSID_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjReleases as(String alias) {
        return new DjReleases(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjReleases as(Name alias) {
        return new DjReleases(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DjReleases rename(String name) {
        return new DjReleases(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DjReleases rename(Name name) {
        return new DjReleases(name, null);
    }
}
