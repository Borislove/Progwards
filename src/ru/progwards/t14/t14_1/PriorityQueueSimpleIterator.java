package ru.progwards.t14.t14_1;

import java.util.Iterator;
import java.util.PriorityQueue;

//Итератор не гарантирует порядка сортировки
public class PriorityQueueSimpleIterator {
    public static void main(String[] args) {
        PriorityQueue<Integer> priQueue = new PriorityQueue<>();
        priQueue.offer(144);
        priQueue.offer(21);
        priQueue.offer(377);
        priQueue.offer(89);
        priQueue.offer(34);
        priQueue.offer(233);
        priQueue.offer(55);

        System.out.println("iterator:");
        Iterator<Integer> it = priQueue.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        System.out.println("\npoll:");
        while (!priQueue.isEmpty()) {
            System.out.println(priQueue.poll());
        }
    }
}
