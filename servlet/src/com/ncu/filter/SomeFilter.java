package com.ncu.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class SomeFilter
 */
@WebFilter("/some")
public class SomeFilter implements Filter {

    /**
     * Default constructor. 
     */
    public SomeFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");//设置字符集编码
		PrintWriter out = response.getWriter();
		out.append("=======执行前========"+"<br>");
		System.out.println("=======执行前========");
		chain.doFilter(request, response);
		System.out.println("=======执行后========");
		out.append("=======执行后========"+"<br>");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
