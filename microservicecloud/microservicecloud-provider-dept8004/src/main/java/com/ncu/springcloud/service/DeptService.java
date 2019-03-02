package com.ncu.springcloud.service;

import java.util.List;

import com.ncu.springcloud.entities.Dept;

public interface DeptService {

	public boolean addDept(Dept dept);

	public Dept findById(Long deptno);

	public List<Dept> findAll();

	public void deleteById(Long deptno);

	public void updateDept(Dept dept);

}
