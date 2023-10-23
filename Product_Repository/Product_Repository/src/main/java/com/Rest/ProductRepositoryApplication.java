package com.Rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ProductRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductRepositoryApplication.class, args);
	}

}
