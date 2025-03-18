package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;

import com.netflix.ribbon.RequestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMicroServiceClientApplication {

	public static final String baseUrl = "http://testuser-microservice";
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroServiceClientApplication.class, args);
	}
	
	
//	public RestTemplate restTemplate()
//	{
//		return new RestTemplate();
//	}

}
