package com.ncu.Array;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int[] a = {56,46,58,95,6,45,62,31};
		
		for(int i = a.length-1;i>0;i--){
			for(int j = 0;j<i;j++){
				if(a[i]<a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
