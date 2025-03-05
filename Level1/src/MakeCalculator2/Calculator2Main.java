package MakeCalculator2;

import java.util.Scanner;

public class Calculator2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        CalculatorClass calculator = new CalculatorClass();


        while (true) {
            System.out.print("첫 번째 정수를 입력하세요 : ");
            int a = scanner.nextInt();
            System.out.print("두 번째 정수를 입력하세요 : ");
            int b = scanner.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = scanner.next();

            //결과값 변수 설정하기
            Object result = 0;

            //연산자에 따라 연산 수행
            switch (operator) {
                case "+":
                    result = calculator.add(a, b);
                    break;
                case "-":
                    result = calculator.subtract(a, b);
                    break;
                case "*":
                    result = calculator.multiply(a, b);
                    break;
                case "/":
                    try { //0으로 나누었을때 연산 오류 잡기 try-catch로
                        result = calculator.divide(a, b);
                    } catch (ArithmeticException e) {
                        System.out.println("오류! " + e.getMessage());
                        System.out.println("다시 입력해주세요.");
                        continue;  // 0으로 나누었을 경우 다시 입력 받도록 함.
                    }
                    break;
                default:
                    System.out.println("잘못된 기호입니다. 다시 입력해주세요"); //case에 부합하지 않는 연산자 기호를 넣었을때
                    continue;  // 다시 입력
            }
            System.out.println("결과: " + result);
            calculator.setResult(result);

            //프로그램 종료 여부 물어보기
            System.out.print("그만하려면 'exit'를 입력하세요 (계속하려면 아무거나 입력하세요) : ");
            String question = scanner.next();
            if (question.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

        System.out.println("==현재 계산기에 들어있는 연산 수==");
        int numList = calculator.getListNum();
        System.out.println(numList);

    }
}
