package MakeCalculator2;

import java.util.Scanner;

public class CalculatorMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        CalculatorClass2 calculator = new CalculatorClass2();


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
                    try { //잘못된 입력
                        result = calculator.divide(a, b);
                    } catch (ArithmeticException e) {
                        System.out.println("오류! " + e.getMessage());
                        System.out.println("다시 입력해주세요.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("잘못된 기호입니다. 다시 입력해주세요"); //case에 부합하지 않는 연산자 기호를 넣었을때
                    continue;  // 다시 입력
            }
            System.out.println("결과: " + result);
            calculator.setResult(a+" + "+b+" = " + result);

            if (calculator.getListNum()>10){
                System.out.println("계산기에 저장된 연산 값이 10개를 넘었습니다. 가장 오래된 연산 결과를 삭제합니다.");
                calculator.removeResult();
            }


            //프로그램 종료 여부 물어보기
            System.out.print("그만하려면 'exit'를 입력하세요 (계속하려면 아무거나 입력하세요) : ");
            String question = scanner.next();
            if (question.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
        System.out.println("===============================");
        System.out.println("계산기에 들어있는 연산 수 : "+calculator.getListNum());
        System.out.println("연산 리스트");
        calculator.getList();


    }
}
