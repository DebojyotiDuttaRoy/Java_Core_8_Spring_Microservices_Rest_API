package com.s_mic_server_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SMicServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SMicServerConfigApplication.class, args);
	}

}
