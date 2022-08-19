package Practice;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 배열(array)

        // 자료형[] 배열이름;

        // 자료형[] 배열이름 = new 자료형[배열의 크기];
        // 자료형 배열이름[] = new 자료형[배열의 크기];
        //배열이름 인덱스
//        int[] Practice.Number;
//        Practice.Number = new int[]{1, 2, 3, 4, 5};
//        System.out.println(Practice.Number[0]);
//        System.out.println(Practice.Number[1]);
//        System.out.println(Practice.Number[2]);
//        System.out.println(Practice.Number[3]);
//        System.out.println(Practice.Number[4]);
//
//        int[] A = {1, 2, 3, 4, 5};
//
//        int[] Arr = new int[5];
//        Arr[0] = 1;
//        Arr[1] = 2;
//        Arr[2] = 5;
//        Arr[3] = 10;
//        System.out.println();
//
//        System.out.println(Arr[0]);
//        System.out.println(Arr[1]);
//        System.out.println(Arr[2]);
//        System.out.println(Arr[3]);
//        System.out.println(Arr[4]);
//        Arr[4] = 100;
//        System.out.println(Arr[4]);
//        System.out.println();
//        for(int I =0; I<5; I++)
//        {
//            System.out.println(Arr[I]);
//        }
//
        //총 다섯명의 학생이 시험을봤는데 시험 점수가 60점이 넘으면
        // 합격이고 , 아니면 불합격입니다

//        int[] Scores = {30, 75, 80, 100, 50};
//
//        for(int I = 0; I < 5; I++) // I < Scores.length; 라고하면 몇개일지 모를때 쓸수있음
//        {
//            System.out.println(Scores[I]);
//
//            if(Scores[I] >= 60)
//            {
//                System.out.println("합격입니다.");
//            }
//            else
//            {
//                System.out.println("불합격 입니다.");
//            }
//        }
//
        //평균 구하기
        //length 사용

//        int Sum = 0;
//        int Result = 0;
//        int[] Test = { 65, 90, 70, 85, 100, 95, 75, 80, 60, 55};
//        for(int I = 0; I <Test.length; I++)
//        {
//            Sum += Test[I];
//            Result = Sum / Test.length;
//
//        }
//        System.out.println("합 : " + Sum);
//        System.out.println("평균 " +Result);

        //foreach 반복문
//        for (변수: 배열
//             ) {
//
//        }
//
//        int[] Scores = {30, 75, 80, 100, 50};
//        for(int J:Scores)
//        {
//            if(J >= 60)
//            {
//                System.out.println("합격입니다");
//            }
//            else
//            {
//                System.out.println("불합격입니다");
//            }
//        }

        // 배열의 크기를 입력해주세요

//        System.out.println("배열의 크기를 입력해주세요");
//        int Num =input.nextInt();
//        int[] Scores = new int[Num];
//        for(int I=0; I<Num; I++)
//        {
//            System.out.println((I+1) +"번째 숫자를 입력해주세요 :");
//            Scores[I] = input.nextInt();
//
//        }
//        for(int J = 0; J <Num; J++)
//        {
//            System.out.println(Scores[J]);
//        }


//        int[] Hundred = new int[100];
//        for(int I=0; I< Hundred.length; I++)
//        {
//            Hundred[I] = I + 1;
//           if(Hundred[I] % 2 == 0){
//               System.out.println(Hundred[I]);
//           }
//        }

//
//        char a = 'A';
//        System.out.println((int) a);
//
//        for (int I = 0; I <= 25; I++, a++) {
//            System.out.println(a);
//        }
//        char[] Alphabet = new char[26];
//        char start = 'A';
//
//        for (int I = 0; I < Alphabet.length; I++, start++) {
//            Alphabet[I] = start;
//
//        }
//        for (char one : Alphabet) {
//            System.out.println(one + " :" + (int) one);
//        }
//
//
//        int i = 1;
//        while (i <= 5) {
//            System.out.println("i : " + i);
//            i++;
//        }
//        int j =-100;
//        while(j<=25)
//        {
//            System.out.println(j);
//            j++;
//        }
//
//        int sum= 0;
//        int x = 1;
//        while (x<=5)
//        {
//            sum += x;
//            x++;
//        }
//        System.out.println(sum);

//        int i = 1;
//
//        while(i<=10)
//        {
//            System.out.println("i :" + i);
//            int j = 1;
//            while(j <=3)
//            {
//                System.out.println("j :" +j);
//                int k=1;
//                while (k <=3) {
//                    System.out.println("k :" + k);
//                    k++;
//                }
//                j++;
//            }F
//            i++;
//        }

        for(int i=1; i<=9; i++)
        {
            System.out.println("=====" + i +"단 =====");
            for(int j = 1; j<=9; j++)
            {
                System.out.println(i + "X" + j +":"+ i*j);
            }
        }



    }
}
