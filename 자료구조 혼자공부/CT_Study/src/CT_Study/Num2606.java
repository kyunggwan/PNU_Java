package CT_Study;

import java.io.*;
import java.util.StringTokenizer;

public class Num2606 {
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;

    public static void DFS(int idx) {
        visited[idx] = true;

        for (int i = 1; i <= N; i++) {
            if (graph[idx][i]) // visited(방문한 적) false인지, index의 i가 true인지
                answer++;
        }
    }

    public static void main(String[] args) throws IOException {
        // 0. 입력값 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());    // 컴퓨터의 수
        M = Integer.parseInt(br.readLine());    // 직접 연결되어 있는 컴퓨터 쌍의 수
        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        // 1. 그래프에 연결 정보 주기
        int x, y;
        for (int i = 1; i <= M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        // 2. dfs(재귀함수) 호출
        DFS(1);
        // 3. 출력
        bw.write(String.valueOf(answer - 1));

        br.close();
        bw.close();
    }
}
