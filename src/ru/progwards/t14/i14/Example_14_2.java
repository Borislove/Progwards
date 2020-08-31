package ru.progwards.t14.i14;

import java.util.ArrayDeque;

public class Example_14_2 {
    /*Реализуйте метод с сигнатурой int sumLastAndFirst(ArrayDeque<Integer> deque) который
   возвращает сумму первого и последнего элемента очереди. При пустой очереди вернуть 0*/
    //[5, 6, 8, 25, 1, 25, 10, 11]
    public static int sumLastAndFirst(ArrayDeque<Integer> deque){

        if (deque.size() ==  1) {
            return deque.poll() * 2;
        } else if (!deque.isEmpty()){
            return deque.pollFirst() + deque.pollLast();
        } else {
            return 0;
        }

    }
}
