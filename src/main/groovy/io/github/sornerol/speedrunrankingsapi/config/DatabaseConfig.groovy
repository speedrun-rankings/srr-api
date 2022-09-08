package io.github.sornerol.speedrunrankingsapi.config

import groovy.transform.CompileStatic
import org.jooq.conf.RenderQuotedNames
import org.jooq.conf.Settings
import org.jooq.impl.DataSourceConnectionProvider
import org.jooq.impl.DefaultConfiguration
import org.jooq.impl.DefaultDSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy

import javax.sql.DataSource

@Configuration
@CompileStatic
class DatabaseConfig {

    @Autowired
    private DataSource dataSource

    @Bean
    DataSourceConnectionProvider connectionProvider() {
        new DataSourceConnectionProvider (new TransactionAwareDataSourceProxy(dataSource))
    }

    @Bean
    DefaultConfiguration configuration() {
        DefaultConfiguration jooqConfiguration = new DefaultConfiguration()
        jooqConfiguration.set(connectionProvider())
        jooqConfiguration.set(new Settings().withRenderQuotedNames(RenderQuotedNames.NEVER))
        jooqConfiguration
    }

    @Bean
    DefaultDSLContext dsl() {
        new DefaultDSLContext(configuration())
    }
}
