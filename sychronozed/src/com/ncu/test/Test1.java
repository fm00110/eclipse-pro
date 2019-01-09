package com.ncu.test;

public class Test1 {
	public double fun(int x,  long y){
		return 3.0;
	}
	
	public double fun(long x,  int y){
		return 5.0;
	}
	public static void main(String[] args) {
		Test1 test = new Test1();
		System.out.println(test.fun(2l, 3));
		System.out.println(test.fun(3, 2l));

	}
}
