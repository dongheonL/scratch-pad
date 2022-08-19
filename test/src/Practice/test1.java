package Practice;

public class test1 {

    public static void main(String[] args) {
        System.out.println("동해물과 백두산이");
        System.out.println("마르고 닳도록");
        System.out.println("하느님이 보우하사");
        System.out.println("우리나라 만세");


        int a = 10;
        System.out.println("a : " + a);
        System.out.println(100);
        // 문자는 "" 로 감싸줘야함
        // 숫자는 그냥 사용 가능

        // 자료형(data type)
        // 정수 : int
        // 문자 : String
        // 논리 : boolean

        // 원시타입
        // 참조타입
        // 원시타입은 변수에 값 자체가 담긴다.
        // 참조타입은 변수에 주소가 담긴다.
        // 원시타입
        // byte(1), short(2), int(4), long(8)

        byte x = 100; // = -128 ~ 127
        short y = 2;
        int e = 3;
        long f = 4L; // = long 사용할때는 뒤에 L(l) 붙여줘야됨

        // 실수
        // float(4)= 사용할때 뒤에 f 사용해야함, double(8) =기본형

        float g = 3.14f; // = (float)3.14 사용하던지 뒤에 f 붙이던지 해야 오류안나옴
        double h = 3.14;


        // 문자
        // char(2)
        // 아스키 코드
        // A == 65 문자를 숫자로 바꾸는걸 인코딩, 숫자를 문자로 바꾸는건 디코딩 이라고함.
        char i = 'A'; // '  ' 안에 한글자만 사용 가능
        System.out.println((int)i); // = A ==65

        // 논리형
        // boolean(1) : True / False
        boolean j = true;

        // 참조타입
        // String : 문자열
        // Integer : 정수

        char ch1 ='V';  // 원시타입은 문자 색이 바뀜
        String s1 = "문자열";
        System.out.println(s1);
        Integer i1 = 100;
        System.out.println(i1); // 참조타입은 문자색 그대로

        // null
        // int int1 = null; = null 호환 x 
        Integer int2 = null; // = null 가능

        // 정수
        int q = 3;

        // 실수
        double w = 0.2;

        // 문자
        char r = 'E';
        char r2 = '한';

        // 논리
        boolean t = true;

        // 문자열
        String u = "hello";

        Integer f1 = null;

        // 형변환(casting)
        // 자동 형변환 // 명시적 형변환
        // int / double
        // (변환하고자 하는 자료형)변수
        // int -> double
        int a2 = 5;
        double d2 = a2; // = 5.0 자동형변환
        double d3 = (double)a2; // = 명시적형변환
        System.out.println(d2);

        // double -> int
        // int a3= 5.5 (x)
        int d4 = (int)5.5;
        System.out.println((int)5.5);

        char a1 = 'A';
        System.out.println((int)a1);

        // Integer, String
        // 2, "2"

        String s2 = Integer.toString(200);
        System.out.println(s2);
        System.out.println(s2.getClass().getName());






    }
}






