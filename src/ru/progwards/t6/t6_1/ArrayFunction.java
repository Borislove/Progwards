package ru.progwards.t6.t6_1;

import java.util.Arrays;

//перебор всех элементов массива
public class ArrayFunction {

    private static void printArray(int[] intArray) {
        // System.out.println(intArray.length);
        // System.out.println(intArray.toString());
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Элемент номер " + i + " = " + intArray[i]);

        }
        System.out.println();
    }

    public static void main(String[] args) {

    /*int[] simpleArray1 = {21,34,55,89,144};
    printArray(simpleArray1);*/

        int[] intArray = {1, 2, 3, 4};
        printArray(intArray);
        System.out.println(Arrays.toString(intArray));

        int[] simpleArray3 = new int[5];
        //printArray(simpleArray3);
    }
}
