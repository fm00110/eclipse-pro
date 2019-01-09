package com.ncu.util;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class ConnectionUtil {
	
	/**
	 * 
	 * 获取MQ的连接
	 * @throws Exception 
	 * @throws IOException 
	 * 
	 */

	public static Connection getConnection() throws IOException, Exception {
		ConnectionFactory factory = new ConnectionFactory();
		//设置主机
		factory.setHost("192.168.36.129");
		
		//设置端口号，客户端的是5672，管理端口是15672
		factory.setPort(5672);
		
		//设置用户名及密码
		factory.setUsername("guest");
		factory.setPassword("guest");
		
		//设置Vhost
		factory.setVirtualHost("/");
		
		//获取连接
		return factory.newConnection();
	}
}
