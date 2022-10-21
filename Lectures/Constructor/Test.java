package com.ruby.java.ch07Inheritance;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee("노동자", 40, "입학처");
		Professor p = new Professor("교수님", 60, "컴퓨터 과학");
		Student s = new Student("박경관", 3, "고분자공");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
		
		
		
	}

}
