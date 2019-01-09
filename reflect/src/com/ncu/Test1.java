package com.ncu;
//��ȡclass��������ַ�ʽ
public class Test1 {

	public static void main(String[] args) throws Exception{
		
		Class c1 = Class.forName("com.ncu.Processor");//��ִ�о�̬����
		
		Class c2 = Processor.class; //����ִ�о�̬����
		
		Class c3 = new Processor().getClass();
		
		System.out.println(c1==c2);
		System.out.println(c3==c2);
		System.out.println(c1);

		//������class��������ʾ�����һ����ʵ��
		Object o = c2.newInstance();  //����processor���޲ι��췽��
		System.out.println(o);
	}
}
