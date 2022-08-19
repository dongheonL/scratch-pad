package Practice;

public class Human {

    //오버로드: 메서드의 이름은 같으나 매개변수가 달라야 한다
    public Human(){

    }
    public Human(String name)
    {
        this.name = name;
    }
    private String  name;
    private   int age;
    private boolean married;
    private String job;

    public void setName(String Name)
    {
        // 멤버 변수    = 매개변수
        this.name = Name;
    }
    public String getName(){
        return name;
    }


    public void setAge(int humanAge)
    {
        age = humanAge;
    }
    public int getAge()
    {
        return age;
    }


    public void setMarried(boolean humanMarried)
    {
        married = humanMarried;
    }
    public boolean get(boolean married)
    {
        return  married;
    }



    public void setJob(String humanJob)
    {
        job = humanJob;
    }
    public String get(String job)
    {
        return job;
    }


    public void printinfo(){
        System.out.println("이름 :" + name);
        System.out.println("나이 :" + age);
        System.out.println("결혼여부 :" + married);
        System.out.println("직업 : " + job);
    }

}
