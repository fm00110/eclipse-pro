package com.ncu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SomeServlet
 */
@WebServlet(value="/some",
		name="Some-Servlet",		//设置Servlet的名字
		initParams= {@WebInitParam(name="school",value="ncu"), //添加局部参数
					 @WebInitParam(name="addr",value="南昌市青山湖区南京东路235号")}
		//loadOnStartup=2 应用启动时创建该Servlet
		) //没有写属性名时，默认为value,此处也可以写为urlPatterns,urlPatterns="/some"
public class SomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charaset=UTF-8");
		response.setCharacterEncoding("utf-8");//设置字符集编码
		PrintWriter out = response.getWriter();
		out.append("Served at: ").append(request.getContextPath());
		
		String servletName = this.getServletName();
		out.append(servletName+"<br>");
		
		Enumeration<String> names = this.getInitParameterNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			String value = this.getInitParameter(name);
			out.append(name+"="+value+"<br>");
		}
	}

}
