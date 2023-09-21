package com.s_mic_hys_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class SMicHysApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SMicHysApiGatewayApplication.class, args);
	}

}
