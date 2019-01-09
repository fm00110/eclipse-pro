package com.ncu.service;

import java.util.Arrays;
import java.util.List;

import com.ncu.bean.UserAddress;

/**
 * 1、将服务提供者注册到注册中心 1）导入dubbo依赖 ，操作zookeeper的客户端依赖 2）配置服务提供者
 * 2、让消费者从注册中心去订阅服务者提供的服务地址
 * 
 * @author fm
 *
 */
public class UserServiceImpl implements UserService {

	public List<UserAddress> getUserAddressList(String userId) {
		// TODO Auto-generated method stub
		UserAddress u1 = new UserAddress(1, "江西抚州", "1", "方敏", "13694849636", "1");
		UserAddress u2 = new UserAddress(2, "江西南昌", "2", "张飞", "1362343434", "0");
		return Arrays.asList(u1, u2);
	}

}
