/*
 * This file is generated by jOOQ.
 */
package io.github.sornerol.speedrunrankingsapi.data.generated.srrdb;


import io.github.sornerol.speedrunrankingsapi.data.generated.DefaultCatalog;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.Category;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.Game;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.GamePlatformAsg;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.Platform;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.Run;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.Series;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.SiteRole;
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
     * The table <code>srrdb.category</code>.
     */
    public final Category CATEGORY = Category.CATEGORY;

    /**
     * The table <code>srrdb.game</code>.
     */
    public final Game GAME = Game.GAME;

    /**
     * The table <code>srrdb.game_platform_asg</code>.
     */
    public final GamePlatformAsg GAME_PLATFORM_ASG = GamePlatformAsg.GAME_PLATFORM_ASG;

    /**
     * The table <code>srrdb.platform</code>.
     */
    public final Platform PLATFORM = Platform.PLATFORM;

    /**
     * The table <code>srrdb.run</code>.
     */
    public final Run RUN = Run.RUN;

    /**
     * The table <code>srrdb.series</code>.
     */
    public final Series SERIES = Series.SERIES;

    /**
     * The table <code>srrdb.site_role</code>.
     */
    public final SiteRole SITE_ROLE = SiteRole.SITE_ROLE;

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
            Category.CATEGORY,
            Game.GAME,
            GamePlatformAsg.GAME_PLATFORM_ASG,
            Platform.PLATFORM,
            Run.RUN,
            Series.SERIES,
            SiteRole.SITE_ROLE,
            User.USER);
    }
}
