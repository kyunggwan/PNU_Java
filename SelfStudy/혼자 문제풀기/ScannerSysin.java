package SelfStudy;

import java.util.Scanner;

public class Practice3 {
//키보드에서 데이터를 입력받아 화면에 출력해 봅시다.
//간단한 데이터를 입력 받을 때는 Scanner객체를 사용합니다.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;

		System.out.println("[정수, 실수, 문자를 입력하는 프로그래밍입니다!]");
		System.out.print("[정수를 입력하세요!](종료는 0)  ");
		while ((a = sc.nextInt()) != 0) {
			int inum = a;
			System.out.print("[실수를 입력하세요!]  ");
			double dnum = sc.nextDouble();
			System.out.print("[문자를 입력하세요!]  ");
			String str = sc.next();

			System.out.println("");
			System.out.println("[입력된 정수 : " + inum + "]");
			System.out.println("[입력된 실수 : " + dnum + "]");
			System.out.println("[입력된 문자 : " + str + "]");
			System.out.println("");
			System.out.println("[정수, 실수, 문자를 입력하는 프로그래밍입니다!]");
			System.out.print("[정수를 입력하세요!](종료는 0) ");
		}
			System.out.print("[종료합니다!]");
	}
}
