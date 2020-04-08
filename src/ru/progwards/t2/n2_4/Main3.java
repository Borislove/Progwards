package ru.progwards.t2.n2_4;

//через инт , остаток от деления
public class Main3 {

    public static void main(String[] args) {

        final int DAYS_IN_YEAR = 365;
        final int DAYS_IN_WEEK = 7;

        int daysRemainder = DAYS_IN_YEAR % DAYS_IN_WEEK;

        System.out.print("В году 52 недели и ");
        System.out.print(daysRemainder);
        System.out.println(" день");
    }
}





