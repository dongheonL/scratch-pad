package Practice;

public class test3 {
    public static void main(String[] args){

        // 정수
        int a = 10;
        // 실수
        double b = 5.6;
        // 문자
        char c = 'a';
        // 논리
        boolean d = true;
        // 문자열
        String e = "hello";

        Integer f = null;

        System.out.println(a);
        a = 100;
        System.out.println(a);


        // 상수
        // final 데이터타입 상수명 = 값;
        final int test = 55;
        // test = 100; error

        // 연산자
        // = : 대입연산자(같다x 오른쪽에있는걸 왼쪽으로 대입한다)
        // 산술연산자
        // +, -, *, /, %
        // 우선순위 *, / > +, -
        System.out.println(3+5);
        System.out.println(3-5);
        System.out.println(3*5);
        System.out.println(3/5);
        System.out.println(3%5);

        int num1 =15;
        int num2 =3;
        int sum = num1 + num2;
        System.out.println(num1 + num2);
        System.out.println(sum);

        int Korean = 80;
        int Math = 100;
        int English = 75;
        int Sum = Korean + Math + English;
        int Avg = Sum / 3;
        System.out.println("평균은 : " + Avg);

        // 증가 , 감소 연산자
        // ++ : 1을 더한다.
        // -- : 1을 뺀다.

        int Score = 99;
        int LastScore = ++Score;        // = Practice.Score = 100으로 저장됨
        System.out.println(LastScore);

        int LastScore2 = --Score;
        System.out.println(LastScore2);

        // 연산자의 위치
        int Number = 5;
        int Number2 = 0;

        Number2 = ++Number;
        System.out.println("Practice.Number : " + Number + " Number2 : " + Number2);
        Number = 5;
        Number2 = 0;
        Number2 = Number++;
        System.out.println("Practice.Number : " + Number + " Number2 : " + Number2);
        System.out.println(Number2);

        int A1 = 5;
        int B1 = 5;
        System.out.println(A1++); // = A1++ = 출력 한 뒤 1을 더해라 / ++A1 = 먼저 1을 더한 값
        System.out.println(++B1);
        System.out.println(A1);
        System.out.println(B1);


        // 관계 연산자
        // > : 크다
        // < : 작다
        // >= : 크거나 같다
        // <= : 작거나 같다
        // == : 같다
        // != : 아니다
        System.out.println(5>2);
        System.out.println(5<2);
        System.out.println(5>=2);
        System.out.println(5<=2);
        System.out.println(5==2);
        System.out.println(5!=2);

        int Age = 30;
//        System.out.println(Age > 10);
        boolean Result = Age > 10;
        System.out.println(Result);
        
        // 논리 연산자
        // && : 두 항이 모두 참인 경우에만 True 를 반환
        // || : 두 항 중 하나만 참이면 True 를 반환 , 두 항 모두 거짓이면 False
        // ! : 참인 경우는 False , 거짓인 경우는 True 로 반환
        boolean Result1 = (5 > 3) && (10 < 5);
        System.out.println(Result1);

        boolean Result2 = (5 > 3) || (10 < 5);
        System.out.println(Result2);

        boolean Result3 = !(5 > 3);
        System.out.println(Result3);

        // 복합대입연산자
        // += : 오른쪽 항의 값을 더해 왼쪽 변수에 대입
        // -= : 오른쪽 항의 값을  빼 왼쪽 변수에 대입
        // *= : 오른쪽 항의 값을 곱해 왼쪽 변수에 대입
        // /= : 오른쪽 항의 값을 나누기해 왼쪽 변수에 대입
        // %= : 오른쪽 항의 값을 나눠 그 나머지를 왼쪽 변수에 대입


        int NumA = 10;
        NumA += 2; // NumA = NumA(10) + 2; 12
        System.out.println(NumA);

        NumA -= 2; //  NumA = NumA(12) - 2; 10
        System.out.println(NumA);

        NumA *= 2; //  NumA = NumA(10) * 2; 20
        System.out.println(NumA);

        NumA /= 2; //  NumA = NumA(20) / 2; 10
        System.out.println(NumA);

        NumA %= 2; //  NumA = NumA(10) % 2; 0
        System.out.println(NumA);

        // 조건 연산자
        // 조건식 ? True : False
        int Last = (5>3)? 0 : 1;
        System.out.println(Last);

        // 언니와 동생의 나이를 각각 변수로 만들어 주세요.
        // Result4 = 조건식? T F

        int Old1 = 35;
        int Old2 = 28;
        String Result4 =(Old1 > Old2) ? "True" : "False";
        System.out.println(Result4);








































    }
}

