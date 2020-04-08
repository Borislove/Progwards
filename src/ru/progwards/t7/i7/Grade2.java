package ru.progwards.t7.i7;

public class Grade2 {

    enum Grade {
        VERYBAD,
        BAD,
        SATISFACTORILY,
        GOOD,
        EXCELLENT,
        NOTDEFINED,
    }

    static Grade intToGrade(int grade) {
        switch (grade) {
            case 1:
                System.out.println("ОЧЕНЬ ПЛОХО");
                return Grade.VERYBAD;
            case 2:
                System.out.println("ПЛОХО");
                return Grade.BAD;
            case 3:
                System.out.println("УДОВЛЕТВОРИТЕЛЬНО");
                return Grade.SATISFACTORILY;
            case 4:
                System.out.println("ХОРОШО");
                return Grade.GOOD;
            case 5:
                System.out.println("ОТЛИЧНО");
                return Grade.EXCELLENT;
            default:
                System.out.println("НЕ ОПРЕДЕЛЕНО");
                return Grade.NOTDEFINED;

            // TODO: 17.01.2020 Расширим когда нибудь 
/*
            case 6: perfect - идеально
            case 7: imposible - невозможное*/
//белисимо, браво...хлоп хлоп

        }
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
