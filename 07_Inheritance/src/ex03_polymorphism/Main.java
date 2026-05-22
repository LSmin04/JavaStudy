package ex03_polymorphism;

/*
  부모 타입으로 자식 타입 관리하기
  다형성: 하나의 타입으로 여러 객체를 관리하는 성질
  부모 타입으로 자식 객체를 관리할 수 있다.
 */

public class Main {

  public static void main(String[] args) {
    // 캐스팅: 형 변환
    // 업캐스팅
    // Coffee coffee1 = new Espresso("브라질");
    // Coffee coffee2 = new Americano("니카라과");
    // // Espresso 에 있는 taste() 호출 불가. 
    // // 타입 변경으로 인해 메서드를 호출하지 못하면 타입에 메서드를 넣어주면 된다.
    
    // // 1. 소스 코드를 작성할 때 Coffee 클래스의 taste() 연결(정적 바인딩)
    // // 2. 실행 시, 실제 객체(Espresso, Americano)의 taste()가 호출됨(동적 바인딩)
    
    // coffee1.taste();
    // coffee2.taste();

    // =======================================================================
    // UpCasting: 자식 객체의 타입을 부모 타입으로 바꾸는 것
    Coffee coffee1 = new Espresso("브라질");
    Coffee coffee2 = new Americano("니카라과");

    // UpCasting된 객체도 실제 메서드 실행 시에는 자신의 메서드를 찾아서 실행한다.
    coffee1.taste();  // 코드 작성 시에는 Coffee의 taste()를 연결하지만, 실행 시에는 Espresso의 taste()를 연결합니다. (동적 바인딩)
    coffee2.taste();

    // ===============================================
    coffee1.info();

    // drink는 Coffee에는 없는(부모에는 없는) 에스프레소 전용 메서드임. 
    // coffee1.drink(); => 호출 불가
    // 다운캐스팅 필요. 자식 타입으로 바꿔주는 것. 직접 코딩을 명시해줘야 함

    // Espresso 전용 메서드 호출을 위해서 Espresso 타입으로 강제 변환 (DownCasting)
    // 타입이 맞는지 체크하는 것이 권장 사항: 타입 체크 연산자 instanceof 사용
    // coffee1 객체가 Espresso 타입이 맞다면, 타입을 변환하라.
    if(coffee1 instanceof Espresso){
      ((Espresso)coffee1).drink();
    }

  }
  
}
