import java.util.Scanner;
// https://www.acmicpc.net/problem/10998
//문제파악
// 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.

public class MultiplyAB {
    //두 정수 곱 구함 
    public int Multiply(int input_first, int input_second) {
        int output_Multiply = input_first * input_second;
        return output_Multiply;
    }


    public static void main(String[] args) {

        //입력
        Scanner scanner = new Scanner(System.in);
        int input_first = scanner.nextInt();
        int input_second = scanner.nextInt();
        scanner.close();
        //처리
        MultiplyAB main = new MultiplyAB();
        int output_Multiply = main.Multiply(input_first, input_second);
        
        //출력
        System.out.println(output_Multiply);
    }
}
