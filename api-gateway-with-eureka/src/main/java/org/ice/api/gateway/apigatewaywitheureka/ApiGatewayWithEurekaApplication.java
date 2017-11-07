package org.ice.api.gateway.apigatewaywitheureka;

import org.ice.api.gateway.apigatewaywitheureka.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ApiGatewayWithEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayWithEurekaApplication.class, args);
	}

	@Bean
	public AccessFilter simpleFilter() {
		return new AccessFilter();
	}
}
