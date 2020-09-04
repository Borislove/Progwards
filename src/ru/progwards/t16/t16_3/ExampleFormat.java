package ru.progwards.t16.t16_3;

import java.text.SimpleDateFormat;
import java.util.Date;

//приведение к строке
public class ExampleFormat {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss.S");
        System.out.println(format.format(new Date()));
    }
}

//04.09.2020 17:53:03.411