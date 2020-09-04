package ru.progwards.t16.t16_2;


import java.time.Clock;
import java.time.Instant;

public class ExampleInstant {
    public static void main(String[] args) {

        Instant instant = Instant.now();

        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());

        System.out.println(instant.toEpochMilli());

        System.out.println(Clock.systemDefaultZone().instant()); // instant.now() эквивалент
    }
}
