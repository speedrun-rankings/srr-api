/*
 * This file is generated by jOOQ.
 */
package io.github.sornerol.speedrunrankingsapi.data.generated.srrdb;


import io.github.sornerol.speedrunrankingsapi.data.generated.DefaultCatalog;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.User;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Srrdb extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>srrdb</code>
     */
    public static final Srrdb SRRDB = new Srrdb();

    /**
     * The table <code>srrdb.user</code>.
     */
    public final User USER = User.USER;

    /**
     * No further instances allowed
     */
    private Srrdb() {
        super("srrdb", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            User.USER);
    }
}
