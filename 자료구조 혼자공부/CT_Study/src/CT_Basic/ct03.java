package CT_Basic;

import java.io.IOException;
import java.util.Scanner;


public class ct03 {

    public String solution(String str) throws IOException {
        String answer = "";
        int m = Integer.MIN_VALUE; // 가장 작은 값으로 초기화
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ct03 m = new ct03();
        System.out.println(m.solution(str));
    }
}
