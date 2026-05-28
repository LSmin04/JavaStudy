package ex02_output;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Main {

  public static void main(String[] args) {
    
    // File 객체 (우리가 만드려는 대상)
    File dir = new File("/storage"); // javaStudy 폴더 최상위(Root)의 바로 하위에 생성됨
    if(!dir.exists()){
      dir.mkdirs(); 
    }

    File file = new File(dir, "test.txt");  // test.txt : 실제 만드려는 파일의 파일명
    
    // 파일로 데이터를 보내는 스트림:통로 (출력 스트림)
    // try (FileOutputStream fos = new FileOutputStream(file, true);) { // fos.close();를 해줄 필요 없다. close() 자동 호출. but FileOutputStream은 성능이 좋지 않음 => BufferedOutputStream 사용.
    try (BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(file, true));) {
          
      // 실제로 데이터 내보내기 (int, byte[])
      // test.txt 파일에 c, b를 보내겠다.
      int c = 'A';
      byte[] b = "pple".getBytes();      
      fos.write(c);
      fos.write(b);

    } catch (Exception e) {
      System.err.println(e.getMessage());
    }

    // 읽어서 컴퓨터 메모리에 저장함. 그러면 어디든 보낼 수 있음
    // 생성보단 파일 읽는 것이 더 어렵다. 왜냐하면 어디까지 읽어야 하는 지 체크가 필요하다. 읽어야 하는 단위에 따라 다르다. 반복문이 필요함.
    

  }
}
