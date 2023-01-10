package BJStep3_Loop;

import java.io.*;
import java.util.StringTokenizer;

public class q06_BufferedSum_11021 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(bf.readLine());
            sb.append("Case #").append(i).append(": ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");

        }
        System.out.println(sb.toString());
        bf.close();
    }
}
