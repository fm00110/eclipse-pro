package com.ncu.iostr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream2 {

	public static void main(String[] args) throws Exception {
	
		String path = "D:\\fileio\\a.txt";
		//1、读取文件，先创建一个‘输入流’
		FileInputStream fis = new FileInputStream(path);
		byte[] b = new byte[3];
		//byte数组是一个临时缓冲区，将独到的数据存到这个数组中去
			int i1 = fis.read(b);  //3
			System.out.println(new String(b));
			int i2 = fis.read(b);  //3
			System.out.println(new String(b));
			int i3 = fis.read(b);  //3
			System.out.println(new String(b));
			int i4 = fis.read(b);  //3
			System.out.println(new String(b));
			int i5 = fis.read(b);  //2
			System.out.println(i5);
			System.out.println(new String(b,0,i5));
			int i6 = fis.read(b);  //-1
			System.out.println(i6);
			
			
		
		
	}
}
