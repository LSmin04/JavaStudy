package ex06_encapsulation;

public class Main {
  public static void main(String[] args) {

    Car myCar = new Car();
    // 객체가 가지고 있는 필드값은 information hiding 필요, 함부로 노출X -> private로 해준다.
    // myCar.model = "G80"; // 직접 세팅
    // =>
    myCar.setModel("G80");
    // System.out.println(myCar.model);
    // => 메서드를 이용한 간접 접근
    System.out.println("getModel: " + myCar.getModel());
    


  }
}
