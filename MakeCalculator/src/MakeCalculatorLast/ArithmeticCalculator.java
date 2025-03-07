package MakeCalculatorLast;

import java.util.ArrayList;
import java.util.List;

//캡슐화를 통해 코드의 간결성과 효율성을 높이자!
//제네릭 사용하되, 숫자 사용할 수 있도록 extends Number 해주기
public class ArithmeticCalculator<T extends Number> {
    //외부에서 리스트에 막 접근하는 것을 막기 위해(리스트 보호) private으로 List 정의하기
    private final List<String> calculateList = new ArrayList<String>();

    //계산 메서드 만들기 - 제네릭으로 어떤 타입이든 입력받을 수 있도록 함
    public Double calculate(T a, T b, char operator) {
        Operatortype operatortype = Operatortype.fromChar(operator);
        return switch (operatortype){
            //제네릭으로 입력받은 수를 double타입으로 변경해서 계산
            case Add -> a.doubleValue() + b.doubleValue();
            case Minus -> a.doubleValue() - b.doubleValue();
            case Multification -> a.doubleValue() * b.doubleValue();
            case Division -> {
                if (b.doubleValue() ==0){
                    System.out.println("0으로 나눌 수 없습니다");
                    yield null; //switch문에서는 return 대신에 yield를 사용한다
                }
                yield a.doubleValue() / b.doubleValue();
            }
        };
    }

    //setter 설정하기 -> 입력받은 result값을 이 클래스의 calculateList에 add
    public void setResult(String result) {
        this.calculateList.add(result);
    }

    //getter - 결과값 뱉어낼거 for문으로 설정하기
    public List<String> getResult(){
        for (String s : calculateList) {
            System.out.println(s);
        }
        return calculateList;
    }

    //리스트에 저장된 개수가 10개가 넘으면 삭제하기
    public void removeFirst(){
        if (calculateList.size()>10) {
            System.out.println("리스트에 저장된 값이 10개를 초과하였으므로 가장 오래된 연산 결과를 삭제합니다.");
            calculateList.remove(0);
        }
    }


}
