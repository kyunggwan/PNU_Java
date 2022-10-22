package Collection;

import java.util.Arrays;

public class Chap2_StringArrayMerge {
	public static void main(String[] args) {

		// String 배열
		String[] s1 = { "홍길동", "강감찬", "을지문덕", "계백", "김유신" };
		String[] s2 = { "독도", "울릉도", "한산도", "영도", "우도" };

		// 정렬
		Arrays.sort(s1);
		Arrays.sort(s2);
		String[] s3 = new String[10];

		// String 배열의 merge
		int i = 0, j = 0, k = 0;
		while (i < s1.length && j < s2.length) {
			if (s1[i].compareTo(s2[j]) < 0) {
				s3[k++] = s1[i++];

			} else if (s1[i].compareTo(s2[j]) > 0) {
				s3[k++] = s2[j++];

			} else {
				s3[k++] = s1[i++];

			}
		}

		// while문 미충족시 부족부분

		// t = 못넣은 배열의 전체 길이
		int t1 = s1.length - i;
		// idx = 시작점
		int idx1 = s1.length - 1;
		//
		for (int x1 = t1; 0 < x1; x1--) {
			s3[k] = s1[idx1];
		}
		
		int t2 = s2.length - i;
		// idx = 시작점
		int idx2 = s2.length - 1;
		//
		for (int x2 = t2; 0 < x2; x2--) {
			s3[k] = s1[idx2];
		}

		// 출력
		for (String st : s1)
			System.out.print(" " + st);
		System.out.println();
		for (String st : s2)
			System.out.print(" " + st);
		System.out.println();
		for (String st : s3)
			System.out.print(" " + st);
	}
}
