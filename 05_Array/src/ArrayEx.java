import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
  public static void main(String[] args) {
    // int[] arr;

    // 배열 선언
    String[] blackPink;

    // 사용자 콘솔 입력 (배열의 길이를 사람이 정하도록)
    Scanner sc = new Scanner(System.in);
    System.out.println("4를 입력하세요 > ");
    int a = sc.nextInt(); // 사용자 입력

    // 배열 생성 (new 의미: 실행 중에 메모리를 할당하는 것: 동적할당 -> Heap영역)
    blackPink = new String[a]; // 길이 설정

    // 배열 요소 (Element: 각 변수를 의미)
    blackPink[0] = "지수";
    blackPink[1] = "제니";
    blackPink[2] = "로제";
    blackPink[3] = "리사";

    // 배열 길이
    System.out.println(blackPink.length);

    // 출력
    for (int i = 0; i < blackPink.length; i++) {
      System.out.println(blackPink[i]);
    }

    // 정적 초기화 (배열 선언 시에만 초기화)
    String[] seasons = { "봄", "여름", "가을", "겨울" };
    for (String season : seasons) {
      System.out.println("향상 for " + season);
    }

    // 동적 초기화 (배열 선언과 분리가 가능한 초기화)
    String[] hobbies;
    hobbies = new String[] { "레고", "독서" };
    for (String hobby : hobbies) {
      System.out.println("향상 for " + hobby);
    }

    // 배열의 길이는 수정 불가
    // 배열의 길이를 늘이는 방법: 새 배열을 만들어서 이사하기
    String[] names = {"김청수", "홍길동"};
    String[] newArray = new String[5];
    System.arraycopy(names, 0, newArray, 0, names.length);
    names = newArray;
    System.out.println(Arrays.toString(names));



    // cd 'c:\JavaStudy\05_Array'; & 'C:\Program Files\Java\jdk-21.0.10\bin\java.exe'
    //              stack {코드블록}                        heap 개발자 영역
    //          names  0xA100                          김철수|홍길동
    //          newArray 라는 참조변수  0xB100           |김 |홍 |null |null |null |
    //          names = newArray; => newArray가 names 주소를 가르키게 됨
    //          메모리 누수: 아무도 참조를 안함 (names)
    //          GC

    // 문제1
    int[] numbers1 = {4, 7, 9, 12, 17, 19, 24, 28, 30};
    int sum = 0;
    for(int num : numbers1){
      sum += num;
    }
    // for(int i = 0; i < numbers1.length; i++){
    //   sum += numbers[i];
    // }
    int avg = sum/numbers1.length;
    System.out.println("합계: "+sum);
    System.out.println("평균: "+avg);

    // 문제2
    int[] numbers2 = {42, 17, 93, 120, 117, 59, 24, 28, 39};
    int max;
    int min;
    int temp;
    for(int i =0; i < numbers2.length; i++){
      
    }


  }
}
