package ex07_static;

public class Calculator {

  public static final double PI = 3.14159;

  // 필드와 상관없는 메서드. 
  // 단독 동작 : 유틸리티메서드
  // 어떤 객체가 부르든 상관이 없다면 객체를 만들어서 부를 필요가 없다

  // static
  // 정적 멤버, 클래스 멤버라고 한다
  // 클래스로 호출하니까..
  public static int add(int a, int b){
    return a + b;
  }

}
