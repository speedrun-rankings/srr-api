/*
 * This file is generated by jOOQ.
 */
package io.github.sornerol.speedrunrankingsapi.data.generated.mysql.tables;


import io.github.sornerol.speedrunrankingsapi.data.generated.mysql.Mysql;
import io.github.sornerol.speedrunrankingsapi.data.generated.mysql.tables.records.UserRecord;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User extends TableImpl<UserRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.user</code>
     */
    public static final User USER = new User();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRecord> getRecordType() {
        return UserRecord.class;
    }

    /**
     * The column <code>mysql.user.Host</code>.
     */
    public final TableField<UserRecord, String> HOST = createField(DSL.name("Host"), SQLDataType.CHAR(60).nullable(false).defaultValue(DSL.field("''", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.user.User</code>.
     */
    public final TableField<UserRecord, String> USER_ = createField(DSL.name("User"), SQLDataType.CHAR(80).nullable(false).defaultValue(DSL.field("''", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.user.Password</code>.
     */
    public final TableField<UserRecord, String> PASSWORD = createField(DSL.name("Password"), SQLDataType.CLOB.defaultValue(DSL.field("NULL", SQLDataType.CLOB)), this, "");

    /**
     * The column <code>mysql.user.Select_priv</code>.
     */
    public final TableField<UserRecord, String> SELECT_PRIV = createField(DSL.name("Select_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Insert_priv</code>.
     */
    public final TableField<UserRecord, String> INSERT_PRIV = createField(DSL.name("Insert_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Update_priv</code>.
     */
    public final TableField<UserRecord, String> UPDATE_PRIV = createField(DSL.name("Update_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Delete_priv</code>.
     */
    public final TableField<UserRecord, String> DELETE_PRIV = createField(DSL.name("Delete_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Create_priv</code>.
     */
    public final TableField<UserRecord, String> CREATE_PRIV = createField(DSL.name("Create_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Drop_priv</code>.
     */
    public final TableField<UserRecord, String> DROP_PRIV = createField(DSL.name("Drop_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Reload_priv</code>.
     */
    public final TableField<UserRecord, String> RELOAD_PRIV = createField(DSL.name("Reload_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Shutdown_priv</code>.
     */
    public final TableField<UserRecord, String> SHUTDOWN_PRIV = createField(DSL.name("Shutdown_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Process_priv</code>.
     */
    public final TableField<UserRecord, String> PROCESS_PRIV = createField(DSL.name("Process_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.File_priv</code>.
     */
    public final TableField<UserRecord, String> FILE_PRIV = createField(DSL.name("File_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Grant_priv</code>.
     */
    public final TableField<UserRecord, String> GRANT_PRIV = createField(DSL.name("Grant_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.References_priv</code>.
     */
    public final TableField<UserRecord, String> REFERENCES_PRIV = createField(DSL.name("References_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Index_priv</code>.
     */
    public final TableField<UserRecord, String> INDEX_PRIV = createField(DSL.name("Index_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Alter_priv</code>.
     */
    public final TableField<UserRecord, String> ALTER_PRIV = createField(DSL.name("Alter_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Show_db_priv</code>.
     */
    public final TableField<UserRecord, String> SHOW_DB_PRIV = createField(DSL.name("Show_db_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Super_priv</code>.
     */
    public final TableField<UserRecord, String> SUPER_PRIV = createField(DSL.name("Super_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Create_tmp_table_priv</code>.
     */
    public final TableField<UserRecord, String> CREATE_TMP_TABLE_PRIV = createField(DSL.name("Create_tmp_table_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Lock_tables_priv</code>.
     */
    public final TableField<UserRecord, String> LOCK_TABLES_PRIV = createField(DSL.name("Lock_tables_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Execute_priv</code>.
     */
    public final TableField<UserRecord, String> EXECUTE_PRIV = createField(DSL.name("Execute_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Repl_slave_priv</code>.
     */
    public final TableField<UserRecord, String> REPL_SLAVE_PRIV = createField(DSL.name("Repl_slave_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Repl_client_priv</code>.
     */
    public final TableField<UserRecord, String> REPL_CLIENT_PRIV = createField(DSL.name("Repl_client_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Create_view_priv</code>.
     */
    public final TableField<UserRecord, String> CREATE_VIEW_PRIV = createField(DSL.name("Create_view_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Show_view_priv</code>.
     */
    public final TableField<UserRecord, String> SHOW_VIEW_PRIV = createField(DSL.name("Show_view_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Create_routine_priv</code>.
     */
    public final TableField<UserRecord, String> CREATE_ROUTINE_PRIV = createField(DSL.name("Create_routine_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Alter_routine_priv</code>.
     */
    public final TableField<UserRecord, String> ALTER_ROUTINE_PRIV = createField(DSL.name("Alter_routine_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Create_user_priv</code>.
     */
    public final TableField<UserRecord, String> CREATE_USER_PRIV = createField(DSL.name("Create_user_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Event_priv</code>.
     */
    public final TableField<UserRecord, String> EVENT_PRIV = createField(DSL.name("Event_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Trigger_priv</code>.
     */
    public final TableField<UserRecord, String> TRIGGER_PRIV = createField(DSL.name("Trigger_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Create_tablespace_priv</code>.
     */
    public final TableField<UserRecord, String> CREATE_TABLESPACE_PRIV = createField(DSL.name("Create_tablespace_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.Delete_history_priv</code>.
     */
    public final TableField<UserRecord, String> DELETE_HISTORY_PRIV = createField(DSL.name("Delete_history_priv"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.ssl_type</code>.
     */
    public final TableField<UserRecord, String> SSL_TYPE = createField(DSL.name("ssl_type"), SQLDataType.VARCHAR(9).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.ssl_cipher</code>.
     */
    public final TableField<UserRecord, String> SSL_CIPHER = createField(DSL.name("ssl_cipher"), SQLDataType.CLOB.nullable(false).defaultValue(DSL.field("''", SQLDataType.CLOB)), this, "");

    /**
     * The column <code>mysql.user.x509_issuer</code>.
     */
    public final TableField<UserRecord, String> X509_ISSUER = createField(DSL.name("x509_issuer"), SQLDataType.CLOB.nullable(false).defaultValue(DSL.field("''", SQLDataType.CLOB)), this, "");

    /**
     * The column <code>mysql.user.x509_subject</code>.
     */
    public final TableField<UserRecord, String> X509_SUBJECT = createField(DSL.name("x509_subject"), SQLDataType.CLOB.nullable(false).defaultValue(DSL.field("''", SQLDataType.CLOB)), this, "");

    /**
     * The column <code>mysql.user.max_questions</code>.
     */
    public final TableField<UserRecord, ULong> MAX_QUESTIONS = createField(DSL.name("max_questions"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.field("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>mysql.user.max_updates</code>.
     */
    public final TableField<UserRecord, ULong> MAX_UPDATES = createField(DSL.name("max_updates"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.field("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>mysql.user.max_connections</code>.
     */
    public final TableField<UserRecord, ULong> MAX_CONNECTIONS = createField(DSL.name("max_connections"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.field("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>mysql.user.max_user_connections</code>.
     */
    public final TableField<UserRecord, Long> MAX_USER_CONNECTIONS = createField(DSL.name("max_user_connections"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>mysql.user.plugin</code>.
     */
    public final TableField<UserRecord, String> PLUGIN = createField(DSL.name("plugin"), SQLDataType.CLOB.nullable(false).defaultValue(DSL.field("''", SQLDataType.CLOB)), this, "");

    /**
     * The column <code>mysql.user.authentication_string</code>.
     */
    public final TableField<UserRecord, String> AUTHENTICATION_STRING = createField(DSL.name("authentication_string"), SQLDataType.CLOB.nullable(false).defaultValue(DSL.field("''", SQLDataType.CLOB)), this, "");

    /**
     * The column <code>mysql.user.password_expired</code>.
     */
    public final TableField<UserRecord, String> PASSWORD_EXPIRED = createField(DSL.name("password_expired"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field("''", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.is_role</code>.
     */
    public final TableField<UserRecord, String> IS_ROLE = createField(DSL.name("is_role"), SQLDataType.VARCHAR(1).defaultValue(DSL.field("NULL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.user.default_role</code>.
     */
    public final TableField<UserRecord, String> DEFAULT_ROLE = createField(DSL.name("default_role"), SQLDataType.CLOB.nullable(false).defaultValue(DSL.field("''", SQLDataType.CLOB)), this, "");

    /**
     * The column <code>mysql.user.max_statement_time</code>.
     */
    public final TableField<UserRecord, BigDecimal> MAX_STATEMENT_TIME = createField(DSL.name("max_statement_time"), SQLDataType.DECIMAL(12, 6).nullable(false).defaultValue(DSL.field("0.000000", SQLDataType.DECIMAL)), this, "");

    private User(Name alias, Table<UserRecord> aliased) {
        this(alias, aliased, null);
    }

    private User(Name alias, Table<UserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"), TableOptions.view("create view `user` as select `mysql`.`global_priv`.`Host` AS `Host`,`mysql`.`global_priv`.`User` AS `User`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.plugin') in ('mysql_native_password','mysql_old_password'),ifnull(json_value(`mysql`.`global_priv`.`Priv`,'$.authentication_string'),''),'') AS `Password`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 1,'Y','N') AS `Select_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 2,'Y','N') AS `Insert_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 4,'Y','N') AS `Update_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 8,'Y','N') AS `Delete_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 16,'Y','N') AS `Create_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 32,'Y','N') AS `Drop_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 64,'Y','N') AS `Reload_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 128,'Y','N') AS `Shutdown_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 256,'Y','N') AS `Process_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 512,'Y','N') AS `File_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 1024,'Y','N') AS `Grant_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 2048,'Y','N') AS `References_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 4096,'Y','N') AS `Index_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 8192,'Y','N') AS `Alter_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 16384,'Y','N') AS `Show_db_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 32768,'Y','N') AS `Super_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 65536,'Y','N') AS `Create_tmp_table_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 131072,'Y','N') AS `Lock_tables_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 262144,'Y','N') AS `Execute_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 524288,'Y','N') AS `Repl_slave_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 1048576,'Y','N') AS `Repl_client_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 2097152,'Y','N') AS `Create_view_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 4194304,'Y','N') AS `Show_view_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 8388608,'Y','N') AS `Create_routine_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 16777216,'Y','N') AS `Alter_routine_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 33554432,'Y','N') AS `Create_user_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 67108864,'Y','N') AS `Event_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 134217728,'Y','N') AS `Trigger_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 268435456,'Y','N') AS `Create_tablespace_priv`,if(json_value(`mysql`.`global_priv`.`Priv`,'$.access') & 536870912,'Y','N') AS `Delete_history_priv`,elt(ifnull(json_value(`mysql`.`global_priv`.`Priv`,'$.ssl_type'),0) + 1,'','ANY','X509','SPECIFIED') AS `ssl_type`,ifnull(json_value(`mysql`.`global_priv`.`Priv`,'$.ssl_cipher'),'') AS `ssl_cipher`,ifnull(json_value(`mysql`.`global_priv`.`Priv`,'$.x509_issuer'),'') AS `x509_issuer`,ifnull(json_value(`mysql`.`global_priv`.`Priv`,'$.x509_subject'),'') AS `x509_subject`,cast(ifnull(json_value(`mysql`.`global_priv`.`Priv`,'$.max_questions'),0) as unsigned) AS `max_questions`,cast(ifnull(json_value(`mysql`.`global_priv`.`Priv`,'$.max_updates'),0) as unsigned) AS `max_updates`,cast(ifnull(json_value(`mysql`.`global_priv`.`Priv`,'$.max_connections'),0) as unsigned) AS `max_connections`,cast(ifnull(json_value(`mysql`.`global_priv`.`Priv`,'$.max_user_connections'),0) as signed) AS `max_user_connections`,ifnull(json_value(`mysql`.`global_priv`.`Priv`,'$.plugin'),'') AS `plugin`,ifnull(json_value(`mysql`.`global_priv`.`Priv`,'$.authentication_string'),'') AS `authentication_string`,'N' AS `password_expired`,elt(ifnull(json_value(`mysql`.`global_priv`.`Priv`,'$.is_role'),0) + 1,'N','Y') AS `is_role`,ifnull(json_value(`mysql`.`global_priv`.`Priv`,'$.default_role'),'') AS `default_role`,cast(ifnull(json_value(`mysql`.`global_priv`.`Priv`,'$.max_statement_time'),0.0) as decimal(12,6)) AS `max_statement_time` from `mysql`.`global_priv`"));
    }

    /**
     * Create an aliased <code>mysql.user</code> table reference
     */
    public User(String alias) {
        this(DSL.name(alias), USER);
    }

    /**
     * Create an aliased <code>mysql.user</code> table reference
     */
    public User(Name alias) {
        this(alias, USER);
    }

    /**
     * Create a <code>mysql.user</code> table reference
     */
    public User() {
        this(DSL.name("user"), null);
    }

    public <O extends Record> User(Table<O> child, ForeignKey<O, UserRecord> key) {
        super(child, key, USER);
    }

    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    @Override
    public User as(String alias) {
        return new User(DSL.name(alias), this);
    }

    @Override
    public User as(Name alias) {
        return new User(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(String name) {
        return new User(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(Name name) {
        return new User(name, null);
    }
}