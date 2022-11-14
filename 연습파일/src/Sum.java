package SelfStudy;

import java.util.Scanner;

//0보다 큰 하나의 정수를 입력받아서 전체 합, 홀수 합, 짝수 합을 출력하세요

public class Sum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입력부분
		System.out.print("정수를 입력하세요");
		int n = sc.nextInt();

		int answer = 0;
		int odd = 0;
		int even = 0;

		// 전체 합
		for (int i = 1; i <= n; i++) {
			answer += i;
		}
		// 짝수 합
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				odd += i;
			}
		}

		// 홀수 합
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				even += i;
			}
		}

		// 출력 부분
		System.out.println("전체 합 " + answer);
		System.out.println("짝수 합 " + even);
		System.out.println("홀수 합 " + odd);
//		Entire(n);
//		System.out.println("홀수 합");
//		Odd(n);
//		System.out.println("짝수 합");
//		Even(n);
	}
}