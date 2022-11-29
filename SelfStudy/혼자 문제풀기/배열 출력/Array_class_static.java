package ListArrayPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//n개의 정수를 배열로 입력받아 평균을 구하는 프로그램
//class, static 으로 구현
class Arr {
	public static List<Integer> arrStatic(int n) {
		List<Integer> list = new ArrayList<>();
		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100 + 1);
			list.add(array[i]);
		}
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println(+n + "개의 랜덤한 숫자의 평균은 >>> " + sum + "입니다");
		return list;
	}

	public class Array_class_static {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("[랜덤한 정수의 평균을 구하는 프로그래밍]");
			System.out.print("[배열의 크기를 입력하세요]");
			int n;
			while ((n = sc.nextInt()) != 0) {
				List<Integer> list1 = new ArrayList<>();
				list1 = Arr.arrStatic(n);
				System.out.println(n + "개의 랜덤한 숫자는 >>> " + list1 + "입니다");
				Collections.sort(list1);
				System.out.println("\t정렬하면 >>> " + list1 + "입니다");
				System.out.println("");
				System.out.println("--------------------------------------------------------");
				System.out.print("[배열의 크기를 입력하세요]");
			}
			sc.close();
		}
	}
}
