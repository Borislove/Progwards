package ru.progwards.t16.i16;

//Укажите формат для правильного вывода java.util.Date в виде "04.01.2020 15:58:37.346". Формат укажите в двойных кавычках, как строка в Java - "aa bb"

//Укажите формат для правильного вывода java.util.Date в виде "От'езд - суббота 04 января в 4PM". Формат укажите в двойных кавычках, как строка в Java - "aa bb"

import java.text.SimpleDateFormat;
import java.util.Date;

//Укажите формат для правильного вывода java.time.Instant стандартного вида "2020-01-04T13:21:42.173042400Z". Формат укажите в двойных кавычках, как строка в Java - "aa bb"
public class ExampleTest {

    public static void main(String[] args) {

        System.out.println(new SimpleDateFormat("dd.MM.yyyy HH:mm:ss.S").format(new Date()));

        System.out.println(new SimpleDateFormat("'От''езд' - EEEE dd MMMM 'в' ha").format(new Date()));

        System.out.println("yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'");
    }

}
