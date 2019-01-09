package com.ncu.util;


import redis.clients.jedis.Jedis;

public class ConnRedis {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.62.133",6379);
		System.out.println(jedis.ping());
		
		System.out.println(jedis.get("k1"));
		
	}
}
