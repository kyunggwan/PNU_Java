package BJStep1_Inoutput;
// 세자리수 곱셈의 각 연산을 출력
import java.util.Scanner;

public class q11_Multiplication_2588 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans1 = (b % 10) * a;
        int ans2 = ((b % 100) / 10) * a;
        int ans3 = (b / 100) * a;

        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans1+ans2*10+ans3*100);
    }
}