package ru.progwards.t16.t16_2;

import java.time.Instant;
import java.time.temporal.ChronoField;
import java.util.Date;

public class Example {
    public static void main(String[] args) {

        Instant instant = Instant.now();
        System.out.println(instant);

        Date date = new Date();
        System.out.println(date);

        System.out.println(instant.getLong(ChronoField.INSTANT_SECONDS));
    }
}
