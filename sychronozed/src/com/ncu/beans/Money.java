package com.ncu.beans;

public class Money {
	
	
	public static double rand(double b){
		double money = Math.random()*b+0.01;
		return money;
	}
	public static void getMoney(int a, double b){
		double[] arr = new double[a];
		int i;
		for(i = 0;i<arr.length;i++){
	    arr[i] = rand(b);
		b=b-arr[i];
		if(b == 0){
			return;
		}
		System.out.println("��"+(i+1)+"����"+"������"+arr[i]+"Ԫ");
		}
	
		
	}
	public static void main(String[] args) {
		getMoney(5,100.00);
	}

}
