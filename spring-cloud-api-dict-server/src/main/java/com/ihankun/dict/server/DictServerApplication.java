package com.ihankun.dict.server;

import com.ihankun.dict.api.DictAutoConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author hankun
 */
@Slf4j
@SpringBootApplication(exclude = {DictAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients(basePackageClasses = DictServerApplication.class)
public class DictServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DictServerApplication.class, args);
	}

}
