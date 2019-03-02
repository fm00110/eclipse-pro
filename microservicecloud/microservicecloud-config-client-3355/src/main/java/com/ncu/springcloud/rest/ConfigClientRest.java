package com.ncu.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientRest {

	@Value("${spring.application.name}") // 这个值是从配置好的github上microservicecloud-client-config.yml的
	private String applicationName;

	@Value("${eureka.client.service-url.defaultZone}")
	private String eurekaServer;

	@Value("${server.port}")
	private String port;

	@RequestMapping("/config")
	public String getConfig() {
		String str = "applicationName: " + applicationName + "\t eurekaServer: " + eurekaServer + "\t port: " + port;
		System.out.println("*******str" + str);
		return str;
	}

}
