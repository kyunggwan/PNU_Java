package SelfStudy;

//환율이 아래와 같이 주어졌을 때 임의의 달러를 원화로 계산해서 출력하세요.
//1 달러 : 1,350원
import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("[[환율 계산 프로그래밍 입니다!]]");
		System.out.print("[원화(달러)를 입력해 주세요!] (종료는 0)  ");

		int a = 0;

		while ((a = sc.nextInt()) != 0) {
			
			System.out.println("[" + a + "]달러 = [" + a * 13500 + "]원입니다!");
			System.out.println("");
			System.out.print("[원화(달러)를 입력해 주세요!] (종료는 0)  ");
		}
		System.out.println("[종료합니다!]");

	}

}
