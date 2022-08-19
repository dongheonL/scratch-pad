package Practice;

public class Score {

    public Score(int korean,int math, int english,int social,int science)
    {
        this.korean = korean;
        this.math = math;
        this.english = english;
        this.social = social;
        this. science = science;
    }

    private int korean;
    private int math;
    private int english;
    private int social;
    private int science;

    public int getKorean() {
        return korean;
    }

    public int getMath() {
        return math;
    }

    public int getEnglish() {
        return english;
    }

    public int getSocial() {
        return social;
    }

    public int getScience() {
        return science;
    }
    public int sum(){
        return korean + math + english + social + science;
    }
    public int avg(){
        return (korean + math + english + social + science) / 5;
    }
}
