package SelfStudy;

//데이터 단위변환 : 임의의 속도를 시속으로 입력 받아서 초속, 분속, 마하로 출력하세요.
import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("★★시속을 단위변환하는 프로그래밍★★");
		System.out.print("[몇 km/h 인가요??] (종료는 0)");
		int a;
		while ((a = sc.nextInt()) != 0) {
			System.out.println("입력값 : [시속 = " + a + " km/h] , [분속 = " + (a / 60) + " km/min] , [초속 = " + (a / 3600)
					+ " km/s] , [마하 = " + (a * 1224) + " mach]");
			System.out.println("");
			System.out.print("[몇 km/h 인가요??] (종료는 0)");
		}
		System.out.println("[종료합니다!]");
	}
}
