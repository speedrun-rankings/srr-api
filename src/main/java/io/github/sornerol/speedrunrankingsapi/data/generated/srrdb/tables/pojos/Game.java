/*
 * This file is generated by jOOQ.
 */
package io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Game implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String    id;
    private final String    name;
    private final String    seriesId;
    private final LocalDate releaseDate;
    private final String    permalink;

    public Game(Game value) {
        this.id = value.id;
        this.name = value.name;
        this.seriesId = value.seriesId;
        this.releaseDate = value.releaseDate;
        this.permalink = value.permalink;
    }

    public Game(
        String    id,
        String    name,
        String    seriesId,
        LocalDate releaseDate,
        String    permalink
    ) {
        this.id = id;
        this.name = name;
        this.seriesId = seriesId;
        this.releaseDate = releaseDate;
        this.permalink = permalink;
    }

    /**
     * Getter for <code>srrdb.game.id</code>.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Getter for <code>srrdb.game.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>srrdb.game.series_id</code>.
     */
    public String getSeriesId() {
        return this.seriesId;
    }

    /**
     * Getter for <code>srrdb.game.release_date</code>.
     */
    public LocalDate getReleaseDate() {
        return this.releaseDate;
    }

    /**
     * Getter for <code>srrdb.game.permalink</code>.
     */
    public String getPermalink() {
        return this.permalink;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Game (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(seriesId);
        sb.append(", ").append(releaseDate);
        sb.append(", ").append(permalink);

        sb.append(")");
        return sb.toString();
    }
}
