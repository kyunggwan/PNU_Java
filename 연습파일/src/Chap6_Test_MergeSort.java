package Chap6Sort;

public class Chap6_Test_MergeSort {

	// --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
	static void merge(int[] a, int lefta, int righta, int leftb, int rightb) {
		int[] t = new int[20]; // 작업용 배열
		int p = lefta; // p는 배열1의 시작 인덱스
		int q = leftb; // q는 배열2의 시작 인덱스
		int ix = 0;
		while (p <= righta && q <= rightb) {
			if (a[p] >= a[q]) {
				t[ix++] = a[q++];
			} else if (a[p] < a[q]) {
				t[ix++] = a[p++];
			}

			for (int i = 0; i <= righta; i++) {
				t[ix++] = a[p++];
			}
			for (int i = 0; i <= rightb; i++) {
				t[ix++] = a[q++];
			}

		}
	}

	// --- 퀵 정렬(비재귀 버전) 이용---//
	static void MergeSort(int[] a, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			// 배열1 만들고, 정렬
			MergeSort(a, left, middle);
			// 배열2 만들고, 정렬
			MergeSort(a, middle + 1, right);
			// merge메소드(배열, 배열1의 시작점과 끝점, 배열2의 시작점과 끝점)
			merge(a, left, middle, middle + 1, right);
		}
	}

	public static void main(String[] args) {
		int nx = 20;
		int[] x = new int[20];
		for (int ix = 0; ix < 20; ix++) {
			double d = Math.random();
			x[ix] = (int) (d * 50);
		}
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
		System.out.println();

		MergeSort(x, 0, nx - 1); // 배열 x를 퀵정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
	}
}
