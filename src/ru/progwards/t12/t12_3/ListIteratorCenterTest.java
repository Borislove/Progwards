package ru.progwards.t12.t12_3;


import java.util.*;

//тест на добавление в середину ( с ListIterator)
public class ListIteratorCenterTest {

    static final int ELEMENTS_COUNT = 250_000;

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList();
        var startTime = new Date().getTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++)
        arrayList.add(arrayList.size() / 2, i);
        System.out.println("Добавление в середину ArrayList: " + (new Date().getTime() - startTime));

        List<Integer> linkedList = new LinkedList();
        startTime = new Date().getTime();
        ListIterator<Integer> listIterator = linkedList.listIterator();
        for (int i = 0; linkedList.size() < ELEMENTS_COUNT; i++) {
            if (listIterator.previousIndex() >= linkedList.size() / 2)
                listIterator.previous();
            listIterator.add(i);
        }
        System.out.println("Добавление в середину LinkedList через итератор: " +
                (new Date().getTime() - startTime));
    }
}

/*Добавление в середину ArrayList: 2334
Добавление в середину LinkedList через итератор: 21
*/

/*Добавление в середину ArrayList: 2329
Добавление в середину LinkedList через итератор: 19*/