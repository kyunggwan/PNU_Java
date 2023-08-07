package CT_Study;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Num24479 {
    final static int MAX = 1000010;
    static ArrayList<Integer>[] graph;
    static boolean visited[];
    static int N, M, R;
    static int[] answer;
    static int order;

    public static void DFS(int idx) {
        visited[idx] = true;
        answer[idx] = order;
        order++;

        for (int i = 0; i < graph[idx].size(); i++) {   // graph[idx].size()는 현재 정점 idx와 연결된 인접 정점의 개수
            int next = graph[idx].get(i);
            if (visited[next] == false) {   // 인접 정점 중 방문한 적이 없는 경우
                DFS(next);  // 인접 정점을 검사
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
        graph = new ArrayList[MAX];
        visited = new boolean[MAX];
        answer = new int[MAX];
        order = 1;
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);    // ArrayList이므로 다른 형식
            graph[y].add(x);
        }

        // 2. 오름 차순 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        // 3. DFS(재귀함수) 호출
        DFS(R);

        // 4. 출력
        for (int i = 1; i <= N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }
        br.close();
        bw.close();

    }
}
