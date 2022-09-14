/*
 * This file is generated by jOOQ.
 */
package io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables;


import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.Keys;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.Srrdb;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.records.SiteRoleRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SiteRole extends TableImpl<SiteRoleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>srrdb.site_role</code>
     */
    public static final SiteRole SITE_ROLE = new SiteRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SiteRoleRecord> getRecordType() {
        return SiteRoleRecord.class;
    }

    /**
     * The column <code>srrdb.site_role.id</code>.
     */
    public final TableField<SiteRoleRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>srrdb.site_role.role_name</code>.
     */
    public final TableField<SiteRoleRecord, String> ROLE_NAME = createField(DSL.name("role_name"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    private SiteRole(Name alias, Table<SiteRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private SiteRole(Name alias, Table<SiteRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>srrdb.site_role</code> table reference
     */
    public SiteRole(String alias) {
        this(DSL.name(alias), SITE_ROLE);
    }

    /**
     * Create an aliased <code>srrdb.site_role</code> table reference
     */
    public SiteRole(Name alias) {
        this(alias, SITE_ROLE);
    }

    /**
     * Create a <code>srrdb.site_role</code> table reference
     */
    public SiteRole() {
        this(DSL.name("site_role"), null);
    }

    public <O extends Record> SiteRole(Table<O> child, ForeignKey<O, SiteRoleRecord> key) {
        super(child, key, SITE_ROLE);
    }

    @Override
    public Schema getSchema() {
        return Srrdb.SRRDB;
    }

    @Override
    public Identity<SiteRoleRecord, Integer> getIdentity() {
        return (Identity<SiteRoleRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<SiteRoleRecord> getPrimaryKey() {
        return Keys.KEY_SITE_ROLE_PRIMARY;
    }

    @Override
    public List<UniqueKey<SiteRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<SiteRoleRecord>>asList(Keys.KEY_SITE_ROLE_PRIMARY);
    }

    @Override
    public SiteRole as(String alias) {
        return new SiteRole(DSL.name(alias), this);
    }

    @Override
    public SiteRole as(Name alias) {
        return new SiteRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SiteRole rename(String name) {
        return new SiteRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SiteRole rename(Name name) {
        return new SiteRole(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
