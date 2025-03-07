package MakeCalculatorLast;

public enum Operatortype {
    Add('+'),
    Minus('-'),
    Multification('*'),
    Division('/');

    //입력받을 연산자를 private final로 설정하기
    // enum은 고정된 상수의 집하이라서 입력 받을 변수인 op의 값도 변경되면 안되기 때문!
    private final char op;

    //생성자 선언하기
    //enum으로 정의한 연산자들을 op에 각각 저장하기 위해서 필요함!
    //ex) 생성자가 없으면 Add('+')이렇게 못쓰고 Add만 쓸 수 있음. 그러니까 각 연산자와 연결하기 위해 꼭 필요함
    Operatortype(char op) {
        this.op = op;
    }

    //입력받은 op와 enum에 저장된 연산자를 대조해서 똑같은거 찾아서 뱉기
    public static Operatortype fromChar(char operator){
        for (Operatortype type : Operatortype.values()){
            if (type.op == operator){
                return type;
            }
        }
        //잘못된 입력 잡아내기 + IllegalArgumentExecption 활용하기
        throw new IllegalArgumentException(("잘못된 연산자를 입력하셨습니다"));
    }
}
