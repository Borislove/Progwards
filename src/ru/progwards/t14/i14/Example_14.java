package ru.progwards.t14.i14;

//Создайте метод с сигнатурой ArrayDeque<Integer> array2queue(int[] a), который копирует содержимое массива в очередь

import java.util.ArrayDeque;

public class Example_14 {
    ArrayDeque<Integer> array2queue(int[] a) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < a.length; i++) {
            arrayDeque.offer(a[i]);
        }
        return arrayDeque;
    }
}

