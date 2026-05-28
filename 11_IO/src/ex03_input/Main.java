package ex03_input;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

  public static void main(String[] args) {

    // File 객체 (우리가 읽으려는 대상)
    File dir = new File("/storage");
    File file = new File(dir, "test.txt");

    // 파일의 데이터를 읽는 스트림:통로 (입력 스트림)
    try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));) {

      // 어떤 단위로 읽을 것인지 결정 (int, byte[])
      // int : 1byte씩 읽겠다. byte[] : 여러 개 읽겠다.(더 성능이 좋음-권장)
      byte[] b = new byte[4];

      // 실제로 읽어들인 수 반환(int)
      // -1 일 때까지 읽어야 함.
      // 실제로 읽은 바이트 수
      int readByte = 0;

      // 파일이 끝날 때까지 읽기 (파일이 끝나면 -1 반환)
      while ((readByte = bis.read(b)) != -1) {
        // 실제로 읽은 바이트 수 만큼만 처리
        System.out.print(new String(b, 0, readByte));
      }

      /*
       * while((readByte = bis.read(b)) != -1){
       * // Appl/eApp/leAp/ple /
       * //   4   4    4    3    -1
       * // Appl/eApp/leAp/plep 출력됨
       * // 메모리를 덮여쓰기 해서 사용하고 있었는데 앞에 있는 leAp에서 ple만 덮여쓰여지고 p는 덮어쓸게 없어서 p가 남음
       * // 마지막에 읽은 실제 데이터가 몇인지 체크 필요함.
       * System.out.println(b);
       * }
       * 
       * 인코딩에 따라 한글 바이트가 다름. -> 문자 기반 스트림 (Character-based Stream) 사용하면 됨.
       */

    } catch (Exception e) {
      System.err.println(e.getMessage());
    }

    // 읽어서 컴퓨터 메모리에 저장함. 그러면 어디든 보낼 수 있음
    // 생성보단 파일 읽는 것이 더 어렵다. 왜냐하면 어디까지 읽어야 하는 지 체크가 필요하다. 읽어야 하는 단위에 따라 다르다. 반복문이
    // 필요함.

  }
}
