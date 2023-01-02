package Inheritance.overriding;
public class Employee extends Person {
    private String dept;

    public String getDept() {
        return dept;
    }

    public Employee(String name, int age, String dept) {
        super.setName(name);
        super.setAge(age);
        this.dept=dept;
        System.out.println("Employee 생성자 실행");
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return this.getName() + ":" + this.getAge() + ":" + dept;
    }
}