package SelfStudy;

import java.util.Scanner;

public class Practice12 {
//0보다 큰 하나의 정수를 입력 받아서 전체 합, 홀수 합, 짝수 합을 출력하세요.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("[숫자 합을 구하는 프로그램입니다!]");
		System.out.print("[숫자를 입력하세요!] (종료는 0)  ");

		int a, b, c, d;

		while ((a = sc.nextInt()) != 0) {

			int sum = 0;
			int evensum = 0;
			int oddsum = 0;

			for (b = 0; b <= a; b++) {
				sum += b;
			}

			for (c = 0; c <= a; c++) {
				if ((c % 2) == 0)
					evensum += c;
			}

			for (d = 0; d <= a; d++) {
				if ((d % 2) == 0)
					continue;
				oddsum += d;
			}
			System.out.println("");
			System.out.println("[입력 : " + (b - 1) + "]");
			System.out.println("[" + (b - 1) + "까지 모든 수의 합 : " + sum + "]");
			System.out.println("[" + (b - 1) + "까지 모든 짝수 합 : " + evensum + "]");
			System.out.println("[" + (b - 1) + "까지 모든 홀수 합 : " + oddsum + "]");
			System.out.println("");
			System.out.print("[숫자를 입력하세요!] (종료는 0)  ");
		}
		System.out.print("[종료합니다!]  ");
	}

}
