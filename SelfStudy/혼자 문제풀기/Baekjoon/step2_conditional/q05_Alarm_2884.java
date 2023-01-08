package BJStep2_ConditinalStatement;
//첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59)
// 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
import java.util.Scanner;
public class q05_Alarm_2884 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if (H > 0) {
            if (44 < M ) {
                M = M - 45;
                System.out.printf("%d %d", H, M);
            } else {
                H = H - 1;
                M = M + 15;
                System.out.printf("%d %d", H, M);
            }
        }else if(H == 0){
            if (M >= 45) {
                M = M - 45;
                System.out.printf("%d %d", H, M);
            } else if( H == 0 && M < 45){
                H = 23;
                M = M + 15;
                System.out.printf("%d %d", H, M);
            }
        }
    }
}
