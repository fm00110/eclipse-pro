package com.ncu.service;

import java.util.List;

import com.ncu.bean.UserAddress;

public interface UserService {
	/**
	 * 根据用户id返回所有的收货地址
	 * 
	 * @param userId
	 * @return
	 */
	public List<UserAddress> getUserAddressList(String userId);
}
