package SelfStudy;

import java.util.Scanner;

public class Practice13 {
//삼각형 또는 사각형을 선택 받는다. 각각 밑변과 높이를 입력받아 면적을 구한다.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("[삼각형 또는 사각형을 선택해주세요.][3/4/0]  ");

		int n;
		while ((n = sc.nextInt()) != 0) {

			if (n == 3) {
				System.out.print(">>밑변(m) : ");
				int b = sc.nextInt();
				System.out.println();
				System.out.print(">>높이(m) : ");
				int c = sc.nextInt();
				System.out.println();
				int d = b * c / 2;
				System.out.println("==>삼각형의 밑변 : " + b + "m, 높이 : " + c + "m, 면적 : " + d + "㎡이다.");
			} else if (n == 4) {
				System.out.print(">>밑변(m) : ");
				int b = sc.nextInt();
				System.out.println();
				System.out.print(">>높이(m) : ");
				int c = sc.nextInt();
				System.out.println();
				int d = b * c;
				System.out.println("==>사각형의 밑변 : " + b + "m, 높이 : " + c + "m, 면적 : " + d + "㎡이다.");
			} else {
				System.out.println("$$$$$ 장난 칠래? $$$$$");
			}
			System.out.print("[삼각형 또는 사각형을 선택해주세요.][3/4/0]   ");
		}
		System.out.println("종료합니다.");
	}
}
