package BJStep3_Loop;
//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
import java.util.Scanner;

public class q03_Sum_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num*(num+1)/2);
    }
}
