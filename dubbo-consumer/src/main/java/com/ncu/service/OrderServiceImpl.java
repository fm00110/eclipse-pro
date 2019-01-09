package com.ncu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncu.bean.UserAddress;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	UserService userService;

	public void initOrder(String userId) {
		// TODO Auto-generated method stub
		// 1、查询用户的收获地址
		System.out.println("用户ID" + userId);
		List<UserAddress> list = userService.getUserAddressList(userId);
		for (UserAddress userAddress : list) {
			System.out.println(userAddress);
		}
	}

}
