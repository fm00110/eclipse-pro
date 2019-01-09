package com.ncu.iostr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy1 {

	public static void main(String[] args) throws IOException {
		String path1 = "D:\\fileio\\b.txt";
		String path2 = "D:\\fileio\\c.txt"; //不存在，则自动创建
		byte[] b = new byte[1024];
		FileInputStream fis = new FileInputStream(path1);
		FileOutputStream fos = new FileOutputStream(path2);//写入时，会覆盖之前的数据，所以要换一个构造方法
		//FileOutputStream fos = new FileOutputStream(path2，true); 以追加的方式写入
		try {
			
			int temp = 0;
			while((temp=fis.read(b)) != -1){
				fos.write(b, 0, temp);
			}
			fos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			fis.close();
			fos.close();
		}
		
	}
}
