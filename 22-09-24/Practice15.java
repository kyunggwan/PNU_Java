package SelfStudy;

import java.util.Scanner;

//임의의 수를 입력받아서 2진수로 출력해 봅시다.
public class Practice15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] arr = new int[10000];
		int i = 0;

		while (num > 0) {
			arr[i] = num % 2;
			num /= 2;
			i++;
		}

		i--;

		for (; i >= 0; i--) {
			System.out.print(arr[i]);
		}

	}

}
