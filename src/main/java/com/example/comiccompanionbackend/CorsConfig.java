package com.example.comiccompanionbackend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * The CorsConfig class is a configuration class for Cross-Origin Resource Sharing (CORS) settings.
 * It defines CORS configuration for your application, allowing or restricting cross-origin requests.
 * CORS is essential for enabling web applications hosted on different domains to communicate with your application's API.
 *
 * This configuration permits cross-origin requests from all origins ("*") and allows specific HTTP methods,
 * headers, and exposed headers to be used in these requests.
 *
 * @Configuration Indicates that this class provides configuration for the application.
 */
@Configuration
public class CorsConfig {

    /**
     * Defines a WebMvcConfigurer bean to configure CORS settings.
     *
     * @return A WebMvcConfigurer bean with custom CORS configuration.
     */
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*")
                        .allowedOrigins("*")
                        .exposedHeaders("*");
            }
        };
    }
}