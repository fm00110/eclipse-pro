package com.ncu.iostr;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws Exception {
		String path = "D:\\fileio\\d.txt";
		FileWriter fw = new FileWriter(path, true);//��������ھʹ�������������׷�ӵķ�ʽд�룬���Ḳ��֮ǰ���ļ�
		String msg = "hello,world!";
		//�ַ����������д���ַ�����
		fw.write(msg);
		fw.flush();
		fw.close();
	}
}
