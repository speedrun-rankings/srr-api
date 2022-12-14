/*
 * This file is generated by jOOQ.
 */
package io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.pojos;


import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.enums.RunStatus;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Run implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID          id;
    private UUID          userId;
    private UUID          categoryId;
    private String        videoUrl;
    private Long          timeMilliseconds;
    private RunStatus     status;
    private LocalDateTime submittedTimestamp;
    private LocalDate     playedDate;

    public Run() {}

    public Run(Run value) {
        this.id = value.id;
        this.userId = value.userId;
        this.categoryId = value.categoryId;
        this.videoUrl = value.videoUrl;
        this.timeMilliseconds = value.timeMilliseconds;
        this.status = value.status;
        this.submittedTimestamp = value.submittedTimestamp;
        this.playedDate = value.playedDate;
    }

    public Run(
        UUID          id,
        UUID          userId,
        UUID          categoryId,
        String        videoUrl,
        Long          timeMilliseconds,
        RunStatus     status,
        LocalDateTime submittedTimestamp,
        LocalDate     playedDate
    ) {
        this.id = id;
        this.userId = userId;
        this.categoryId = categoryId;
        this.videoUrl = videoUrl;
        this.timeMilliseconds = timeMilliseconds;
        this.status = status;
        this.submittedTimestamp = submittedTimestamp;
        this.playedDate = playedDate;
    }

    /**
     * Getter for <code>srrdb.run.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Setter for <code>srrdb.run.id</code>.
     */
    public Run setId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>srrdb.run.user_id</code>.
     */
    public UUID getUserId() {
        return this.userId;
    }

    /**
     * Setter for <code>srrdb.run.user_id</code>.
     */
    public Run setUserId(UUID userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Getter for <code>srrdb.run.category_id</code>.
     */
    public UUID getCategoryId() {
        return this.categoryId;
    }

    /**
     * Setter for <code>srrdb.run.category_id</code>.
     */
    public Run setCategoryId(UUID categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * Getter for <code>srrdb.run.video_url</code>.
     */
    public String getVideoUrl() {
        return this.videoUrl;
    }

    /**
     * Setter for <code>srrdb.run.video_url</code>.
     */
    public Run setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    /**
     * Getter for <code>srrdb.run.time_milliseconds</code>.
     */
    public Long getTimeMilliseconds() {
        return this.timeMilliseconds;
    }

    /**
     * Setter for <code>srrdb.run.time_milliseconds</code>.
     */
    public Run setTimeMilliseconds(Long timeMilliseconds) {
        this.timeMilliseconds = timeMilliseconds;
        return this;
    }

    /**
     * Getter for <code>srrdb.run.status</code>.
     */
    public RunStatus getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>srrdb.run.status</code>.
     */
    public Run setStatus(RunStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>srrdb.run.submitted_timestamp</code>.
     */
    public LocalDateTime getSubmittedTimestamp() {
        return this.submittedTimestamp;
    }

    /**
     * Setter for <code>srrdb.run.submitted_timestamp</code>.
     */
    public Run setSubmittedTimestamp(LocalDateTime submittedTimestamp) {
        this.submittedTimestamp = submittedTimestamp;
        return this;
    }

    /**
     * Getter for <code>srrdb.run.played_date</code>.
     */
    public LocalDate getPlayedDate() {
        return this.playedDate;
    }

    /**
     * Setter for <code>srrdb.run.played_date</code>.
     */
    public Run setPlayedDate(LocalDate playedDate) {
        this.playedDate = playedDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Run (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(categoryId);
        sb.append(", ").append(videoUrl);
        sb.append(", ").append(timeMilliseconds);
        sb.append(", ").append(status);
        sb.append(", ").append(submittedTimestamp);
        sb.append(", ").append(playedDate);

        sb.append(")");
        return sb.toString();
    }
}
