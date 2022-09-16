/*
 * This file is generated by jOOQ.
 */
package io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.records;


import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.enums.RunStatus;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.Run;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RunRecord extends TableRecordImpl<RunRecord> implements Record8<UUID, UUID, UUID, String, Long, RunStatus, LocalDateTime, LocalDate> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>srrdb.run.id</code>.
     */
    public RunRecord setId(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>srrdb.run.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>srrdb.run.user_id</code>.
     */
    public RunRecord setUserId(UUID value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>srrdb.run.user_id</code>.
     */
    public UUID getUserId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>srrdb.run.category_id</code>.
     */
    public RunRecord setCategoryId(UUID value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>srrdb.run.category_id</code>.
     */
    public UUID getCategoryId() {
        return (UUID) get(2);
    }

    /**
     * Setter for <code>srrdb.run.video_url</code>.
     */
    public RunRecord setVideoUrl(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>srrdb.run.video_url</code>.
     */
    public String getVideoUrl() {
        return (String) get(3);
    }

    /**
     * Setter for <code>srrdb.run.time_milliseconds</code>.
     */
    public RunRecord setTimeMilliseconds(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>srrdb.run.time_milliseconds</code>.
     */
    public Long getTimeMilliseconds() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>srrdb.run.status</code>.
     */
    public RunRecord setStatus(RunStatus value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>srrdb.run.status</code>.
     */
    public RunStatus getStatus() {
        return (RunStatus) get(5);
    }

    /**
     * Setter for <code>srrdb.run.submitted_timestamp</code>.
     */
    public RunRecord setSubmittedTimestamp(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>srrdb.run.submitted_timestamp</code>.
     */
    public LocalDateTime getSubmittedTimestamp() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>srrdb.run.played_date</code>.
     */
    public RunRecord setPlayedDate(LocalDate value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>srrdb.run.played_date</code>.
     */
    public LocalDate getPlayedDate() {
        return (LocalDate) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<UUID, UUID, UUID, String, Long, RunStatus, LocalDateTime, LocalDate> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<UUID, UUID, UUID, String, Long, RunStatus, LocalDateTime, LocalDate> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Run.RUN.ID;
    }

    @Override
    public Field<UUID> field2() {
        return Run.RUN.USER_ID;
    }

    @Override
    public Field<UUID> field3() {
        return Run.RUN.CATEGORY_ID;
    }

    @Override
    public Field<String> field4() {
        return Run.RUN.VIDEO_URL;
    }

    @Override
    public Field<Long> field5() {
        return Run.RUN.TIME_MILLISECONDS;
    }

    @Override
    public Field<RunStatus> field6() {
        return Run.RUN.STATUS;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return Run.RUN.SUBMITTED_TIMESTAMP;
    }

    @Override
    public Field<LocalDate> field8() {
        return Run.RUN.PLAYED_DATE;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public UUID component2() {
        return getUserId();
    }

    @Override
    public UUID component3() {
        return getCategoryId();
    }

    @Override
    public String component4() {
        return getVideoUrl();
    }

    @Override
    public Long component5() {
        return getTimeMilliseconds();
    }

    @Override
    public RunStatus component6() {
        return getStatus();
    }

    @Override
    public LocalDateTime component7() {
        return getSubmittedTimestamp();
    }

    @Override
    public LocalDate component8() {
        return getPlayedDate();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public UUID value2() {
        return getUserId();
    }

    @Override
    public UUID value3() {
        return getCategoryId();
    }

    @Override
    public String value4() {
        return getVideoUrl();
    }

    @Override
    public Long value5() {
        return getTimeMilliseconds();
    }

    @Override
    public RunStatus value6() {
        return getStatus();
    }

    @Override
    public LocalDateTime value7() {
        return getSubmittedTimestamp();
    }

    @Override
    public LocalDate value8() {
        return getPlayedDate();
    }

    @Override
    public RunRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public RunRecord value2(UUID value) {
        setUserId(value);
        return this;
    }

    @Override
    public RunRecord value3(UUID value) {
        setCategoryId(value);
        return this;
    }

    @Override
    public RunRecord value4(String value) {
        setVideoUrl(value);
        return this;
    }

    @Override
    public RunRecord value5(Long value) {
        setTimeMilliseconds(value);
        return this;
    }

    @Override
    public RunRecord value6(RunStatus value) {
        setStatus(value);
        return this;
    }

    @Override
    public RunRecord value7(LocalDateTime value) {
        setSubmittedTimestamp(value);
        return this;
    }

    @Override
    public RunRecord value8(LocalDate value) {
        setPlayedDate(value);
        return this;
    }

    @Override
    public RunRecord values(UUID value1, UUID value2, UUID value3, String value4, Long value5, RunStatus value6, LocalDateTime value7, LocalDate value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RunRecord
     */
    public RunRecord() {
        super(Run.RUN);
    }

    /**
     * Create a detached, initialised RunRecord
     */
    public RunRecord(UUID id, UUID userId, UUID categoryId, String videoUrl, Long timeMilliseconds, RunStatus status, LocalDateTime submittedTimestamp, LocalDate playedDate) {
        super(Run.RUN);

        setId(id);
        setUserId(userId);
        setCategoryId(categoryId);
        setVideoUrl(videoUrl);
        setTimeMilliseconds(timeMilliseconds);
        setStatus(status);
        setSubmittedTimestamp(submittedTimestamp);
        setPlayedDate(playedDate);
    }
}
