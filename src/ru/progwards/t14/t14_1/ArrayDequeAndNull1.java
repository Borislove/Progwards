package ru.progwards.t14.t14_1;

import java.sql.SQLOutput;
import java.util.ArrayDeque;

//Пустая очередь: element и remove
public class ArrayDequeAndNull1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        try {
            System.out.println("Пытаемся посмотреть первый элемент пустой очереди через element");
            System.out.println("Первый элемент очереди = "+deque.element());
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            System.out.println("Пытаемся взять элемент из пустой очереди через remove");
            System.out.println("Взят элемент очереди = "+deque.remove());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
