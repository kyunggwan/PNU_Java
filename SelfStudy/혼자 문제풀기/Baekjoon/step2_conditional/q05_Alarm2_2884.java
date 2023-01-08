package BJStep2_ConditinalStatement;

import java.util.Scanner;
public class q05_Alarm2_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        int time = H * 60 + M - 45;

        if( time < 0){
            time = 60 * 24 + time;
        }
        System.out.printf("%d %d", time / 60, time % 60);
    }
}
