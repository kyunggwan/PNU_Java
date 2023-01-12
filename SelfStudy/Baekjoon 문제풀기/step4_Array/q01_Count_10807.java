package BJStep4_Array;

import java.util.Scanner;

//총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
public class q01_Count_10807 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //배열의 크기를 입력 받음
        int array = sc.nextInt();
        int [] arr = new int[array];

        //배열의 크기 만큼 채움
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //찾고자 하는 수 입력과 count
        int v = sc.nextInt();
        int count = 0;

        //배열을 돌면서 v숫자를 찾으면 count 증가
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == v){
                count++;
            }
        }
        System.out.println(count);

    }
}
