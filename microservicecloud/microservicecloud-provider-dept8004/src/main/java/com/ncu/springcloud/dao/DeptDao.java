package com.ncu.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ncu.springcloud.entities.Dept;

@Mapper // 添加映射注解
public interface DeptDao {

	public boolean addDept(@Param(value = "dept") Dept dept);

	public Dept findById(@Param(value = "deptno") Long deptno);

	public List<Dept> findAll();

	public void deleteById(@Param(value = "deptno") Long deptno);

	public void updateDept(@Param(value = "dept") Dept dept);
}
