package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
