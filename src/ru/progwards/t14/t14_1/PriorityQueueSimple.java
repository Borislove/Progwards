package ru.progwards.t14.t14_1;

import java.util.PriorityQueue;

//PriorityQueue  - сортированная очередь
public class PriorityQueueSimple {
    public static void main(String[] args) {
        PriorityQueue<Integer> priQueue = new PriorityQueue<>();
        priQueue.offer(144);
        priQueue.offer(21);
        priQueue.offer(377);
        priQueue.offer(89);
        priQueue.offer(34);
        priQueue.offer(233);
        priQueue.offer(55);

        while (!priQueue.isEmpty()) {
            System.out.println(priQueue.poll());
        }
    }
}
