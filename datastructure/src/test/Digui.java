package test;

import java.util.Scanner;

public class Digui {

	public static void main(String[] args) {
		System.out.println("请输入要计算的数！");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n < 1) {
			System.out.println("您输入的数字有误，请重新输入");
		}
		System.out.print(n+"!=");
		part(n);
		System.out.print("=");
		System.out.print(getSum(n));
		in.close();
	}
	public static int getSum(int n) {
		if(n<1) {
			return -1;
		}
		else if(n==1) {
			return 1;
		}
		else {
			return n*getSum(n-1);
		}
	}	
	public static void part(int n) {
		for(int i = 1;i<=n;i++) {
			if(i<n) {
				System.out.print(i+"*");
			}else {
				System.out.print(i);
			}
		}
	}
	
	
	public static String sort(int n) {	
		
		if(n<1) {
			return "-1";
		}
		else if(n==1) {
			return "1";
		}
		else {
			return n+"*"+sort(n-1);
		}
	}
}
