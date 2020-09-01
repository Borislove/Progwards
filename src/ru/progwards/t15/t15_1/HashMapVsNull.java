package ru.progwards.t15.t15_1;

import java.util.HashMap;

//HashMap и null
public class HashMapVsNull {
    public static void main(String[] args) {
        HashMap<Integer , String> hashMap = new HashMap<>();

        hashMap.put(null,null);
        hashMap.put(55,null);
        hashMap.put(0,null);
        hashMap.put(3,null);
        hashMap.put(5,null);

        System.out.println(hashMap);
    }
}
