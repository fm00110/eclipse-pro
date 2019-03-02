package com.ncu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy // 开启ZuulProxy服务
public class Zuul_9527_Sprinfcloud_App {

	public static void main(String[] args) {
		SpringApplication.run(Zuul_9527_Sprinfcloud_App.class, args);
	}
}
