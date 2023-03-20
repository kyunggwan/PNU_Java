package moreBack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//피보나치
public class Num10870 {

    //메소드 활용
    static int Calculate(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        return Calculate(num - 1) + Calculate(num - 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //수 입력 받음
        int num = Integer.parseInt(br.readLine());
        System.out.println(Calculate(num));
    }
}