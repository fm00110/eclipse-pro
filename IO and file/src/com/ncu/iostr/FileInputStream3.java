package com.ncu.iostr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream3 {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "D:\\fileio\\a.txt";
		// 1����ȡ�ļ����ȴ���һ������������
		FileInputStream fis = new FileInputStream(path);

		// һ����һ���ֽڵĴ�С��ȡ���ݣ�����ȡ���������ٴ洢����������С�
		byte[] b = new byte[1024];
		// 2����ʼ���ļ�
		int temp = 0;
		try {
			while ((temp = fis.read(b)) != -1) {

				System.out.println(new String(b, 0, temp));
			}
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}

	}
}
