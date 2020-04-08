package ru.progwards.t6.t6_3;

import java.util.Arrays;

//Копирование массивов System.arraycopy()
public class ArrayArrayCopy {
    public static void main(String[] args) {

        int[] arrayInt = {-7, 5, 0, 58, -1};
        int[] arrayIntCopy = new int[arrayInt.length];

        //название массива ,0 позиция массива
        System.arraycopy(arrayInt, 0, arrayIntCopy, 0, arrayInt.length);

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));

        arrayInt[0] = 55555;

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));
    }
}
