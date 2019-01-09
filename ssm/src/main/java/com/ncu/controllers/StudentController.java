package com.ncu.controllers;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ncu.beans.Student;
import com.ncu.services.IStudentServices;

@Controller
public class StudentController {
	
	@Resource(name="service")
	private IStudentServices service;
	
	
	public IStudentServices getService() {
		return service;
	}


	public void setService(IStudentServices service) {
		this.service = service;
	}


	@RequestMapping("/login.do")
	public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		Student student = service.checkLogin(name,password);
		
		if(student != null) {
			HttpSession session = request.getSession();
			session.setAttribute("student", student);
			request.getRequestDispatcher("/myjsp.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("/error.jsp").forward(request, response);
		}
	}
	
	@RequestMapping("/jsp/returnuse.do")
	@ResponseBody
	public Object resultStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("进入控制器");
		String name = request.getParameter("name");

		String password = request.getParameter("password");
		Student student = service.checkLogin(name,password);
		System.out.println(name+" "+password);
		return student;
	}
}
