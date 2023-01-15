import java.util.Arrays;
import java.util.Scanner;

public class q05_Homework_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //boolean 값의 배열을 30개 선언한다.
        boolean [] arr = new boolean[30];

        //boolean 배열이 입력될 때 마다 true로 전환한다.
        for(int i = 1; i < 29; i ++){
            arr[sc.nextInt()-1] = true;
        }

        //false값만 출력한다.
        for(int i = 0; i < 30; i++){
            if(!arr[i]){
                System.out.println(i+1);
            }
        }
    }
}
