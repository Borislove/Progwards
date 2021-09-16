package ru.progwards.t4.i4;

public class Ocenka_3 {
    static String textGrade(int grade){
        if(grade ==0)
            return "не оценено";

        if(grade >= 1 && grade <= 20)
            return "очень плохо";

        if(grade >= 21 && grade <= 40)
            return "плохо";

        if(grade >= 41 && grade <= 60)
            return "удовлетворительно";

        if(grade >= 61 && grade <= 80)
            return "хорошо";

        if(grade >= 81 && grade <= 100)
            return "отлично";

        return "не определено";
    }
    public static void main(String[] args) {

    }
}
