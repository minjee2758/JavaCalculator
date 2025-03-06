# JavaCalculator

## 📌 프로젝트 개요
Java를 활용해 기본적인 사칙연산을 수행하는 계산기를 개발. 
LV1, LV2, LV3으로 구성된 프로젝트는 점차 기능을 확대하고 객체지향적인 설계를 반영함.

### 🚀 기본 요구사항
```
1. 기본적인 사칙연산(➕,➖,✖️,➗) 지원
2. 콘솔 기반 사용자 인터페이스
3. 예외 처리: 0으로 나누는 경우 등
```
---

## 🚧 설계
### Lv1 | 클래스 없이 기본적인 연산 수행 `MakeCalculator1`
```
- Scanner를 사용하여 양의 정수(0 포함) 2개와 연산 기호 입력
- 연산 수행: if 또는 switch 문을 사용하여 연산 처리
- 예외 처리: 0으로 나누는 경우 등의 오류 메시지 출력
- 반복 실행: "exit" 입력 전까지 무한 반복 실행
```

### Lv2 | 클래스를 적용한 연산 기능 구현 `MakeCalculator2`
```
- `CalculatorClass2` 클래스 생성
  - 사칙연산을 수행하는 메서드 구현
- 연산 결과를 저장하는 `ArrayList` 추가
  - 가장 먼저 저장된 연산 결과를 삭제하는 기능 추가
- `CalculatorClass2` 클래스를 캡슐화하여 직접 접근 제한 (Getter, Setter 활용)
```

### Lv3 | Enum & Lambda 적용 `MakeCalculator3`
```
- `CalculatorClass3` 클래스에 Enum, 람다 & 스트림 적용
  - Enum을 활용하여 연산자 타입을 관리
- ArithmeticCalculator 클래스에서 Enum을 사용, 코드 간결화
```

## 📂 프로젝트 구조
```java
📦 JavaCalculator
┣ 📂out
┃ 
┣ 📂src
┃ ┃   //레벨1
┃ ┣ 📂 MakeCalculator1    
┃ ┃  ┗  CalculatorMain1.java
┃ ┃ 
┃ ┃   //레벨2
┃ ┣ 📂 MakeCalculator2   
┃ ┃  ┣  CalculatorClass2.java
┃ ┃  ┗  CalculatorMain2.java
┃ ┃
┃ ┃   //레벨3
┃ ┣ 📂 MakeCalculator3 
┃ ┃  ┣  ArithmeticCalculator.java
┃ ┃  ┣  CalculatorClass3.java
┃ ┃  ┣  CalculatorMain3.java
┃ ┃  ┗  OperatorType.java
┃ ┃ 
┗ 📜 README.md
```

### ⚙️ 실행 방법
1. CalculatorMain.java를 실행하여 콘솔에서 계산을 수행합니다.
2. "exit"을 입력하면 지금까지의 연산결과를 출력하고 프로그램이 종료됩니다.
