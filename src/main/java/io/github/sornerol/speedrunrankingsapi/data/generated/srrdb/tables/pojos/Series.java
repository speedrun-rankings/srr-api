/*
 * This file is generated by jOOQ.
 */
package io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Series implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String id;
    private final String name;
    private final String permalink;

    public Series(Series value) {
        this.id = value.id;
        this.name = value.name;
        this.permalink = value.permalink;
    }

    public Series(
        String id,
        String name,
        String permalink
    ) {
        this.id = id;
        this.name = name;
        this.permalink = permalink;
    }

    /**
     * Getter for <code>srrdb.series.id</code>.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Getter for <code>srrdb.series.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>srrdb.series.permalink</code>.
     */
    public String getPermalink() {
        return this.permalink;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Series (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(permalink);

        sb.append(")");
        return sb.toString();
    }
}