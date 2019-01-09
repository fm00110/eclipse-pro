package com.ncu.iostr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream4 {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "D:\\fileio\\f.bmp";
		//1、读取文件，先创建一个‘输入流’
		FileInputStream fis = new FileInputStream(path);
		
		//一次以一个字节的大小读取数据，将读取到的数据再存储到这个数组中。
		byte[] b = new byte[1024];
		//2、开始读文件
		int temp =0;
		try {
			while((temp=fis.read(b)) != -1){

				System.out.println(new String(b,0,temp));
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
	}
}
