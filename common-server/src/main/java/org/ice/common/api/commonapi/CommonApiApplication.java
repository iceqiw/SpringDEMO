package org.ice.common.api.commonapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class CommonApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonApiApplication.class, args);
	}
}
