package BJStep1_Inoutput;
//첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다.
// 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.
import java.util.Scanner;
public class q09_Chess_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int p = sc.nextInt();

        System.out.printf("%d %d %d %d %d %d", 1-k,1-q,2-r,2-b,2-n,8-p);
    }
}