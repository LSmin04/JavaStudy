package ex04_this;


public class Car {
  // this
  // 현재 클래스로 만든 객체를 의미함 (참조값=주소값)

  // 2가지 활용
  // 1. 필드와 매개변수 구분 (필드는 this 붙여서 적기)
  // 2. 다른 생성자 호출하기

  int oil;  // 필드

  void addOil(int oil) {  // 매개변수
    if(oil < 0){
      return; // 비즈니스 종료
    }
    // 필드 += 매개변수 인 상황
    this.oil += oil;
    
  }

}
