package ru.progwards.t14.t14_2;

import java.util.*;

//Чтение из PriorityQueue и ArrayList
public class PriorityQueueTestRead {
    static final int ELEM_COUNT = 5_000_000;

    public static void main(String[] args) {
        Queue<Double> priQueue = new PriorityQueue<>();
        ArrayList<Double> arrayList = new ArrayList<>();

        Random rnd = new Random();
        for (int i = 0; i < ELEM_COUNT; i++) priQueue.offer(rnd.nextDouble());
        for (int i = 0; i < ELEM_COUNT; i++) arrayList.add(rnd.nextDouble());
        Collections.sort(arrayList);

        long start = System.currentTimeMillis();
        for (int i = 0; i < ELEM_COUNT; i++) priQueue.poll();
        System.out.println("Чтение элементов из PriorityQueue: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < ELEM_COUNT; i++) arrayList.get(i);
        System.out.println("Чтение элементов из ArrayList: " + (System.currentTimeMillis() - start));
    }
}

/*Чтение элементов из PriorityQueue: 6135
Чтение элементов из ArrayList: 6*/