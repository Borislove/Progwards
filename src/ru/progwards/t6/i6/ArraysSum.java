package ru.progwards.t6.i6;

/*Напишите функцию, суммирующие значения элементов одномерного массива, содержащего целые числа. Сигнатура:
public int sumArrayItems(int[] a)*/

public class ArraysSum {

    private static int[] a = {2, 3, 4, 5, 6, 7};  // sum 27

    public static int sumArrayItems(int[] a) {   // Passed all tests!

        int test = 0;

        for (int value : a)
            //  System.out.println(value);
            test += value;
        //    System.out.println(test);
        return test;
    }

    public static void main(String[] args) {

        sumArrayItems(a);
        System.out.println(java.util.Arrays.toString(a));
    }
}
