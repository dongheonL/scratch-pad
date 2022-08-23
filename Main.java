import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args) {



        List<String> articles = new ArrayList<>();
        // 리스트에 여러개가 들어가니 변수이름은 복수로 지어줘야함
        // add함수 : list에 값 추가
        articles.add("hello");
        articles.add("bye");
        articles.add("good");
        articles.add("반가워요");

        // get 함수 : list 안에 있는 데이터 가져오기
        for(int i=0;i< articles.size();i++){
            System.out.println(articles.get(i));
        }
        // set 함수 : list에 값 수정(index, 수정 할 데이터);
        articles.set(1,"잘가세요");
        System.out.println(articles.get(1));

        // contains 함수 : lost 안에 값 유무 확인

        System.out.println(articles.contains("어서오세요"));
        System.out.println(articles.contains("반가워요"));

        // indexOf 함수 : list 안에 값 위치 확인
        System.out.println("값 위치 : "+ articles.indexOf("반가워요"));

        //size() 함수 : ArrayList의 개수를 리턴
        System.out.println("List size : " + articles.size());

        // remove() 함수 : ArrauList에 데이터 삭제
        // 방법 2개
         articles.remove(0) ;// index로 접근하여 삭제
         articles.remove("반가워요");  //값으로 접근하여 삭제

        // 반복문 이용해서 list 순회
        for(int i=0;i<articles.size();i++){
            System.out.println(articles.get(i));
        }







    }


}