package ru.progwards.t2.n2_4;

public class Main {

//
    public static void ostOtDeleniya() {
        int DAYS_IN_YEAR = 365;
        int DAYS_IN_WEEK = 7;
        int daysRemainder = DAYS_IN_YEAR % DAYS_IN_WEEK;
        System.out.print("В году 52 недели и ");
        System.out.print(daysRemainder);
        System.out.println(" день");
    }


    public static void main(String[] args) {
        final short DAYS_IN_YEAR = 365;
        final byte DAYS_IN_WEEK = 7;

        //вернулось точное число, а не результат деления
        double weekInYear = DAYS_IN_YEAR / DAYS_IN_WEEK;

        final double DAYS_IN_YEARDOUBLE = 365;
        double weekInYearDOUBLE = DAYS_IN_YEARDOUBLE / DAYS_IN_WEEK;

        System.out.print("Недель в году: ");
        System.out.println(weekInYear);


        System.out.print("Недель в году: ");
        System.out.println(weekInYearDOUBLE);

        ostOtDeleniya();
    }
}
