package com.spring.config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.spring.repository")
@ComponentScan("com.spring")
@PropertySource("application.properties")
@EntityScan("com.spring.model")
public class ApplicationConfig {
}
