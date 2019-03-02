package com.ncu.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ncu.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable arg0) {

		return new DeptClientService() {

			@Override
			public boolean addDept(Dept dept) {

				return false;
			}

			@Override
			public Dept findById(Long id) {
				Dept dept = new Dept();
				dept.setDeptno(id);
				dept.setDname("该ID：" + id + "没有对应的信息，Consumer提供的降级信息，此时服务prower");
				dept.setDb_source("no this database in mysql");
				return dept;
			}

			@Override
			public List<Dept> findAll() {

				return null;
			}

			@Override
			public void deleteById(Long id) {
				System.out.println("删除失败!");
			}

		};
	}

}
