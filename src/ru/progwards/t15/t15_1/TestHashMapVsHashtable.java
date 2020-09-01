package ru.progwards.t15.t15_1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TestHashMapVsHashtable {
    static int ELEM_COUNT = 5_000_000;
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < ELEM_COUNT; i++) hashMap.put(i, "Строка" + i);
        System.out.println("Добавление в HashMap " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < ELEM_COUNT; i++) hashtable.put(i, "Строка" + i);
        System.out.println("Добавление в Hashtable " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < ELEM_COUNT; i++) hashMap.get(i);
        System.out.println("Поиск в HashMap " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < ELEM_COUNT; i++) hashtable.get(i);
        System.out.println("Поиск в Hashtable " + (System.currentTimeMillis() - start));

        Integer keyTmp;
        String valTmp;
        Map.Entry<Integer, String> entryTmp;

        start = System.currentTimeMillis();
        for (var key : hashMap.keySet()) keyTmp = key;
        System.out.println("Итератор по ключу в HashMap " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (var key : hashtable.keySet()) keyTmp = key;
        System.out.println("Итератор по ключу в Hashtable " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (var value : hashMap.values()) valTmp = value;
        System.out.println("Итератор по значению в HashMap " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (var value : hashtable.values()) valTmp = value;
        System.out.println("Итератор по значению в Hashtable " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (var entry : hashMap.entrySet()) entryTmp = entry;
        System.out.println("Итератор по Entry в HashMap " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (var entry : hashtable.entrySet()) entryTmp = entry;
        System.out.println("Итератор по Entry в Hashtable " + (System.currentTimeMillis() - start));
    }
}

/*Добавление в HashMap 843
Добавление в Hashtable 640
Поиск в HashMap 208
Поиск в Hashtable 74
Итератор по ключу в HashMap 79
Итератор по ключу в Hashtable 83
Итератор по значению в HashMap 83
Итератор по значению в Hashtable 111
Итератор по Entry в HashMap 90
Итератор по Entry в Hashtable 81*/