package com.ncu.send;

import java.io.IOException;

import com.ncu.util.ConnectionUtil;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

public class Rec2 {
	
	private static final String QUEUE_NAME="ncu.news";

	public static void main(String[] args) throws IOException, Exception {
		//获取channel
		Connection connection = ConnectionUtil.getConnection();
		
		//创建频道
		Channel channel = connection.createChannel();
		
		DefaultConsumer consumer = new DefaultConsumer(channel) {
			 @Override
			 //获取到达的消息
			    public void handleDelivery(String consumerTag,
			                               Envelope envelope,
			                               AMQP.BasicProperties properties,
			                               byte[] body)
			        throws IOException
			    {
			            // no work to do
				 String msg = new String(body,"utf-8");
				 System.out.println("rec2---->"+msg);
				 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					System.out.println("[2] done");
				}
			    }
		};
		//监听队列
		channel.basicConsume(QUEUE_NAME, true, consumer);
	}
}
