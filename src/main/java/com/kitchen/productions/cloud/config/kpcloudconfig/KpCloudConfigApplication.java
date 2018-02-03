package com.kitchen.productions.cloud.config.kpcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class KpCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(KpCloudConfigApplication.class, args);
	}
}
