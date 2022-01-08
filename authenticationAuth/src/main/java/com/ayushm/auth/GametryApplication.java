package com.ayushm.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableConfigurationProperties
@EntityScan("com.ayushm.auth")
@ComponentScan("com.ayushm.auth")
public class GametryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GametryApplication.class, args);
	}

}
