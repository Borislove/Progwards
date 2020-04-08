package ru.progwards.t8.t8_1;

import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {

        String str = "Зачем";
        System.out.println(str.hashCode());
        str = "нужны";
        System.out.println(str.hashCode());
        str = "хеш-таблицы?";
        System.out.println(str.hashCode());
        str = "Чтобы";
        System.out.println(str.hashCode());
        str = "поиск";
        System.out.println(str.hashCode());
        str = "летал";
        System.out.println(str.hashCode());
        str = "как";
        System.out.println(str.hashCode());
        str = "птица";
        System.out.println(str.hashCode());


        String strArray[] = {"Зачем", "нужны", "хеш-таблицы?", "Чтобы", "поиск", "летал", "как", "птица"};
        System.out.println(Arrays.toString(strArray));
        for (String value : strArray) {
            System.out.println(value + " " + value.hashCode());
        }
    }
}
