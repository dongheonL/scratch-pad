import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
//exam1();
//exam2();
//exam3();
exam4();
        }

  static void exam4() {
      System.out.println("== 예제 4 ==");
      List<Article> articles = new ArrayList<>();
      articles.add(new Article());
      articles.add(new Article());
      articles.add(new Article());
      articles.add(new Article());
      articles.add(new Article());

      for(int i =0; i< articles.size();i++){
          Article article = (Article) articles.get(i);
          System.out.println(article.id);
      }

    }

    static void exam3() {
         System.out.println("== 예제 3 ==");
         ArrayList<Article> articles = new ArrayList<Article>();
         articles.add(new Article());
         articles.add(new Article());
         articles.add(new Article());
         articles.add(new Article());
         articles.add(new Article());

         for(int i =0; i< articles.size();i++){
             Article article = (Article) articles.get(i);
             System.out.println(article.id);
         }
    }


    static void exam1() {
         System.out.println("== 예제 1 ==");
         int articlesSize = 0;
         Article[] articles = new Article[1000];
         articles[0] = new Article();
         articlesSize++;
         articles[1] = new Article();
         articlesSize++;
         articles[2] = new Article();
         articlesSize++;
         articles[3] = new Article();
         articlesSize++;
         System.out.println(articles[0].id);
         System.out.println(articles[1].id);
         System.out.println(articles[2].id);
         System.out.println(articles[3].id);

         for(int i =0; i< articlesSize;i++){
             System.out.println(articles[i].id);
         }
    }

    // 리스트의 좋은 점
//    1. 기억하는 것을 자기가 알아서 하기 때문에 int articlesSize 만들필요없다.
//        2. new Article[1000] -> 이 사이즈를 내가 정할 필요없다.
//                3. 넣을때도 알아서 들어가기 때문에 크게 신경 쓸 필요 없다.
    static void exam2() {

                System.out.println("== 예제 2 ==");
        ArrayList articles = new ArrayList();
        articles.add(new Article());
          articles.add(new Article());
          articles.add(new Article());
          articles.add(new Article());
          articles.add(new Article());

          for(int i =0; i< articles.size();i++){
              Article article = (Article) articles.get(i);
              System.out.println(article.id);
          }

    }
}

    class Article{
    static int lastId = 0;
    int id;
    String regDate;

        Article(){
            this(lastId+1,"2022-08-22 21:27:00");
 lastId++;
        }
        Article(int id,String regDate){
            this.id = id;
            this.regDate = regDate;
        }
    }

