/*
 * This file is generated by jOOQ.
 */
package io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum RunStatus implements EnumType {

    APPROVED("APPROVED"),

    REJECTED("REJECTED"),

    PENDING("PENDING");

    private final String literal;

    private RunStatus(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return "run_status";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
