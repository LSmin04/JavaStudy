public class SwitchEx {
  public static void main(String[] args) {
    // 월에 따른 계절 출력하기
    int month = 12;
    switch (month % 12 / 3) { // 12월만 0인 값 / 봄: 3~5, 겨울: 0~2
      case 1:
        System.out.println("봄");
        break;
      case 2:
        System.out.println("여름");
        break;
      case 3:
        System.out.println("가을");
        break;
      default:
        System.out.println("겨울");
    }

    // 문제1
    int a = 10;
    int b = 15;

    int sum = a + b;
    int diff = a - b;
    System.out.println("sum:: " + sum);
    if (diff > 0) {
      System.out.println("diff: " + diff);
    } else {
      System.out.println("두 수의 차는 양수가 아닙니다.");
    }
    
    // 문제2
    
    
  }
}
