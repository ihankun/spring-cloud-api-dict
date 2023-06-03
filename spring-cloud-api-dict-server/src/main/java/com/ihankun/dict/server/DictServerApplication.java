package com.ihankun.dict.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {DictServerApplication.class})
@EnableDiscoveryClient
@EnableFeignClients(basePackageClasses = DictServerApplication.class)
public class DictServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DictServerApplication.class, args);
	}

}
