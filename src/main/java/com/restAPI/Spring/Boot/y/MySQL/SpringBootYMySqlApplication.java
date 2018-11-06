package com.restAPI.Spring.Boot.y.MySQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootYMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootYMySqlApplication.class, args);
	}
}
