package com.casestudy.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;

import com.casestudy.project.userprofile.services.ProfileServiceImpl;

@SpringBootApplication
@EnableMongoRepositories
@EnableEurekaServer

public class ProfileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileServiceApplication.class, args);
			
	}
	@Bean // it will be called anywhere because below class has the config
	public ProfileServiceImpl proService() {
		return new  ProfileServiceImpl();
	}
	}

