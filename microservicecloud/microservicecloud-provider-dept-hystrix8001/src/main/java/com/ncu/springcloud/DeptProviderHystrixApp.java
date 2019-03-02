package com.ncu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient
@EnableCircuitBreaker // 开启服务熔断
public class DeptProviderHystrixApp {
	// 主启动类
	public static void main(String[] args) {
		SpringApplication.run(DeptProviderHystrixApp.class, args);
	}
}
