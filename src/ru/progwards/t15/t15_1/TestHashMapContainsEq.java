package ru.progwards.t15.t15_1;

import java.util.HashMap;

//тест HashMap.contains...для 1 элемента
public class TestHashMapContainsEq {

    static int ELEM_COUNT = 1;
    static int ITERATIONS = 500_000_000;

    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < ELEM_COUNT; i++) hashMap.put(i, i);

        long start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) hashMap.containsValue(i);
        System.out.println("HashMap.containsValue: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) hashMap.containsKey(i);
        System.out.println("HashMap.containsKey: " + (System.currentTimeMillis() - start));
    }
}

/*HashMap.containsValue: 4189
HashMap.containsKey: 1672*/