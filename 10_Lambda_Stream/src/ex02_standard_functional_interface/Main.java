package ex02_standard_functional_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// 매개변수가 함수형 인터페이스인 경우: 람다식을 전달합니다!

public class Main {
  public static void main(String[] args) {

    executeConsumer("홍길동", name -> System.out.println("Consumer 이름: " + name));
    executeSupplier(() -> "Hello");
    executeFunction("홍길동", name -> name.length());
    executePredicate(10, num -> num > 0);
    executePredicate(-10, num -> num > 0);
    
  }

  // 주는 것만 제네릭 처리, 반환(boolean형)은 정해져 있음
  // 필터링하는 곳에서 주로 사용함(if문)
  /**
   * 
   * @param param     람다식에 전달할 값
   * @param predicate 값(param)을 받아서 체크한 뒤 boolean을 반환하는 함수 (람다식)
   */
  public static void executePredicate(Integer param, Predicate<Integer> predicate){
    if(predicate.test(param)){
      System.out.println(param + "은 양수");
    } else {
      System.out.println(param + "은 음수");
    }

  }

  // Function<String, Integer> function : String 매개변수, Integer 반환 값
  // 함수를 만들어서 전달하는 것이 KeyPoint!
  /**
   * @param param    람다식에 전달할 값
   * @param function 값(param)을 받아서 가공하여 반환하는 함수(람다식)
   */
  public static void executeFunction(String param, Function<String, Integer> function){
    Integer result = function.apply(param);
    System.out.println("Function 결과: " + result);
  }

  // Supplier<String> supplier : 값을 반환함. String 타입을 반환하겠다는 의미
  /**
   * @param supplier 값을 반환하는 함수 (람다식)
   */
  public static void executeSupplier(Supplier<String> supplier) {
    String result = supplier.get();
    System.out.println("Supplier 결과: " + result);
  }

  // static 메서드는 오직 클래스 메서드만 호출이 가능하다
  // consumer : 받아서 쓰는 것이 consumer이다.
  // param : 받아온 값, consumer: 받아온 값을 사용할 함수
  /**
   * @param param    람다식에 전달할 값
   * @param consumer 값(param)을 받아서 사용하는 함수 (람다식)
   */
  public static void executeConsumer(String param, Consumer<String> consumer) {
    consumer.accept(param);
  }

}
