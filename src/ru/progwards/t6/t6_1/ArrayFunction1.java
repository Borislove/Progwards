package ru.progwards.t6.t6_1;

import java.util.Arrays;

//Возврат массива функцией
public class ArrayFunction1 {

    public static int[] reverse(int[] originalArray) {

        int[] reversedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[originalArray.length - 1 - i] = originalArray[i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {

        int[] test = {21, 321, 312};
        reverse(test);

        System.out.println(Arrays.toString(reverse(test)));
    }
}
