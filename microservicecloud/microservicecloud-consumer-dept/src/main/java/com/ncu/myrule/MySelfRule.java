package com.ncu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class MySelfRule {

	@Bean
	public IRule myRule() {
		return new RoundRobinRule(); // 默认的轮询算法
		// return new RandomRule(); // 随机算法

	}
}
