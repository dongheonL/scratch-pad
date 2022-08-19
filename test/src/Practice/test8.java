package Practice;

import com.sun.jdi.connect.Connector;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

// while(조건식){
//     수행문
// }
//        while(true){
//            System.out.println("hi");
//        }

//        int N = 1;
//        int Sum = 0;
//        while(N<=10){
//
//            Sum += N;
//            N++;
//        }
//        System.out.println("1부터 10까지 더한 값은" + Sum + "입니다");

//        int I = 1;
//
//        while(I<=10){
//
//            System.out.println(I);
//            I++;
//        }
//
        // 1부터 100까지 짝수만 출력
//        int J = 1;
//        while (J<=100){
//
//            if ((J%2) ==0){
//                System.out.println(J);
//
//            }
//            J++;
//
//        }
// 중첩 while
//        int I = 2;
//
//
//        while(I<=9){
//
//            int J = 1;
//
//            while(J<=9){
//                System.out.println(I + "X" + J + "=" + I*J);
//                J += 1;
//            }
//            I += 1 ;
//
//
//
//        }

        System.out.println("얼마를 넣으시겠습니까?");
        String Money = input.nextLine();
        int Money1 = Integer.parseInt(Money);

       int I = 0;
        while(Money1>=300)
        {
            I +=1;
            Money1 -= 300;
            System.out.println("커피" + I +"잔, 잔돈" + Money1 + "원");
        }


































    }
}
