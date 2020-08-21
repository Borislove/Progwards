package ru.progwards.t12.t12_2;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

// TODO: 21.08.2020 Количество элементов 2500
//Тест на добавление в середину списков 3
public class ListsAddInCenterTest_3 {

    static final int ELEMENTS_COUNT = 2500;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList();
        var startTime = new Date().getTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        System.out.println("Добавление в середину ArrayList: " + (new Date().getTime() - startTime));

        List<Integer> linkedList = new LinkedList();
        startTime = new Date().getTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        System.out.println("Добавление в середину LinkedList: " + (new Date().getTime() - startTime));
    }
}

/*Добавление в середину ArrayList: 1
Добавление в середину LinkedList: 6*/
