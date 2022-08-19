package Practice;

import java.util.Random;
import java.util.Scanner;

public class test10 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Random random =new Random();
       // for while break


//        변수를 불린타입으로 만들어 true를 주고,
//        정수 타입의 변수를 하나 만들어 0
//            을 대입합니다
//
//        int X = 0;
//        boolean Y = true;
//        while(Y)
//        {
//            System.out.println(X);
//            if (X == 5)
//            {
//                 Y = false;
//
//            }
//            X++;
//        }

        // break
//        int X = 0;
//        boolean Y = true;
//        while(Y)
//        {
//            System.out.println(X);
//            if (X == 5)
//            {
//                break;
//            }
//            X++;
//        }
        // for 사용
        // 1-10까지 반복되는데 5가 되면 break를 사용해 반복을 멈춤

//        for(int X = 1; X<=10;X++)
//        {
//            System.out.println(X);
//            if(X==5)
//            {
//                break;
//            }
//        }
//        int Sum = 0;
//        for(int X = 1; X<=10; X++)
//        {
//            Sum += X;
//            if(Sum>10)
//            {
//                break;
//            }
//
//            System.out.println("숫자 : " + X);
//            System.out.println("합 : " + Sum);
//        }



        // continue
//                int X = 0;
//        while(X <= 10)
//        {
//            X++;
//            if( X == 5)
//            {
//                continue;
//            }
//            System.out.println(X);

            // 1-10까지의 수를 더하는데 홀수일때 더하고 짝수일때는 더하지않는 프로그램

//            int Sum = 0;
//            for(int Y = 1; Y<=10; Y++)
//            {
//
//                if(Y % 2 ==0)
//                {
//                    continue;
//                }
//                Sum += Y;
//                System.out.println("숫자 :" +Y);
//                System.out.println("합 : " + Sum);
//            }

//            for(int I = 1; I<=9; I++)
//            {
//                if(I%2 == 0)
//                {
//                    continue;
//                }
//                for(int J = 1; J<=9; J++)
//                {
//
//                    System.out.println(I + "X" + J + ":" + I*J);
//                }
//
//                System.out.println();
//
//
//            }

//            int n =1;
//            while(n >=10)
//            {
//                System.out.println("while : " + n);
//                n++;
//            }
//
//            n = 1;
//            do{
//                System.out.println("do :" + n);
//                n++;
//            }
//            while(n>11);

//            int number = 0;
//
//            do{
//                System.out.println("숫자를 입력해주세요 : ");
//                number = input.nextInt();
//            }
//            while(number != 0);
//        System.out.println("반복문 종료");
        //String I;

//        do
//        {
//            System.out.println("반복을 종료하시겠습니까? o x 를입력해주세요");
//            I = input.nextLine();
//        }
//            while(I.equals("x"));
//        {
//            System.out.println("반복을 종료합니다");
//        }

        // random

//        int number = random.nextInt(100);
//        System.out.println(number);
//
//
//        int i = 1;
//        while(i<11)
//        {
//            int x = random.nextInt(10);
//            System.out.println(x);
//            i++;
//        }
        // do while
        // 0 - 10 까지의 난수를 두개 만들어 줍니다.

//        do{
//
//        int x = random.nextInt(10);
//        int y = random.nextInt(10);
//        int sum = x + y;
//
//        System.out.print(x + "+" + y + "=");
//        int result = input.nextInt();
//        if (sum == result){
//            System.out.println("정답입니다.");
//        }
//        else
//        {
//            System.out.println("정답이 아닙니다.");
//        }
//        System.out.println("계속하시겠습니까? (Yes, No)");
//        String a = input.next();
//
//        if (a.equals("No")) {
//            System.out.println("게임끝");
//            break;
//        }
//        }
//
//        while(true);


//        // do while 사용
//        불린타입의 변수를 만들어 true
//            돈을넣어주세요 : 1500
//                    money <=0
//                            돈이부족합니다
////        불린 타입의 변수를 false 로 바꿔 반복 멈추기
//        money -= 500

//        boolean State = true;
//        System.out.println("넣어줄 돈을 입력해주세요");
//        int Money = input.nextInt();
//        do {
//            if(Money<=0)
//            {
//                System.out.println("돈이 부족합니다.");
//                State = false;
//            }
//            else
//            {
//                Money -= 500;
//            }

        boolean state = true;
        System.out.print("돈을 넣어주세요 : ");
        int money = input.nextInt();

        do{

            if(money <= 0){
                System.out.println("돈이 부족합니다.");
                state = false;
            }else{
                money -= 500;

                int num1 = random.nextInt(10);
                int num2 = random.nextInt(10);
                int sum = num1 + num2;

                System.out.print(num1 + " + " + num2 + " = ");

                int result = input.nextInt();

                if(sum == result){
                    System.out.println("정답입니다.");
                }else{
                    System.out.println("정답이 아닙니다.");
                }

                System.out.println("money : " + money);
            }
        }while(state);

















































    }
}
