package com.wishfulcloud.dataServ.serialNum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WishfulCloudDataServSerialNumApplication {

	public static void main(String[] args) {
		SpringApplication.run(WishfulCloudDataServSerialNumApplication.class, args);
	}
}
