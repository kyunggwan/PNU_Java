package InnerClass;

interface Multiply {
	double getValue();
}

public class Test02 {

	public static void main(String[] args) {

		Multiply m; 			//객체 만들어진건 아님, 그냥 변수 선언만했다. new가 들어가야 객체가 만들어짐.
		m = () -> 3.14 * 2;		//new가 없는데 되네?? -> 람다식은 익명클래스 만들고, 객체 생성까지
		System.out.println(m.getValue());

		m = () -> 10 * 3;  //()는 익명클래스, 객체 생성이고,   ->는 익명클래스의 메서드를 구성이다.
		System.out.println(m.getValue());
	}
}