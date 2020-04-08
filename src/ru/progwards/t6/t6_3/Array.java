package ru.progwards.t6.t6_3;

import java.util.Arrays;

public class Array {

    private static int[] a = {1,2,3,4,5};
    private static int[] b = {1,2,3,4,5};
    private static int[][] ab = {a,b};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ab)); //
        System.out.println("Двумерный массив ab");
        System.out.println(Arrays.deepToString(ab));  //вывод двумерного массива

        System.out.println("Массив a ");
        System.out.println(Arrays.toString(a));
        System.out.println("Массив b ");
        System.out.println(Arrays.toString(a));


    }
}
