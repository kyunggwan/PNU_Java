package SelfStudy;
//최소 지폐 수 계산
//천원 미만은 할인하고 임의의 금액을 지불하기 위해 필요한 지폐 장수를 구하는 프로그램을 작성하세요.

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("★★최소 지폐수 구하는 프로그래밍★★");
		System.out.print("[얼마 인가요??(단위 원)] (종료는 0)  ");
		int money;
			
		while ((money = sc.nextInt()) != 0) {
			
			int Sinsa = (money / 50000);
			int Sejong = ((money % 50000) / 10000);
			int Hwang = (((money % 50000) % 10000) / 5000);
			
			System.out.println("5만원권 >> " + Sinsa + "장");
			System.out.println("만원권 >>> " + Sejong + "장");
			System.out.println("5천원권 >> " + Hwang + "장" );

			System.out.println("");
			System.out.print("[얼마 인가요??(단위 만원)] (종료는 0)  ");
		}
		System.out.println("[종료합니다!]");
	}

}
