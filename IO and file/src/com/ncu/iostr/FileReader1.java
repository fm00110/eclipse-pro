package com.ncu.iostr;

import java.io.FileReader;

public class FileReader1 {

	public static void main(String[] args) throws Exception {
		
		String path = "D:\\fileio\\a.txt";
		//�ַ���ֻ�ܶ�ȡ���ı��ļ���һ���ַ������ֽڣ�������һ��1KB��ȡ
		char[] chars = new char[512];
		
		FileReader fr = new FileReader(path);
		int temp = 0;
		while((temp=fr.read(chars)) != -1){
			System.out.println(new String(chars,0,temp));
		}
		fr.close();
	}
}
