package BJStep3_Loop;

import java.io.*;
import java.util.StringTokenizer;

public class q05_Bufferd_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(bf.readLine());

        for(int i=0; i<T; i++){
            st = new StringTokenizer(bf.readLine());
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n");
        }
        bw.close();
    }
}
