package ru.progwards.t16.i16;

import java.time.Instant;

//Создайте метод с сигнатурой Instant createInstant(), который возвращает Instant,
// соответствующий 1 января 2020 года, 15 часов и одна наносекунда по Московскому времени
public class Example3 {
    Instant createInstant(){
        java.time.LocalDateTime time = java.time.LocalDateTime.of(2020,1,1,15,0,0,1);

        return time.toInstant(java.time.ZoneOffset.of("+03:00:00"));
    }
}
