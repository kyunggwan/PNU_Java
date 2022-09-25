package SelfStudy;

//두 수를 입력 받아서 곱을 출력하세요.
//앞의 수를 뒤의 수로 나누어서 몫과 나머지를 출력하세요.
import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b;
		System.out.println("★★정수를 입력받아 몫을 구하는 프로그래밍★★");
		System.out.print("[정수를 2개 입력하세요!] (종료는 0)");

		while ((a = scan.nextInt()) != 0) {

			b = scan.nextInt();
			System.out.println("입력값 >> " + a + ", " + b);
			System.out.println("곱 >> " + (a * b));
			System.out.println("몫 >> " + (a / b));
			System.out.println("나머지 >> " + (a % b));
			System.out.println("");
			System.out.print("[정수를 2개 입력하세요!] (종료는 0)");

		}
		System.out.println("[종료합니다!]");
	}

}
