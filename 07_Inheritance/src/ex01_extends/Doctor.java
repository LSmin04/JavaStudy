package ex01_extends;

public class Doctor extends Person {

  private String hospital;

  // 객체가 생성될 때 부모 생성자를 호출 필요
  public Doctor(String name, String hospital) {
    super(name); // 부모
    this.hospital = hospital; // 자식
  }

  // void eat(){
  // System.out.println("밥먹기");
  // }
  public void operate() {
    System.out.println("수술하기");
  }

}
