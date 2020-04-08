package ru.progwards.t2.n2_4;

//через флоат , остаток от деления
public class Main4 {

    public static void main(String[] args) {

        final float DAYS_IN_ASTRO_YEAR = 365.24219878F;
        final float DAYS_IN_WEEK = 7;

        float daysRemainder = DAYS_IN_ASTRO_YEAR % DAYS_IN_WEEK;

        System.out.print("В году 52 недели и ");
        System.out.print(daysRemainder);
        System.out.println(" день");
    }
}







