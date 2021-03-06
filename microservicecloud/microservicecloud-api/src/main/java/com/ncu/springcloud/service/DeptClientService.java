package com.ncu.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncu.springcloud.entities.Dept;

@FeignClient(value = "MICROSERVICECLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class) //
public interface DeptClientService {

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)//这里是调用服务端的地址，http:MICROSERVICECLOUD-DEPT/dept/add
	
	public boolean addDept(Dept dept);

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept findById(@PathVariable("id") Long id);

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> findAll();

	@RequestMapping(value = "/dept/delete/{id}", method = RequestMethod.GET)
	public void deleteById(@PathVariable("id") Long id);

}
