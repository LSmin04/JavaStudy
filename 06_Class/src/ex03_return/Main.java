package ex03_return;

public class Main {

  public static void main(String[] args) {
    
    // 객체를 만들고, 객체로 메서드를 호출한다.
    
    Calculator calc = new Calculator();
    
    int result = calc.add(1,3);
    System.out.println("결과: "+result);

    System.out.println(calc.add(4,5));

    calc.add(-1.5, 1.5);

  }

}
