package BJStep2_ConditinalStatement;
// 주사위 세개

import java.util.Scanner;

public class q07_Dice_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        } else if ((a == b && b != c)) {
            System.out.println(1000 + a * 100);
        } else if ((b == c && a != b)) {
            System.out.println(1000 + c * 100);
        } else if ((a == c && b != a)){
            System.out.println(1000 + a * 100);
        }        else {
            int max = Math.max(a, Math.max(b, c));
            System.out.println(max * 100);
        }
    }
}
