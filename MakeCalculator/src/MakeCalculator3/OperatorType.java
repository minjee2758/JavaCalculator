package MakeCalculator3;

import java.util.function.BiFunction;
//연산자를 enum타입에 정의하고 람다함수로 표현하기
public enum OperatorType {
    Plus("+", (a,b) -> (a+b)),
    Minus("-", (a,b) -> (a-b)),
    Multiply("*", (a,b) -> (a*b)),
    Divide("/", (a,b) -> {
        if (b == 0) { //예외처리
            throw new ArithmeticException("0으로는 나눌 수 없습니다");
        }
        return a / b;
    });

    private final String operator;
    private final BiFunction<Integer, Integer, Object> operation;

    OperatorType(String operator, BiFunction<Integer,Integer, Object> operation){
        this.operator = operator;
        this.operation = operation;
    } //생성자로 연산을 받고, 입력받을 숫자와 결과값 정의

    //연산 적용하기 ->apply 활용
    public Object apply(int a, int b){
        return operation.apply(a,b);
    }

    //입력받은 연산산자가 enum중에 어떤건지 찾아서 적용하기
    public static OperatorType findOperator(String operator){
        for (OperatorType value : OperatorType.values()) {
            if (value.operator.equals(operator)){
                return value;
            }
        }
        //연산자 잘못 입력했을때 처리
        throw new IllegalArgumentException(("잘못 입력하셨습니다. "+operator));
    }

}
