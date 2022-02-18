package com.example.HerokuApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class HerokuAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokuAppApplication.class, args);
	}

}
