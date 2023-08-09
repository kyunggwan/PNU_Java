package CT_Basic;

// 피보나치 수열, 재귀
public class Chapter07_04Fibonacci {
    static int[] fibo;  // 중복계산 줄이기 위해

    public int DFS(int n) {
        if (fibo[n] > 0) return fibo[n];    // 메모이제이션, 저장된 값이 있으면 불러옴
        if (n == 1) return fibo[n] = 1; // 값을 fibo에 넣음
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args) {
        Chapter07_04Fibonacci T = new Chapter07_04Fibonacci();
        int n = 10;
        fibo = new int[n + 1]; // 중복계산 줄이기 위해
        T.DFS(n);
        for (int i = 1; i < n; i++) {
            System.out.print(fibo[i] + " ");
        }

    }
}
