package com.ncu.iostr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy1 {

	public static void main(String[] args) throws IOException {
		String path1 = "D:\\fileio\\b.txt";
		String path2 = "D:\\fileio\\c.txt"; //�����ڣ����Զ�����
		byte[] b = new byte[1024];
		FileInputStream fis = new FileInputStream(path1);
		FileOutputStream fos = new FileOutputStream(path2);//д��ʱ���Ḳ��֮ǰ�����ݣ�����Ҫ��һ�����췽��
		//FileOutputStream fos = new FileOutputStream(path2��true); ��׷�ӵķ�ʽд��
		try {
			
			int temp = 0;
			while((temp=fis.read(b)) != -1){
				fos.write(b, 0, temp);
			}
			fos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally{
			fis.close();
			fos.close();
		}
		
	}
}
