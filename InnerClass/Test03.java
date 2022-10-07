package InnerClass;
//람다식 매개변수
interface Verify {				//Verify는 인터페이스 이름.
	boolean check(int n);
}

interface Verify2 {
	boolean check(int n, int d);
}

public class Test03 {
	public static void main(String[] args) {
		Verify isEven = (n) -> (n % 2) == 0; 	//isEven이라고 선언, ()로 익명클래스, 객체 생성 거기다가 n을 집어넣음.
		System.out.println(isEven.check(10));	//->로 메서드 구성, 함수 body는 (n % 2)
												//n = 10을 넣고, check 함수에 적용 ,check 함수는 논리함수네
		Verify isPositive = (n) -> n >= 0;
		System.out.println(isPositive.check(-5));
		
		Verify2 baesu = (n,d) -> (n % d) ==0; 	//숫자 두개 해봄.
		System.out.println(baesu.check(24, 3));
	}
}