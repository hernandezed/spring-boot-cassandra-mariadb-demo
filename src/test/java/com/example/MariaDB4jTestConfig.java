/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import ch.vorburger.exec.ManagedProcessException;
import ch.vorburger.mariadb4j.DBConfigurationBuilder;
import ch.vorburger.mariadb4j.springframework.MariaDB4jSpringService;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Eduardo
 */
@Configuration
public class MariaDB4jTestConfig {

    @Bean
    MariaDB4jSpringService mariaDB4jSpringService() {
        MariaDB4jSpringService mariaDB4jSpringService = new MariaDB4jSpringService();
        // Argumento para deshabilitar el control de ejecución con root
        mariaDB4jSpringService.getConfiguration().addArg("--user=root");
        return mariaDB4jSpringService;
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    DataSource dataSource(MariaDB4jSpringService mariaDB4jSpringService,
            @Value("${app.mariaDB4j.databaseName}") String databaseName) throws ManagedProcessException {
        mariaDB4jSpringService.getDB().createDB(databaseName);

        DBConfigurationBuilder config = mariaDB4jSpringService.getConfiguration();

        return DataSourceBuilder
                .create()
                .url(config.getURL(databaseName))
                .build();
    }
}
