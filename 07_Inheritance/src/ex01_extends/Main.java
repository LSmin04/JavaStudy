package ex01_extends;

public class Main {

  public static void main(String[] args) {
    
    WebDeveloper web = new WebDeveloper("kim", "aws");
    web.eat();  // Person
    web.develop();  // Developer
    web.webDevelop();   // WebDeveloper

  }
}
