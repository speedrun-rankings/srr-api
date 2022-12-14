/*
 * This file is generated by jOOQ.
 */
package io.github.sornerol.speedrunrankingsapi.data.generated.srrdb;


import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.Category;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.Game;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.GamePlatformAsg;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.Platform;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.Series;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.SiteRole;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.User;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.records.CategoryRecord;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.records.GamePlatformAsgRecord;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.records.GameRecord;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.records.PlatformRecord;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.records.SeriesRecord;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.records.SiteRoleRecord;
import io.github.sornerol.speedrunrankingsapi.data.generated.srrdb.tables.records.UserRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * srrdb.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CategoryRecord> KEY_CATEGORY_PRIMARY = Internal.createUniqueKey(Category.CATEGORY, DSL.name("KEY_category_PRIMARY"), new TableField[] { Category.CATEGORY.ID }, true);
    public static final UniqueKey<GameRecord> KEY_GAME_PRIMARY = Internal.createUniqueKey(Game.GAME, DSL.name("KEY_game_PRIMARY"), new TableField[] { Game.GAME.ID }, true);
    public static final UniqueKey<PlatformRecord> KEY_PLATFORM_PRIMARY = Internal.createUniqueKey(Platform.PLATFORM, DSL.name("KEY_platform_PRIMARY"), new TableField[] { Platform.PLATFORM.ID }, true);
    public static final UniqueKey<SeriesRecord> KEY_SERIES_PRIMARY = Internal.createUniqueKey(Series.SERIES, DSL.name("KEY_series_PRIMARY"), new TableField[] { Series.SERIES.ID }, true);
    public static final UniqueKey<SiteRoleRecord> KEY_SITE_ROLE_PRIMARY = Internal.createUniqueKey(SiteRole.SITE_ROLE, DSL.name("KEY_site_role_PRIMARY"), new TableField[] { SiteRole.SITE_ROLE.ID }, true);
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, DSL.name("KEY_user_PRIMARY"), new TableField[] { User.USER.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CategoryRecord, GameRecord> CATEGORY_FK = Internal.createForeignKey(Category.CATEGORY, DSL.name("category_FK"), new TableField[] { Category.CATEGORY.GAME_ID }, Keys.KEY_GAME_PRIMARY, new TableField[] { Game.GAME.ID }, true);
    public static final ForeignKey<GameRecord, SeriesRecord> GAME_FK = Internal.createForeignKey(Game.GAME, DSL.name("game_FK"), new TableField[] { Game.GAME.SERIES_ID }, Keys.KEY_SERIES_PRIMARY, new TableField[] { Series.SERIES.ID }, true);
    public static final ForeignKey<GamePlatformAsgRecord, GameRecord> GAME_PLATFORM_ASG_FK = Internal.createForeignKey(GamePlatformAsg.GAME_PLATFORM_ASG, DSL.name("game_platform_asg_FK"), new TableField[] { GamePlatformAsg.GAME_PLATFORM_ASG.GAME_ID }, Keys.KEY_GAME_PRIMARY, new TableField[] { Game.GAME.ID }, true);
    public static final ForeignKey<GamePlatformAsgRecord, PlatformRecord> GAME_PLATFORM_ASG_FK_1 = Internal.createForeignKey(GamePlatformAsg.GAME_PLATFORM_ASG, DSL.name("game_platform_asg_FK_1"), new TableField[] { GamePlatformAsg.GAME_PLATFORM_ASG.PLATFORM_ID }, Keys.KEY_PLATFORM_PRIMARY, new TableField[] { Platform.PLATFORM.ID }, true);
    public static final ForeignKey<UserRecord, SiteRoleRecord> USER_FK = Internal.createForeignKey(User.USER, DSL.name("user_FK"), new TableField[] { User.USER.SITE_ROLE_ID }, Keys.KEY_SITE_ROLE_PRIMARY, new TableField[] { SiteRole.SITE_ROLE.ID }, true);
}
