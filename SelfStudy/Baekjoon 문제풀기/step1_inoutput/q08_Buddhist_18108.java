package BJStep1_Inoutput;
// 서기 연도를 알아보고 싶은 불기 연도 y가 주어진다. (1000 ≤ y ≤ 3000)
import java.util.Scanner;
public class q08_Buddhist_18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int answer = 0;

        answer = year -543;
        System.out.println(answer);
    }
}
