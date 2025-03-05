package MakeCalculator3;

import java.util.ArrayList;

public class CalculatorClass3<T> {
    private ArrayList<Object> calculateList = new ArrayList<>(); //연산 결과 저장하기

    //setter 설정하기
    public void setResult(String result){
        calculateList.add(result);
    }


    //더하기
    int add(int a, int b){
        return a+b;
    }
    //빼기
    int subtract(int a, int b){
        return a-b;
    }
    //곱하기
    int multiply(int a, int b){
        return a*b;
    }
    //나누기
    Object divide(int a, int b) {
        if (b==0){
            throw new ArithmeticException("0으로는 나눌 수 없습니다");
        }
        if (a % b == 0) {  // 나머지가 없으면 int 반환
            return a / b;
        } else {  // 나머지가 있으면 double 반환
            return (double) a / b;
        }
    }

    //개수출력하기 getter
    public int getListNum(){
        return calculateList.size();
    }
    public void getList(){
        for (Object o : calculateList) {
            System.out.println(o);
        }
    }

    public void removeResult() {
            calculateList.remove(0);
    }
}
