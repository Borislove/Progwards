package ru.progwards.t15.t15_2;

import java.util.HashMap;
import java.util.Map;

//Пример putIfAbsent
public class HashMapEdit {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Ivanov1", "Иванов Иван Иванович");
        hashMap.put("student1", "Студентов Ученик Изучаевич");
        hashMap.put("UmnikRD", "Умников Раз Думович");
        hashMap.put("tormoz_dk", "Тормозов Диск Колодкович");
        hashMap.put("Student2", "Студентов Ученик Изучаевич");

        String oldVal = hashMap.putIfAbsent("Strudent2", "Студентов Студент Студетович");

        if (oldVal != null)
            System.out.println("Уже есть: " + oldVal);

        for (Map.Entry<String, String> entry : hashMap.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}
