package BJStep2_ConditinalStatement;
// 사분면 고르기
import java.util.Scanner;
public class q04_quadrant_14681 {
    public static void main(String[] args) {

        // 입력
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if((x > 0) && ( y > 0)){
            System.out.println("1");
        } else if((x > 0) && ( y < 0)){
            System.out.println("4");
        } else if ((x < 0) && ( y > 0)){
            System.out.println("2");
        } else if((x < 0) && ( y < 0)){
            System.out.println("3");
        }
    }
}
