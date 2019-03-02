package com.ncu.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ncu.springcloud.entities.Dept;
import com.ncu.springcloud.service.DeptClientService;

@RestController
public class DeptController_Concumer {

	@Autowired
	private DeptClientService service; // 面向接口编程，不再是调用模板了，而且feign也封装了ribbon

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@ModelAttribute Dept dept) {
		System.out.println("=============provider调用此方法===========");
		return service.addDept(dept);
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") long id) {
		return service.findById(id);
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		return service.findAll();
	}

	@RequestMapping(value = "/dept/delete/{id}", method = RequestMethod.GET)
	public void delete(@PathVariable("id") long id) {
		service.deleteById(id);
	}

}
