package ru.progwards.t6.t6_3;

import java.util.Arrays;

//Копирование массивов объектов Arrays.copyOf
//Используем классы обёртки
public class ArrayCopyOfObjects {

    public static void main(String[] args) {

        Integer[] arrayInt = {-7, 5, 0, 58, -1};
        Integer[] arrayIntCopy = Arrays.copyOf(arrayInt, arrayInt.length);

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));

        arrayInt[0] = 55555;  //тут срабатывает автоупаковка и автораспаковка

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));
        //-----------------------------------------------------
        int[] arrayInt1 = {57, 55, 10, 538, -132};
        int[] arrayIntCopy1 = Arrays.copyOf(arrayInt1, arrayInt1.length);
        System.out.println(Arrays.toString(arrayInt1));
        System.out.println(Arrays.toString(arrayIntCopy1));
        arrayInt1[0] = 7777;
        arrayInt1[1] = 2222;
        System.out.println(Arrays.toString(arrayInt1));
        System.out.println(Arrays.toString(arrayIntCopy1));
        //   Arrays.fill(arrayInt1,arrayInt1[0]);
        Arrays.fill(arrayInt1, arrayInt1[1]);
        System.out.println(Arrays.toString(arrayInt1));
    }
}
