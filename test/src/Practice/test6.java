package Practice;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // 조건문
        // if(조건식){
        //    실행문
        // }

//        if(true){
//            System.out.println(true);
//        }
//        System.out.println("점수를 입력하세요 >>> ");
//        int Practice.Score = input.nextInt();
//        if(Practice.Score >= 80){
//            System.out.println(Practice.Score +" 점은 합격입니다.");
//        }
//        else{
//            System.out.println(Practice.Score + "점은 불합격입니다.");
//        }
//        System.out.println("나이를 입력해주세요 >>>");
//        int Age = input.nextInt();
//        if(Age>=20){
//            System.out.println(Age + "살은 성인입니다.");
//        }
//        else{
//            System.out.println(Age + "살은 미성년입니다.");
//        }

        System.out.println("나이를 입력해주세요 >>>");
        String Age = input.nextLine();
        int Age2 = Integer.parseInt(Age);
        if(Age2>=20){
            System.out.println(Age + "살은 성인입니다.");
        }
        else{
            System.out.println(Age + "살은 미성년입니다.");
        }



    }
}
