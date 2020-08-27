package ru.progwards.t13.t13_1;

import java.util.*;

//Тест на скорость поиска элемента
public class ContainsInSetAndListTest {
    final static int ELEMENTS_COUNT = 5_000_000;

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        Set<Integer> intSet = new HashSet<>();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            intList.add(i);
            intSet.add(i);
        }

        var startTime = new Date().getTime();
        for (int i = 0; i < ELEMENTS_COUNT; i += 1000) {
            intList.contains(i);
        }
        System.out.println("ArrayList: " + (new Date().getTime() - startTime));

        startTime = new Date().getTime();
        for (int i = 0; i < ELEMENTS_COUNT; i += 1000) {
            intSet.contains(i);
        }
        System.out.println("HashSet: " + (new Date().getTime() - startTime));
    }
}

//ArrayList: 34543
//HashSet: 2