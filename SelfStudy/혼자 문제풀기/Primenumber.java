package SelfStudy;

//임의의 수를 입력 받아서 해당 수가 소수인지 확인하는 프로그램을 작성해 보세요.
import java.util.Scanner;

public class Practice14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("★★소수 인지 확인하는 프로그램 입니다!★★");
		System.out.print("[숫자를 입력해 주세요!]   ");
		int num;
		while ((num = sc.nextInt()) != 1) {

			int b;
			boolean result = true;

			for (b = 2; b < num; b++) {
				if (num % b == 0) {
					result = false;
					break;
				} else {
					result = true;
				}
			}
			System.out.println("[" + num + " 의 소수 판별 : " + result + "]");
			System.out.println("");
			System.out.print("[숫자를 입력해 주세요!] (종료는 1)  ");
		}
		System.out.println("[종료합니다!]");
	}
}
