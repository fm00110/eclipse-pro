package com.ncu;

public class Paramt {
	
	//�ɱ䳤����ֻ�ܳ����ٲ��������һλ����ֻ�ܳ��ִ�
	public static void m1(int... a){   //��������0-n������
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
