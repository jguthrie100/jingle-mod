package com.jingle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.jingle"})
@EnableJpaRepositories("com.jingle.api.repositories")
@EntityScan("com.jingle") 
public class Server {

	public static void main(String[] args) {
		SpringApplication.run(Server.class, args);
	}

}
