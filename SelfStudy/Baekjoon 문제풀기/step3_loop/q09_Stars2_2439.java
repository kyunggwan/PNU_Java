package BJStep3_Loop;

import java.io.*;

//별찍기 오른쪽 정렬
public class q09_Stars2_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String star = "";

        for(int i = 1; i <= N; i++){
            for(int j = N; j > i; j--){
                bw.write(" ");
            }
            star = star + "*";
            bw.write(star+"\n");
        }
        br.close();
        bw.close();
    }
}
