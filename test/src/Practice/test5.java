package Practice;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("숫자를 입력해주세요");
        //int Practice.Number = input.nextInt();
        String Number2 = input.nextLine();
        int Number3 = Integer.parseInt(Number2); //= Integer.parseInt() 는 Str을 int로 바꿔준다
        boolean Result = (Number3%2) == 0? true : false;
        System.out.println(Result);


    }
}
