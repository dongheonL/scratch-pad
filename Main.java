import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Main{
    public static void main(String[] args) {

        List<Integer> ageList = new ArrayList<>();
        ageList.add(20); //철수
        ageList.add(23); //수민
        ageList.add(10); //영희
        ageList.add(15); // 영수

        System.out.println(ageList.get(1));

        HashMap<String,Integer> ageMap = new HashMap<String,Integer>();
        ageMap.put("철수",20); //철수
        ageMap.put("수민",23); //수민
        ageMap.put("영희",10); //영희
        ageMap.put("영수",15); //영수

        System.out.println("영희나이 :" +ageMap.get("영희"));
        System.out.println("수민나이 :" +ageMap.get("수민"));
        System.out.println("영수나이 :" +ageMap.get("영수"));
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