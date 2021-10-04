package ru.progwards.t6.t6_1;

import java.util.Arrays;

//Передача массива параметром функции
public class ArrayExamples1 {
    private static void printArray(int[] intArray) {
        System.out.println(Arrays.toString(intArray));
        //код функции
    }

    public static void main(String[] args) {
        int[] simpleArray1 = {21, 34, 55, 89, 144};
        printArray(simpleArray1);
    }
}
