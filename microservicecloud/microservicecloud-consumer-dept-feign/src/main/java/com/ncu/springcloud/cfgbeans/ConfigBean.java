package com.ncu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean { // boot 版的 applicationContext.xml文件

	// bean id= "" class="" property=""
	@Bean
	@LoadBalanced // 开启负载均衡，ribbon是一种客户端负载均衡的工具，在客户端开启
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
