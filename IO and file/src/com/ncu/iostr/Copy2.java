package com.ncu.iostr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy2 {

	public static void main(String[] args) throws IOException {
		String path1 = "D:\\fileio\\b.txt";
		String path2 = "D:\\fileio\\e.txt";
		char[] chars = new char[512];
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(path1);
			fw = new FileWriter(path2, true);
			int temp = 0;
			while((temp = fr.read(chars)) != -1){
				fw.write(chars,0,temp);
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			fw.flush();
			fr.close();
			fw.close();
		}
	}
}
