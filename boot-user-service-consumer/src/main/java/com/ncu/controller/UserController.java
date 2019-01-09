package com.ncu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ncu.service.OrderService;

@Controller
public class UserController {

	@Autowired
	OrderService orderService;

	@RequestMapping(value = "/hello1")
	@ResponseBody
	public String testDubbo() {
		System.out.println(orderService.initOrder(1));
		return "rest1";
	}
}
