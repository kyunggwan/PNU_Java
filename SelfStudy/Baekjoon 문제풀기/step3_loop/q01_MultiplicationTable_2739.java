package BJStep3_Loop;

import java.util.Scanner;

//첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
public class q01_MultiplicationTable_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i = 1; i <= 9; i++){
            System.out.printf("%d * %d = %d", a, i, a*i);
            System.out.println("");
        }


    }
}
