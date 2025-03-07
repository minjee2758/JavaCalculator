package MakeCalculatorLast;

import java.util.Scanner;

public class CalculatorMainLast {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //계산 클래스 불러오기
        ArithmeticCalculator<Double> ACalculator = new ArithmeticCalculator<>();

        //while문으로 break될때까지 반복하기
        while (true){
            System.out.print("첫 번째 정수를 입력하세요 : ");
            double a = scanner.nextDouble();
            System.out.print("두 번째 정수를 입력하세요 : ");
            double b = scanner.nextDouble();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = scanner.next().charAt(0); //연산자 1개만 입력 받기 위해 charAt(0)사용하기

            //setter 사용해서 계산 결과 리스트에 집어넣기 (a+b=? 이런 형태로)
            System.out.println("계산 결과 : "+ACalculator.calculate(a, b, operator));
            String result = a+" " + operator +" "+b +" = " +ACalculator.calculate(a, b, operator);
            ACalculator.setResult(result);

            //저장된 결과값들이 10개가넘으면 제일 먼저 저장된거 삭제
            ACalculator.removeFirst();

            //프로그램 종료 여부 물어보기
            System.out.print("그만하려면 'exit'를 입력하세요 (계속하려면 아무거나 입력하세요) : ");
            String question = scanner.next();
            if (question.equals("exit")){
                System.out.println("프로그램을 종료하고 결과 리스트를 출력합니다.");
                break;
            }
        }

        ACalculator.getResult(); //프로그램 종료하면 저장된 결과값들 출력
    }

}
