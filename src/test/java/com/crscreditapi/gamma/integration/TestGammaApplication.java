package com.crscreditapi.gamma.integration;

import com.crscreditapi.gamma.GammaApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

@ActiveProfiles("test")
@TestConfiguration(proxyBeanMethods = false)
@Testcontainers
public class TestGammaApplication {

    @Bean
    @ServiceConnection
    PostgreSQLContainer<?> postgresContainer() {
        return new PostgreSQLContainer<>("postgres:15.3")
                .withDatabaseName("gamma")
                .withUsername("gamma")
                .withPassword("gamma");
    }

    public static void main(String[] args) {
        SpringApplication
                .from(GammaApplication::main)
                .with(TestGammaApplication.class)
                .run(args);
    }
}
