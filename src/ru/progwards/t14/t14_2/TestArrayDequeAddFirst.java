package ru.progwards.t14.t14_2;

import java.util.ArrayDeque;

//Тест на добавление в начало ArrayDeque
public class TestArrayDequeAddFirst {
    static final int ITERATIONS = 50_000_000;

    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque1 = new ArrayDeque<>();
        ArrayDeque<Integer> arrayDeque2 = new ArrayDeque<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) arrayDeque1.offer(i); //аналог offerLast(i)
        System.out.println("Добавление в конец: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) arrayDeque2.offerFirst(i);
        System.out.println("Добавление в начало: " + (System.currentTimeMillis() - start));
    }
}


/*Добавление в конце: 1651
Добавление в начало: 1729*/

/*Добавление в конец: 1642
Добавление в начало: 1658*/

