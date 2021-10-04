package ru.progwards.t6.t6_1;

import java.util.Arrays;

public class TestArray_1 {

    public static void main(String[] args) {
        String[] arr = new String[5];
        System.out.println(Arrays.toString(arr));

        String[] arr_1 = {null, "hello", "hello", "test"};
        System.out.println(Arrays.toString(arr_1));
        arr_1[0] = "pizza";
        System.out.println(Arrays.toString(arr_1));

        arr_1[1] = null;
        System.out.println(Arrays.toString(arr_1));
    }
}
