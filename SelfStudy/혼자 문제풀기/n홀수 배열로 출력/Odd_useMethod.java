package selfstudy1;

import java.util.Scanner;

//정수 n을 입력받아 n까지의 홀수를 배열에 넣어 출력하는 프로그램
public class Odd_useMethod {

	static int[] func(int number) {
		int answer[];
		int k = 0;
		// 정수 n에 따라서 answer배열의 크기 생성
		if (number % 2 == 0) {
			answer = new int[number / 2];
		} else {
			answer = new int[(number / 2) + 1];
		}

		// 1부터 홀수들을 answer배열에 넣음
		for (int i = 1; i <= number; i++) { // 범위 주의
			if (i % 2 == 1) {
				answer[k] = i;
				k++;
			}
		}
		System.out.print(">>>" + number + "까지의 홀수인 배열 출력 : ");
		// answer 배열 반환
		return answer;
	}

	public static void main(String[] args) {
		// 사용할 변수 선언

		int number;
		Scanner sc = new Scanner(System.in);

		System.out.println("★★ 정수n까지의 홀수를 배열에 넣어 출력하는 프로그램★★");
		System.out.print("[정수 n을 입력하세요](0을 누르면 종료)");

		while ((number = sc.nextInt()) != 0) {

			// func메소드로 answer배열 가져옴 + 출력
			int[] returns = func(number);
			for (int i = 0; i < returns.length; i++) {
				System.out.print(returns[i] + " ");
			}

			System.out.println("");
			System.out.println("");
			System.out.print("[정수 n을 입력하세요](0을 누르면 종료)");
		}
		System.out.println("[종료합니다]");
		sc.close();
	}
}