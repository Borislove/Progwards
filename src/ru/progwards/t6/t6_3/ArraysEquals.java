package ru.progwards.t6.t6_3;

import java.util.Arrays;

//проверка на равенство Arrays.equals()
public class ArraysEquals {

    public static void main(String[] args) {

        int[] arrayInt1 = {1, 2, 3, 4, 5};
        int[] arrayInt2 = {5, 4, 3, 2, 1};
        int[] arrayInt3 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.equals(arrayInt1, arrayInt2)); //false
        System.out.println(Arrays.equals(arrayInt1, arrayInt3)); //true
    }
}
