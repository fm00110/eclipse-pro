package com.ncu.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ncu.threads.ComputerThread;

/**
 * Servlet implementation class SomeServlet
 * asyncSupported=true表示当前Servlet支持异步处理
 * 1、在异步子线程中使用ac.complete()用于结束异步操作，并将于当前异步对象相关的requrest于response对象销毁
 * 2、在异步子线程中使用ac.dispatch("show.jsp")，该方法在结束异步操作的同时，会将参数指定的页面内容包含到
 *     当前异步对象相关的标准输出流中，其执行效果相当于requestDispatcher对象的include方法的执行效果
 * 3、在异步Servlet主线程中设置ac超时时限是，异步对象及其相关的request于response对象销毁
 */
@WebServlet(value="/some",asyncSupported=true)
public class SomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charaset=utf-8");
		out.print("主线程开始运行"+" "+System.currentTimeMillis()+"<br>");
		
		AsyncContext ac = request.startAsync();
		ComputerThread ct = new ComputerThread(ac);
		
		//设置异步上下文的超时时限
		//ac.setTimeout(3000);
		
		ac.start(ct);
		
		
		
		//中间的service非常耗时
		/*Thread t = new Thread(new ComputerThread(out));
		t.start();
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		out.print("主线程运行结束"+" "+System.currentTimeMillis()+"<br>");
	}

}
