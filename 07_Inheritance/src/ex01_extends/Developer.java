package ex01_extends;

 
/*
  개발자는 사람이다 (is a 관계)
  개발자는 사람을 상속받을 수 있다.
  
  Person을 상속 받은 Developer
  Developer는 Person의 멤버를 내 것처럼 다룰 수 있다.
  
  부모: Person (상위, super)
  자식: Developer (하위, sub)
 */

// 부모가 먼저 태어나야 자식이 태어날 수 있다. 
// 자식 생성자는 부모 생성자를 호출해야 한다.

// super() : 부모 생성자 호출하는 코드
public class Developer extends Person {

  private String skill;

  public Developer(String name, String skill){
    super(name); // 여기선 Person의미함. 
    this.skill = skill;
  }

  // void eat(){
  //   System.out.println("밥먹기");
  // }

  public void develop(){
    System.out.println("개발하기");
  }


}
/*
상속: 클래스가 가지고 있는 걸(필드, 메서드) 다른 클래서가 가져다 사용할 수 있는 것. 
상속 키워드: extends

*/