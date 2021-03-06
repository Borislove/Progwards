package ru.progwards.t15.t15_3;

import java.util.HashMap;
import java.util.TreeMap;

//TreeMap vs HashMap: добавление 50
public class TestPutHashMapVsTreeMapSmall {
    final static int ELEM_COUNT = 50;

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        HashMap<Integer, String> hashMap = new HashMap<>();

        long start = System.currentTimeMillis();
        for (int j = 0; j < 1_000_000; j++)
            for (int i = 0; i < ELEM_COUNT; i++) treeMap.put(i, "Строка " + i);
        System.out.println("treeMap.put: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int j = 0; j < 1_000_000; j++)
            for (int i = 0; i < ELEM_COUNT; i++) hashMap.put(i, "Строка " + i);
        System.out.println("hashMap.put: " + (System.currentTimeMillis() - start));
    }
}

/*treeMap.put: 1814
hashMap.put: 1153*/
