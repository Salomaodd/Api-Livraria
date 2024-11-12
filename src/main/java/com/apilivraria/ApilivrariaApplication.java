package com.apilivraria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ApilivrariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApilivrariaApplication.class, args);
	}

}
