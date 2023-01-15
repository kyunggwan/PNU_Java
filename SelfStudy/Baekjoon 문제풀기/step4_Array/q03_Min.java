import java.util.Arrays;
import java.util.Scanner;

public class q03_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //배열의 갯수
        int num = sc.nextInt();
        //배열 생성
        int[] arr = new int[num];

        //배열에 요소를 채움
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //배열의 정렬 후 최소, 최대 출력
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[arr.length - 1]);
    }
}

