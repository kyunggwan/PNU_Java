package MergeSort;

public class Test_MergeSort {

	private static void mergeSort(int[] arr) {
		// 임시 저장 공
		int[] tmp = new int[arr.length];
		// 임시저장소, 저장배열, 시작과 끝 인덱스를 넘겨준다
		mergeSort(arr, tmp, 0, arr.length - 1);
	}

	// 재귀 함수가 호출되면 정렬할 배열, 임시저장공간, 시작과 끝 인덱스를 인자로 받는
	private static void mergeSort(int[] arr, int[] tmp. int start, int end) {
		//시작인자가 끝 인자보다 작은 경우에만 재귀 호
	if(start < end) {
		int mid = (start + end) /2;
		mergeSort(arr, tmp, start, mid);
		mergeSort(arr, tmp, mid + 1, end);
		//merge함수를 호출해서 합친다.
		merge(arr, tmp, start, mid, end);
	}
	}

	// merge함수
	private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
		// 임시 저장소에 저장이 된 배열을 필요한 만큼 복사한다
		for (int i = start; i <= end; i++) {
			tmp[i] = arr[i];
		}
		// 첫번쨰 배열의 첫뻔재랑 두번쨰 배열의 첫번쨰 방의 인덱스를
		int part1 = start;
		int part2 = mid + 1;
		// 양쪽 배열방에서 작은 값을 하나씩 복사할 때 마다 결과 배열 방에 어디에 저장해야 하는지 복사후에 하나씩 늘려보도
		int index = start;

		// 첫번쨰 배열이 끝까지 가거나 두번째 배열이 끝까지 갈 떄까지 배열을 돌린
		while (part1 <= mid && part2 <= end) {
			if (tmp[part1] <= tmp[part2]) {
				arr[index] = tmp[part1];
				part1++;
			} else {
				arr[index] = tmp[part2];
				part2++;
			}
			index++;
		}
		// 데이터 남은 값 넣어주
		for (int i = 0; i <= mid - part1; i++) {
			arr[index + 1] = tmp[part1 + i];
		}
	}

	private static void printArray(int[] arr) {
		for (int data : arr) {
			System.out.println(data + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int nx = 20;
		int[] arr = new int[20];
		for (int ix = 0; ix < 20; ix++) {
			double d = Math.random();
			arr[ix] = (int) (d * 50);
		}
		for (int i = 0; i < nx; i++)
			System.out.println(" " + arr[i]);
		System.out.println();
		mergeSort(arr);

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println(" " + arr[i]);
	}

}
