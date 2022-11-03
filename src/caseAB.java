import java.util.Scanner;

public class caseAB {

    public int plus(int input_first, int input_second) {
        int output_plus = input_first + input_second;
        return output_plus;
    }
    public static void main(String[] args) {
        // 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        // 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
        // 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
        
        //입력
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();

        int b;
        int c;
        //출력
        caseAB caseAB = new caseAB();

        for (int i = 0; i < a; i++) {
            b = sc.nextInt();
            c = sc.nextInt();
            int output_plus = caseAB.plus(b, c);
            System.out.println(output_plus);
        }

    }
}
