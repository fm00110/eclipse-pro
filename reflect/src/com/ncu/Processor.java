package com.ncu;

public class Processor {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Processor(String name) {

		this.name = name;
	}

	public Processor() {
		System.out.println("ִ调用构造方法");
	}
	
}
