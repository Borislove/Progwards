package ru.progwards.t6.t6_3;

import java.util.Arrays;

public class ArraysToString {

    public static void main(String[] args) {

        byte[] arrayByte = {1,2,3,4,5};
        double[] arrayDouble = {-9E5,0,-123.456789,Math.PI,55.555};
        String[] arrayString = {"Arrays.toSTring()", "удобно", "выводить","массив", "на консоль"};

        System.out.println(Arrays.toString(arrayByte));
        System.out.println(Arrays.toString(arrayDouble));
        System.out.println(Arrays.toString(arrayString));

        System.out.println(java.util.Arrays.toString(arrayString)); //можно так
    }
}
