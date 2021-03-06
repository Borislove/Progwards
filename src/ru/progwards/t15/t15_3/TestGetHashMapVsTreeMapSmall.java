package ru.progwards.t15.t15_3;

import java.util.HashMap;
import java.util.TreeMap;

//TreeMap vs HashMap: поиск 50
public class TestGetHashMapVsTreeMapSmall {
    final static int ELEM_COUNT = 50;

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        HashMap<Integer, String> hashMap = new HashMap<>();

        for (int i = 0; i < ELEM_COUNT; i++) treeMap.put(i, "Строка " + i);
        for (int i = 0; i < ELEM_COUNT; i++) hashMap.put(i, "Строка " + i);

        long start = System.currentTimeMillis();
        for (int j = 0; j < 10_000_000; j++)
            for (int i = 0; i < ELEM_COUNT; i++) treeMap.get(i);
        System.out.println("treeMap.get: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int j = 0; j < 10_000_000; j++)
            for (int i = 0; i < ELEM_COUNT; i++) hashMap.get(i);
        System.out.println("hashMap.get: " + (System.currentTimeMillis() - start));
    }
}

/*treeMap.get: 7319
hashMap.get: 1027*/