package com.ihankun.dict.api;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = DictConfiguration.class)
@EnableFeignClients(basePackageClasses = DictConfiguration.class)
public class DictConfiguration {

}
