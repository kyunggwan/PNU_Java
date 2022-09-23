package com.ruby.java.ch06;
class Student{
	private int sno; 
	private String name;
	private double weight;
	
	public void getStudent(int sno, String name, double weight) {
		this.sno = sno;
		this.name = name;
		this.weight = weight;		
	}
	public void showStudent() {
		System.out.println("Student number : " +sno);
		System.out.println("Student name : " +name);
		System.out.println("Student weight : " +weight);
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student a = new Student();
		a.getStudent(22, "gg", 60.5);
		a.showStudent();		
	}
}

