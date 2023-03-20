import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//피보나치
public class Num10870_1 {

    //클래스 활용
    static class Recursion {
        public int calculate(int num) {
            if (num == 0) return 0;
            if (num == 1) return 1;
            return calculate(num - 1) + calculate(num - 2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        Recursion recursion = new Recursion();
        int result = recursion.calculate(num);

        System.out.println(result);
    }
}
