package ru.progwards.t14.t14_1;

import java.util.ArrayDeque;

//Очередь на основе ArrayDeque
public class ArrayDequeExample1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= 5; i++)
            deque.offer(i);

        System.out.println(deque);

        while (!deque.isEmpty()) {
            Integer element = deque.poll();
            System.out.println("Убрали: " + element);
            System.out.println(deque);
        }
    }
}
