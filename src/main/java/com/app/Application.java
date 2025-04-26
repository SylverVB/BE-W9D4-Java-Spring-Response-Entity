package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * The main entry point for the Spring Boot application.
 * 
 * This class contains the main method that launches the Spring Boot application.
 * It is annotated with {@link SpringBootApplication}, which is a convenience annotation
 * that adds all of the following:
 * <ul>
 *   <li>{@link Configuration} - marks the class as a source of bean definitions for the application context.</li>
 *   <li>{@link EnableAutoConfiguration} - enables Spring Boot's auto-configuration mechanism.</li>
 *   <li>{@link ComponentScan} - enables component scanning, which allows Spring to discover and register beans.</li>
 * </ul>
 * 
 * The main method calls {@link SpringApplication#run(Class, String...)} to launch the application.
 * 
 * @see SpringBootApplication
 * @see SpringApplication
 */
@SpringBootApplication
public class Application {
    
    /**
     * The main method which serves as the entry point for the application.
     * It starts the Spring Boot application by invoking {@link SpringApplication#run(Class, String...)}.
     * 
     * @param args command-line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}