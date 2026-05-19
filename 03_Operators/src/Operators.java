public class Operators {
  public static void main(String[] args) {

    System.out.println("3. 대입 연산자");

    int a = 10;
    System.out.println("a :: " + a);

    int x = 10;
    x += 10;
    System.out.println(x);
    x -= 10;
    System.out.println(x);
    x *= 10;
    System.out.println(x);
    x /= 10;
    System.out.println(x);
    x %= 10;
    System.out.println(x);

    System.out.println("4. 비교 연산자");
    int xx = 10;
    int y = 20;

    System.out.println("xx > y :: " + (xx > y));
    System.out.println(xx >= y);
    System.out.println(xx < y);
    System.out.println(xx <= y);
    System.out.println(xx == y);
    System.out.println(xx != y);

    System.out.println("5. 논리 연산자");
    System.out.println(xx > 0 && y > 0);
    System.out.println(xx > 0 || y > 0);
    System.out.println(!(xx > 0));
    
    System.out.println("연산자 실습 문제");
    System.out.println("1.");
    int aa = 10;
    int bb = 20;

    int sum = aa + bb;
    int diff = aa - bb;
    System.out.println("sum :: "+ sum + ", diff :: "+ diff);

    int xxx = 20;
    int yyy = 25;
    int product = xxx * yyy, quotient = xxx / yyy; 

  }
}
