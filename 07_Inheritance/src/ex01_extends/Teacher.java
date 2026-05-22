package ex01_extends;

public class Teacher extends Person {

  private String school;

  public Teacher(String name, String school){
    super(name);
    this.school = school;
  }

  // void eat(){
  //   System.out.println("밥먹기");
  // }
  public void teach(){
    System.out.println("가르치기");
  }

}
