package ru.progwards.t6.t6_3;

import java.util.Arrays;

//Присваивание массивов примитивов
public class ArrayCopy1 {
    public static void main(String[] args) {
        int[] arrayInt = {-7, 5, 0, 58, -1};
        int[] arrayIntCopy = arrayInt;

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));
        arrayInt[0] = 55555; //в индекс 0 занесли значение , т.е присвоили

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayIntCopy));
    }
}
