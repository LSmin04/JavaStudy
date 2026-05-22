package ex03_throws;

public class Main {

  // 실행 예외는 코드를 강제로 적을 필요 없음
  public static void main(String[] args) {

    
    try {
      String a = "10.5", b = "3";
      
      Calculator.div(a, b);
      Calculator.mod(a, b);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }

  }

}
