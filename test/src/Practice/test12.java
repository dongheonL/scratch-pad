package Practice;

public class test12 {
    static int Plus(int Num1, int Num2){

         int Result = Num1 + Num2;
        return Result;}

    static void printName(){
        System.out.println("자바는 재밌다");
    }

    static void printLan(String language){
        System.out.println(language + "는 재미있어");
    };
    static int ten(){
        return 10;
    }
    static int min(int A, int B){

        return A - B;
    }
    static int Produck(int A, int B){
       return A * B;
    }

    static void Divide(int A, int B){
        System.out.println(A / B);
    }

    public static void main (String[]args){

       // 함수반환형 함수이름 (매개변수) { return }

        int result = Plus(3, 5);
        System.out.println(result);
        printName();
        printLan("멍때리기");
        int number = ten();
        System.out.println(number);
        int result2 =min(5,3);
        System.out.println(result2);
        int result3 =Produck(5,3);
        System.out.println(result3);

        Divide(10,2);

























    }

}
