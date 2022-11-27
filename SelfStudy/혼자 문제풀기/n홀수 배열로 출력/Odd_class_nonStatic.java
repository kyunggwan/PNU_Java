package selfstudy1;

import java.util.Scanner;

//정수 n을 입력받아 n까지의 홀수를 배열에 넣어 출력하는 프로그램
//class, non-static으로 구현
class Function {

	int[] func(int number) {
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
		return answer;
	}
}

public class Odd_class_nonStatic {
	public static void main(String[] args) {
		// 사용할 변수 선언
		int number;
		Scanner sc = new Scanner(System.in);
		// Function클래스 생성자
		Function f = new Function();

		System.out.println("★★ 정수n까지의 홀수를 배열에 넣어 출력하는 프로그램★★");
		System.out.print("[정수 n을 입력하세요](0을 누르면 종료)");

		while ((number = sc.nextInt()) != 0) {

			System.out.print(">>>" + number + "까지의 홀수인 배열 출력 : ");
			// 생성자로 출력
			for (int k = 0; k < f.func(number).length; k++) { // 범위 주의
				System.out.print(f.func(number)[k] + " ");
				
			}
			System.out.println("");
			System.out.println("");
			System.out.print("[정수 n을 입력하세요](0을 누르면 종료)");
		}
		System.out.println("[종료합니다]");
		sc.close();
	}
}