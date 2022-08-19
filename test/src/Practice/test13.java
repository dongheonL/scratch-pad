package Practice;

import java.util.Scanner;

public class test13 {
    static Scanner input = new Scanner(System.in);
    //메인 함수


    public static void main(String[] args) {
        System.out.println("첫번째 숫자 :");
        int x = input.nextInt();
        System.out.println(("두번째 숫자 :"));
        int y = input.nextInt();
        input.nextLine();
        System.out.println("사칙 연산자를 넣어 주세요");
        String operator = input.nextLine();


        System.out.println(calculator(x, y, operator));

        //호출
        // 함수이름();
        // 재사용성, 중복코드 제거, 관리가 용이함


    }
    //메서드
    // 정의
    // public static 리턴타입 함수이름(){}


    // 매개변수
    // return : 함수 종료, 값 반환


    public static int bigger(int a, int b) {

        int big = a;
        if (a < b) {
            big = b;
        }
        return big;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int calculator(int x, int y, String c) {
        int result = 0;
        switch (c) {
            case "+":
                result = plus(x, y);
                break;
            case "-":
                result = minus(x, y);
                break;
            case "*":
                result = multiply(x, y);
                break;
            case "/":
                result = divide(x, y);
                break;
            default:
                System.out.println("지원하지 않는 연산자 입니다.");



        }
        return result;
    }

// + - * / 메소드만들기
    // calculator()
    // return int
    // 매개변수 x
    // 사용자로부터 숫자 두개를 받아줍니다
    // 첫번째 숫자 : 5
    // 두번째 숫자 : 10
    // 사칙연산 연산자를 넣어 주세요 : +
    // switch-case
    // default : 지원하지 않는 연산자 입니다.
    // sout(calculator());
    // 연산은 위에서 만든 사칙연산 메소드를 사용해 연산합니다


    // 첫번째 숫자 : 5
    // 두번째 숫자 : 10
    // 사칙연산 연산자를 넣어 주세요 : +, -, *, /
    // calculator(5, 10, "+")

}
