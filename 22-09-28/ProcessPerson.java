package Hong;

class Person {
	private String pno;
	private String pname;
	private int age;

	public Person() {
		// System.out.println("default 생성자");
		pno = null;
		pname = null;
		age = 0;
	}

	// 중복 코딩 줄여줌
	public Person(String pn) {
		this();
		pno = pn;
	}

	public Person(String pn, String name) {
		this(pn);
		pname = name;
	}

	public Person(String pn, String name, int a) {
		this(pn, name);
		age = a;
	}

	public void show() {
		System.out.println("pno = " + pno + ", name = " + pname + ", age = " + age);
	}
}

class Student extends Person {
	private String schoolName;
	private int schoolYear;

	public Student(String pn, String name, int a, String sn, int sy) {
		super(pn, name, a);
		schoolName = sn;
		schoolYear = sy;
	}

	public void show() {
		super.show(); // 그냥 show();라고 하면 자기 자신을 계속 불러서 안된다.
		System.out.println("schoolName = " + schoolName + ", schoolYear = " + schoolYear);
	}

	//@Override
	//public String toString() {
	//	return super.toString() + "schoolName = " + schoolName;
	//}
}

class WorkStudent extends Student {
	private String job;
	private int salary;

	// public WorkStudent() {job = null; salary = 0;}
	public WorkStudent(String pn, String name, int a, String sname, int syear, String j, int pay) {
		super(pn, name, a, sname, syear);
		job = j;
		salary = pay;
	}

	public void show() {
		super.show();
		System.out.println("job = " + job + ", salary = " + salary);

	}
}

public class ProcessPerson {
	static void display(Person[] p) {
		for (int i = 0; i < p.length; i++)
			p[i].show();
}
	public static void main(String[] args) {
		
		//Person list[] = new person[10];
		Person p = new Person();
		Person p1 = new Person("p001");
		Person p2 = new Person("p002", "Hong");
		Person p3 = new Person("p003", "Kim", 20);
		Student s1 = new Student("p004", "Lee", 40, "신라대", 5);
		WorkStudent ws = new WorkStudent("p001", "Hong", 30, "부산대", 3, "code", 10000);
		//list[0]= p; list[1] = p1; list[2] = p2; list[3] = p3; list[4] = s1; list[5] = ws; 
		//display(list); //함수 호출, 배열을 전달
		ws.show(); //show 함수는 객체가 있어야 돌아간다. 객체 멤버함수
//		WorkStudent.show();
//		p3.show();]
//		s1.show();
//		ws.show();

	}

}
