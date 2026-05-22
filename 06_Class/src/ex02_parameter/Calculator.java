package ex02_parameter;

class Main2 {
  public static void main(String[] args) {

    // 클래스타입 객체명;
    Calculator myCalc;
    myCalc = new Calculator(); // new로 메모리 할당까지 받은 객체는 인스턴스라고 한다.

    myCalc.add(1, 2);
    myCalc.add(1.5, 2.5);
    myCalc.add(new int[] {1,2,3,4,5}); // 동적 초기화

    myCalc.multiply(1, 2, 3, 4);
    myCalc.multiply(1, 2); // 인자 2개짜리 메서드가 실행된다. 자바는 정확한 걸 먼저 찾는다.

   
  }

}

public class Calculator {

  // 메서드 오버로딩 (Overloading)
  // 같은 이름의 메서드 + 개수나 타입이 다른 매개변수
  void add(int a, int b) {
    System.out.println("정수형 합:" + (a + b));
  }

  void add(double a, double b) {
    System.out.println("실수형 합:" + (a + b));
  }

  void add(int[] numbers){
    int result = 0;
    for(int n : numbers){
      result += n;
    }
    System.out.println(result);
  }

  void multiply(int a, int b) {
    System.out.println(a * b);
  }

  void multiply(int a, int b, int c) {
    System.out.println(a * b * c);
  }

  // 가변 인자 처리를 위한 말줄임표(...)
  // 가변 인자는 실제로는 배열로 처리된다.
  // void multiply(int... numbers) {
  // int result = 1;

  // 곱하기 위해서 최소 2개의 숫자가 필요하다. 
  void multiply(int a, int b, int... numbers) {
    int result = a * b;
    for (int n : numbers) {
      result *= n;
    }
    System.out.println(result);
  }

}
