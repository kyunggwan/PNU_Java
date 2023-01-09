package BJStep3_Loop;

import java.util.Scanner;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// (0 < A, B < 10)
public class q02_Sum_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);

        }
    }
}
