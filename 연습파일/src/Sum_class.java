package SelfStudy;

import java.util.Scanner;

//0보다 큰 하나의 정수를 입력받아서 전체 합, 홀수 합, 짝수 합을 출력하세요

class Entire {
	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Entire(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int sum(int a, int b) {
		return a + b;
	}

}

public class Sum_class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력부분
		System.out.println("정수를 입력하세요");
		int n = sc.nextInt();
		int m = sc.nextInt();
		// 출력 부분
		Entire e = new Entire(n, m);
		int a = e.getA();
		int b = e.getB();
		System.out.println("게터 " + (a + b));
		System.out.println("메소드 " + e.sum(a, b));
	}
}