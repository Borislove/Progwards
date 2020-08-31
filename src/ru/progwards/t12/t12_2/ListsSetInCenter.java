package ru.progwards.t12.t12_2;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

//Тестирование set в середине списков
public class ListsSetInCenter {
    static final int ELEMENTS_COUNT = 250_000;

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList();
        List<Integer> linkedList = new LinkedList();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        var starTime = new Date().getTime();
        for (int i = ELEMENTS_COUNT - 1; i >= 0; i--)
            arrayList.set(ELEMENTS_COUNT / 2, i);
        System.out.println("Set в середине ArrayList: " + (new Date().getTime() - starTime));

        starTime = new Date().getTime();

        for (int i = ELEMENTS_COUNT - 1; i >= 0; i--)
            linkedList.set(ELEMENTS_COUNT / 2, i);
        System.out.println("Set в середине LinkedList: " + (new Date().getTime() - starTime));
    }
}

/*Set в середине ArrayList: 8
Set в середине LinkedList: 149997*/