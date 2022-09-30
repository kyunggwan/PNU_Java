package Coding;

abstract class Person {
	private String pnum; // 주민번호
	private String name; // 이름
	private int age; // 나이

	public Person() {
		pnum = "";
		name = "";
		age = 0;
	}

	public Person(String pn, String nm, int a) {
		this.pnum = pn;
		this.name = nm;
		this.age = a;
	}

	public String toString() {
		return "[주민번호 = " + pnum + ", 이름 = " + name + ", 나이 = " + age + "] \n";
	}

	public String getPnum() {
		return pnum;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	abstract void show(); // toString()을 호출하여 sysout처리

	abstract void increase(); // salary, scholarship, dayapay 10% 증가
}

class Employee extends Person {
	private String job; // 직업
	private String dept; // 부서
	private int salary; // 급여

	public Employee(String pn, String nm, int a, String job, String dept, int salary) {
		super(pn, nm, a);
		this.job = job;
		this.dept = dept;
		this.salary = salary;
	}

	public void show() {
		System.out.print("인물 정보 = " + toString());
	}

	public void increase() {
		System.out.println("");
		System.out.println(getName()+"의 [근로자의 임금 출력!]");
		System.out.println(getName()+"의 기존 임금은 (" + salary + "만원) >> 10% 증가해서 (" + Math.round((salary * 110)/100) + "만원)입니다!");
	}

}

class Designer extends Employee {
	private String language; // 사용 가능 언어
	private int workYear; // 경력

	public Designer(String pn, String nm, int a, String job, String dept, int salary, String language, int workYear) {
		super(pn, nm, a, job, dept, salary);
		this.language = language;
		this.workYear = workYear;
	}

	public void show() {
		super.show();
		System.out.println("          [사용 가능 언어 = " + language + ", 경력 = " + workYear + "]");
	}

	public void increase() {
		System.out.println("");
		System.out.print("[디자이너]");
		super.increase();
	}

}

class Student extends Person {
	private String schoolName; // 학교 이름
	private int schoolYear; // 학년
	private int scholarship; // 장학금

	public Student(String pn, String nm, int a, String schoolName, int schoolYear, int scholarship) {
		super(pn, nm, a);
		this.schoolName = schoolName;
		this.schoolYear = schoolYear;
		this.scholarship = scholarship;
	}

	public void show() {
		System.out.print(toString());
		System.out.println(
				"          [학교 이름 = " + schoolName + "학교, 학년 = " + schoolYear + "학년, 장학금 = " + scholarship + "만원]");
	}

	public void increase() {
		System.out.println("");
		System.out.println(getName()+"의 [학생의 급여 상승 출력!]");
		System.out.println(getName()+"의 기존의 장학금은 (" + scholarship + "만원) >> 10% 증가 하여 (" + Math.round((scholarship * 110)/100) + "만원)입니다!");
	}
}

class WorkStudent extends Student {
	private String job; // 직업
	private int dayPay; // 일당

	public WorkStudent(String pn, String nm, int a, String schoolName, int schoolYear, int scholarship, String job,
			int dayPay) {
		super(pn, nm, a, schoolName, schoolYear, scholarship);
		this.job = job;
		this.dayPay = dayPay;
	}

	public void show() {
//		super.show();
		System.out.println("          [직업 = " + job + ", 일당 = " + dayPay + "만원]");
	}

	public void increase() {
		super.increase();
		System.out.println(getName()+"의 기존 일당은 (" + dayPay + "만원) >> 10% 증가 하여 (" + (dayPay * 1.1) + "만원)입니다!");
	}
}

public class TestPerson {

	static void showAll(Person[] p) {
		for (int i = 0; i < p.length; i++) {
			p[i].show();
		}
	}

	static void increaseAll(Person[] p) {
		for (int i = 0; i < p.length; i++) {
			p[i].increase();
		}
	}

	static void getData(Person[] p) {

		Employee e = new Employee("p01", "Hong", 10, "DB", "Design", 200);
		Designer d = new Designer("p02", "Kim", 30, "디자이너", "부서", 300, "java", 5);
		Student s = new Student("p03", "Lee", 24, "부산대", 3, 350);
		WorkStudent w = new WorkStudent("p04", "Park", 21, "밀양대", 2, 200, "근로 장학생의 직업", 20);
		p[0] = e;
		p[1] = d;
		p[2] = s;
		p[3] = w;

	}

	public static void main(String[] args) {
		Person[] setPerson = new Person[4];
		getData(setPerson);
		showAll(setPerson);
		increaseAll(setPerson);
		// showAll(setPerson);

	}
}

//WorkStudent의 show가 출력되지 않습니다 ㅜ
