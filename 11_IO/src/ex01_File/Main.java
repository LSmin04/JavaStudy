package ex01_File;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    // 자바 홈을 File 객체로 생성하기 C:\Program Files\Java\jdk-21.0.10
    // 자바는 텍스트를 // 2개 사용
    File javaHome = new File("C:/Program Files/Java/jdk-21.0.10");

    // 기본 정보 확인
    System.out.println("이름: " + javaHome.getName());
    System.out.println("절대경로: " + javaHome.getAbsolutePath());
    System.out.println("상대경로: " + javaHome.getPath());
    System.out.println(javaHome.isDirectory() ? "디렉토리" : "파일");
    System.out.println("크기: " + javaHome.length() + "Byte");
    // epoch time (유닉스 운영체제) - 밀리초 단위, time stamp
    System.out.println("최종 수정일: " + javaHome.lastModified()); // 날짜시간이 아닌 것처럼 보임

    // 하위 디렉터리/파일 객체 가져오기
    File[] files = javaHome.listFiles();
    Arrays.stream(files)
        .filter(file -> file.isFile())
        .forEach(file -> {
          System.out.println(file.getName());
          System.out.println(file.length());
          System.out.println("==============================");
        });

    // 디렉토리 조장 (생성, 삭제)
    File dir = new File("C:/JavaStudy/io_test");
    if (dir.exists()) {
      System.out.println(dir.getAbsolutePath() + "존재합니다.");
    } else {
      dir.mkdirs(); // 폴더 만들기(하위 폴더까지 만듦)
      System.out.println(dir.getAbsolutePath() + " 생성했습니다.");
    }

    dir.delete(); // 폴더 지우기 (바로)  코드 동작할 때 바로 지움.

  }
}
