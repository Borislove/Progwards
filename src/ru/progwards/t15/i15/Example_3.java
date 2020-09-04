package ru.progwards.t15.i15;

import java.util.TreeMap;

//Реализуйте метод с сигнатурой void checkAndAdd(TreeMap<Integer, String> map, Integer key, String value),
// который добавляет пару key-value в map при выполнении следующих условий:
//
//значение с таким key должно отсутствовать
//значение key долно быть больше головы TreeMap
//значение key долно быть меньше хвоста TreeMap
//Answer:(penalty regime: 10, 20, ... %)
public class Example_3 {
    static void checkAndAdd(TreeMap<Integer, String> map, Integer key, String value) {
        if (key != 0) {
            if ((map.ceilingKey(key) != key) && (map.firstEntry().getKey() < key)) {
                if (map.lastEntry().getKey() > key)
                    map.put(key, value);
            }
        }
    }
}


