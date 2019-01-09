package com.ncu.send;

import java.io.IOException;

import com.ncu.util.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class WorkQueue {
	private static final String QUEUE_NAME="ncu.news";
	private static final String ROUTING_KEY="ncu.news";
	
	public static void main(String[] args) throws IOException, Exception {
		
		Connection connection = ConnectionUtil.getConnection();
		//获取channel
		Channel channel = connection.createChannel();
		
		//声明队列
		for(int i = 0;i < 50;i++) {
			String msg = "hello rabbit"+i;
			channel.basicPublish("exchange.direct", ROUTING_KEY, null, msg.getBytes());
			Thread.sleep(i*20);
		}
		
		channel.close();
		connection.close();
	}
}
