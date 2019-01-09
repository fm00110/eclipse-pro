package com.ncu;

public class Paramt {
	
	//可变长参数只能出现再参数的最后一位，且只能出现次
	public static void m1(int... a){   //可以输入0-n个参数
		System.out.println("m1");
	}
	public static void m1(int i){
		System.out.println(i);
	}
	public static void main(String[] args) {
		m1();
		m1(1);
		m1(1,2);
		m1(1,2,3);
	}
}
