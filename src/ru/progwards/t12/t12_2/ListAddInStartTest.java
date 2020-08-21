package ru.progwards.t12.t12_2;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

//Тест на добавление в начало списков
public class ListAddInStartTest {
    static final int ELEMENTS_COUNT = 250_000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList();
        var startTime = new Date().getTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(0, i);
        }
        System.out.println("Добавление в начало ArrayList: " + (new Date().getTime() - startTime));

        List<Integer> linkedList = new LinkedList();
        startTime = new Date().getTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            linkedList.add(0, i);
        }
        System.out.println("Добавление в начало LinkedList: " + (new Date().getTime() - startTime));
    }
}

/*Добавление в начало ArrayList: 5081
Добавление в начало LinkedList: 13*/

//LinkedList добавление в начало быстрее