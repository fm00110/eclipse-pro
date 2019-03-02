package com.ncu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
// @RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration =
// MySelfRule.class)
@EnableFeignClients(basePackages = { "com.ncu.springcloud" })
@ComponentScan(basePackages = { "com.ncu.springcloud" })
public class DeptConsumer_feignApp {

	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer_feignApp.class, args);
	}
}
