package BJStep3_Loop;

import java.util.Scanner;

//첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
//둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
//이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
public class q04_Receipt_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int N = sc.nextInt();
        int answer = 0;
        for(int i = 1; i <= N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            answer += a * b;
        }
        if(price == answer){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
