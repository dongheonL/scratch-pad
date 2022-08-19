package Practice;

import java.util.ArrayList;
import java.util.List;

// public == 접근제어자
// public / private
public class run {
    public static void main(String[] args) {

        // public : 어디서나 접근 가능
        // private: 클래스 안에서만 접근 가능

       //  클래스명 인스턴스이름;
Score scores = new Score(90,85,90,80,90);

        System.out.println("총 합은 : " +scores.sum());
        System.out.println("평균 값은 : " + scores.avg());



        List<Score> lists = new ArrayList<>();
        lists.add(scores);
        System.out.println(scores);
        List<String> strS = new ArrayList<>();
        strS.add("a");
        strS.add("b");
        strS.add("c");
        strS.add("d");
        strS.add("e");
        strS.add("f");
        strS.add("g");
        strS.add("h");
        strS.add("i");
        strS.add("d");
        System.out.println(strS.indexOf("d"));
        System.out.println(strS.lastIndexOf("d"));


    }
}
