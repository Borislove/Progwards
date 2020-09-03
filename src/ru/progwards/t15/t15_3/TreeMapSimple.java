package ru.progwards.t15.t15_3;

import java.util.Map;
import java.util.TreeMap;

//Пример TreeMap
public class TreeMapSimple {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(5,"Сама случается");
        treeMap.put(4,"Сортировка");
        treeMap.put(2,"Тем отличается,");
        treeMap.put(1,"TreeMap от HashMap");
        treeMap.put(3,"Что в нём");

        for(var entry : treeMap.entrySet())
            System.out.println(entry.getKey() + " -> "+entry.getValue());
    }
}
