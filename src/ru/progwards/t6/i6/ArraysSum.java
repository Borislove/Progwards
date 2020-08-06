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

    public static int sumArrayItems1(int[] a) {

        int result = 0;
        for (int i = 0; i < a.length; i++) {   // TODO: 21.07.2020  replaceable
            result += a[i];
        }
        return result;
    }


    public static void main(String[] args) {

        sumArrayItems(a);
        System.out.println(java.util.Arrays.toString(a));

        System.out.println(sumArrayItems(a));

        System.out.println(sumArrayItems1(a));
    }
}
//: int a[];, int []a = new int[10];, int []a = {10, 26, 12, 35};, int a[] = {11, 22, 33};
//int item = a[1];, int a[][][];, int a1[], a2[], a3[];
//int a[][] = {a1, a2, a3};,
//int a[][];
//int item = a[1][2];