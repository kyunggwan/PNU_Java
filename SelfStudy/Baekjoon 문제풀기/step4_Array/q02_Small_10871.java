import java.util.Scanner;

public class q02_Small_10871 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // N, X 입력 받음
        int N = sc.nextInt();
        int X = sc.nextInt();
        int [] arr = new int[N];

        //배열에 입력값들을 넣고 수식에 따라 필요한값 출력
        for(int i = 0 ; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < X){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
