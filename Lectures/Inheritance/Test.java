package Hong;

import java.util.ArrayList;
import java.util.List;

class Person {
	private String pname;
	private int page;

	public Person() {
		pname = "";
		page = 0;
	}

	public Person(String name, int age) {
		pname = name;
		page = age;
	}

	public String getName() {
		return pname;
	}

	public int getAge() {
		return page;
	}

	public void show() {
		System.out.print("[이름 : " + getName() + "] [나이 : " + getAge() + "] ");
	}

}

class Student extends Person {
	String major;

	public Student(String name, int age, String mj) {
		super(name, age);
		major = mj;

	}

	public void show() {
		super.show();
		System.out.println("[전공 : " + major + "]");
	}

}

class Professor extends Person {
	String subject;

	public Professor(String name, int age, String sj) {
		super(name, age);
		subject = sj;
	}
}

class Employee extends Person {
	String dept;

	public Employee(String name, int age, String dt) {
		super(name, age);
		dept = dt;

	}
}

public class Test {
//	static void display(Person[] p) {
//		for (int i = 0; i < p.length; i++)
//			p[i].show();
//	}

	public static void main(String[] args) {

		// Person list[] = new Person[5];
		// Person p = new Person();
		
		// 출력 방법 1
//		Student s = new Student("박경관", 3, "고분자"); 
//		s.show();
		
		// 출력 방법 2
		List<Person> list = new ArrayList<>(); 
		list.add(new Student("박경관", 3, "고분자"));

		for (Person a : list) {
			a.show();
		}
		
		//출력 방법 3
//		Person[] p = new Person[1];				
//		p[0] = new Student("박경관", 4, "고분자");
		//출력 방법 3-1
//		for( int i = 0 ; i < p.length; i++) {  
//			p[i].show();
//		}
		//출력 방법 3-2
//		for (Person a : p) {					
//			a.show();
//		}
	}

}
