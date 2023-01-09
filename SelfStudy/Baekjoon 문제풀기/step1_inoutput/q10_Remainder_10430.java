package BJStep1_Inoutput;
//(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
//        (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
//        세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
import java.util.Scanner;
public class q10_Remainder_10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int A1 = (a+b)%c;
        int A2 = (a*b)%c;

        System.out.println(A1);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println(A2);
        System.out.println(((a%c) * (b%c))%c);
    }
}
