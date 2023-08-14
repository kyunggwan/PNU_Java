package CT_Study;

import java.io.*;
import java.util.StringTokenizer;

public class Num2644 {
    static int MAX = 100 + 10;
    static boolean [][] graph;
    static boolean[] visited;
    static int N, M, PersonA, PersonB;
    static int generation = -1;

    public static void dfs(int idx, int count) {
        visited[idx] = true;

        if(idx == PersonB){
            generation = count;
            return;
        }

        for(int i = 1; i <= N; i++){
            if(visited[i]==false && graph[idx][i]){
                dfs(i, count + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        PersonA = Integer.parseInt(st.nextToken());
        PersonB = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());

        // 1. graph로 연결 정보 채우기
        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];
        generation = -1;
        for (int i = 1; i <= M; i++) {
            int x, y;
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        // 2. DFS(재귀함수) 호출
        dfs(PersonA, 0);

        // 3. 출력
        bw.write(String.valueOf(generation));

        br.close();
        bw.close();

    }
}