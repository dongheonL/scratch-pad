package Practice;

import java.util.Scanner;

public class test9 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

//        // for
//        for(초기화; 조건; 증가/감소)
//        {
//
//        }
//
//        while(조건)
//        {
//
//        }
//        int Sum = 0;
//
//        for(int I = 1; I<=10; I++)
//        {
//
//            Sum += I;
//
//        }
//        System.out.println(Sum);

//        for (int I = 1; I<=100; I++)
//        {
//            if ((I%2) ==0)
//            {
//                System.out.println(I);
//            }
//        }

//        System.out.println("출력할 구구단을 입력하세요");
//        String X = input.nextLine();
//        int Dan = Integer.parseInt(X);
//
//        for( int I = 1; I <= 9; I++)
//        {
//            System.out.println(Dan + "X" + I + "=" + Dan * I);
//        }

        //중첩 for문

//        for(int D = 1; D <= 9; D++)
//        {
//            System.out.println("\n" + D + "단");
//            for(int X = 1; X <= 9 ; X++)
//            {
//                System.out.println(D + "X" + X + ":" + D*X);
//
//            }
//        }

//        for(int c =1; c<=3; c++) //3줄 만들기
//        {
//         for(int e = 1; e<=4; e++) // 4번 별을 출력하기위함
//         {
//             System.out.print("*");
//
//         }
//            System.out.println("*");
//        }

        for( int i = 1; i<=4; i++)
        {

            for(int j = 0; j<i ; ++j)
            {
                System.out.print("*");
            }
            System.out.println();


        }


























    }
}
