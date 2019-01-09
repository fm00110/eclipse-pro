package com.ncu.iostr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream1 {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "D:\\fileio\\a.txt";
		//1����ȡ�ļ����ȴ���һ������������
		FileInputStream fis = new FileInputStream(path);
		
		//2����ʼ���ļ�
		try {
			int i = fis.read();
			int i1 = fis.read();
			int i2 = fis.read();
			System.out.println(i);
			System.out.println(i1);
			System.out.println(i2);
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally{
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
