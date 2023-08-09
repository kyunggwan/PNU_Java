package CT_Basic;

// 이진수 출력(재귀)
public class Chapter07_02Binary {

    public void DFS(int n) {
        if (n == 0) return;
        else {
            // 마찬가지로 DFS와 sout의 위치에 따라 출력이 다름을 기억
            DFS(n / 2);
            System.out.print(n % 2 + " ");
        }
    }

    public static void main(String[] args) {
        Chapter07_02Binary T = new Chapter07_02Binary();
        T.DFS(11);
    }
}
