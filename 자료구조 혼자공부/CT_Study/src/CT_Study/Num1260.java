package CT_Study;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Num1260 {
    static int MAX = 1010;
    static boolean graph[][];
    static boolean[] visited;
    static ArrayList<Integer> queue;
    static int N, M, R;

    public static void dfs(int idx) {
        visited[idx] = true;

        System.out.print(idx + " ");
        for (int i = 1; i <= N; i++) {  // 내림차순, 오름차순 조절 가능
            if (visited[i] == false && graph[idx][i]) {
                dfs(i);
            }
        }
    }

    public static void bfs() {
        queue = new ArrayList<>();
        visited = new boolean[MAX]; // 여기서 다시 초기화

        queue.add(R);   // 시작 정점 추가
        visited[R] = true;  // 시작 정점 방문

        while (!queue.isEmpty()) {  // queue가 empty가 될때까지
            int idx = queue.remove(0);  // idx = queue에서 하나 가져옴
            System.out.print(idx + " ");    // idx 출력

            for (int i = 1; i <= N; i++) {  // idx와 연결된 정점을 queue에 추가
                if (visited[i] == false && graph[idx][i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        // 1. graph로 연결 정보 채우기
        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];
        int x, y;
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        // 2. DFS(재귀함수) 호출
        dfs(R);
        System.out.println("");
        bfs();

        br.close();
        bw.close();

    }
}