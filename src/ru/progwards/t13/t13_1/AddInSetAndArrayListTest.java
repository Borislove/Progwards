package ru.progwards.t13.t13_1;

import java.util.*;

//Добавление элементов в HashSet и ArrayList
public class AddInSetAndArrayListTest {
    final static int ELEMENTS_COUNT = 5_000_000;

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        Set<Integer> intSet = new HashSet<>();

        var startTime = new Date().getTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            intList.add(i);
        }
        System.out.println("Добавление в ArrayList: " + (new Date().getTime() - startTime));

        startTime = new Date().getTime();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            intSet.add(i);
        }
        System.out.println("Добавление в HashSet: " + (new Date().getTime() - startTime));
    }
}

//Добавление в ArrayList: 179
//Добавление в HashSet: 345