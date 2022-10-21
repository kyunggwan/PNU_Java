package SelfStudy;

//두 개의 정수를 입력 받아서 최대공약수와 최소공배수를 구해서 출력해 봅시다.
//유클리드 호제법

import java.util.Scanner;

public class Practice16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("★★정수 두개를 입력받아 최대공약수, 최소공배수를 구하는 프로그래밍★★");
		int a, b; // 입력받은 두 수
		int max = 0;
		int min = 0;
		int rem;
		int GCD = 0; // 최대 공약수
		int LCM = 0; // 최소 공배수

		System.out.print("[정수를 하나 입력하세요!]  ");
		a = sc.nextInt();
		System.out.print("[정수를 하나 입력하세요!]  ");
		b = sc.nextInt();

		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		rem = max % min;
		while (rem != 0) {
			max = min;
			min = rem;
			rem = max % min;
		}
		GCD = min;
		LCM = (a * b) / GCD;

		System.out.println("[입력] = " + a + ", " + b + "  >>>> [최대 공약수 = " + GCD + "] [최소 공배수 = " + LCM+"]");
	}
}
