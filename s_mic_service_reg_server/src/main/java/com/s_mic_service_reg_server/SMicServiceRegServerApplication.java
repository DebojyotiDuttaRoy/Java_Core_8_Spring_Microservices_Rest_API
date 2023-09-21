package com.s_mic_service_reg_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SMicServiceRegServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SMicServiceRegServerApplication.class, args);
	}

}
