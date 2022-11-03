import java.util.Scanner;

public class caseAB {

    public int plus(int input_first, int input_second) {
        int output_plus = input_first + input_second;
        return output_plus;
    }
    public static void main(String[] args) {
        // 문제 :  첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
        // 유추파악 : a+b를 t만큼 반복하기 
        // 단어 선정 : 입력 input 출력 output 합 plus 반복 수 = int a 합칠 수 int b, int c

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
