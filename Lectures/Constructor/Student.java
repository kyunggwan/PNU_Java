package com.ruby.java.ch07Inheritance;

public class Student extends Person{
	private String major;

	public Student() {
		super();
		System.out.println("Student 생성자 실행");
	}
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
		System.out.println("Student(name, age, major) 생성자 실행!");
	}

	public String getSubject() {
		return major;
	}

	public void setSubject(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString() + ":" + major;
	}
	
	
	
}
