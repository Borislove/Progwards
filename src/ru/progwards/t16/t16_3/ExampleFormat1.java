package ru.progwards.t16.t16_3;

import java.text.SimpleDateFormat;
import java.util.Date;

//Приведение к строке
public class ExampleFormat1 {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("EEEE dd MMMMM yyyy,HH:mm zzzz");
        System.out.println(format.format(new Date()));
    }
}
