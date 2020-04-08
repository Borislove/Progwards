package ru.progwards.t6.t6_3;

import java.util.Arrays;
//Копирование массивов Arrays.copyOf
public class ArrayCopyOf {

    public static void main(String[] args) {

        int[] arrayInt = {-7,5,0,58,-1};
        int[] arrayIntCopy = Arrays.copyOf(arrayInt,arrayInt.length); //имя массива + его длина

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));

        arrayInt[0] = 55555;
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));
    }
}
