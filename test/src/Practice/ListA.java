package Practice;

import java.util.*;

public class ListA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //배열

        //배열의 길이가 정해져있다 단점
        int[] arr = new int[10];

        arr[0] = 10;

        for (int i = 0, j = 1; i < 10; i++, j++) {
            arr[i] = j;
            System.out.println(i);
        }

        for (int a : arr) {
            System.out.println(a);
        }
        // 길이가 정해져 있지 않다.
        // List<자료형> 배열이름 = new ArrayList<자료형>(배열의 길이)

        List<String> test = new ArrayList<>();
        // 값을 저장
        test.add("문자");
        test.add("숫자");
        test.add("논리");
        System.out.println(test);
        //특정 인덱스 값 저장
        test.add(0, "첫번째");
        System.out.println(test);

        // 특정 값 바꾸기
        test.set(2, "바꾸고자 하는 값");
        System.out.println(test);

        //특정 인덱스 값 삭제
        test.remove(0);
        System.out.println(test);

        //특정 인덱스 값 가지고 오기
        System.out.println(test.get(0));

        //리스트 안에 요소 개수
        System.out.println(test.size());

        // 값이 몇번 인덱스에 위치하는지 찾을때
        System.out.println(test.indexOf("논리"));
        System.out.println(test.lastIndexOf("논리"));

        //값이 리스트에 있는지 확인할 때
        System.out.println(test.contains("문자"));

        //리스트 비우기
        test.clear();
        System.out.println(test);

        //배열을 list로 만들어 주는데, while을 사용해 값을 입력받아줍니다.
        // 입력받은 값을 배열에 저장하는데 만약에 0 을 입력했다면 반복을 멈춰주세요.
//
//        List<Integer> numbers = new ArrayList<>();

//
//
//        while (true){
//            System.out.print("값을 입력하세요");
//            int num = input.nextInt();
//            if( num == 0)
//            {
//                System.out.println("종료합니다.");
//                break;
//            }
//            else
//            {
//                numbers.add(num);
//            }
//        }
//
//        for(int number : numbers)
//        {
//            System.out.println(number);
//        }


        List<String> names = new ArrayList<>();
        boolean status = false;

        for(int i = 1; i<=5; i++)
        {
            System.out.print("이름을 입력해 주세요 : ");
//            String name = input.nextLine();
//            names.add(name);
            names.add(input.nextLine());
        }
        System.out.print("찾고자 하는 성씨를 입력해주세요 :");
        String firstName = input.nextLine();

        for(String name : names)
        {// startsWith: 문자열이 인자로 넣은 문자로 시작하는지 아닌지를 판단해
            // true / false 로 반환
            if(name.startsWith(firstName))
            {
                System.out.println(name);
                status = true;
            }
        }
        if(!status)
        {
            System.out.println("찾으시는 성씨는 존재하지않습니다.");
        }









    }

}
