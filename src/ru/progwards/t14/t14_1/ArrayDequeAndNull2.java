package ru.progwards.t14.t14_1;

import java.util.ArrayDeque;

//Пустая очередь: peek и poll
public class ArrayDequeAndNull2 {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        try {
            System.out.println("Пытаемся посмотреть первый элемент пустой очереди через peek");
            System.out.println("Первый элемент очереди = "+deque.peek());
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            System.out.println("Пытаемся взять элемент из пустой очереди через poll");
            System.out.println("Взят элемент очереди = "+deque.poll());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
