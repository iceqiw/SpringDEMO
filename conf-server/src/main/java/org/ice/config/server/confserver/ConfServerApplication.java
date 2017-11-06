package org.ice.config.server.confserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ConfServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfServerApplication.class, args);
	}
}
