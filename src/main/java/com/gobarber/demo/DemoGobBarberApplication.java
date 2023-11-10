package com.gobarber.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DemoGobBarberApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoGobBarberApplication.class, args);
	}

}
