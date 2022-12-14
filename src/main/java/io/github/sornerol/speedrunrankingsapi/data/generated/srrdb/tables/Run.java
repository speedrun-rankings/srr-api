/*
 * This file is generated by jOOQ.
 */
package io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables;


import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.Srrdb;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.enums.RunStatus;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.records.RunRecord;
import io.github.sornerol.speedrunrankingsapi.util.typeconverter.UUIDByteArrayToStringConverter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Run extends TableImpl<RunRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>srrdb.run</code>
     */
    public static final Run RUN = new Run();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RunRecord> getRecordType() {
        return RunRecord.class;
    }

    /**
     * The column <code>srrdb.run.id</code>.
     */
    public final TableField<RunRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.BINARY(16).nullable(false), this, "", new UUIDByteArrayToStringConverter());

    /**
     * The column <code>srrdb.run.user_id</code>.
     */
    public final TableField<RunRecord, UUID> USER_ID = createField(DSL.name("user_id"), SQLDataType.BINARY(16).nullable(false), this, "", new UUIDByteArrayToStringConverter());

    /**
     * The column <code>srrdb.run.category_id</code>.
     */
    public final TableField<RunRecord, UUID> CATEGORY_ID = createField(DSL.name("category_id"), SQLDataType.BINARY(16).nullable(false), this, "", new UUIDByteArrayToStringConverter());

    /**
     * The column <code>srrdb.run.video_url</code>.
     */
    public final TableField<RunRecord, String> VIDEO_URL = createField(DSL.name("video_url"), SQLDataType.VARCHAR(2000).nullable(false), this, "");

    /**
     * The column <code>srrdb.run.time_milliseconds</code>.
     */
    public final TableField<RunRecord, Long> TIME_MILLISECONDS = createField(DSL.name("time_milliseconds"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>srrdb.run.status</code>.
     */
    public final TableField<RunRecord, RunStatus> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(8).nullable(false).defaultValue(DSL.field("'PENDING'", SQLDataType.VARCHAR)).asEnumDataType(io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.enums.RunStatus.class), this, "");

    /**
     * The column <code>srrdb.run.submitted_timestamp</code>.
     */
    public final TableField<RunRecord, LocalDateTime> SUBMITTED_TIMESTAMP = createField(DSL.name("submitted_timestamp"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("current_timestamp()", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>srrdb.run.played_date</code>.
     */
    public final TableField<RunRecord, LocalDate> PLAYED_DATE = createField(DSL.name("played_date"), SQLDataType.LOCALDATE.nullable(false), this, "");

    private Run(Name alias, Table<RunRecord> aliased) {
        this(alias, aliased, null);
    }

    private Run(Name alias, Table<RunRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>srrdb.run</code> table reference
     */
    public Run(String alias) {
        this(DSL.name(alias), RUN);
    }

    /**
     * Create an aliased <code>srrdb.run</code> table reference
     */
    public Run(Name alias) {
        this(alias, RUN);
    }

    /**
     * Create a <code>srrdb.run</code> table reference
     */
    public Run() {
        this(DSL.name("run"), null);
    }

    public <O extends Record> Run(Table<O> child, ForeignKey<O, RunRecord> key) {
        super(child, key, RUN);
    }

    @Override
    public Schema getSchema() {
        return Srrdb.SRRDB;
    }

    @Override
    public Run as(String alias) {
        return new Run(DSL.name(alias), this);
    }

    @Override
    public Run as(Name alias) {
        return new Run(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Run rename(String name) {
        return new Run(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Run rename(Name name) {
        return new Run(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<UUID, UUID, UUID, String, Long, RunStatus, LocalDateTime, LocalDate> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
