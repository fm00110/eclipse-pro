package com.ncu;

import java.lang.reflect.Field;

public class Test2 {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.ncu.Processor2");
		Field[] fields = c.getFields();
		Field[] declaredFields = c.getDeclaredFields();
		System.out.println(fields.length);
		System.out.println(declaredFields.length);
		for (Field field : fields) {
			System.out.println(field);
		}
		for (Field field : declaredFields) {
			System.out.println(field);
		}
	}
}
