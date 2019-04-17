package com.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer//表示是一个eurekaserver
@SpringBootApplication
public class AppCloud {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(AppCloud.class, args);
	}
 

}