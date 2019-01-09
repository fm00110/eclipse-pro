package com.ncu.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ncu.bean.User;

@Service
public class OrderServiceImpl implements OrderService {
	// @Reference(url="192.168.31.36:20880")通过url直接连上服务，不需要注册中心
	@Reference
	UserService userService;

	@Override
	public User initOrder(Integer id) {
		// TODO Auto-generated method stub

		System.out.println(userService.getUser(id));

		return userService.getUser(id);
	}

}
