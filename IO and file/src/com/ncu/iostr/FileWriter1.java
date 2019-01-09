package com.ncu.iostr;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws Exception {
		String path = "D:\\fileio\\d.txt";
		FileWriter fw = new FileWriter(path, true);//如果不存在就创建，而且是以追加的方式写入，不会覆盖之前的文件
		String msg = "hello,world!";
		//字符输出流可以写入字符串了
		fw.write(msg);
		fw.flush();
		fw.close();
	}
}
