package com.ncu.services;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ncu.beans.Student;
import com.ncu.daos.IStudentDao;

@Service("service")
public class StudentServicesImpl implements IStudentServices {
	@Resource(name="IStudentDao")
	private IStudentDao dao;

	public IStudentDao getDao() {
		return dao;
	}

	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	@Override
	public Student checkLogin(String name, String password) {
		// TODO Auto-generated method stub
		return dao.checkLogin(name,password);
	}

}
