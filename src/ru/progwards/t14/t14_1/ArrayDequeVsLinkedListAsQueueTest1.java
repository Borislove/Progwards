package ru.progwards.t14.t14_1;

import java.util.ArrayDeque;
import java.util.LinkedList;

//Тест на добавление с установкой capacity
public class ArrayDequeVsLinkedListAsQueueTest1 {
    static final int ITERATIONS = 50_000_000;

    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(ITERATIONS);
        LinkedList<Integer> linkedList = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) arrayDeque.offer(i);
        System.out.println("Наполнение ArrayDeque: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) linkedList.offer(i);
        System.out.println("Наполнение LinkedList: " + (System.currentTimeMillis() - start));
    }
}

/*Наполнение ArrayDeque: 939
Наполнение LinkedList: 18143*/
