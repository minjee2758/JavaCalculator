package MakeCalculator3;

import java.util.Scanner;

public class CalculatorMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        // CalculatorClass3 calculator = new CalculatorClass3();
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();


        while (true) {
            System.out.print("첫 번째 정수를 입력하세요 : ");
            int a = scanner.nextInt();
            System.out.print("두 번째 정수를 입력하세요 : ");
            int b = scanner.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = scanner.next();

            //enum 적용하기 (OperatorType)
            try {
                OperatorType operatorType = OperatorType.findOperator(operator);
                //결과값 변수 설정하기
                Object result = operatorType.apply(a,b);
                System.out.println("결과: " + result);
                arithmeticCalculator.setResult(a+" " + operator+" "+b+" = " + result);

                if (arithmeticCalculator.getListNum()>10){
                    System.out.println("계산기에 저장된 연산 값이 10개를 넘었습니다. 가장 오래된 연산 결과를 삭제합니다.");
                    arithmeticCalculator.removeResult();
                }

            } catch (IllegalArgumentException e){
                System.out.println("오류 발생 : " + e.getMessage());
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
        System.out.println("계산기에 들어있는 연산 수 : "+arithmeticCalculator.getListNum());
        System.out.println("연산 리스트");
        arithmeticCalculator.getList();


    }
}
