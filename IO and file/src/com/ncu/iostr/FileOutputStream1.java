package com.ncu.iostr;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {

	public static void main(String[] args) throws IOException {
		String path = "D:\\fileio\\a.txt";
		//创建输出流
		FileOutputStream fos = new FileOutputStream(path,true);
		String msg = "hello,world!";
		byte[] b = msg.getBytes();
		//写入
		fos.write(b);
		//刷新
		fos.flush();
		//关闭
		fos.close();
	
	}
}
