package BJStep3_Loop;

import java.io.*;
import java.util.StringTokenizer;

public class q07_BufferedSum_11022 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb;
        sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append("Case #").append(i).append(": ");
            sb.append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n");

        }
        System.out.println(sb.toString());
    }
}
