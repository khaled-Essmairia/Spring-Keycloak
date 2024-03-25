package com.example.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.keycloak.admin.client.Keycloak;

@Configuration
public class KeycloakConfig {

    @Bean
    public Keycloak keycloak() {
        // Create and configure a Keycloak instance
        return Keycloak.getInstance("http://localhost:8080/", "Pi-Dev", "admin", "admin", "pidev-client-ang");
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}