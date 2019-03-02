package com.ncu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ncu.springcloud.entities.Dept;

@RestController
public class DeptController_Concumer {

	// private static final String REST_URL_PRETRIX = "http://localhost:8001";
	private static final String REST_URL_PRETRIX = "http://MICROSERVICECLOUD-DEPT";// 用服务名代替原来的IP地址+端口
	@Autowired
	private RestTemplate restTemplate; // 提供了多种便捷访问http服务的方法
	// 提供了多种便捷访问http服务的方法
	// 是一种简单便捷的restful服务模板类，是spring提供的用于访问rest服务的客户端模板工具集
	// 类似与jdbctemplate

	/**
	 * 使用restTemplate访问restful接口非常的简单
	 * (url,requestMap,ResponseBean.class)三个参数费别代表rest请求地址，请求参数，HTTP响应转换 被转换成的对象模型
	 */
	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept) {
		System.out.println("=============consumer调用此方法===========");
		return restTemplate.postForObject(REST_URL_PRETRIX + "/dept/add", dept, Boolean.class);
	}

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") long id) {
		return restTemplate.getForObject(REST_URL_PRETRIX + "/dept/get/" + id, Dept.class);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {
		return restTemplate.getForObject(REST_URL_PRETRIX + "/dept/list", List.class);
	}

	@RequestMapping("/consumer/dept/discovery")
	public Object discovery() {
		return restTemplate.getForObject(REST_URL_PRETRIX + "/dept/discovery", Object.class);
	}
}
