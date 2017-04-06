package com.wishfulcloud.dataServ.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WishfulCloudDataServAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(WishfulCloudDataServAdminApplication.class, args);
	}
}
