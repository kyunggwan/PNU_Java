import java.util.Scanner;
//값을 입력받아 2진수 출력
public class Binary2 {
//메소드 활용
    public static void calculate(int num){
        //배열 arr에 담았다가 역순으로 출력할 예정
        int[] arr = new int[10000];
        //배열 초기값 지정
        int i = 0;
        while (num > 0) {
            //2로 나눈 나머지를 배열에 넣는다.
            arr[i] = num % 2;
            //그리고 입력값을 2로 나눠줌
            num /= 2;
            //다음 index에 넣어야 하므로 i 값 증가
            i++;
        }
        //while문을 벗어난 경우는 num이 0이므로 증가한 i값을 감소시켜 줘야함
        i--;
        //넣어준 배열의 역순으로 출력
        for(; i >=0; i--){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //num은 입력 받은 수
        int num = sc.nextInt();
        System.out.println("메소드로 구현");
        //calculate 메소드 호출
        calculate(num);
    }
}
