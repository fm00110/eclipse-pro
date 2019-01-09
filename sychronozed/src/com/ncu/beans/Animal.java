package com.ncu.beans;

public class Animal {
	private int age;
	private String name="fm";
	public Animal() {
		System.out.println("animal");
	}
	public Animal(int age, String name) {
	
		this.age = age;
		this.name = name;
		System.out.println("animal has name");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
