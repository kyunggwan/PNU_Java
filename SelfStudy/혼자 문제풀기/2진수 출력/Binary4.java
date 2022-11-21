import java.util.Scanner;
//값을 입력받아 2진수 출력
//class, static 메소드 활용
class Cal_static{
    public static void calculate(int num){
        //배열 arr에 담았다가 역순으로 출력할 예정
        int[] arr = new int[10000];
        //배열 초기값 지정
        int i = 0;

        //2진수 구현 부분
        while (num > 0) {
             arr[i] = num % 2;
            num /= 2;
             i++;
        }
        i--;
        //넣어준 배열의 역순으로 출력
        for(; i >=0; i--){
            System.out.print(arr[i]);
        }
    }
}

public class Binary4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        //출력
        Cal_static.calculate(num);
    }
}
