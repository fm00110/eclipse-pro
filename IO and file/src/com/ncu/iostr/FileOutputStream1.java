package com.ncu.iostr;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {

	public static void main(String[] args) throws IOException {
		String path = "D:\\fileio\\a.txt";
		//���������
		FileOutputStream fos = new FileOutputStream(path,true);
		String msg = "hello,world!";
		byte[] b = msg.getBytes();
		//д��
		fos.write(b);
		//ˢ��
		fos.flush();
		//�ر�
		fos.close();
	
	}
}
