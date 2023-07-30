package CT_Basic;

import java.util.Scanner;

public class ct03 {

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos; // m 은 int가 가지는 가장 최소값,
        while ((pos = str.indexOf(' ')) != -1) { // 띄어쓰기의 위치를 return 해준다
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        // 마지막 단어의 길이를 비교
        if (str.length() > m) {
            answer = str;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ct03 instance = new ct03();
        System.out.println(instance.solution(str));
    }
}
