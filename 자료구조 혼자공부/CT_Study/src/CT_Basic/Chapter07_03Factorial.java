package CT_Basic;

// 팩토리얼, 재귀
public class Chapter07_03Factorial {
    public int DFS(int n){
        if (n == 1 ) return 1;
        else return n * DFS(n-1);
    }

    public static void main(String[] args) {
        Chapter07_03Factorial T = new Chapter07_03Factorial();
        System.out.println(T.DFS(5));
    }
}
