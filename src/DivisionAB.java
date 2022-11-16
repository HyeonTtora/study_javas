import java.util.Scanner;

public class DivisionAB {

    public double division(double input_first, double input_second) {
        double output_division = input_first / input_second;
        return output_division;
    }
    public static void main(String[] args) {

        //입력
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();

            //처리 
            DivisionAB main = new DivisionAB();           
            double output_division = main.division(a, b);
            //출력
            System.out.println(output_division);
        }

    }
