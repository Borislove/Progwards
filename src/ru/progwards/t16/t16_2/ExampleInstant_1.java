package ru.progwards.t16.t16_2;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

//вычитаем 20 минут и добавляем 1 день
public class ExampleInstant_1 {
    public static void main(String[] args) {

        Instant instant = Instant.now();
        System.out.println(instant);
        Instant newInst = instant.minus(20, ChronoUnit.MINUTES);
        System.out.println(newInst);
        System.out.println(newInst.plus(1, ChronoUnit.DAYS));
    }
}
