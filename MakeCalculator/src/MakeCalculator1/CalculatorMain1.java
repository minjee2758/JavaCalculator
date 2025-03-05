package MakeCalculator1;

import java.util.Scanner;

public class CalculatorMain1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        boolean system = true;

        do {
            System.out.print("첫 번째 정수를 입력하세요 : ");
            int a = scanner.nextInt();
            System.out.print("두 번째 정수를 입력하세요 : ");
            int b = scanner.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = scanner.next();
            if (operator.equals("+")) {
                add(a,b);
            } else if (operator.equals("-")){
                subtract(a,b);
            } else if (operator.equals("*")) {
                multiply(a,b);
            } else if (operator.equals("/")){
                divide(a,b);
            }
            System.out.println("더 계산하시겠습니까? 아무 문자나 입력하세요. (exit 입력 시 종료)");
            String ask = scanner.next();
            if (ask.equals("exit")){
                system = false;
                System.out.println("시스템을 종료합니다");
            }
        }while (system);

    }
    //더하기
    static void add(int a, int b){
        System.out.println("결과 : "+(a+b));
    }
    //빼기
    static void subtract(int a, int b){
        System.out.println("결과 : "+(a-b));
    }
    //곱하기
    static void multiply(int a, int b){
        System.out.println("결과 : "+(a*b));
    }
    //나누기
    static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("수행할 수 없는 연산입니다");
        }else {
            System.out.println("결과 : "+(double) a/b);
        }
    }
}
