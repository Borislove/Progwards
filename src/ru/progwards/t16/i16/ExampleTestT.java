package ru.progwards.t16.i16;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//Напишите метод, с сигнатурой ZonedDateTime parseZDT(String str),
// который возвращает ZonedDateTime, парся строку вида "01.01.2020 16:27:14.444 +0300 Moscow Standard Time"
public class ExampleTestT {

    ZonedDateTime parseZDT(String str){
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss.SSS Z zzzz", Locale.US);
        ZonedDateTime dateTime1 = ZonedDateTime.parse(str, formatter1);

        return dateTime1;
    }
    }

