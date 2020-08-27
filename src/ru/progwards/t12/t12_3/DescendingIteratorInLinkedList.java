package ru.progwards.t12.t12_3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//Обратный итератор в LinkedList
public class DescendingIteratorInLinkedList {

    static final int ELEMENTS_COUNT = 5;

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        for (int i = 0; i < ELEMENTS_COUNT; i++)
            linkedList.add(i + 1);

        Iterator<Integer> iterator1 = linkedList.listIterator();
        Iterator<Integer> iterator2 = linkedList.descendingIterator();

        while (iterator1.hasNext() && iterator2.hasNext()) {
            Integer intObj1 = iterator1.next();
            Integer intObj2 = iterator2.next();

            System.out.println("iterator1 вернул " + intObj1);
            System.out.println("iterator2 вернул " + intObj2 + "\n");
        }
    }
}



