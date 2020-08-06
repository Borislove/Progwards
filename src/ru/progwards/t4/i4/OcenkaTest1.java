package ru.progwards.t4.i4;
/*Создайте метод, возвращающий значение enum Grade по числовой оценке.
Сигнатура метода static Grade intToGrade(int grade)

Соответствие оценок

1 - VERYBAD
2 - BAD
3 - SATISFACTORILY
4 - GOOD
5 - EXCELLENT
все остальное NOTDEFINED

Например, intToGrade(4) должно вернуть GOOD*/


//что то пошло не так...
enum Kinds1 {   //виды оценок
    NOTRATED("не оценено"),      //0 - не оценено
    VERYBAD("очень плохо"),      //1..20 - очень плохо
    BAD("плохо"),          //21..40 - плохо
    SATISFACTORY("удовлетворительно"), //41..60 - удовлетворительно
    GOOD("хорошо"),         //61..80 - хорошо
    EXELLENT("отлично");      //81..100 - отлично

    private String stri;

    Kinds1(String stri) {
        this.stri = stri;
    }

    public String getStri() {
        return stri;
    }
}

public class OcenkaTest1 {

    static String textGrade(int grade) {
        String str = "";

        for (; grade == 0; ) {
            System.out.println(Kinds1.NOTRATED);
            break;
        }

        for (; grade <= 20 && grade > 1; ) {
            System.out.println(Kinds1.VERYBAD);
            break;
        }

        for (; grade <= 40; ) {
            System.out.println(Kinds1.BAD);
            break;
        }

        for (; grade <= 60; ) {
            System.out.println(Kinds1.SATISFACTORY);
            break;
        }

        for (; grade <= 80; ) {
            System.out.println(Kinds1.GOOD);
            break;
        }

        for (; grade <= 100; ) {
            System.out.println(Kinds1.EXELLENT);
            break;
        }
        return str;
    }

    public static void main(String[] args) {
        //    textGrade(0);
        // textGrade(10);
        textGrade(21);
    }
}







