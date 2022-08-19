public class Test {
    public static void main(String[] args) {
        Person a =new Person();


     a.age = 28;
     a.isMarried =false;
     a.name = "동헌";

     a.introduce();
     a.age++;
     a.introduce();



    }
}

class Person{
    int age = this.age;
    boolean isMarried = this.isMarried;
    String name =this.name;

    void introduce(){
        System.out.println("== 자기소개 시작 ==");
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("기혼여부 : %b\n", isMarried);
        System.out.println("== 자기소개 끝 ==");
    }

    void 숨쉬다(){
        System.out.println("숨쉬다다");    }
}

