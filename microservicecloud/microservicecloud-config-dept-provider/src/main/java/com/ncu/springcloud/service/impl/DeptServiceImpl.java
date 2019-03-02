package com.ncu.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncu.springcloud.dao.DeptDao;
import com.ncu.springcloud.entities.Dept;
import com.ncu.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	DeptDao deptDao;

	@Override
	public boolean addDept(Dept dept) {
		// TODO Auto-generated method stub
		return deptDao.addDept(dept);
	}

	@Override
	public Dept findById(Long deptno) {
		// TODO Auto-generated method stub
		return deptDao.findById(deptno);
	}

	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return deptDao.findAll();
	}

	@Override
	public void deleteById(Long deptno) {
		// TODO Auto-generated method stub
		deptDao.deleteById(deptno);
		System.out.println("成功删除");
	}

	@Override
	public void updateDept(Dept dept) {
		// TODO Auto-generated method stub
		deptDao.updateDept(dept);
		System.out.println("更新成功！");
	}

}
