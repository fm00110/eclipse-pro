package com.ncu.threads;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;

public class ComputerThread implements Runnable {
	
	private AsyncContext ac;
	
	public ComputerThread(AsyncContext ac) {
		super();
		this.ac = ac;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		PrintWriter out = null;
		try {
			out = ac.getResponse().getWriter();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		out.print("子线程开始执行"+" "+System.currentTimeMillis()+"<br>");
		int sum = 0;
		for (int i = 1;i<=10;i++) {
			sum=sum+i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("i="+i);
			
		}
		out.println("sum="+sum+"<br>");
		out.print("子线程运行结束"+" "+System.currentTimeMillis()+"<br>");
		//ac.complete();   //通知主线程的异步子线程结束
		//ac.complete();在底层执行的过程其实是销毁了这个异步线程
		ac.dispatch("/show.jsp");
	}

}
