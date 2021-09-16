package ru.progwards.t4.i4;

/*Напишите метод, который возвращает текстовую характеристику оценки по числовой.

0 - не оценено
1..20 - очень плохо
21..40 - плохо
41..60 - удовлетворительно
61..80 - хорошо
81..100 - отлично
в остальных случаях - не определено

Сигнатура метода static String textGrade(int grade)

Например, textGrade(45) должна вернуть "удовлетворительно"*/

public class Ocneka_4 {

    static String textGrade(int grade) {
        //0 - не оценено
        if (grade == 0)
            return "не оценено";

        //1..20 - очень плохо
        else if (grade >= 1 && grade <= 20)
            return "очень плохо";

        //21..40 - плохо
        else if(grade >=21 && grade <=40)
            return "плохо";

        //41..60 - удовлетворительно
        else if(grade >=41 && grade <=60)
            return "удовлетворительно";

        //61..80 - хорошо
        else if(grade >=61 && grade <=80)
            return "хорошо";

        //81..100 - отлично
        else if(grade >=81 && grade <=100)
            return "отлично";

        //в остальных случаях - не определено
        return "не определено";
    }

    public static void main(String[] args) {

        System.out.println(textGrade(0));
        System.out.println(textGrade(1));
        System.out.println(textGrade(22));
        System.out.println(textGrade(30));
        System.out.println(textGrade(40));
        System.out.println(textGrade(50));
        System.out.println(textGrade(60));
        System.out.println(textGrade(70));
        System.out.println(textGrade(80));
        System.out.println(textGrade(90));
        System.out.println(textGrade(100));
        System.out.println(textGrade(101));
        System.out.println(textGrade(90));

    }
}
