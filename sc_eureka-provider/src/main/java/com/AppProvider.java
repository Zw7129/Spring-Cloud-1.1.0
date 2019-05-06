package com;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient//表示是一个eurekaserver
@MapperScan(basePackages = "com.dao")
@SpringBootApplication
public class AppProvider {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(AppProvider.class, args);
	}
 

}