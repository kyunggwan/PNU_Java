package CT_Basic;

public class Chapter07_06Subset {
    static int n;   // 부분 집합을 구할 전체 숫자의 범위
    static int[] check; // 각 숫자가 부분 집합에 포함되는지 여부

    public void dfs(int num) {

        if (num == n + 1) { // num이 n보다 큰 경우, 부분 집합을 생성해서 출력
            String temp = "";
            for (int i = 1; i <= n; i++) {
                if (check[i] == 1) {    // 부분 집합에 포함 됐는지
                    temp += (i + " ");
                }
            }
            if (temp.length() > 0) {
                System.out.println(temp);
            }

        } else {
            check[num] = 1;
            dfs(num + 1);
            check[num] = 0;
            dfs(num + 1);
        }
    }

    public static void main(String[] args) {
        Chapter07_06Subset T = new Chapter07_06Subset();
        n = 3;
        check = new int[n + 1];
        T.dfs(1);
    }
}
