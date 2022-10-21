package Array;

public class Arr {
	public static void main(String[] args) {
		// 배열을 표현하는 방식 1
		int[] score = new int[2];
		score[0] = 30;
		score[1] = 20;

		// 배열을 표현하는 방식 2
		char[] alphabet = { 'a', 'b' };

		// //배열 출력 방식 1
		// for ( int i = 0; i <score.length; i++) {
		// System.out.println(score[i]);
		// System.out.println(alphabet[i]);
		// }
		//
		//배열 출력방식 2 = 확장 for문
		for (int print : score) {
			System.out.println(print);
		}
		for (char printal : alphabet) {
			System.out.println(printal);
		}
	}
}
