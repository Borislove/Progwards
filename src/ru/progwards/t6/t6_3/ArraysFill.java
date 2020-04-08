package ru.progwards.t6.t6_3;

import java.util.Arrays;

//Arrays.fill  заполнить массив значениями
public class ArraysFill {

    public static void main(String[] args) {

        int[] arrayInt = new int[5];
        System.out.println(Arrays.toString(arrayInt)); //вывод пустого массив

        Arrays.fill(arrayInt, -1); //заполнили значениями
        System.out.println(Arrays.toString(arrayInt));
    }
}
