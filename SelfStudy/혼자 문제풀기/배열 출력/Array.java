package ListArrayPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//n개의 정수를 배열로 입력받아 평균을 구하는 프로그램
public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[랜덤한 정수의 평균을 구하는 프로그래밍]");
		System.out.print("[배열의 크기를 입력하세요]");
		int n;
		while ((n = sc.nextInt()) != 0) {
			// 배열 출력을 위해 list 생성
			List<Integer> list = new ArrayList<>();
			// n을 입력받아 n크기 만큼의 배열 array생성
			int array[] = new int[n];
			// 배열 array를 랜덤숫자로 채우고, list를 만듦.
			for (int i = 0; i < array.length; i++) {
				array[i] = (int) (Math.random() * 100 + 1);
				list.add(array[i]);
			}
			// array의 값들을 합친 sum만듦.
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				sum += array[i];
			}
			System.out.println(+n + "개의 랜덤한 숫자는 >>> " + list + "입니다");
			Collections.sort(list);
			System.out.println("\t정렬하면 >>> " + list + "입니다");
			System.out.println(+n + "개의 랜덤한 숫자의 평균은 >>> " + sum + "입니다");
			System.out.println("");
			System.out.println("--------------------------------------------------------");
			System.out.print("[배열의 크기를 입력하세요]");
		}
		sc.close();
	}
}
