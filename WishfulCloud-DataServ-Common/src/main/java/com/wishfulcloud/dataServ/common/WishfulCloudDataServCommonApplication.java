package com.wishfulcloud.dataServ.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WishfulCloudDataServCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(WishfulCloudDataServCommonApplication.class, args);
	}
}
