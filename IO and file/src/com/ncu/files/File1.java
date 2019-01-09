package com.ncu.files;

import java.io.File;

public class File1 {

	public static void main(String[] args) {
		File f1 = new File("File1.java");
		File f2 = new File("D:\\fileio\\b.txt");
		File f3= new File("D:/fileio");
		
		System.out.println(f3.exists());
	}
}
