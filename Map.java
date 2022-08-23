import java.util.HashMap;
import java.util.Map;

class Main{
    public static void main(String[] args) {


//        Map<String,Article> articleMap = new HashMap<>();
//   articleMap.put("id가 가장 큰 게시물",new Article(100,1));
//   articleMap.put("조회수가 가장 큰 게시물",new Article(1,100));
//
//        System.out.println(articleMap.get("id가 가장 큰 게시물"));
//        System.out.println(articleMap.get("조회수가 가장 큰 게시물"));

        Map<String,Integer> ageMap = new HashMap<>();

        ageMap.put("철수", 20); // 철수
        ageMap.put("수민", 23); // 수민
        ageMap.put("영희", 10); // 영희
        ageMap.put("영수", 15); // 영수

        // containsKey("Key") : 맵에 해당 Key가 있는지 조사해서 결과값 리턴
        System.out.println(ageMap.containsKey("철수"));

        // remove("Key") : 맵에 해당 Key와 연결 되어 있는 데이터를 삭제
        System.out.println(ageMap.remove(("철수")));

        // size() : 맵에 size를 리턴
        System.out.println(ageMap.size());

        // KyeSet() : 맵에 해당 Key를 출력
        for(String Key : ageMap.keySet()){
            System.out.println(ageMap.get(Key));
        }

    }
}

class Article{
    int id;
    int hitCount;

    Article(int id,int hitCount){
        this.id = id;
        this.hitCount = hitCount;
    }
    @Override
    public String toString(){
        return String.format("{id : %d, hitCount : %d}",id,hitCount);
    }
}

// List
// - 데이터 넣을 때 편하다.
// - 인덱스가 자동 생성(우리한테 선택권이 없다)
// - 데이터 가져올 때 불편하다.
// - 데이터 넣는 함수 : add(데이터);

// Map
// - 데이터 넣을 때 불편하다.
// - 인덱스가 수동 생성(우리가 지정해야 한다.)
// - 데이터 넣는 함수 : put("데이터이름",데이터);