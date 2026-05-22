package ex01_extends;

public class WebDeveloper extends Developer { // eat, develop 가능

  public WebDeveloper(String name, String skill){
    super(name, skill);   // Developer
  }

  public void webDevelop(){
    System.out.println("웹 개발하기");
  }
}
