package BJStep2_ConditinalStatement;

import java.util.Scanner;

public class q06_OvenClock_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();

        int time = h * 60 + m + c;

        if ( time >= 24 * 60){
            time = time % (24 * 60);
        }
        System.out.printf("%d %d", time / 60, time % 60);
    }
}
