package CT_Basic;

public class Chapter07_01StackFrame {

    public void DFS(int n) {
        if(n==0)return;
        else {
            // DFS와 sout 위치에 따라 출력이 다른 점 기억하기
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Chapter07_01StackFrame T = new Chapter07_01StackFrame();
        T.DFS(3);
    }
}
