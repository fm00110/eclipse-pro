package com.ncu.iostr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream1 {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "D:\\fileio\\a.txt";
		//1、读取文件，先创建一个‘输入流’
		FileInputStream fis = new FileInputStream(path);
		
		//2、开始读文件
		try {
			int i = fis.read();
			int i1 = fis.read();
			int i2 = fis.read();
			System.out.println(i);
			System.out.println(i1);
			System.out.println(i2);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
