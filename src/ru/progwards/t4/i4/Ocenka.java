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


public class Ocenka {

    static String textGrade(int grade) {

        //Integer a = new Integer(grade);

        String c = "";   //возврат к пустой строке!!!ага ...веселье еще то
        if (grade == 0) {
            //System.out.println(grade + " не оценено");
            System.out.println("не оценено");
        }

        if (grade >= 1 & grade <= 20) {
            //System.out.println(grade + " очень плохо");
            System.out.println("очень плохо");
        }

        if (grade >= 21 & grade <= 40) {
            //System.out.println(grade + " плохо");
            System.out.println("плохо");
        }

        if (grade >= 41 & grade <= 60) {
            //System.out.println(grade + " удовлетворительно");
            System.out.println("удовлетворительно");
        }
        if (grade >= 61 & grade <= 80) {
            //System.out.println(grade + " хорошо");
            System.out.println("хорошо");
        }
        if (grade >= 81 & grade <= 100) {
            //System.out.println(grade + " отлично");
            System.out.println("отлично");
        }

        if (grade < 0 || grade >= 101) {
            //       System.out.println(grade + " не определно"); }
            System.out.println("не определено");
        }
//        String s = "не определено";
        return c;
    }


    public static void main(String[] args) {
        textGrade(82);
        textGrade(900);
        //textGrade(45);
        //textGrade(20);
//        textGrade(19);
//        textGrade(23);
//        textGrade(0);
//        textGrade(90);
//        textGrade(50);
//        textGrade(70);
//        textGrade(102);
//        textGrade(81);
//        textGrade(-32);
//        textGrade(101);
    }
}
