package com.ncu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ncu.springcloud.entities.Dept;
import com.ncu.springcloud.service.DeptService;

@RestController
public class DeptController {
	@Autowired
	private DeptService deptService;
	@Autowired
	private DiscoveryClient client;

	//
	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@ModelAttribute Dept dept) {
		System.out.println("=============provider调用此方法===========");
		return deptService.addDept(dept);
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") long id) {
		return deptService.findById(id);
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		return deptService.findAll();
	}

	@RequestMapping(value = "/dept/delete/{id}", method = RequestMethod.GET)
	public void delete(@PathVariable("id") long id) {
		deptService.deleteById(id);
	}

	@RequestMapping(value = "/dept/discovery")
	public Object discovery() {
		List<String> list = client.getServices(); // 查询出eureka所有的微服务
		System.out.println("***********" + list);
		List<ServiceInstance> srvlist = client.getInstances("MICROSERVICECLOUD-DEPT");
		for (ServiceInstance element : srvlist) {
			System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getUri());

		}
		return this.client;
	}

}
