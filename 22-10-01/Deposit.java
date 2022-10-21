package SelfStudy;

//은행에 목돈 a를 예금하려 한다. 만기는 n년, 이율은 연 복리로 r%이다. 아래 공식을 참고하여 만기 시 수령 금액을 출력하세요. (소수점 이하 금액은 버릴 것)
//
//S=a(1+r)n (S: 만기 금액, a: 원금, r: 이율, n: 만기 년수)
//
//출력 예
//원금(a) : 10,000,000원, 만기(n) : 5년, 연 복리(r) : 3%
//만기 금액 : 11,592,741원
import java.util.Scanner;

public class Practice17 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		double s = 0; // 만기 금액
//		double money = 0; // 원금
//		double r = 0.03; // 이율
//		int n; // 만기년수
//
//		System.out.println("[복리 연산하는 프로그램 입니다!]");
//		System.out.print("[원금(원)을 입력하세요!  ] (종료하시려면 0을 누르세요!)");
//		while ((money = sc.nextDouble()) != 0) {
//			System.out.print("[예금기간(년)을 입력하세요!]  ");
//			n = sc.nextInt();
//
//			s = money;
//			for (int i = 1; i <= n; i++) {
//				s = s + (s * r);
//				System.out.println("원금이 " + money + " 일때 " + i + "년 후의 만기 금액은 " + Math.round(s) + "원 입니다!");
//
//			}
//			System.out.println("------------------------------------------------------------");
//			System.out.println("원금은 " + money + "원, 이자율은 " + r + "입니다!");
//			System.out.println("예금기간은 " + n + "년 입니다!");
//			System.out.println("최종 금액은 " + Math.round(s) + "원 입니다!");
//			System.out.println("");
//			System.out.println("[복리 연산하는 프로그램 입니다!]");
//			System.out.println("[원금(원)을 입력하세요!] (종료하시려면 0을 누르세요!)");
//		}
//		System.out.println("[종료합니다!]");
//		}
//	}

	public static void main(String[] args) {

		Deposit d = new Deposit();
		Scanner sc = new Scanner(System.in);
		long money;

		System.out.print("[저금할 금액을 입력하세요(원)](종료하려면 0)\t");
		while ((money = sc.nextLong()) != 0) {
			d.setDeposit(money);

			System.out.print("[이자율을 입력하세요(%)]\t");
			d.setRate(sc.nextFloat());

			System.out.print("[몇년 저축할지 입력하세요(년)]\t");
			d.setYear(sc.nextInt());

			System.out.println("원금은 " + d.getDeposit() + ", 이율은 " + d.getRate() + "%, 년수는 " + d.getYear() + "년, 최종금액 = "
					+ d.Last() + "이다.");
			System.out.println("");
			System.out.print("[저금할 금액을 입력하세요(원)](종료하려면 0)\t");
		}
		System.out.println("[종료합니다]");
	}
}

class Deposit {
	private long deposit; // 저금 금액
	private float rate; // 이율
	private int year; // 년수

	public long getDeposit() {
		return deposit;
	}

	public void setDeposit(long deposit) {
		this.deposit = deposit;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double Last() {
		return Math.round(deposit * Math.pow(1.0 + (double) rate / 100, (double) year)); 
		// Math.pow는 제곱수 구하는 공식 (대상숫자, 지수)
	}   // Math.round는 소수 첫째자리를 반올림

}
