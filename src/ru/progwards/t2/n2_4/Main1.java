package ru.progwards.t2.n2_4;

//через шорт
public class Main1 {

    public static void main(String[] args) {

        final short DAYS_IN_YEAR = 365;
        final byte DAYS_IN_WEEK = 7;

        double weekInYear = DAYS_IN_YEAR / DAYS_IN_WEEK;

        System.out.print("Недель в году: ");
        System.out.println(weekInYear);
    }
}


