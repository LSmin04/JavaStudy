package ex07_static;

public class Main {
  public static void main(String[] args) {
    
    // 객체 생성 뒤, 메서드를 호출한다
    // 어떤 객체가 부르든 상관이 없다면 객체를 만들어서 부를 필요가 없다
    // Calculator calc = new Calculator();
    // int result = calc.add(2,4);
    // System.out.println(result);

    // 정적 메서드: 객체 생성 없이 클래스로 메서드를 호출한다 
    int result = Calculator.add(2,4);
    System.out.println(result);


    // public static double PI = 3.14159; 인 경우 접근해서 값을 변경할 수있으니까 final 를 넣어서 변경을 못하도록 한다
    // Calculator.PI = 233.332;
    
    System.out.println(Calculator.PI);

    

  }

}
