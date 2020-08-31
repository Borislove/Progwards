package ru.progwards.t14.t14_1;

import java.util.ArrayDeque;

//Пример организации цикла без isEmpty
public class ArrayDequeExample2 {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= 5; i++)
            deque.offer(i);

        System.out.println(deque);

        Integer element;
        while ((element = deque.poll()) != null) {
            System.out.println("Убрали: " + element);
            System.out.println("deque = " + deque);
        }
    }
}
