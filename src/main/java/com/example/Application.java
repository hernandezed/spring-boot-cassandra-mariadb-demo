package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableCassandraRepositories(basePackages = "com.example.cassandra.repository")
@EnableJpaRepositories(basePackages = "com.example.jpa.repository")
@EnableMongoRepositories(basePackages = "com.example.mongo.repository")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
