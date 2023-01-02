package Inheritance.overriding;

public class Professor extends Person {

    private String subject;

    public String getSubject() {
        return subject;
    }

    public Professor(String name, int age, String subject) {
        super.setName(name);
        super.setAge(age);
        this.subject=subject;
        System.out.println("Professor 생성자 실행");
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String toString() {
        return this.getName() + ":" + this.getAge() + ":" + subject;
    }
}
