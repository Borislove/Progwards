package ru.progwards.t14.t14_2;

import java.util.*;

//Тестирование PriorityQueue,TreeSet,ArrayList
public class PriorityQueueTest {
    static final int ELEM_COUNT = 5_000_000;

    public static void main(String[] args) {
        Queue<Double> priQueue = new PriorityQueue<>();
        SortedSet<Double> treeSet = new TreeSet<>();
        ArrayList<Double> arrayList = new ArrayList<>();

        Random rnd = new Random();

        long start = System.currentTimeMillis();
        for (int i = 0; i < ELEM_COUNT; i++) priQueue.offer(rnd.nextDouble());
        System.out.println("Добавление в PriorityQueue: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < ELEM_COUNT; i++) treeSet.add(rnd.nextDouble());
        System.out.println("Добавление в TreeSet: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < ELEM_COUNT; i++) arrayList.add(rnd.nextDouble());
        Collections.sort(arrayList);
        System.out.println("Добавление и сортировка в ArrayList: " + (System.currentTimeMillis() - start));
    }
}

/*Добавление в PriorityQueue: 401
Добавление в TreeSet: 6441
Добавление и сортировка в ArrayList: 3035*/