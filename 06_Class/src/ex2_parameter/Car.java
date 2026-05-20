package ex2_parameter;

// "public" class 는 클래스 명과 파일명 동일해야 한다. 
// 파일 하나에 2개의 public 존재X 
public class Car {

  // 값 (필드)
  int oil;

  // 함수: 특정 기능을 수행하는 코드 블록(단, 클래스 외부에 있어야 한다.)

  // output input
  // 결과타입 함수명(매개변수) {}

  // 클래스 내부의 함수는 메서드라고 한다.
  /**
   * 메서드 설명 작성함
   * @param city 뭘 받는지 설명함
   */
  void drive(String city) { // 매개변수(Parameter) // 포수
    oil -= 10;
    System.out.println(city + "에서 드라이브하기");
  }
  
  void goToGasStasion(int fuel){
    oil += fuel;
    System.out.println("현재 연료량: "+ oil);
  }

}
