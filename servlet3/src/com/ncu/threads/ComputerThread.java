package com.ncu.threads;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class ComputerThread implements Runnable {
	
	private AsyncContext ac;
	
	public ComputerThread(AsyncContext ac) {
		super();
		this.ac = ac;
	}

	@Override
	public void run() {
		try {
		HttpServletRequest request = (HttpServletRequest) ac.getRequest();
		HttpSession session = request.getSession();
		int sum=0;
		for(int i=1;i<=10;i++) {
			System.out.println("i="+i);
			sum = sum+i;
			Thread.sleep(1000);
		}
		session.setAttribute("sum", sum);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//ac.complete();
		}
	
	

}
