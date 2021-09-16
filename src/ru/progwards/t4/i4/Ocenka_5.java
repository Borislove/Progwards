package ru.progwards.t4.i4;

public class Ocenka_5 {

    static String textGrade(int grade) {

        String indefinite = "не определено";
        //0 - не оценено
        System.out.println(grade == 0 ? "не оценено" : indefinite);
        //1..20 - очень плохо
        System.out.println((grade >= 1 && grade <= 20) ? indefinite : "очень плохо");
        //21..40 - плохо
 //       System.out.println((grade >= 21 && grade <= 40) ? indefinite : "плохо");
        //41..60 - удовлетворительно
  //      System.out.println((grade >= 41 && grade <= 60) ? indefinite : "удовлетворительно");
        //61..80 - хорошо
   //     System.out.println((grade >= 61 && grade <= 80) ? indefinite : "хорошо");
        //81..100 - отлично
    //    System.out.println((grade >= 81 && grade <= 100) ? indefinite : "отлично");

        //в остальных случаях - не определено*/
        return indefinite;
    }

    public static void main(String[] args) {

        textGrade(0);
        textGrade(20);
       /* textGrade(20);
        textGrade(30);
        textGrade(40);
        textGrade(50);*/
    }
}
