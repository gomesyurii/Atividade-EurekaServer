package com.example.clientB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientBApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientBApplication.class, args);
	}

}
