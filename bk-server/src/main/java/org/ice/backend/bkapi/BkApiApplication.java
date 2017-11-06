package org.ice.backend.bkapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BkApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BkApiApplication.class, args);
	}
}
