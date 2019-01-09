package com.ncu.iostr;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader1 {

	public static void main(String[] args) throws Exception {
		String path = "D:\\fileio\\a.txt";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);

		String temp = null;
		while ((temp = br.readLine()) != null) {
			System.out.println(temp); // �������з�������Ҫ���Լ���ӻ��з�
		}

		br.close();
	}
}
