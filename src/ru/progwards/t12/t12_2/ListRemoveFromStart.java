package ru.progwards.t12.t12_2;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

//Тестирование удаления из начала списков
public class ListRemoveFromStart {

    static final int ELEMENTS_COUNT = 250_000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList();
        List<Integer> linkedList = new LinkedList();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        var startTime = new Date().getTime();
        for (int i = ELEMENTS_COUNT - 1; i >= 0; i--)
            arrayList.remove(0);
        System.out.println("Удаление из начала ArrayList: " + (new Date().getTime() - startTime));

        startTime = new Date().getTime();
        for (int i = ELEMENTS_COUNT - 1; i >= 0; i--)
            linkedList.remove(0);
        System.out.println("Удаление из начала LinkedList: " + (new Date().getTime() - startTime));
    }
}

/*Удаление из начала ArrayList: 3604
Удаление из начала LinkedList: 7*/

