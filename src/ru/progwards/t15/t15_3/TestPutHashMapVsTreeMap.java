package ru.progwards.t15.t15_3;

import java.util.HashMap;
import java.util.TreeMap;

//TreeMap vs HashMap: добавление 5 000 000
public class TestPutHashMapVsTreeMap {
    final static int ELEM_COUNT = 5_000_000;

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        HashMap<Integer, String> hashMap = new HashMap<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < ELEM_COUNT; i++) treeMap.put(i, "Строка " + i);
        System.out.println("treeMap.put: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < ELEM_COUNT; i++) hashMap.put(i, "Строка " + i);
        System.out.println("hashMap.put: " + (System.currentTimeMillis() - start));
    }
}


/*treeMap.put: 1788
hashMap.put: 658*/