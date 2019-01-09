package com.ncu.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.ncu.bean.User;
import com.ncu.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub

		return userDao.getUser(id);
	}

}
