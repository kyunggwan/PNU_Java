package BJStep3_Loop;

import java.util.Scanner;

// 사이클
public class q12_Sum_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int copy = num;
        int count = 0;

        while (true) {
            int a = (num % 10) * 10; //num의 일의 자릿수는 새로운 수의 십의 자릿수
            int b = ((num / 10) + (num % 10)) % 10; //새로운 수의 일의 자릿수
            num = a + b;
            count++;

            if(copy == num){
                break;
            }
        }
        System.out.println(count);
    }
}
