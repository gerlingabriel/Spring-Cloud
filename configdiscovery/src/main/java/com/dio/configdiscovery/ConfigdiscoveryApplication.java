package com.dio.configdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ConfigdiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigdiscoveryApplication.class, args);
	}

}
