package com.ncu.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ncu.bean.User;

@Mapper
public interface UserDao {
	@Select("select * from student where id=#{id}")
	public User getUser(Integer id);
}
