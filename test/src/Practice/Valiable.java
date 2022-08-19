package Practice;

public class Valiable {

    //지역변수
    // 함수 내부에서 선언한 변수는 함수 내부에서만 사용해야한다.
    // 외부에서 접근 불가

    // 전역 변수
    // 함수 외부에서 선언한 변수는 함수 내부나 외부 모드 사용 가능하다.


    public Valiable()
    {

    }
    public static String a = "이건 전역변수야";


    public static String test(){
        String b = "이건 지역변수야";

        String a = b;

        return a;
    }

    public static String test2(){
        return a;
    }

// String test3 = b;
    public  static String test4 = a;

    public static String c = "hello";


















}
