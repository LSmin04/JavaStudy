package ex03_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArticleMain {

  public static void main(String[] args) {
    // 원본 리스트 생성
    List<Article> articles = Arrays.asList(
      new Article("오늘날씨", 15),
      new Article("이란전쟁", 150),
      new Article("GTX-A철근", 200),
      new Article("스타벅스", 50),
      new Article("지방선거", 300)
    );
    
    // 스트림 API 이용해서 
    // 조회수가 100 이상인 기사의 제목을 List에 저장하세요.
    // Stream<Article> stream = articles.stream();
    List<String> titles = articles.stream()
                                .filter(article -> article.getViewCount() >= 100)
                                .map(article -> article.getTitle())
                                .collect(Collectors.toList());
 
    System.out.println("조회수 100이상인 기사 제목: " + titles);
  }

}
