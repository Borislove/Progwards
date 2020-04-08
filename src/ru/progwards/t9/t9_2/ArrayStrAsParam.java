package ru.progwards.t9.t9_2;

import java.util.Arrays;

//Массив строк как параметр
public class ArrayStrAsParam {
    static void arrayAsParam(String[] strArray) {
        strArray[0] = "Строка2019";
    }

    public static void main(String[] args) {
        String[] strArray = {"Строка1", "Строка2", "Строка3", "Строка4", "Строка5"};
        System.out.println(Arrays.toString(strArray));
        arrayAsParam(strArray);
        System.out.println(Arrays.toString(strArray));
    }
}


