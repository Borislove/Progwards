package ru.progwards.t5.n5_2;

//Пример простого enum
public class Enum {
    enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY,
    }

    //объявление переменной типа enum
    static DayOfWeek day1 = DayOfWeek.MONDAY;
    static DayOfWeek day2 = DayOfWeek.TUESDAY;
    static DayOfWeek day3 = DayOfWeek.WEDNESDAY;
    static DayOfWeek day4 = DayOfWeek.THURSDAY;
    static DayOfWeek day5 = DayOfWeek.FRIDAY;
    static DayOfWeek day6 = DayOfWeek.SATURDAY;
    static DayOfWeek day7 = DayOfWeek.SUNDAY;

    public static void main(String[] args) {

        System.out.println(day1 + " - Понедельник");
        System.out.println(day2 + " - Вторник");
        System.out.println(day3 + " - Среда");
        System.out.println(day4 + " - Четверг");
        System.out.println(day5 + " - Пятница");
        System.out.println(day6 + " - Суббота");
        System.out.println(day7 + " - Воскресенье");
    }
}
