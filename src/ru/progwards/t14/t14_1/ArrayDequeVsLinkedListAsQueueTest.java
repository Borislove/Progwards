package ru.progwards.t14.t14_1;

import java.util.ArrayDeque;
import java.util.LinkedList;

//Тест на добавление: ArrayDeque и LinkedList
public class ArrayDequeVsLinkedListAsQueueTest {
    static final int ITERATIONS = 50_000_000;

    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) arrayDeque.offer(i);
        System.out.println("Наполнение ArrayDeque: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) linkedList.offer(i);
        System.out.println("Наполнение LinkedList: " + (System.currentTimeMillis() - start));
    }
}


/*Наполнение ArrayDeque: 1552
Наполнение LinkedList: 17881*/