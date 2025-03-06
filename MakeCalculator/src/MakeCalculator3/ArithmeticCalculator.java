package MakeCalculator3;

import java.util.ArrayList;

public class ArithmeticCalculator {
    private final ArrayList<Object> calculateList = new ArrayList<>(); //연산 결과 저장하기
    //setter 설정하기
    public void setResult(String result){
        calculateList.add(result);
    }

    //개수출력하기 getter
    public int getListNum(){
        return calculateList.size();
    }
    public void getList(){
        int i =1;
        for (Object o : calculateList) {
            System.out.println(i+++"번째 : " +" "+ o);
        }
    }

    public void removeResult() {
        calculateList.removeFirst();
    }

}