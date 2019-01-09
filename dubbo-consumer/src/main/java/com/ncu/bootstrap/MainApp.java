package com.ncu.bootstrap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncu.service.OrderService;

public class MainApp {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
		OrderService service = ioc.getBean(OrderService.class);
		service.initOrder("1");
		System.out.println("调用结束");
		System.in.read();
	}
}
