package ru.progwards.t12.t12_2;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

//Тестирование удаления из середины списков
public class ListsRemoveFromCenter {

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
            arrayList.remove(arrayList.size() / 2);
        System.out.println("Удаление из середины ArrayList: " + (new Date().getTime() - startTime));

        startTime = new Date().getTime();
        for (int i = ELEMENTS_COUNT - 1; i >= 0; i--)
            linkedList.remove(linkedList.size() / 2);
        System.out.println("Удаление из середины LinkedList: " + (new Date().getTime() - startTime));
    }
}


/*Удаление из середины ArrayList: 2267
Удаление из середины LinkedList: 27040*/

//удаление элемента по индексу в LinkedList