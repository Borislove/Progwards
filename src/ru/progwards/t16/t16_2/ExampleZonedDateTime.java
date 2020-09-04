package ru.progwards.t16.t16_2;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExampleZonedDateTime {

    public static void main(String[] args) {

        Instant instant = Instant.now();
        ZonedDateTime zdt = instant.atZone(ZoneId.of("Europe/Moscow"));
        System.out.println(zdt);

        DayOfWeek dow = zdt.getDayOfWeek();
        System.out.println(dow);
    }
}

/*2020-09-04T16:48:25.551643600+03:00[Europe/Moscow]
FRIDAY*/