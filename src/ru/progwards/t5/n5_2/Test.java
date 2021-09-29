package ru.progwards.t5.n5_2;

import java.util.Arrays;

public class Test {
    enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY,
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(DayOfWeek.values()));
    }

}
