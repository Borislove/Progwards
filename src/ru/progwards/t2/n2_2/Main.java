package ru.progwards.t2.n2_2;

// TODO: 03.02.2020 точно в этой теме? 
//N2.4 БНФ, константы, операторы, приоритеты
//Примеры объявления констант

public class Main{

    public static final int DAYS_IN_WEEK = 7;
    private static final int HOURS_IN_DAY = 24;
    static final int MINUTES_IN_HOUR = 60;

    //final int SECONDS_IN_MINUTE = 60;  //без статик ошибка будет
    public static void main(String[] args) {
        final int SECONDS_IN_MIN = 60;

        System.out.print("Секунд в сутках: ");
        System.out.println(MINUTES_IN_HOUR*HOURS_IN_DAY*SECONDS_IN_MIN);

        System.out.print("Секунд в неделе: ");
        System.out.println(MINUTES_IN_HOUR * HOURS_IN_DAY*DAYS_IN_WEEK*SECONDS_IN_MIN);

        System.out.print("Секунд в часе: ");
        System.out.println(SECONDS_IN_MIN* MINUTES_IN_HOUR);

    }
}
