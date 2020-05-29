package com.Morgan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching //enabling caching
public class SpringBootPartTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPartTwoApplication.class, args);
	}

}
