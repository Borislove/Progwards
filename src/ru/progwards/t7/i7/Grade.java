package ru.progwards.t7.i7;

public class Grade {


    enum grades {
        VERYBAD,
        BAD,
        SATISFACTORILY,
        GOOD,
        EXCELLENT,
        NOTDEFINED
    }

    static Grade intToGrade(int grade) {

        //       String casic = String.valueOf(grade);
        //casic.toString();
        //String casic2 = casic2.toString(String.valueOf(grade));
//        Grade.grade
        switch (grade) {
            case 1:
                grades mTypes22 = grades.VERYBAD;
                System.out.println(mTypes22);
                break;
            case 2:
                grades mTypes223 = grades.BAD;
                System.out.println(mTypes223);
                break;
            case 3:
                grades mTypes22232 = grades.SATISFACTORILY;
                System.out.println(mTypes22232);
                break;
            case 4:
                grades mTypes3123213 = grades.GOOD;
                System.out.println(mTypes3123213);
                break;

            case 5:
                grades mTypes3123123 = grades.EXCELLENT;
                System.out.println(mTypes3123123);
                break;
            default:
                grades mTypes234234134 = grades.NOTDEFINED;
                System.out.println(mTypes234234134);
        }

        return null;
    }

    public static void main(String[] args) {
        intToGrade(4);
        intToGrade(1);
        intToGrade(2);
        intToGrade(3);
        intToGrade(4);
        intToGrade(5);
        intToGrade(6);
        intToGrade(0);
        intToGrade(-1);
    }
}


/*Создайте метод, возвращающий значение enum Grade по числовой оценке.
Сигнатура метода static Grade intToGrade(int grade)

Соответствие оценок

1 - VERYBAD
2 - BAD
3 - SATISFACTORILY
4 - GOOD
5 - EXCELLENT
все остальное NOTDEFINED

Например, intToGrade(4) должно вернуть GOOD

*/