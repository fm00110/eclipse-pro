package com.ncu.send;

import java.io.IOException;

import com.ncu.util.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
/**
 * 
 * @author fm
 * 生产者
 * 简单队列，一个生产者对应一个消费者
 */
public class Send {
	
	private static final String QUEUE_NAME="ncu.news";
	private static final String ROUTING_KEY="ncu.news";
	
	public static void main(String[] args) throws IOException, Exception {
		//获取连接
		Connection connection = ConnectionUtil.getConnection();
		
		//从连接中获取一个通道		
		Channel channel = connection.createChannel();
		
		//声明一个队列
		//channel.queueDeclare(QUEUE_NAME,false,false,false,null);
		
		String msg = "hello rabbit!";
		channel.basicPublish("exchange.direct", QUEUE_NAME, null, msg.getBytes());
		
		
		channel.close();
		connection.close();
		
	}
}
