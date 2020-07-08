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


public class Ocenka2 {

    static String textGrade(int grade) {

        int resultFalse = 404;

        if(grade==0)
           // System.out.println("не оценено");
            return "не оценено";
        ////////////////////////////////////////////////////////////////////////////////////
        int number_1_20 = grade >= 1 & grade <= 20 ? grade : resultFalse;
        if (grade == number_1_20) {
          //  System.out.println(grade);
          //  System.out.println("очень плохо");
            return "очень плохо";
        }
        ////////////////////////////////////////////////////////////////////////////////////
        int number_21_40 = grade >= 21 & grade <= 40 ? grade : resultFalse;
        if (grade == number_21_40) {
           // System.out.println(grade);
            //System.out.println("плохо");
            return "плохо";
        }
        ////////////////////////////////////////////////////////////////////////////////////
        int number_41_60 = grade >= 41 & grade <= 60 ? grade : resultFalse;
        if(grade == number_41_60){
           // System.out.println(grade);
            //System.out.println("удовлетворительно");
            return "удовлетворительно";
        }
        ////////////////////////////////////////////////////////////////////////////////////
        int number_61_80 = grade >= 61 & grade <= 80 ? grade : resultFalse;
        if(grade == number_61_80){
           // System.out.println(grade);
            //System.out.println("хорошо");
            return "хорошо";
        }
        ////////////////////////////////////////////////////////////////////////////////////
        int number_81_100 = grade >= 81 & grade <= 100 ? grade : resultFalse;
        if(grade == number_81_100){
           // System.out.println(grade);
            //System.out.println("отлично");
            return "отлично";
        }
        return "не определено";
    }

    public static void main(String[] args) {

        textGrade(0);
        textGrade(10);
        textGrade(20);
        textGrade(21);
        textGrade(30);
        textGrade(40);
        textGrade(50);
        textGrade(60);
        textGrade(70);
        textGrade(80);
        textGrade(90);
        textGrade(100);
    }
}
