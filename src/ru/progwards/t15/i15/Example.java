package ru.progwards.t15.i15;

import java.util.HashMap;

/*Реализуйте метод с сигнатурой HashMap<Integer, String> a2map(int[] akey, String[] aval),
 который создает Map на основе пары массивов akey (ключи) и aval (значения). Первому элементу массива
 akey соответствует первый элемент массива aval, и т.д. Размеры массивов одинаковые.*/
public class Example {
    HashMap<Integer, String> a2map(int[] akey, String[] aval) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < akey.length; i++) {
            hashMap.put(akey[i], aval[i]);
        }
        return  hashMap;
    }
}
