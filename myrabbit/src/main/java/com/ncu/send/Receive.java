package com.ncu.send;

import java.io.IOException;

import com.ncu.util.ConnectionUtil;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.QueueingConsumer.Delivery;

/**
 * 
 * @author fm
 * 消费者获取消息
 */
public class Receive {

	private static final String QUEUE_NAME="ncu.news";
	
	
	
	public static void main(String[] args) throws IOException, Exception {
		//获取channel
		Connection connection = ConnectionUtil.getConnection();
		
		//创建频道
		Channel channel = connection.createChannel();
		
		//定义监听队列的消费者，这是老的api
/*		QueueingConsumer consumer = new QueueingConsumer(channel);
		
		//监听队列
		channel.basicConsume(QUEUE_NAME, true,consumer);
		
		//从队列接收消息
		while(true) {
			Delivery delivery = consumer.nextDelivery();
			String msgString = new String(delivery.getBody());
			System.out.println(msgString);
		}
		
		*/
		
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
				 System.out.println("new api---->"+msg);
			    }
		};
		//监听队列
		channel.basicConsume(QUEUE_NAME, true, consumer);
		
	}
}
